import java.sql.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.Iterator;
/*for this file, i have left the username, password, and url
fields blank for privacy...
*/

public class dataBaseControl
{
	private	static	Connection conn;
	private static 	Statement statement;
	private static 	ResultSet rs;

	private static 	int id_num;
	private String 	driver;
	private String 	url;

	private String 	user;
	private String 	pw;
	private static 	String command;

	public dataBaseControl()
	{

		url = "jdbc:mysql://localhost/AddressBook";

		//blank for privacy purposes
		user = "root";
		pw = "vishal";
		
		try{

			//attempt to connect to our database...
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(url, user,pw);
			statement = conn.createStatement();
			command = "USE AddressBook";
			statement.executeUpdate(command);
			System.out.println("connection Established");
		}
		catch(Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR: " +e.getMessage());
		}

	}
	public static int getNextID(){
		command = "SELECT id FROM Name WHERE id = (SELECT MAX(id) FROM Name)";
		try{
			rs = statement.executeQuery(command);
			rs.next();
			//System.out.println("Here is our max value: " +  rs.getInt(1));
			return rs.getInt(1) + 1;

		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
		
			//in case of error we return -1
			return -1;
		}
	}

	/* insert takes as input first and last name, street, city, state, zipcode, and phone number...*/
	public static void insert_to_dataBase(String f, String l, String s, String c, String st, String z, String p)
	{
		//we need to create an ID number to use as the primary key in out
		//database.  for simplicity, we will just input them in numerical
		//order

		id_num = getNextID();
		if (id_num != -1){
			//call insert_name and perform the operation...
			insert_name_db(id_num, f, l);
		}


		//this should be at the end of the function only...
		deleteView.refresh_model();
	}


	public static void insert_name_db(int id,String f, String l){

		try{

			statement.executeQuery(command);
			command = "INSERT INTO Name (id, first, last)"
				+ "VALUES (" + id + ", \"" + f + "\", \"" + l + "\")";
			statement.executeUpdate(command);

		}
		catch(Exception e){
		
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public static DefaultComboBoxModel get_model(){

		DefaultComboBoxModel m = new DefaultComboBoxModel();
		String str, final_string;

		try{
//			statement.executeQuery("USE AddressBook");
			rs = statement.executeQuery("SELECT * FROM Name");
			while(rs.next()){
			final_string = "";
			id_num = rs.getInt(1);
			str = rs.getString(2);
			final_string = Integer.toString(id_num) + " " + str + " ";
			str = rs.getString(3);
			final_string += str;
			//System.out.println(id_num);
			m.addElement(final_string);
			}

		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERROR: getMODEL" + e.getMessage());
		}


		return m;
		
	}

	public static DefaultTableModel get_tableModel(){
		Vector<String> column_vec = new Vector<String>();
		Vector<Vector> data_vec = new Vector<Vector>();
		try{
			//grab column names...
			rs = statement.executeQuery("SELECT * FROM Name");
			ResultSetMetaData rs_md = rs.getMetaData();

			int num_columns = rs_md.getColumnCount();

			//store the column names...
			for (int i = 0; i < num_columns; ++i){
				column_vec.add(rs_md.getColumnName(i+1));
//				System.out.println(rs_md.getColumnName(i+1));
			}



			//store the data into a data vector...
			Vector row;

			while(rs.next()){
				row = new Vector(num_columns);
				for (int i = 0; i < num_columns; ++i){
					row.add(rs.getString(i+1));
				}
				data_vec.add(row);
			}

		}
		catch(Exception e){
		System.out.println("tableModel Error: " + e.getMessage());
		//need to implement joptionpane...
		}

		DefaultTableModel model = new DefaultTableModel(data_vec, column_vec);
		return model;
	}

	public static void deleteEntry(int entryNum){
		try{
			statement.executeQuery("USE AddressBook");
			statement.executeUpdate("DELETE FROM Name WHERE id=" + entryNum);
			conn.commit();			
		}
		catch(Exception e){
			//we need to implement a joptionpane here....
		}
	}


}


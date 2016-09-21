import java.sql.*;
import java.awt.*;
import javax.swing.*;

/*for this file, i have left the username, password, and url
fields blank for privacy...
*/

public class dataBaseControl
{
	private		Connection conn;
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

		url = "jdbc:mysql://localhost/";

		//blank for privacy purposes
		user = "";
		pw = "";
		
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
}


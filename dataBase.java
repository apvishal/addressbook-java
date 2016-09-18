import java.sql.*;

/*for this file, i have left the username, password, and url
fields blank for privacy...
*/
public class dataBase
{
	private Connection conn;
	private String driver;
	private String url;

	private String user;
	private String pw;

	public dataBase()
	{

//		System.out.println("in constructor");

		url = "jdbc:mysql://localhost/...";

		//blank for privacy purposes
		user = "";
		pw = "";
		
		try{

			//attempt to connect to our database...
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(url, user,pw);
			System.out.println("connection Established");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	static void runDataBase()
	{
		System.out.println("We are here");

	}

}


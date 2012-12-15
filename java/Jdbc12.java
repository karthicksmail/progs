import java.sql.*;

public class Jdbc12 {
	public static void main(String args[]){
		System.out.println("Copyright 2009, SK");
		try {

			//Register the JDBC driver for MySQL.
			Class.forName("com.mysql.jdbc.Driver");

			//Define URL of database server for
			// database named mysql on the localhost
			// with the default port number 3306.
			String url = "jdbc:mysql://127.0.0.1:3306/status";

			//Get a connection to the database for a
			// user named root with a blank password.
			// This user is the default administrator
			// having full privileges to do anything.
			Connection con = DriverManager.getConnection(url,"karthick", "11111111");

			//Display URL and connection information
			//System.out.println("URL: " + url);
			//System.out.println("Connection: " + con);

			if (con != null)
			{
				//Get a Statement object
				Statement stmt = con.createStatement();
				ResultSet result = stmt.executeQuery("select * from teammaster");

				while(result.next())
				{
					int teamID = result.getInt(1);
					String teamName = result.getString(2);
					System.out.println("Team ID = " + teamID);
					System.out.println("Team Name = " + teamName);
				}

				con.close();
			}
		}catch( Exception e ) {
		e.printStackTrace();
		}//end catch
	}//end main
}//end class Jdbc12

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class DbBaseClass {
	private String serverName = null;
	private String portNumber = null;
	private String database = null;
	private String table = null;
	private String username = null;
	private String password = null;
	private String driverName = null;
	private String dbUrl = null;

	public void DbBaseClass() {
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName(driverName).newInstance();
			connection = DriverManager.getConnection(dbUrl, username, password);
			if(!connection.isClosed()) {
				System.out.println("Successfully connected to MySQL server using TCP/IP...");
				connection.setAutoCommit(false);
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
		return connection;
	}

	public void commit(Connection connection) throws SQLException {
		try {
			//TODO: Karthick Add log message
			connection.commit();
		} catch(SQLException se) {
			//TODO: Karthick Add log message
			throw se;
		}
	}
}

class DbBase {
	public static void main(String[] args) {
		DbBaseClass dbc = new DbBaseClass();
		dbc.setDbUrl("jdbc:mysql:///status");
		dbc.setDriverName("com.mysql.jdbc.Driver");
		dbc.setDatabase("status");
		dbc.setServerName("127.0.0.1");
		dbc.setUserName("karthick");
		dbc.setPassword("11111111");
		Connection conn = dbc.createConnection();

		System.out.println("Display all results:");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from spectypemaster");
			while(rs.next()){
				int ID = rs.getInt("ID");
				String SpecType = rs.getString("Name");
				System.out.println("\tID= " + ID + "\tSpec Type = " + SpecType);
			}

			if (conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getDBConnection() throws Exception{
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        String sURL="jdbc:mysql://127.0.0.1:3306/status";
        String sUserName="karthick";
        String sPwd="11111111";

        conn = DriverManager.getConnection(sURL,sUserName,sPwd);
      return conn;
    }
}


package com.escom.ipn.dao;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionDB {
    
 static String USER = "root";
    static String PASS = "caradepapa";
    static String URL = "jdbc:mysql://localhost/shop";
    PreparedStatement prState;
    CallableStatement cs ;
    ResultSet result ;
    Connection con;

    public Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        con = null;
        cs = null ;
        result = null;
        prState = null ;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(URL,USER,PASS);
        return con;
    }
    
    public void closeConnection (Connection con) throws SQLException{
    con.close();
    
    }





}

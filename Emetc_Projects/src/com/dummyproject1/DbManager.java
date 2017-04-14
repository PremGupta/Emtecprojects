package com.dummyproject1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 
public class DbManager 
 
{
    private static Connection con = null;
    private static Connection conn = null;
     
    // Database connection for SQL Server
 
    public static void setDbConnection() throws SQLException, ClassNotFoundException, AddressException, MessagingException
    {
        try
        {
        Class.forName(TestConfig.driver);
        con =   DriverManager.getConnection(dbConnectionUrl, dbUserName, dbPassword);
 
        if(!con.isClosed())
        System.out.println("Successfully connected to SQL server");
      
        }
        
        catch(Exception e)
        {
        System.err.println("Exception: " + e.getMessage());            
        }
    }
 
 
   public static void setMysqlDbConnection() throws SQLException, ClassNotFoundException, AddressException, MessagingException
    {
    try
      {
        Class.forName (TestConfig.mysqldriver).newInstance ();
        conn = DriverManager.getConnection (mysqlurl, mysqluserName, mysqlpassword);
 
        if(!conn.isClosed())
        System.out.println("Successfully connected to MySQL server");
      }
 
    catch (Exception e)
    {
     System.err.println ("Cannot connect to database server");
     }
   }
 
 // Query list for SQL
 public static List<String> getQuery(String query) throws SQLException
 {
 Statement St = con.createStatement();
 ResultSet rs = St.executeQuery(query);
 List<String> values = new ArrayList<String>();
 
 while(rs.next())
   {
     values.add(rs.getString(1));
   }
 return values;
 }
 
 // Query list for MySQL
 public static List<String> getMysqlQuery(String query) throws SQLException
 {
 Statement St = conn.createStatement();
 ResultSet rs = St.executeQuery(query);
 List<String> values1 = new ArrayList<String>();
 
 while(rs.next())
    {
      values1.add(rs.getString(1));
    }
   return values1;
  }
}
     
     
 
     
 
             
             
             
             

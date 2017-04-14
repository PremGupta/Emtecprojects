package com.dummyproject1;

import  java.sql.Connection;        
import  java.sql.Statement;     
import  java.sql.ResultSet;     
import  java.sql.DriverManager;     
import  java.sql.SQLException;      
public class  SQLConnector {                
        public static void  main(String[] args) throws  ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {                                                  
                //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"        
                String dbUrl = "jdbc:sqlserver://localhost:3036/Empower_QA";                   
        	//String dbUrl = "jdbc:mysql://127.0.0.1:3306/Empower_QA";         
        	System.out.println("Connection URL Syntax");
                
                //Database Username     
                String username = "empower";   
                 System.out.println("Database Username");
                
                //Database Password     
                String password = "empower$321";             
                System.out.println("Database Password");
                
                //Query to Execute      
                String query = "select *  from dbo.employee;";  
                 System.out.println("Query to Execute");
                
                //Load mysql jdbc driver        
                //Class.forName("com.jdbc.sqlserver.jdbc.Driver");
                 
                 Class.forName("com.jdbc.sqlserver.jdbc.Driver").newInstance();
                System.out.println("Load mysql jdbc driver");
                
                //Create Connection to DB       
                Connection con = DriverManager.getConnection(dbUrl+username+password);
                System.out.println("Create Connection to DB");
                
                //Create Statement Object       
               Statement stmt = con.createStatement();                  
               System.out.println("Create Statement Object");
               
                //Execute the SQL Query. Store results in ResultSet        
                ResultSet rs= stmt.executeQuery(query);                         
                System.out.println("Execute the SQL Query. Store results in ResultSet");
                
                // While Loop to iterate through all data and print results     
                while (rs.next()){
                            String myName = rs.getString(1);                                        
                            String myAge = rs.getString(2);                                                
                            System. out.println(myName+"  "+myAge);     
                    }       
                 // closing DB Connection       
                con.close();            
        }
}



/*import java.sql.*;
import javax.sql.*;

public class dbconnection
{
public static void main(String args[])
{
String email;
String dbUrl = "jdbc:mysql://localhost:3306/test";  //This URL is based on your IP address
String username="username"; //Default username is root
String password="password"; //Default password is root
String dbClass = "com.mysql.jdbc.Driver";
String query = "Select email from users where user_id = 1;";

try 
{

Class.forName(dbClass);
Connection con = DriverManager.getConnection (dbUrl,username,password);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);

while (rs.next()) 
{
dbtime = rs.getString(1);
System.out.println(email);
} //end while

con.close();
} //end try

catch(ClassNotFoundException e) 
{
e.printStackTrace();
}

catch(SQLException e) 
{
e.printStackTrace();
}

}  //end main

}  //end class
*/
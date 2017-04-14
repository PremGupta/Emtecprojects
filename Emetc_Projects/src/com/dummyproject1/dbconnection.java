
//Db - Connection Statement
package com.dummyproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class dbconnection
{
 public static void main(String[] args)
 {
	 
     Connection conn= null;
     String url = "jdbc:mysql://localhost:3306/";
     String dbname = "test";
     String driver = "com.mysql.jdbc.Driver";
     String username = "root";
     String password = "divya";
     
     try
     {
         Class.forName(driver).newInstance();//create object of driver
         conn = DriverManager.getConnection(url + dbname, username,password);
         java.sql.Statement stmt = conn.createStatement();
         /*ResultSet rs = stmt.executeQuery("select * from persons");
         while(rs.next())
         {
             for(int i=1; i <=4; i++ ){
                 System.out.print(rs.getString(i)+"--");    
             }
             System.out.println();
             }
             */
     
         // String query = ("select * from persons where userId='1'");
         ResultSet rs1 = stmt.executeQuery("select * from persons where userId='2'");
         //ResultSet rs2 = stmt.executeQuery("select * from persons where userId='3'");
         while(rs1.next())
         {
             for(int i=1; i <=4; i++ )
             {
                 System.out.print(rs1.getString(i)+"--");    
             }
             System.out.println();
         } 
         
             //rs1.next();
      }
     
     catch (Exception e)
     {
         e.printStackTrace();
     }
  }
}
package com.dummyproject1;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class DbConnectionPrepare 
{
    public static void main (String[] args)
    {
        java.sql.Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbname = "test";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "divya";
        try
        {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbname, username,password);
            java.sql.PreparedStatement pstmt = conn.prepareStatement("insert into persons values (? , ? , ? ,? ,? )");
            //ResultSet rs = pstmt.executeQuery();
            pstmt.setString(1,"8");
            pstmt.setString(2,"Gupta");
            pstmt.setString(3,"Prem");
            pstmt.setString(4,"Manjari");
            pstmt.setString(5,"Pune");
            
            pstmt.executeUpdate();
            
        
        
            //System.out.println(rs.getString(1) + "--" + rs.getString(2) + "--" + rs.getString(3) + "--" + rs.getString(4) + "--" + rs.getString(5));
                
            
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

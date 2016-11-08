package jdbc;

import java.sql.*;


public class DAOLayer {
    
   public static Connection con;
    
    static
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/polling";
        String un="root";
        String p="system";
        
        con=DriverManager.getConnection(url,un,p);
        }
        catch(Exception e)
        {
            System.out.println("Connection Error : "+e.getMessage());
        }
    } 
    public static Connection getCon()
    {
    return con;
    }
    
    public static int updateData(String dmlQuery)
    {
        try{
        
        Statement st=con.createStatement();
        int ur=st.executeUpdate(dmlQuery);
        return ur;
        }
        catch(Exception e)
        {
            System.out.println("Update Error : "+e.getMessage());
            return -1;
        }
    
    }
    
    public static ResultSet selectData(String projectionQuery)
    {
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(projectionQuery);
        return rs;
        
        }
        catch(Exception e)
        {
            System.out.println("Select Error : "+e.getMessage());
            return null;
        }
    
    
    
    }
    
    
    }
    

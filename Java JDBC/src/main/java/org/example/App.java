package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    static String sql="SELECT \"Ph_no\"\n" +
            "FROM public.\"Employee_Table\" WHERE \"Id\"=2";

    static String url="jdbc:postgresql://localhost:5432/JDBC_Connection";
    static String username="postgres";
    static String password="admin@123";
    public static void main( String[] args )
    {
        try{
            System.out.println("Hello world");
            Connection conn= DriverManager.getConnection(url,username,password);  //u called who u want to talk
            Statement st=conn.createStatement();  //u know what you want to talk

            ResultSet res=st.executeQuery(sql);    //u said what u want to say
            res.next();

            String ph_no=res.getString(1);
            System.out.println(ph_no);
            conn.close();

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}

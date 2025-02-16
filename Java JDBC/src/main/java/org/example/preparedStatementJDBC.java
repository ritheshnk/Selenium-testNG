package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class preparedStatementJDBC {

    public static void main(String[] args){
        try {
            String query="Select \"Ph_no\" FROM public.\"Employee_Table\" where \"Id\">? and \"Id\"<?";
            String url="jdbc:postgresql://localhost:5432/JDBC_Connection";
            String username="postgres";
            String password="admin@123";

            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,1);
            ps.setInt(2,4);
            //ps.setString(3,"rithu")   // for string values ...  3 is parameter index
            ResultSet rs=ps.executeQuery();
            System.out.println("Ph_no");
             while (rs.next()){
                 String curr_ph_no=rs.getString("Ph_no");
                 System.out.println(curr_ph_no);
             }

            con.close();




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

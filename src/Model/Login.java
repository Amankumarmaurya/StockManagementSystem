/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Aman Maurya
 */
public class Login {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/java_db";
        String uname = "root";
        String pwd = "";

        try {
            //step-1: Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //step 2:create connection to the database
            Connection con = DriverManager.getConnection(url, uname, pwd);
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name,age , faculty : ");
                String name = in.next();
                String address = in.next();
                Double salary = in.nextDouble();
                //step 3:create sql querry and exeute it
                String sql = "INSERT INTO supplier(name,salary,address)values(?,?,?)";
//                String sql = "INSERT INTO tbl_person(name,address,salary)values('"+name+"','"+address"',"+salary+")";
//                       Statement st = con.createStatement();
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, name);
                st.setString(2, address);
                st.setDouble(3, salary);

                st.execute();
            }
            //step 4:close the connection
            con.close();
            System.out.println("Record inserted Sucessfully ");

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    }


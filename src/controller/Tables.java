/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author HASHINI
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            // st.executeUpdate("CREATE TABLE appuser (appuser_pk INT AUTO_INCREMENT PRIMARY KEY, " +
            //                  "userRole VARCHAR(200), " +
            //                   "name VARCHAR(200), " +
            //                    "dob VARCHAR(50), " +
            //                    "mobileNumber VARCHAR(50), " + // Corrected typo
            //                    "email VARCHAR(200), " +
            //                    "username VARCHAR(200), " +
            //                    "password VARCHAR(200), " +
            //                    "address VARCHAR(200))");
            //   st.executeUpdate("INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) " +
            //                   "VALUES ('Admin', 'Admin', '2001-01-04', '0771234567', 'admin@gmail.com', 'admin', 'admin', 'Sri Lanka')");
         //   st.executeUpdate("Create table Medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
st.executeUpdate("Create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");         

            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

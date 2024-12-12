/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author steve junior
 */
public class maconnection {
    public static Connection getConnection(){
        Connection cnx = null;
                     
    try{
        Class.forName("com.mysql.jc.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return cnx;
    
    } 
}

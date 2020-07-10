/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.sql.*;
import javax.swing.JOptionPane;
public class DB_connect {
    Connection conn= null;
    
    public  static Connection connect_DB(){
        try{
            Class.forName("org.h2.Driver");
           Connection conn=DriverManager.getConnection("jdbc:h2:~/test","sa","");
            return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        
    }}
}

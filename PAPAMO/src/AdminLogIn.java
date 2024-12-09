/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erlan
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class AdminLogIn {
    public static Connection DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection DBCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbseniorhigh","root","");
            return DBCon;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}

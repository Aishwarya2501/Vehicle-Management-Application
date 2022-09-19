/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagaement;

/**
 *
 * @author dell
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnection {
    
    private static Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    public Connection OpenConnection ()
    {    
        String dataSourceName = "Database/VehicleDB.accdb";
        String url = "jdbc:ucanaccess://D:\\Sem-6\\LABS\\OOAD Lab\\Project\\VehicleManagaement/"+ dataSourceName;
        
        conn = null;
        try{
            conn =   DriverManager.getConnection(url);
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
    
    //to access data from database
    public  ResultSet GetData(String Sql)
    {
        try {
            pst = conn.prepareStatement(Sql);
            rst = pst.executeQuery();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "\nDbConnection GetData Error");
        }
        return rst;
    }
    
    //to insert data into database
    public int InsertUpdateDelete(String Sql)
    {
        int flag=0;
        try {
            pst = conn.prepareStatement(Sql);
            flag = pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(flag);
        return flag ;
    }
    
    //closing connection
    public void CloseConnection()
    {
        if (rst != null) {
            try {
                rst.close();
            } catch (SQLException e) { /* ignored */}
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) { /* ignored */}
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) { /* ignored */}
        }
    }
}

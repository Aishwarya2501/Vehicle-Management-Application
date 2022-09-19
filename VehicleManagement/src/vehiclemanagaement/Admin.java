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

public class Admin {
    
    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    public void changePassword(String username,String newPassword)
    {
        int flag;
        
        try{
            conn.OpenConnection();
            String sql = "UPDATE Admin SET AdminP = '"+ newPassword +"' where AdminID = '"+username+ "'";
            flag = conn.InsertUpdateDelete(sql);
            if(flag == 1)
                JOptionPane.showMessageDialog(null, "YOUR PASSWORD HAS BEEN CHANGED  ");
            else
                JOptionPane.showMessageDialog(null, "YOUR PASSWORD COULDn't BE CHANGED" );
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Failed to Update Password");
        } 
    }
    
    public boolean chkAdminPass(String id, String pass)
    {
        boolean flag = false;
        
        try{
            conn.OpenConnection();
            String sql = "Select AdminID,AdminP from Admin where AdminID = '" + id + "' and AdminP = '" + pass + "'";
            rst= conn.GetData(sql);
            if(rst.next())
                flag= true;                 
            else 
                flag=  false;
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nInavlid Username or Password");
        }
       return flag; 
    }
    
    public ResultSet RideRealTimeCombined()
    {
        ResultSet rst1=null;
    
        try{
            conn.OpenConnection();
            String sql = "Select Date,Username,DriverName,DriverContactNo,VehiclePlate,VehicleName,Fromm,Too,StartTime,EndTime,RideStatus,BillStatus,Bill from RideRealtime";
            rst1= conn.GetData(sql);
            do{
                return rst1;
            } 
            while(rst1.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nRide Realtime Combined Error");
        }
          
        conn.CloseConnection();
        return null;
    }
    
}

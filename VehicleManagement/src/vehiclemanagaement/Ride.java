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

public class Ride {
    
    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    public void updateRideStatus(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;        
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Ride Status Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
        
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverCarRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
             int flagg=comm.InsertUpdateDelete(sql);
             if(flagg==1){
                //JOptionPane.showMessageDialog(null, "Ride Status Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
             comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }          
    }
    
    public void updateRideStatusRickshaw(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Ride Status Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
                
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
             
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    public void updateStartTimeDateCar(String username,String date,String time)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Date='"+date+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
        
        try{
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverCarRT SET StartTime = '"+ time +"',Date='"+date+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
               
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    public void updateStartTimeDateRickshaw(String username,String date,String time)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";           
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Date='"+date+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
        
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET StartTime = '"+ time +"',Date='"+date+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
         
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }      
    }
    
    public void updateEndTimeDateCar(String username,String time)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET EndTime = '"+ time +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "End Time Updated ");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
        
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverCarRT SET EndTime = '"+ time +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
              
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    public void updateEndTimeDateRickshaw(String username,String time)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET EndTime = '"+ time +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "End Time Updated ");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
        
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET EndTime = '"+ time +"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
               
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    public void updateBillStatusCar(String username,String billStatus,int billCar)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Bill Status Updated ");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
                
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverCarRT SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
             
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    public void updateBillStatusRickshaw(String username,String billStatus,int billRickshaw)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            rst= conn.GetData(sql);
            while(rst.next()){
                mat=rst.getInt("ID");
            }
            conn.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        
        String j=matching;
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billRickshaw+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
                JOptionPane.showMessageDialog(null, "Bill Status Updated ");
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }
                
        try{
            DbConnection comm = new DbConnection();
            comm.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET BillStatus = '"+ billStatus +"',Bill = '"+billRickshaw+"' where ID = '"+mat+"'";
            int flagg=comm.InsertUpdateDelete(sql);
            if(flagg==1){
               
            }
            else{
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }
            comm.CloseConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);  
        }         
    }
    
    public ResultSet DriverRide(String username)
    {
        ResultSet rst1=null;
        try{
            conn.OpenConnection();
            String sql = "Select Date,Username,VehiclePlate,PUsername,PassengerContactNo,Fromm,Too,StartTime,EndTime,RideStatus,BillStatus,Bill,NoOfPassengers from RideRealtime where Username ='"+username+"'";
            rst1= conn.GetData(sql);
            do{
                return rst1;
            }while(rst1.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nSelect DriverCarRT Error");
        }
        conn.CloseConnection();
        return null;
    }
    
}

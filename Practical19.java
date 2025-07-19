/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical19;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author KSC6
 */
public class Practical19 {

    /**
     */
    
     public void inse()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","root","");
            Scanner sc=new Scanner(System.in);
            System.out.print("enter name=");
            String nm=sc.next();
	
            System.out.print("enter designation=");
            String des=sc.next();
	
            System.out.print("enter city=");
            String City=sc.next();
	
            System.out.print("enter salary=");
            int sal=sc.nextInt();
	
            System.out.print("enter department=");
            String dp=sc.next();
	
            String p12="insert into emp1 (empnm,designation,city,salary,department) values(?,?,?,?,?)";
	
             PreparedStatement pst=con.prepareStatement(p12);
	
            pst.setString(1,nm);
            pst.setString(2,des);
            pst.setString(3,City);
            pst.setInt(4,sal);
            pst.setString(5,dp);
            pst.executeUpdate();
           
        }
        catch(SQLException e)
        {
            System.out.println("error"+e);
        }
    }
    public void upd()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","root","");
            Scanner sc=new Scanner(System.in);
            System.out.print("enter name=");
            String nm=sc.next();
	
            System.out.print("enter designation=");
            String des=sc.next();
            
            System.out.print("enter city=");
            String City=sc.next();
	
            System.out.print("enter salary=");
            int sal=sc.nextInt();
	
            System.out.print("enter department=");
            String dp=sc.next();
	
            System.out.print("enter your id=");
            int i=sc.nextInt();
	
            String p13="update emp1 set empnm=?,designation=?,city=?,salary=?,department=? where empno=?";
	
            PreparedStatement pst=con.prepareStatement(p13);
            
            pst.setString(1,nm);
            pst.setString(2,des);
            pst.setString(3,City);
            pst.setInt(4,sal);
            pst.setString(5,dp);
            pst.setInt(6,i);
	
            pst.executeUpdate();
            
        }
        catch(SQLException e)
        {
            System.out.println("error"+e);
        }
    }
    public void del()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","root","");
            Scanner sc=new Scanner(System.in);
            System.out.print("enter your empno=");
            int eno=sc.nextInt();
            String p14="delete from emp1 where empno=?";
            PreparedStatement pst=con.prepareStatement(p14);
            pst.setInt(1,eno);
            pst.executeUpdate();   
            
        }
        catch(SQLException e)
        {
            System.out.println("error"+e);
        }
    }
    public void sel()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","root","");
            Scanner sc=new Scanner(System.in);
            System.out.print("enter your empno=");
            int eno=sc.nextInt();
            String p10="select * from emp1 where empno=?";
            PreparedStatement pst=con.prepareStatement(p10);
            pst.setInt(1,eno);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
		System.out.println("empno:"+rs.getInt(1));
		System.out.println("empnm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }
           
            
        }
        catch(SQLException e)
        {
            System.out.println("error"+e);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         try
        {
            Practical19 obj=new Practical19();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your choise");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                        obj.inse();
                case 2:
                        obj.upd();
                case 3:
                        obj.del();
                case 4:
                        obj.sel();
                default :
                        System.out.println("choos another from 1 to 4");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("error"+e); 
        }
    }
    
}

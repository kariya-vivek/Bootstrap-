/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical1to9;
import java.sql.*;

/**
 *
 * @author KSC6
 */
public class Practical1to9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","root","");
            Statement st=con.createStatement();
            /*String r1="insert into emp1 (empnm,designation,city,salary,department) Values('rohit sharma','softwareengineer','rajkot',80000,'IT')";
            String r2="insert into emp1 (empnm,designation,city,salary,department) Values('aarav jain','marketing manager','amreli',90000,'Marketing')";
            String r3="insert into emp1 (empnm,designation,city,salary,department) Values('rohan kumar','sales represenatative','babra',40000,'Sales')";
            String r4="insert into emp1 (empnm,designation,city,salary,department) Values('ananya singh','HR Manager','amreli',70000,'HR')";
            String r5="insert into emp1 (empnm,designation,city,salary,department) Values('siddharth gupta','financial analyst','rajkot',85000,'Finance')";
            String r6="insert into emp1 (empnm,designation,city,salary,department) Values('kavya patel','product manager','rajkot',95000,'Product')";
            String r7="insert into emp1 (empnm,designation,city,salary,department) Values('arjun reddy','data scientist','atkot',100000,'Data Science')";
            String r8="insert into emp1 (empnm,designation,city,salary,department) Values('ishani menon','ux designer','mahuva',45000,'Design')";
            String r9="insert into emp1 (empnm,designation,city,salary,department) Values('dhruv choudhary','network administrator','babra',65000,'IT')";
            String r10="insert into emp1 (empnm,designation,city,salary,department) Values('nandini bhatt','business analyst','rajkot',80000,'Business Analysis')";
            st.executeUpdate(r10);*/
            
           /* String p2="select * from emp1";
            ResultSet rs=st.executeQuery(p2);
            while(rs.next())
            {
		System.out.println("empno:"+rs.getInt(1));
		System.out.println("empnm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }*/
            
            /*String p3="select * from emp1 where salary>50000";
            ResultSet rs=st.executeQuery(p3);
            while(rs.next())
            {
            	System.out.println("empno:"+rs.getInt(1));
		System.out.println("empnm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }*/
            
            /*String p4="select * from emp1 where city='rajkot'";
            ResultSet rs=st.executeQuery(p4);
            while(rs.next())
            {
		System.out.println("empno:"+rs.getInt(1));
		System.out.println("empnm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }*/
            
            //practicle 5
            /*String p2="select * from emp1 where empnm like 'a%'";
            ResultSet rs=st.executeQuery(p2);
            while(rs.next())
            {
            	System.out.println("emp1no:"+rs.getInt(1));
		System.out.println("emp1nm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }*/
	
            //practicle 6
            /*String p6="select * from emp1 where designation like'%manager'";
            ResultSet rs=st.executeQuery(p6);
            while(rs.next())
            {
		System.out.println("emp1no:"+rs.getInt(1));
		System.out.println("emp1nm:"+rs.getString(2));
		System.out.println("designation:"+rs.getString(3));
		System.out.println("city:"+rs.getString(4));
		System.out.println("salary:"+rs.getInt(5));
		System.out.println("department:"+rs.getString(6));
            }*/
	
            //practicle 7
            /*String p7="select count(*) from emp1 ";
            ResultSet rs=st.executeQuery(p7);
            while(rs.next())
            {
		System.out.println("total emp:"+rs.getInt(1));
            }*/
	
            //practicle 8
          /*String p8="select max(salary) from emp1 ";
            ResultSet rs=st.executeQuery(p8);
            while(rs.next())
            {
		System.out.println("maxsalary:"+rs.getInt(1));
            }*/
	
            //practicle 9
            String p9="select * from emp1 order by empnm";
            ResultSet rs=st.executeQuery(p9);
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
        catch(Exception e)
        {
            System.out.println("error"+e);
        }
    }
    
}

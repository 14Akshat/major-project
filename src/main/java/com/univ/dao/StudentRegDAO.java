package com.univ.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.univ.db.DBConnection;
//import com.univ.DTO.StudentRegDTO;
import com.univ.db.DBConfig;

import com.univ.dto.RegistrationGetterSetter;

public class StudentRegDAO {
	
	

		//Insert method 
		public int insert(RegistrationGetterSetter dto) {
			int x=0;
			try{
				Connection con= DBConnection.getConn();
//				PreparedStatement ps=con.prepareStatement("insert into student(name,email,enrollmentNo,mobileNo,password,confirmPassword)value(?,?,?,?,?,?)");
				PreparedStatement ps=con.prepareStatement("insert into student(name,email,enrollmentNo,mobileNo,year,password) values(?,?,?,?,?,?)");
				ps.setString(1,dto.getName());
				ps.setString(2, dto.getEmail());
				ps.setString(3,dto.getEnrollmentNo());
				ps.setInt(4,dto.getMobileNo());
				ps.setInt(5, dto.getYear());
				ps.setString(6,dto.getPassword());
				//ps.setString(6,dto.getConfirmPassword());
				x=ps.executeUpdate();
				con.close();
				
			}
			catch(Exception ee) 
			{
				System.out.println(ee);
				}
			return x;
		}
		
		//Insert method close
	
		//get password method
		public boolean checkDetails(String enrollmentNo,String password)
		 {
			 boolean b1=false;
			 try {
			 Connection con=DBConnection.getConn();
				PreparedStatement ps= con.prepareStatement("select enrollmentNo,password from student where enrollmentNo=? AND password=? "); 
			   ps.setString(1, enrollmentNo);
			   ps.setString(2, password);
			 ResultSet rs=ps.executeQuery();
			 b1=rs.next();
			 con.close();
			 }
			 catch(Exception tt)
			 {
				 System.out.println(tt);
				 }
			 return b1;
		 }
		//get password method close
		
		
		//get  search method
		 public List srchCust(int id)
		 {
			 List lt=new ArrayList();
			 try {
				 Connection con=DBConnection.getConn();
				 Statement stm=con.createStatement();
				 ResultSet rs= stm.executeQuery("select * from student where sid="+id);
				 if(rs.next())
				 {
			      lt.add(rs.getInt(1));
			      lt.add(rs.getString(2));
			      lt.add(rs.getString(3));
			      lt.add(rs.getInt(4));
			      lt.add(rs.getString(5));
			      lt.add(rs.getString(6));
			      lt.add(rs.getString(7));
			    }else {
			    	lt=null;
			    }
				 
			 }catch(Exception tt)
			 {System.out.println(tt);}
		   return lt;
		 }
			//get search method close
 
		//update method 
//			public int update(RegistrationGetterSetter dto) {
//				int x=0;
//				try{
//					Connection con= DBConnection.getConn();
//					int id=dto.getSid();
//					PreparedStatement ps=con.prepareStatement("update student  set sname=?,sadd=?,smob=?,semail=?,sunm=?,spw=? where sid="+id);
//					ps.setString(1,dto.getSname());
//					ps.setString(2,dto.getSadd());
//					ps.setInt(3,dto.getSmob());
//					ps.setString(4,dto.getSemail());
//					ps.setString(5,dto.getSunm());
//					ps.setString(6,dto.getSpw());
//					
//					x=ps.executeUpdate();
//					con.close();
//					
//				}catch(Exception ee) 
//				{
//					System.out.println(ee);
//					}
//				return x;
//			}
			
			//update  method close
			
		
	}




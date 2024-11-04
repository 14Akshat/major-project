package com.univ.dao;
import com.univ.db.DBConnection;
import com.univ.dto.RegistrationGetterSetter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CoordinatorRegDAO {
	public int insert(RegistrationGetterSetter dto) {
		int x =0;
		try {
			Connection con = DBConnection.getConn();
			PreparedStatement ps = con.prepareStatement("insert into coordinator(name,coordinatorId,mobileNo,email,password) values(?,?,?,?,?)");
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getCoordinatorId());
			ps.setInt(3, dto.getMobileNo());
			ps.setString(4, dto.getEmail());
			ps.setString(5, dto.getPassword());
            x= ps.executeUpdate();
            con.close();
		}
		catch(Exception e){
			System.out.print(e);
		}
		return x;
	}
	public boolean checkDetails(String coordinatorId, String password) {
		boolean b = false;
		try {
			Connection con = DBConnection.getConn();
			PreparedStatement ps = con.prepareStatement("select coordinatorId,password from coordinator where coordinatorId=? AND password=? ");
			ps.setString(1, coordinatorId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			b =rs.next();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}

}

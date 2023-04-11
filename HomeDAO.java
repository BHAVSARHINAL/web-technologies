package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.model.personmodel;
import com.util.DBUtil;

public class HomeDAO {

	Connection cn = null;
	personmodel model = null;
	
	public personmodel conformlogin(int userid)
	{
		cn =  new DBUtil().getcon();
		String sql = "select employee where userid=?";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			
		pst.setInt(1,userid);
			
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				
				model = new personmodel();
				model.setUserid(rs.getInt(1));
				model.setName(rs.getString(2));
				model.setEmail(rs.getString(3));
				model.setPassword(rs.getString("password"));
			}
			
			
			cn.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return model;
		
	}
	

}

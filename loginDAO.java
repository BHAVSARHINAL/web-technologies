package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.model.personmodel;
import com.util.DBUtil;

public class loginDAO {

	Connection cn = null;
	personmodel model = null;
	
	public personmodel getmodel(personmodel smodel)
	{
		cn =  new DBUtil().getcon();
		String sql = "select * from employee where name= ? and password = ?";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setString(1,smodel.getName());
			pst.setString(2,smodel.getPassword());
			
			
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

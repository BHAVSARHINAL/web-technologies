package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.personmodel;
import com.util.DBUtil;

public class registrationDAO {
	
Connection cn = null;
int x= 0;

public int doregistration(personmodel pmodel)
{
	cn = new DBUtil().getcon();
	
	String sql = "insert into employee(name,email,password) values(?,?,?)";
	
	try {
		PreparedStatement pst;
       pst = cn.prepareStatement(sql);
		pst.setString(1,pmodel.getName());
		pst.setString(2,pmodel.getEmail());
		pst.setString(3, pmodel.getPassword());

		x= pst.executeUpdate();
		cn.close();
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	
	
	
	
	return x;
	
}

}

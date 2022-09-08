package com.training.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.app.ConnectionManager;
import com.training.entities.Employee;
import com.training.service.EntryNotFoundException;



public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Connection con = ConnectionManager.getConnection();
 	public EmployeeDAOImpl() {
		try {
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
String sql = "insert into employee values(?,?,?,?,?)";
		
		try(Connection con =  ConnectionManager.getConnection();
				PreparedStatement ps =  con.prepareStatement(sql);){
			
			ps.setLong(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getDesignation());
			ps.setString(5, employee.getInsuranceScheme());
			
			int retVal =  ps.executeUpdate();
			if(retVal == 1) {
				return employee;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Employee deleteEmployee(long id) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id = ?";
		try(Connection con =  ConnectionManager.getConnection();
				PreparedStatement ps =  con.prepareStatement(sql);)
		{
			     ps.setLong(1, id);
		     
				int retVal = ps.executeUpdate(); 
		
		       if(retVal ==1 )System.out.println("deleted");
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public Employee listEmployeeByScheme(String sc) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		String sql = "select * from employee where ischeme = ?";
		try(
				PreparedStatement ps =  con.prepareStatement(sql);){
			     ps.setString(1, sc);
		     
				ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			long idd = rs.getLong(1);
			String name = rs.getString(2);
			double salary = rs.getDouble(3);
			String designation = rs.getString(4);
			String ischeme = rs.getString(5);
			
			Employee e =  new Employee(idd,salary,name,designation,ischeme);
		return e;
		}
		throw new EntryNotFoundException("no such Employee scheme");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		List <Employee> list = new ArrayList<Employee>();
		String sql = "select * from employee ";
		try(Connection con =  ConnectionManager.getConnection();
				Statement stat =  con.createStatement();
				ResultSet rs =  stat.executeQuery(sql);){
		
		while (rs.next()) {
			long idd = rs.getLong(1);
			String name = rs.getString(2);
			double salary = rs.getDouble(3);
			String designation = rs.getString(4);
			String ischeme = rs.getString(5);
				
				Employee e =  new Employee(idd,salary,name,designation,ischeme);
				list.add(e);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return list;
	}

	@Override
	public List<Employee> sortlistAllEmployee() {
		// TODO Auto-generated method stub
		List <Employee> list = new ArrayList<Employee>();
		String sql = "select * from employee order by salary";
		try(Connection con =  ConnectionManager.getConnection();
				Statement stat =  con.createStatement();
				ResultSet rs =  stat.executeQuery(sql);){
		
		while (rs.next()) {
			long idd = rs.getLong(1);
			String name = rs.getString(2);
			double salary = rs.getDouble(3);
			String designation = rs.getString(4);
			String ischeme = rs.getString(5);
				
				Employee e =  new Employee(idd,salary,name,designation,ischeme);
				list.add(e);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return list;
	}
}

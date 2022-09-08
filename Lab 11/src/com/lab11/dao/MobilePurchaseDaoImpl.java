package com.lab11.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.sql.Date;
import com.lab11.entities.Mobile;
import com.lab11.entities.PurchaseDetails;
import com.lab11.exception.EntityNotFoundException;
import com.lab11.dao.ConnectionManager;

public class MobilePurchaseDaoImpl implements MobilePurchaseDao {
		
	//Connection
	 private static Connection con = ConnectionManager.getConnection();
	 	public MobilePurchaseDaoImpl() {
			try {
				con.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 	
	 	public Set<Integer> getMobileIdSet(){
	 		Set<Integer> mobSet = new TreeSet<>();
	 		
	 		String sql = "Select mobileid from mobiles";
	 		try(Statement stmt = con.createStatement();
	 				ResultSet rs = stmt.executeQuery(sql);
	 				){
	 			while(rs.next()) {
	 				int a = rs.getInt(1);
	 				mobSet.add(a);
	 			}
	 			return mobSet;
	 		} 
	 		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		return mobSet;
	 	}
	 	
	 	public int getLastPurchaseId(){
	 		int p_id;
	 		
	 		String sql = "Select max(purchaseid) from purchasedetails";
	 		try(Statement stmt = con.createStatement();
	 				ResultSet rs = stmt.executeQuery(sql);
	 				){
	 			int a = 0;
	 			while(rs.next()) {
	 				a = rs.getInt(1);	 				
	 			}	 				
	 				p_id = a +1 ;
	 				return p_id;
	 		} 
	 		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
	 		catch (Exception e) {
	 			return 0;
	 		}
	 	}


	@Override
	public PurchaseDetails insertPurchaseDetails (PurchaseDetails obj) {
		
		String sql = "Insert into purchasedetails values (?,?,?,?,?,?)";
		
		try(PreparedStatement ps = con.prepareStatement(sql);)
		{
			ps.setInt(1,obj.getPurchaseid());
			ps.setString(2,obj.getCname());
			ps.setString(3,obj.getMailid());
			ps.setString(4, obj.getPhoneno());
//			ps.setObject(5,(Object)  obj.getPurchasedate());
			ps.setDate(5, Date.valueOf(obj.getPurchasedate()));
			ps.setInt(6, obj.getMobileid());		
			
			 int retVal = ps.executeUpdate();
	    	 if(retVal == 1) {	    		 
	    		 System.out.println("Purchase details added.");
	    	 }			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	
	@Override
	public Mobile updateMobileQuantity(int id) {
		
		String sql =  "update mobiles set quantity = quantity -1  where mobileid = ? ";
	    
	    try(PreparedStatement ps= con.prepareStatement(sql);)
	    {	    	
	    	 ps.setInt(1,id);	  

	    	 int retVal = (int)ps.executeUpdate();
	    	 if(retVal == 1) {	    		 
	    		 System.out.println("Mobile quantity updated");
	    	 }			
	    } 
	    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		return null;	
	}

	@Override
	public List<Mobile> listAllMobiles() {

		List <Mobile> list = new ArrayList<>();
		String sql = "Select * from mobiles";
				try(Statement stat = con.createStatement();
						ResultSet rs = stat.executeQuery(sql);	){
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						double price =rs.getDouble(3);
						int quantity = rs.getInt(4);
						
						Mobile m = new Mobile(id,name,price,quantity);
						list.add(m);
					}
					return list;					
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return null;
	}

	@Override
	public Mobile listMobileById(int a) throws EntityNotFoundException{
		
		String sql = "Select * from mobiles where mobileid = ?";
		try(PreparedStatement ps = con.prepareStatement(sql);) {
			
			ps.setInt(1, a);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double price =rs.getDouble(3);
				int quantity = rs.getInt(4);
				
				Mobile m = new Mobile(id,name,price,quantity);
				return m;
			}
			throw new EntityNotFoundException("no such applicant id");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List listByPriceRange(double a, double b)  throws EntityNotFoundException {
		List <Mobile> list = new ArrayList<>();
		String sql = "Select * from mobiles where price > ? and price < ?";
		try(PreparedStatement ps = con.prepareStatement(sql);) {
			
			ps.setDouble(1, a);
			ps.setDouble(2 , b);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double price =rs.getDouble(3);
				int quantity = rs.getInt(4);
				
				Mobile m = new Mobile(id,name,price,quantity);
				list.add(m);
			}
			return list;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	

}

package tools;

import org.sqlite.JDBC;
import java.sql.*;



public class dbtest {
	private Statement stat=null;
	private ResultSet rsq=null;
	private String tablename=null;
	
	public dbtest(String tablename) {
		this.tablename=tablename;
	}
	
	public void conn() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:zieckey.db");
			stat=conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String  getXpath(String elementname) {
		String xpath=null;
		try {			
			rsq=stat.executeQuery("select * from "+tablename+" where name='"+elementname+"';");
			while(rsq.next()) {
//				System.out.println(rsq.getString("salary"));
				xpath=rsq.getString("xpath");
			}
			rsq.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return xpath;
	}
	
	
	public static void main(String[] args) {
		dbtest logintab=new dbtest("tbl1");
		logintab.conn();
		System.out.println(logintab.getXpath("lala"));
	}
	
	
	
	
}

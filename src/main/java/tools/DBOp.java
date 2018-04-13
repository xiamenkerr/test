package tools;

import org.sqlite.JDBC;
import java.sql.*;



public class DBOp {
	private Statement stat=null;
	private ResultSet rsq=null;
	private String tablename=null;
	
	public DBOp(String tablename) {
		this.tablename=tablename;
	}
	
	public void conn() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:F:\\datebase\\loginback.db");
			stat=conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String getXpath(String elementname) {
		String xpath=null;
		try {			
			rsq=stat.executeQuery("select * from "+tablename+" where ElementName='"+elementname+"';");
//			System.out.println(rsq.next());
			while(rsq.next()) {
				xpath=rsq.getString("Xpath");				
			}
			rsq.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return xpath;
	}
	
	
	public static void main(String[] args) {
		DBOp logintab=new DBOp("login");
		logintab.conn();
		System.out.println(logintab.getXpath("te"));
	}
	
	
	
	
}

package com.swufe.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	private static Connection conn;
	private static Statement stmt;
	
	private ConnectionFactory(){
		
	}
	/**
	 * 通锟斤拷web.xml锟斤拷JNDIname锟斤拷锟斤拷锟斤拷锟矫达拷锟斤拷锟斤拷锟斤拷
	 * @return
	 */
	public static Connection getConnection(){
		try {
			String JNDIname=(String)new javax.naming.InitialContext().lookup("java:comp/env/JNDIname");
			return ConnectionFactory.getConnection(JNDIname);
		} catch (NamingException e) {
			System.out.print("锟斤拷菘锟轿达拷锟斤拷锟斤拷锟斤拷锟斤拷映锟轿达拷锟斤拷茫锟�");
		}
		return null;
	}
	/**
	 * 通锟斤拷指锟斤拷锟斤拷JNDI锟斤拷苹锟饺★拷锟捷匡拷锟斤拷锟斤拷,锟斤拷JDBC/SURVEY
	 * @param JNDIname
	 * @return Connection
	 */
	public static Connection getConnection(String JNDIname){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");           
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","");
			stmt=conn.createStatement();
			//System.out.println("锟斤拷锟斤拷菘锟斤拷锟斤拷锟�");
			return conn;
		}catch (Exception ex) {
			System.err.println("锟斤拷锟斤拷菘锟绞憋拷锟斤拷锟�: " + ex.getMessage());
		}
		return null;
		 
//		try {
//			Context initCtx = new InitialContext();
//		      Context envCtx = (Context) initCtx.lookup("java:comp/env");
//		      DataSource ds = (DataSource) envCtx.lookup(JNDIname);
//			return ds.getConnection();
//		} catch (NamingException e1) {
//			System.out.print("锟斤拷菘锟轿达拷锟斤拷锟斤拷锟斤拷锟斤拷映锟轿达拷锟斤拷茫锟�");
//			return null;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
	}
	
	
	
}

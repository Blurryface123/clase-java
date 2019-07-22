package com.andresbank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.andresbank.models.Cliente;
import com.andresbank.models.Cuenta;

public class ClienteDAO {

	private static ClienteDAO instance=null;
	public static ClienteDAO getInstance() throws Exception {
		if (instance==null) instance=new ClienteDAO();
		
		return instance;
	};
	private ClienteDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}
	public Cliente getUserByDNIAndPass(String dnirec, String passrec) throws SQLException {
		Cliente resCliente=null;
			
		String url = "jdbc:mysql://localhost/andresBank";
		
			Connection conn = DriverManager.getConnection(url, "root", "root");
			
			//Hago peticiones
			String sql= "SELECT uid, nombre, dni, pin, nomina FROM clientes WHERE dni=? AND pin=?";		
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dnirec);
			psmt.setString(2, passrec);
			
			ResultSet rs = psmt.executeQuery();
			
			System.out.println("Resultset:" +rs);
			
			while(rs.next()) {
				System.out.println("Resultset:" +rs.getInt(1)+ "::"+ rs.getString(2));
				resCliente = new Cliente(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		return resCliente;

	}
	public Cuenta getCuentasByCid(int cidID) throws SQLException {
		String url = "jdbc:mysql://localhost/andresBank";
		
		Connection connc = DriverManager.getConnection(url, "root", "root");
		String sql = "SELECT cid, nombre, numero, saldo FROM `cuenta` WHERE cid=?";
		PreparedStatement prepst = connc.prepareStatement(sql);
		
		prepst.setString(1, cidID);
		
		
		
		return null;
	}
	public Cliente getUserByDNI(Object dnisess) throws SQLException {
		Cliente resCliente=null;
		
		String url = "jdbc:mysql://localhost/andresBank";
		
			Connection conn = DriverManager.getConnection(url, "root", "root");
			
			//Hago peticiones
			String sql= "";		
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, (String) dnisess);
			
			
			ResultSet rs = psmt.executeQuery();
			
			System.out.println("Resultset:" +rs);
			
			while(rs.next()) {
				System.out.println("Resultset:" +rs.getInt(1)+ "::"+ rs.getString(2));
				resCliente = new Cliente(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
				break;
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		return resCliente;
	}
}

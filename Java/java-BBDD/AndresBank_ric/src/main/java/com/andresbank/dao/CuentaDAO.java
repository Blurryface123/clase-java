package com.andresbank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.andresbank.models.Cliente;
import com.andresbank.models.Cuenta;
import com.mysql.jdbc.Statement;

import sun.security.action.GetIntegerAction;

public class CuentaDAO {

	private static CuentaDAO instance = null;

	public static CuentaDAO getInstance() throws Exception {
		if (instance == null)
			instance = new CuentaDAO();

		return instance;
	};

	private CuentaDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

	}

	public ArrayList<Cuenta> getCuentasByDni(String dnirec) throws SQLException {
		ArrayList<Cuenta> rescuentas = null;

        String url = "jdbc:mysql://localhost/andresbank";

        Connection conec = DriverManager.getConnection(url, "root", "root");
        // ahora hago peticiones
        String sql = "SELECT cid, nombre, numero, saldo FROM cuenta WHERE 1";
        PreparedStatement prepst = conec.prepareStatement(sql);
        prepst.setString(1, dnirec);

        ResultSet rs = prepst.executeQuery();
        System.out.println("res:" + rs);

        rescuentas = new ArrayList<Cuenta>();

        while (rs.next()) {
            rescuentas.add(new Cuenta(rs.getInt(1), rs.getString(2) + rs.getString(3) + rs.getDouble(4), sql, 0));

        }
        rs.close();
        prepst.close();
        conec.close();

        return rescuentas;

	}

	public int crearCuenta(Cuenta cuenta, Cliente cliente) throws SQLException {
		int cidres=0;
		String url = "jdbc:mysql://localhost/andresBank";
		
		Connection conn = DriverManager.getConnection(url, "root", "root");
		
		//Hago peticiones
		String sql= "INSERT INTO cuenta(nombre, numero, saldo) VALUES (?, ?, ?)";		
		PreparedStatement psmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		psmt.setString(1, cuenta.getNombre());
		psmt.setString(2, cuenta.getNumero());
		psmt.setDouble(3, cuenta.getSaldo());
		
		ResultSet rs = psmt.getGeneratedKeys();
		if (rs.next()) {
			cidres = rs.getInt(1);
		}
		rs.close();
		psmt.close();
		//INSERTAR CLIENTE_CUENTA
		sql="INSERT INTO `cliente_cuenta`(`clientes`, `cuenta`) VALUES (?, ?)";
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, cliente.getUid());
		psmt.setInt(2, cidres);
		
		psmt.executeUpdate();		
		psmt.close();
		conn.close();
		
		return cidres;
	}
}

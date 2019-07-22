package com.andresbank.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andresbank.dao.ClienteDAO;
import com.andresbank.models.Cuenta;

/**
 * Servlet implementation class CuentaServlet
 */
public class CuentaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CuentaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cid = request.getParameter("cid");
		int cidID = Integer.parseInt(cid);

		// si existe cid = pedir a bbdd que busque

		try {
			Cuenta cuentasrec = ClienteDAO.getInstance().getCuentasByCid(cidID);

			if (cid != null) {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/cuenta.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}

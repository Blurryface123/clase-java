package com.andresbank.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andresbank.dao.ClienteDAO;
import com.andresbank.dao.CuentaDAO;
import com.andresbank.models.Cliente;
import com.andresbank.models.Cuenta;

/**
 * Servlet implementation class CrearCuentaServlet
 */
public class CrearCuentaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CrearCuentaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession().getAttribute("dni") != null) {
			request.getRequestDispatcher("/crearcuenta.jsp").forward(request, response);
		} else {
			response.sendRedirect("./login");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		if (request.getSession().getAttribute("dni") != null) {
			String cidrec = request.getParameter("cid");
			String nombrerec = request.getParameter("nombre");
			String numerorec = request.getParameter("numero");
			String saldorec = request.getParameter("saldo");

			try {
				double saldoDbl = Double.parseDouble(saldorec);
				String dnisess = (String) request.getSession().getAttribute("dni");
				Cuenta newCuenta = new Cuenta(0, nombrerec, numerorec, saldoDbl);
				
				Cliente miCliente= ClienteDAO.getInstance().getUserByDNI(dnisess);
				int newCid = CuentaDAO.getInstance().crearCuenta(newCuenta, miCliente);
				if (newCid>0) {
					response.sendRedirect("cuentas");
				}else {
					request.setAttribute("mensaje_error", "la cuenta no se ha creado correctamente");
					doGet(request, response);
				}
			} catch (Exception e) {

				request.setAttribute("mensaje_error", "Ooops....tenemos un problema..intentalo mas tarde..");
				doGet(request, response);
			}
		} else {
			response.sendRedirect("login");
		}
	}
}
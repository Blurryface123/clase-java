package com.andresbank.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andresbank.dao.CuentaDAO;


/**
 * Servlet implementation class BorrarServlet
 */
public class BorrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BorrarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("dni") != null) {

			try {
				String cidrec = request.getParameter("cid");
				

				int cidInt = Integer.parseInt(cidrec);
				


				boolean isOK= CuentaDAO.getInstance().borrarcuenta(cidInt);
				
				if(isOK) {
					response.sendRedirect("cuentas");
				}else {
					request.getRequestDispatcher("./error.jsp");
				}

			} catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
				request.getRequestDispatcher("./error.jsp").forward(request, response);
			}

		} else {
			response.sendRedirect("login");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		

}
}
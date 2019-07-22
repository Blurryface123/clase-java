package com.andresBankapp.Controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andresBankapp.Modelos.Cliente;
import com.andresBankapp.Modelos.Cuenta;
import com.andresBankapp.Modelos.Nomina;


public class clienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public clienteServlet() {
        super();
        // TODO Auto-generated constructor stub}

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("cliente.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		int idrecID= 0;
		String nombrerec=request.getParameter("nombre");
		String dnirec=request.getParameter("dni");
		String pinrec=request.getParameter("pin");
		Cuenta cuentasrec=request.getParameter("cuentas");
		Nomina nominarec=request.getParameter("nominas");
	
		try {
			int idrecID = Integer.parseInt("idrec");
			
		} catch (Exception e) {
			System.out.println("Excepción!!!!!: " + e.getMessage());
		}
		
		Cliente nuevocliente = new Cliente(
				0,
				nombrerec,
				dnirec,
				pinrec,
				cuentasrec = new Cuenta(1, "juan", "23131312", 29),
				nominarec= new Nomina(1,"juan", 29,8),
			);
	}

}

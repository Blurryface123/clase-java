package com.andres.controles;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andres.models.Employee;
import com.andres.persistencia.EmployeeManager;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UsuarioServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String idInt = request.getParameter("id");
			
			int  empl = Integer.parseInt(idInt); 
			
			Employee unE = EmployeeManager.getInstance().getEmployee(empl);
					
			
		
			request.setAttribute("unE", empl);
			request.getRequestDispatcher("usuario.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			doGet(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

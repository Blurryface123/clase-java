package com.ricardo.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.andres.database.BBDD;

/**
 * Servlet implementation class NewUserServlet
 */
@WebServlet("/newuser")
public class NewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public NewUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if (session.getAttribute("usuario") != null) {

			BBDD bbdd = new BBDD();

			request.setAttribute("losUsuarios", bbdd.usuarios);

			request.getRequestDispatcher("/newusuario.jsp").forward(request, response);
		} else {
			response.sendRedirect("login");
		}

	}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

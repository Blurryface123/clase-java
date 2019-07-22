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
 * Servlet implementation class loginservlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String emailrecib=request.getParameter("email");
		String passwordrecib=request.getParameter("password");
		
		System.out.println("ESTOY EN EL POST");
		System.out.println("Email:"+emailrecib);
		System.out.println("Email:"+passwordrecib);
		
		BBDD bd = new BBDD();
		boolean existeUser=bd.existeUsuarioPorEmailYPass(emailrecib,passwordrecib); 
		
		//decidir si existe usuario con ese email y password...entrar en listausuarios
		//si no...volver a mostrar formularios
		
		
		HttpSession session = request.getSession();
		
		if(existeUser) {
			//llevarlo a esta lista usuario
			//request.getRequestDispatcher("/ListaUsuariosServlet").forward(request, response);
			session.setAttribute("usuario", emailrecib);
			response.sendRedirect("listadeusuarios");
		}else {
			//devolver a login
			request.setAttribute("error", "Usuario y contraseño no existe!!");
			this.doGet(request, response);
		}
		
	
	}
	

}
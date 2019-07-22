package com.ricardo.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andres.database.BBDD;

/**
 * Servlet implementation class ListaHabitaciones
 */
@WebServlet("/ListaHabitaciones")
public class ListaHabitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BBDD bbdd = new BBDD();
		
	
		request.setAttribute("lashabitaciones", bbdd.habitaciones);
		//dispacher=despachador, que el jsp devuelva la respuesta. El forward pasa la respuesta a jsp.
		request.getRequestDispatcher("/ListaHabitaciones.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

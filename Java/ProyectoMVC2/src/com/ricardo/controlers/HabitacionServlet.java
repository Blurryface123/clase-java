package com.ricardo.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andres.database.BBDD;
import com.ricardo.modelos.Habitacion;
import com.sun.swing.internal.plaf.basic.resources.basic;



@WebServlet("/habitacion")
public class HabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idhabitacion= request.getParameter("hid");
		
		int idH = Integer.parseInt(idhabitacion);
		BBDD bbdd = new BBDD();
		
		
		
	
		request.setAttribute("unaHabitacion", bbdd.getHabitacionByHid(idH));
		
		request.getRequestDispatcher("/habitacion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

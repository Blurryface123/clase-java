package com.ricardo.controlers;
//controlador:
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.andres.database.BBDD;
import com.ricardo.modelos.Usuario;

//anotación: metodo para modificar un comportamiento de una misma clase, esta dice cual es la ruta de escucha de este servlet:
// no puede haber 2 servlet con la misma ruta.
@WebServlet("/usuario")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		// Si existe el dato de usuario en session -> lo dejo pasar
		// Si no lo redirijo a login
		if (session.getAttribute("usuario") != null) {

			BBDD bbdd = new BBDD();

			request.setAttribute("u", bbdd.usuarios);

			request.getRequestDispatcher("/usuario.jsp").forward(request, response);
		} else {
			response.sendRedirect("login");
		}

	}
		
		/*String idUsuario= request.getParameter("id");
		System.out.println("ID recibido: "+idUsuario);
		
		int idU=Integer.parseInt(idUsuario);
		
		BBDD bbdd = new BBDD();
		
	
		request.setAttribute("elUsuario", bbdd.getUsuarioById(idU));
		//dispacher=despachador, que el jsp devuelva la respuesta. El forward pasa la respuesta a jsp.
		request.getRequestDispatcher("/usuario.jsp").forward(request, response);
	}
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

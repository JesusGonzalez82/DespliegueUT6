package com.gsd.daw.daw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/// Esto es un pequeño servlet de pruebas

@WebServlet("/ElSaludador")
public class ElSaludador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElSaludador() {
        super();
        // TODO Auto-generated constructor stub
    }
    /// Metodo que atiende a las peticiones GET
    /// @param request la HTTP Request
    /// @param response la HTTP Response
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException{
    	String nombre = request.getParameter("nombre");
    	String saludo = "Buenos días Mr. " + nombre;
    	request.setAttribute("saludo", saludo);
    	request.getRequestDispatcher("/index.jsp").forward(request, response);
    	}
    /// Metodo que atiende a las peticiones POST, se limita a llamar a doGet
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException{
    	doGet(request, response);
	}

}

package org.SebaouneEtSaraoui.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); 
		String nom = (String) session.getAttribute("nom");
		String Pnom = (String) session.getAttribute("Pnom");
		request.setAttribute("nom", nom);
		request.setAttribute("Pnom", Pnom);
		RequestDispatcher Dispach = request.getRequestDispatcher("FormUser.html");
		Dispach.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); 
		String nom = request.getParameter("fname");
		String Pnom= request.getParameter("lname");
		session.setAttribute("nom", nom);
		session.setAttribute("Pnom", Pnom);

		request.setAttribute("n", nom);
		request.setAttribute("p", Pnom);
		RequestDispatcher Dispach = request.getRequestDispatcher("User.jsp");
		Dispach.forward(request, response);
		
		
	}

}

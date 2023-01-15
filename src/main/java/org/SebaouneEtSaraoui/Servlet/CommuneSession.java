package org.SebaouneEtSaraoui.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CommuneSession
 */
@WebServlet("/CommuneSession")
public class CommuneSession extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private long count = 0;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommuneSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		//String S = Long.toString(count);
		//request.setAttribute("CoO", count);
		session.setAttribute("CoO", count);
		RequestDispatcher Dispach = request.getRequestDispatcher("FormUser.html");
		Dispach.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =request.getSession();
		String nom = request.getParameter("fname");
		String Pnom= request.getParameter("lname");
		request.setAttribute("n", nom);
		request.setAttribute("p", Pnom);
		//request.setAttribute("CoO", count++);
		count++;
		session.setAttribute("CoO", count);
		RequestDispatcher Dispach = request.getRequestDispatcher("CommuneSession.jsp");
		Dispach.forward(request, response);
	}

}

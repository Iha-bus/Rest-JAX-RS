package org.SebaouneEtSaraoui.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.SebaouneEtSaraoui.models.Commune;

/**
 * Servlet implementation class CommuneSerlet
 */
@WebServlet("/communeservlet")
public class CommuneSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommuneSerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter Writer = response.getWriter();
		response.getWriter().append("Count : ").append(request.getContextPath());
		RequestDispatcher Dispach = request.getRequestDispatcher("create-commune.html");
		Dispach.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		long Id = Long.parseLong(request.getParameter("id"));
		String Nom= request.getParameter("name");
		
		//request.setAttribute("I", Long.toString(Id));
		//request.setAttribute("N", Nom);
		Commune com = new Commune (Nom,Id);
		request.setAttribute("Co",com);
		RequestDispatcher Dispach = request.getRequestDispatcher("Commune.jsp");
		Dispach.forward(request, response);

	}

}

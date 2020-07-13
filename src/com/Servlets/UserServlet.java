package com.Servlets;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Models.User;
import com.controllers.UserController;
/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public UserServlet() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User test = new User("JP", "password", "jp@mail.com");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean success = false;
		
		if(test.getUserName().equalsIgnoreCase(username) && test.getPassword().equalsIgnoreCase(password)) {
			success = true;
		}
		if(success) {
		UserController uc = new UserController();
		uc.createUser(username, "default@default.com", password);
		User u = uc.getUser("default@gmail.com");
		request.setAttribute("userrole" , "Employee");
		request.setAttribute("name", username);
		RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
		rd.forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Incorrect username or password");
			RequestDispatcher rd = request.getRequestDispatcher("JSP/incorrectLogin.jsp");
			rd.forward(request, response);
		}
	} 
}

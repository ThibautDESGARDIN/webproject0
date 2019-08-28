package fr.formation.inti.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet("/Init")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitServlet() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("init");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("methode doGet");
		response.getWriter().append("<h1> test Init </h1>").append(request.getContextPath())
		.append("<br>")
		.append(request.getRequestURL())
		.append("<br>")
		.append(request.getRequestURI());
	}
	
	protected void doDouDou(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("methode doDouDou");
		response.getWriter().append("<h1> test Init </h1>").append(request.getContextPath())
		.append("<br>")
		.append(request.getRequestURL())
		.append("<br>")
		.append(request.getRequestURI());}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		String str = req.getMethod();
		System.out.println(str);
		if("GET".equals(str))
			doGet(req, resp);
		else { doDouDou(req, resp);}
//		super.service(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

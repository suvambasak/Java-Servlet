

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet3requestDispatcher")
public class Servlet3requestDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3requestDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try{
			String name = request.getParameter("id");
			String password = request.getParameter("password");
			
			if(password.equals("testing")){
				RequestDispatcher rd = request.getRequestDispatcher("Welcome");
				rd.forward(request, response);
			}else{
				PrintWriter out = response.getWriter();
				out.println("Incorrect Password !!");
			
				RequestDispatcher rd = request.getRequestDispatcher("form3.html");
				rd.include(request, response);
			}
			
		}finally{}
	}

}

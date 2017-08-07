

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet7Cookies")
public class Servlet7Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlet7Cookies() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>Page 1 : </h2>");
		
		String n = request.getParameter("userName");
		out.println("Welcome " + n);
		
		
		Cookie ck=new Cookie("name",n);
		response.addCookie(ck);
		
		
	}

}

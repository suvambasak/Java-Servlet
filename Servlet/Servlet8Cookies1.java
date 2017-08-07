

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet8Cookies1")
public class Servlet8Cookies1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlet8Cookies1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Page 2:</h2>");
		
		javax.servlet.http.Cookie[] ck=request.getCookies();  
	    out.print("Hello "+ck[0].getValue());  
	  
	    out.close(); 
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.soap.AddressingFeature.Responses;

@WebServlet("/Servlet4sendRedirect")
public class Servlet4sendRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet4sendRedirect() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try{
			response.sendRedirect("https://www.google.com");
		}finally{}
	}

}

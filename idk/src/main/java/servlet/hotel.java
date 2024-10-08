package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hotel
 */
@WebServlet("/hotel")
public class hotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		
		
		String nome = request.getParameter("nome");
		int noites = Integer.parseInt(request.getParameter("noites"));
		double total=0.0;	
		for(int i=0;i<noites;i++) {
			total+=350/(i+1);
			
		}
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		
		o.println("<h1>Resultado:<h1><br>");
		o.println("<p>nome:"+nome+"</p><br>");
		o.println("<p>noites:"+noites+"</p><br>");
		o.println("<p>total:"+total+"</p>");
	
		
		
			System.out.println("Aluno: " + nome );
			System.out.println("- valor total a pagar:" +total );

		
	
		
	}

}

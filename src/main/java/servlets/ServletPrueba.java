package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPrueba
 */
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletPrueba() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		if (request.getParameter("numero")!=null) {
			int numero = Integer.parseInt(request.getParameter("numero"));
			
			
			if (numero%2==0) {
				response.getWriter().append("<H1>EL numero "+numero+"es par</h1>");
			}else {
				response.getWriter().append("<H1>EL numero "+numero+"es impar</h1>");
			}
		}else {
			response.getWriter().append("<H1>No has introducido el numero</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Pasando por el post");
		
		List<String> usuarios = new ArrayList<String>();
		
		if (request.getParameter("caja1")!=null) {
			String caja1 = request.getParameter("caja1");
			String caja2 = request.getParameter("caja2");
			System.out.println("Se ha mandado el valor " + caja1 + caja2);
			response.getWriter().append("<H5>INSERTADO CORRECTAMENTE</h5>");
			response.getWriter().append("<table>");
			response.getWriter().append("<th>Nombre</th><th>Apellidos</th>");
			for (String usuario : usuarios) {
				response.getWriter().append("<tr>");
				
				response.getWriter().append("</tr>");
			}
			
			response.getWriter().append("</table>");
			
		}else {
			System.out.println("No llega nada");
			response.setContentType("text/html");
			response.getWriter().append("<H5 style='color:red'>HA HABIDO UN ERROR</h5>");
		}
		
		
		
	}

	
	
}

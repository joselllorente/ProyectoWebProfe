package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import daos.MueblesDAO;
import entities.muebles.Lampara;
import entities.muebles.Mesa;
import entities.muebles.Mueble;
import entities.muebles.Sofa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class MueblesServlet
 */
public class MueblesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String subtitulo;
    //private List<Mueble> muebles;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MueblesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		subtitulo = config.getInitParameter("subtitle");
		System.out.println("Entrando init con subtitulo "+ subtitulo);
		//Inicializo la lista para poder empezar a guardar objetos
		//muebles = new ArrayList<Mueble>();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Entrando service");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entrando doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando doPost");
		String tipo = request.getParameter("tipo");
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		
		
		MueblesDAO<Mueble> mdao = new MueblesDAO();
		Mueble mueble = null;
		if(tipo.equals("M")) {
			String estilo = request.getParameter("estilo");
			mueble = new Mesa (nombre,precio,estilo);
			//muebles.add(mesa);
			
		}else  if(tipo.equals("S")) {
			String color = request.getParameter("color");
			mueble = new Sofa(nombre,precio,color);
			//muebles.add(sofa);
		}else if(tipo.equals("L")) {
			double potencia = Double.parseDouble(request.getParameter("potencia"));
			mueble = new Lampara(nombre,precio,potencia);
			//muebles.add(lampara);
		}
		//Realizamos la inserción
		mdao.insert(mueble);
		
		//Obtenemos los muebles de la base de datos
		List<Mueble> muebles =  mdao.get();
		
		Map<String,Object> datos = new HashMap<String,Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoMuebles", muebles);
		
//		request.setAttribute("subtitulo", subtitulo);
//		request.setAttribute("listadoMuebles", muebles);
		
		request.setAttribute("mapa", datos);
		RequestDispatcher rd =  request.getRequestDispatcher("ejercicioMueblesHerencia/listadoMuebles.jsp");
		
		rd.forward(request, response);
		
		
		
	}
	
	
	
}

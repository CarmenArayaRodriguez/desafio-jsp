package cl.praxis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.Factorial;

/**
 * Servlet implementation class FactorialServlet
 */
@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FactorialServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
				//Se convierte el parámetro numero de la solicitud a entero.
				int numero = Integer.parseInt(request.getParameter("numero"));
				
				// Se se usa la clase factorial.
				int factorial = Factorial.calcularFactorial(numero);

				 // Se configuran atributos en el request para pasarlos a la vista JSP.
				request.setAttribute("numero", numero);
				request.setAttribute("factorial", factorial);
				
				// Se redirige la solicitud internamente a la página JSP.
				request.getRequestDispatcher("factorial.jsp").forward(request, response);
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

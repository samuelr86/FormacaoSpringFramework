package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaEmpresas")
public class ListaEmpresasServelet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
												throws ServletException, IOException {
		
		// pegar as empresas
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		

		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
		
	}

}

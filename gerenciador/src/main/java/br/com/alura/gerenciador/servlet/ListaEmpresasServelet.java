package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// pegar as empresas
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		// criar um html 
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
	
		out.println("<ul>");
		
		//listar as empresas
		for(Empresa empresa:lista) {
			out.println("<li>"+empresa.getNome()+"</li>");
		}
		
		
		out.println("</ul>");

		
		
		
		
		
		
		
		
		
		out.println("</body></html>");
		
		
		
		
		
		
		
	}

}

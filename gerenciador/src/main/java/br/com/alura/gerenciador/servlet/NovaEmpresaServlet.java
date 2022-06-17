package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		System.out.println("Cadastrando nova empresa.");
		
		String login = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body> Login da Empresa " + login +"<br></body></html>");
		out.println("<html><body> Senha da Empresa " + senha +"</body></html>");

		
		System.out.println("Empresa cadastrada!");
	}

}

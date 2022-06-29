package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet  {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		System.out.println("Cadastrando nova empresa.");
		
		// acessa o nome cadastrado no formulário
		String nomeEmpresa = request.getParameter("nome");
		// criar a empresa
		Empresa empresa = new Empresa();
		// da nome a empresa
		empresa.setNome(nomeEmpresa);
		// cria uma simulacao de BD
		Banco banco = new Banco();
		// relaciona a empresa com o banco
		banco.adiciona(empresa);
		
		// chamar o JSP		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		// envia os dados para a JSP
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);
		
		
	}

}

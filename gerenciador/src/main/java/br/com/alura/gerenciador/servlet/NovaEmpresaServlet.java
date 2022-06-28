package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet  {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		System.out.println("Cadastrando nova empresa.");
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body> Empresa "+ nomeEmpresa + " cadastrada com sucesso. <br></body>");
		out.println("<script>alert('Empresa Cadastrada') </script></html>");

		
		System.out.println("Empresa cadastrada!");
	}

}

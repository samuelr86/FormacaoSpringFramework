<%

// scriptlet

	String nomeEmpresa = (String)request.getAttribute("empresa");
	
%>



<html>
	<body> 
		Empresa <b><%= nomeEmpresa %></b> cadastrada com sucesso. <br>
	</body>
</html>
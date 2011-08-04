<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	<h1>Alunos</h1>
	
	<table>
		<c:forEach items="${alunos.lista}" var="aluno">
			<tr>
				<td>${aluno.nome}</td>
				<td>${aluno.anoDeIngresso}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
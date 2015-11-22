<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Gouja Page</title>

</head>
<body>
<h1> Product's list</h1>


<table>
	<s:form modelAttribute="product" action="save" method="post">
	
	
				
				<tr>
					<td>Id</td>
					<td><s:input path="id"/></td>
					<td><s:errors path="id" cssClass="error"/></td>
				</tr>
				<tr>
					<td>nom</td>
					<td><s:input path="nom"/></td>
					<td><s:errors path="nom" cssClass="error"/></td>
				</tr>
				<tr>
					<td>prix</td>
					<td><s:input path="prix"/></td>
					<td><s:errors path="prix" cssClass="error"/></td>
				</tr>
<tr>
					<td><input type="submit" value="save"/> </td>
				</tr>
	
	
	
	</s:form>
		</table>
<div>			
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Prix</th>

</tr>

<c:forEach items="${products}" var="p">

<tr>
<th>${p.id}</th>
<th>${p.nom}</th>
<th>${p.prix}</th>

<th>
						<form action="delete" method="post">
							<input type="hidden" value="${p.id}" name="selectedProd">
							<input type="submit" value="delete">
						</form>
					</th>
<th>
						<form action="selectForUpdate" method="post">
							<input type="hidden" value="${p.id}" name="selectedProd">
							<input type="submit" value="select">
						</form>
					</th>

</tr>

</c:forEach>


</table>

</div>


</body>
</html>
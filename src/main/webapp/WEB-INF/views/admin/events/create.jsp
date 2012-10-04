<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<form:form action="/admin/categories/save" method="POST" modelAttribute="category" enctype="multipart/form-data">
<h1>Create New Category</h1></br>
	<table>
		<tr>
			<td>Category Code:</br>
			<form:input path="categoryCode"/></td>
		</tr>
		<tr>
			<td>Category Name:</br>
			<form:input path="categoryName"/></td>
		</tr>
		<tr>
			<td>Description:</br>
			<form:textarea path="description"/></td>
		</tr>
	</table>
	<input type="submit" value="Submit"/>
</form:form>
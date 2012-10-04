<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<form:form action="/admin/stores/save" method="POST" modelAttribute="store" enctype="multipart/form-data">
<h1>Create New Store</h1></br>
	<table>
		<tr>
			<td>Store Code:</br>
			<form:input path="storeCode"/></td>
		</tr>
		<tr>
			<td>Store Name:</br>
			<form:input path="storeName"/></td>
		</tr>
		<tr>
			<td>Store Address:</br>
			<form:textarea path="address"/></td>
		</tr>
	</table>
	<input type="submit" value="Submit"/>
</form:form>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<form:form action="/admin/products/save" method="POST" modelAttribute="product" enctype="multipart/form-data">
<h1>Create new Product</h1></br>
	<table>
		<tr>
			<td>Product Code:</br>
			<form:input path="productCode"/></td>
		</tr>
		<tr>
			<td>Product Name:</br>
			<form:input path="productName"/></td>
		</tr>
		<tr>
			<td>Product Description:</br>
			<form:textarea path="productDescription"/></td>
		</tr>
		<tr>
			<td>Product Cost:</br>
			<form:input path="productCost"/></td>
		</tr>
		<!-- <tr>
			<td>Category:</br>
			<form:input path="category"/></td>
		</tr> -->
	</table>
	<input type="submit" value="Submit"/>
</form:form>
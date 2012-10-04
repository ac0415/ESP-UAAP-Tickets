<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<form:form action="/admin/saletransactions/save" method="POST" modelAttribute="sale_transaction" enctype="multipart/form-data">
<h1>New Sale Transaction</h1></br>
	<table>
		<tr>
			<td>Sale Transaction Code:</br>
			<form:input path="transactionCode"/></td>
		</tr>
		<tr>
			<td>Date:</br>
			<form:input path="transactionDate"/></td>
		</tr>
		<!-- <tr>
			<td>Store:</br>
			<form:input path="store"/></td>
		</tr>
		<tr>
			<td>Product:</br>
			<form:input path="product"/></td>
		</tr> -->
		<tr>
			<td>Transaction Cost:</br>
			<form:input path="transactionCost"/></td>
		</tr>
	</table>
	<input type="submit" value="Submit"/>
</form:form>
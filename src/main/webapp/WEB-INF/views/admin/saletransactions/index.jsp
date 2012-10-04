<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Sale Transaction List</h1>

<table class="data_grid display">
	<thead>
		<tr>
			<th>Sale Transaction ID</th>
			<th>Actions</th>
		</tr>
	</thead>
	<c:forEach items="${saleTransactions}" var="saleTransaction">
	<tr>
		<td>${saleTransaction.id}</td>
		<td>
			<a href="/admin/saletransactions/${saleTransaction.saleTransactionId}">Show</a>
		</td>
	</tr>
	</c:forEach>
</table>

<script type="text/javascript">
$(document).ready(function() {
	$('table.data_grid').dataTable({
		"sPaginationType": "full_numbers"
	});
});
</script>
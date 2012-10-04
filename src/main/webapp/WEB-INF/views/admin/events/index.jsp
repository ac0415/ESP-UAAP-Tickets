<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Category List</h1>

<table class="data_grid display">
	<thead>
		<tr>
			<th>Name</th>
			<th>Actions</th>
		</tr>
	</thead>
	<c:forEach items="${categories}" var="category">
	<tr>
		<td>${category.categoryName}</td>
		<td>
			<a href="/admin/categories/${category.id}">Show</a>
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
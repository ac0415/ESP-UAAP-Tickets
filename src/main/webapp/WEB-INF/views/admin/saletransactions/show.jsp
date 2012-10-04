<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Sale Transaction Details</h1>

<h2>ID</h2>
<div>${saleTransaction.id}</div>

<h2>Code</h2>
<div>${saleTransaction.transactionCode}</div>

<h2>Date</h2>
<div>${saleTransaction.transactionDate}</div>

<h2>Store</h2>
<div>${saleTransaction.storeName}</div>

<h2>Product</h2>
<div>${saleTransaction.productName}</div>

<h2>Cost</h2>
<div>${saleTransaction.cost}</div>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="brand" href="${home}">Retail Admin</a>
			<!--<div class="pull-right" style="padding-top: 10px;">
			Logged in as: [username here] | <a href="">Logout</a>
			</div>-->
			<div class="nav-collapse">
			  <ul class="nav">
			    <li class="nav-admin"><a  href="${admin_index}">Admin</a></li>
			  </ul>
			</div>
		</div>
	</div>
</div>
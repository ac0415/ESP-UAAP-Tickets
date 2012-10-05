<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="brand" href="/">UAAP Tickets</a>
			<div class="pull-right" style="padding-top: 10px;">
				<sec:authorize access="isAuthenticated()"> 
					Logged in as: <sec:authentication property="principal.username"/>  | <a href="/logout">Logout</a>
				</sec:authorize>
				<sec:authorize access="!isAuthenticated()">
					<a href="/login">Login</a> 
				</sec:authorize>
			</div>
			<div class="nav-collapse">
			  <ul class="nav">
			    <li><a  href="/">Home</a></li>
			    <sec:authorize access="!isAuthenticated()"> 
			    	<li><a  href="/signup">Sign-up</a></li>
			    </sec:authorize>
			    <sec:authorize access="isAuthenticated()"> 
			    	<li><a  href="/profile">Profile</a></li>
			    	<li><a  href="/event">My Events</a></li>
			    </sec:authorize>
			  </ul>
			</div>
		</div>
	</div>
</div>
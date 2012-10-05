<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<div class="row well">
	<h1>Login Form</h1>
	<form action="j_spring_security_check" method="POST">
		<fieldset>
			<label>Username:</label>
			<input type="text" name="j_username" />
			<label>Password:</label>
			<input type="password" name="j_password" />
		</fieldset>
		<input type="submit" value="login" class="btn btn-primary"/>
	</form>	
</div>
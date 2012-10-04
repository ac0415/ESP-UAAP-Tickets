<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page session="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
	<head>
		<!-- CSS -->
		<spring:url value="/resources/styles/bootstrap.css" var="bootstrap_css_url" />
		<spring:url value="/resources/styles/bootstrap-responsive.css" var="bootstrap_responsive_css_url" />
		<spring:url value="/resources/styles/jquery.dataTables.css" var="dataTables_url" />
		<spring:url value="/resources/styles/main.css" var="main_css_url" />
		
		<link rel="stylesheet" type="text/css" media="screen" href="${bootstrap_css_url}" />
		<link rel="stylesheet" type="text/css" media="screen" href="${bootstrap_responsive_css_url}" />
		<link rel="stylesheet" type="text/css" media="screen" href="${dataTables_url}" />
		<link rel="stylesheet" type="text/css" media="screen" href="${main_css_url}" />
		
		<!-- Javascript -->
		<spring:url value="/resources/js/jquery.js" var="jquery_url" />
  		<spring:url value="/resources/js/jquery.dataTables.js" var="jquery_dataTables_url" />
  		
  		<script src="${jquery_url}" type="text/javascript"><!-- required for FF3 and Opera --></script>
  		<script src="${jquery_dataTables_url}" type="text/javascript"><!-- required for FF3 and Opera --></script>
	</head>
	<body>
		<body class="">
		   <div class="container">
		   		<tiles:insertAttribute name="menu"/>
			   	<div style="margin-top: 50px;"></div>
				<tiles:insertAttribute name="body"/>
			</div>
		</body>
	</body>
</html>
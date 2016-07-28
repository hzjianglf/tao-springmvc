<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.*"%>
<%@ page import="org.apache.shiro.subject.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<c:set var="base" value="${pageContext.request.contextPath}" />

<%
	response.setHeader("Expires","0");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragrma","no-cache");
	response.setDateHeader("Expires",0); 
%> 

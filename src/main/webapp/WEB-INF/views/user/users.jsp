<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>

<ul>
	<c:forEach items="${ users }" var="user">
		<li>${ user.id  } | ${ user.email }</li>
		<a href="/user/profile/${ user.id }">Profile</a>
	</c:forEach>
</ul>
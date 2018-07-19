<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>

ID : ${userModel.id}
<br>
EMAIL : ${userModel.email}
<br>
STATUs : ${userModel.userStatus.status}
<br>
ROLE : ${userModel.userRole}
<br>
IMAGE: <img src="${ userModel.profileImageUrl }" width="100px">
<br>
<a href="/user/${ userModel.id }/image">Upload profile image</a>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<form action="/user/image/upload" method="post"
	enctype="multipart/form-data">

	<input type="hidden" value="${ userId }" name="user_id"> <input
		type="file" name="profileImage"> <br>
	<button type="submit">Upload</button>

</form>
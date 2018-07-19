<%@ include file="/WEB-INF/taglib.jsp"%>
<form:form 
	cssClass="form-horizontal" 
	modelAttribute="userModel"
	action="/user/register" 
	method="POST">
	<fieldset>

		<!-- Form Name -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Email</label>
			<div class="col-md-5">
				<form:input path="email" type="email" cssClass="form-control input-md" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-4 control-label">Password</label>
			<div class="col-md-5">
				<form:input path="password" type="password" cssClass="form-control input-md" />
			</div>
		</div>

		<!-- Button -->
		<div class="form-group">
			<label class="col-md-4 control-label"></label>
			<div class="col-md-4">
				<button type="submit" class="btn btn-warning">Register</button>
			</div>
		</div>

	</fieldset>
</form:form>

<%@ include file="/WEB-INF/taglib.jsp"%>
<form:form cssClass="form-horizontal" modelAttribute="carMakeAttr"
	action="/add/make" method="POST">
	<fieldset>

		<!-- Form Name -->
		<legend>Add Make</legend>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Make
				name</label>
			<div class="col-md-5">
				<form:input path="name" type="text" cssClass="form-control input-md" />

			</div>
		</div>

		<!-- Button -->
		<div class="form-group">
			<label class="col-md-4 control-label"></label>
			<div class="col-md-4">
				<button type="submit" class="btn btn-warning">Add Make</button>
			</div>
		</div>

	</fieldset>
</form:form>

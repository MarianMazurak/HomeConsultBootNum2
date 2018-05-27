<%@ include file="/WEB-INF/taglib.jsp"%>

<form:form cssClass="form-horizontal" modelAttribute="carModelAttr"
	action="/add/model" method="POST">



	<fieldset>

		<!-- Form Name -->
		<legend>Add Model</legend>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Model
				name</label>
			<div class="col-md-5">
				<form:input path="name" type="text" cssClass="form-control input-md" />

			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Model
				year</label>
			<div class="col-md-5">
				<form:input path="year" type="text" cssClass="form-control input-md" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="selectbasic">Select
				make</label>
			<div class="col-md-5">
				<form:select path="make" cssClass="form-control">
					<form:options items="${ makeListAttr }" itemLabel="name" />
				</form:select>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="selectbasic">Select
				body Type</label>
			<div class="col-md-5">
				<form:select path="bodyType" cssClass="form-control">
					<form:options items="${ bodyTypeAttr }"  />
				</form:select>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="selectbasic">Select
				fuel type</label>
			<div class="col-md-5">
				<form:radiobuttons path="fuelType" items="${ fuelTypeAttr }"  />
			</div>
		</div>


		<!-- Button -->
		<div class="form-group">
			<label class="col-md-4 control-label"></label>
			<div class="col-md-4">
				<button type="submit" class="btn btn-warning">Add Model</button>
			</div>
		</div>

	</fieldset>



</form:form>
















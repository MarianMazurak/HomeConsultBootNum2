<%@ include file="/WEB-INF/taglib.jsp"%>

<table class="table ">
	<thead>
		<tr>
			<td>Id</td>
			<td>Make</td>
			<td>Model</td>
			<td>year</td>
			<td>fuel type</td>
			<td>body type</td>
		</tr>
	</thead>
	<tbody>

		<c:forEach items="${ listAttr }" var="make">

			<tr>
				
			</tr>

			<c:forEach items="${ make.carModelList }" var="carModelList">

				<tr>
				<td>${ make.id }</td>
				<td>${ make.name }</td>
					<td>${ carModelList.name }</td>
					<td>${ carModelList.year }</td>
					<td>${ carModelList.bodyType }</td>
					<td>${ carModelList.fuelType }</td>
				</tr>



			</c:forEach>

		</c:forEach>

	</tbody>



</table>
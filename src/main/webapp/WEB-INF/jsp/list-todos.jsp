<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Todo</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of TODO's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">Description</th>
						<th width="20%">Target Date</th>
						<th width="20%">Creation Date</th>
						<th width="20%">Status</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.targetDate}"
									pattern="dd/MM/yyyy" /></td>
									
						<td><fmt:formatDate value="${todo.creationDate}"
									pattern="dd/MM/yyyy" /></td>
									
								<td>${todo.status}</td>	
								
							<td><a type="button" class="btn btn-success"
								href="/update-todo?id=${todo.id}">Update</a>
							<a type="button" class="btn btn-warning"
								href="/delete-todo?id=${todo.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
 
<c:if test="${pageContext.request.userPrincipal.name != null}">

	<div class="panel panel-primary">
		<div class="panel-heading">Home Page</div>
		<div class="panel-body">
			Welcome ${pageContext.request.userPrincipal.name}!! <a href="/list-todos">Click Me</a> If you want
			to Manage Your todo's List.
		</div>
	</div>
	
</c:if>
	 
</div>
<%@ include file="common/footer.jspf"%>
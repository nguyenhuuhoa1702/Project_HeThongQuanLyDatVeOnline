<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!-- tự động -->
<ul>
<c:forEach var="item" items="${menu}">
	<li>${item}</li>
</c:forEach>
</ul>
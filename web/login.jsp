<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
    <form action="${pageContext.request.contextPath}/login" method="POST">
        <div>
            <label>ID:</label>
            <input type="text" name="id">
        </div>
        <br>
        <div>
            <label>Password:</label>
            <input type="password" name="pw">
        </div>
        <br>
        <input type="submit" value="Submit">
    </form>

</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

<body>
<%@include file="dynamic/navBar.jspf" %>
<%@include file="home/home.jsp" %>
<main id="main">
    <%@include file="about/about.jsp" %>
    <%@include file="technologies/technologies.jsp" %>
    <%@include file="dynamic/counter.jspf" %>
    <%@include file="work/work.jsp" %>
    <%@include file="education/education.jsp" %>
    <%@include file="contactSection/contact.jsp" %>
</main>
<%@include file="dynamic/footer.jspf" %>
<%@include file="dynamic/javaScript.jspf" %>
</body>
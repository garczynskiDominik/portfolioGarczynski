<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@include file="../dynamic/navBar.jspf" %>


<!-- ======= Hero Section ======= -->
<div id="hero" class="hero route bg-image"
     style="background-image: url(/resources/img/fire_black_background_2560x1600.jpg)">
    <div class="overlay-itro"></div>
    <div class="hero-content display-table">
        <div class="table-cell">
            <c:forEach items="${about}" var="title">
                <div class="container">
                    <!--<p class="display-6 color-d">Hello, world!</p>-->
                    <h1 class="hero-title mb-4">I am ${title.name}</h1>
                    <p class="hero-subtitle"><span class="typed"
                                                   data-typed-items="Designer, Developer, Freelancer, Photographer"></span>
                    </p>

                    </p>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
<!-- End Hero Section -->

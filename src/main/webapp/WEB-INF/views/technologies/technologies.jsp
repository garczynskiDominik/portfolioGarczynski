<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@include file="../dynamic/navBar.jspf" %>

<section id="services" class="paralax-mf footer-paralax bg-image sect-mt4 route">
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="title-box text-center">
                    <h3 class="title-a">
                        Technologies
                    </h3>
                    <p class="subtitle-a">
                        Technologies I was learning.
                    </p>
                    <div class="line-mf"></div>
                </div>
            </div>
        </div>
        <sec:authorize access="hasRole('ADMIN')">
            <a href='<c:url value="/addTechnologies"/>' class="btn-right btn btn-secondary" role="button"><i
                    class="bx bx-edit"></i>Add</a>
        </sec:authorize>
        <div class="row">
            <c:forEach items="${technologies}" var="techno">
                <div class="col-md-4">
                    <div class="service-box">
                        <div class="service-ico">
                            <span class="ico-circle"><i class="${techno.logo}"></i></span>
                        </div>
                        <div class="service-content">
                            <h2 class="s-title">${techno.title}</h2>
                            <p class="s-description text-center">
                                    ${techno.description}
                            </p>
                        </div>
                        <sec:authorize access="hasRole('ADMIN')">
                            <a href='<c:url value="/editTechnologies/${techno.id}"/>'> <span
                                    class="bi bi-arrow-counterclockwise"></span></a>
                        </sec:authorize>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>

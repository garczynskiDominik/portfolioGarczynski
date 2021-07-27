<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@include file="../dynamic/css.jspf" %>
<%@include file="../dynamic/navBar.jspf" %>


<section id="blog" class="paralax-mf footer-paralax bg-image sect-mt4 route">
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="title-box text-center">
                    <h3 class="title-a">
                        Certifications and Education
                    </h3>
                    <p class="subtitle-a">
                        My scientific achievements.

                    </p>
                    <div class="line-mf"></div>
                </div>
            </div>
        </div>
        <sec:authorize access="hasRole('ADMIN')">
            <a href='<c:url value="/addEducation"/>' class="btn-right btn btn-secondary" role="button"><i
                    class="bx bx-edit"></i>Add</a>
        </sec:authorize>
        <div class="row">
            <c:forEach items="${education}" var="edu">
                <div class="col-md-4">
                    <div class="card card-blog">
                        <div class="card-img">
                            <img src="${edu.img}" alt=""
                                                            class="img-fluid">
                        </div>
                        <div class="card-body">
                            <div class="card-category-box">
                                <div class="card-category">
                                    <h6 class="category">${edu.type}</h6>
                                </div>
                            </div>
                            <h3 class="card-title">${edu.nameOfSchool}</h3>
                            <sec:authorize access="hasRole('ADMIN')">
                                <a href='<c:url value="/editEducation/${edu.id}"/>'> <span
                                        class="bi bi-arrow-counterclockwise"></span></a>
                            </sec:authorize>
                            <p class="card-description">
                                    ${edu.description}
                            </p>
                        </div>
                        <div class="card-footer">
                            <div class="post-author">
                                <span class="bi bi-calendar-date"> Start: <fmt:formatDate value="${edu.dateStart}"
                                                                                          pattern="yyyy"/></span>
                            </div>
                            <div class="post-date">
                                <span class="bi bi-calendar-date">End: <fmt:formatDate value="${edu.dateEnd}"
                                                                                       pattern="yyyy"/></span>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>
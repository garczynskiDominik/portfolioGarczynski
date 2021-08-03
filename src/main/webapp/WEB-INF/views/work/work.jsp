<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>
<%@include file="../dynamic/navBar.jspf" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<section id="work" class="paralax-mf footer-paralax bg-image sect-mt4 route">
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="title-box text-center">
                    <h3 class="title-a">
                        My projects
                    </h3>
                    <p class="subtitle-a">
                        Work.
                    </p>
                    <div class="line-mf"></div>
                </div>
            </div>
        </div>
        <sec:authorize access="hasRole('ADMIN')">
            <a href='<c:url value="/addWork"/>' class="btn-right btn btn-secondary" role="button"><i
                    class="bx bx-edit"></i>Add</a>
        </sec:authorize>
        <div class="row">
            <c:forEach items="${work}" var="title">
                <div class="col-md-4">
                    <div class="work-box">
                        <a href="${title.img}" data-gallery="portfolioGallery" class="portfolio-lightbox">
                            <div class="work-img">
                                <img src="${title.img}"
                                     alt="nie znaleziono foty" class="img-fluid">
                            </div>
                        </a>
                        <div class="work-content">
                            <div class="row">
                                <div class="col-sm-8">
                                    <h2 class="w-title">${title.title}</h2>
                                    <div class="w-more">
                                        <span class="w-ctegory">${title.category}</span> / <span
                                            class="w-date"><fmt:formatDate value="${title.date}"
                                                                                         pattern="yyyy-MM-dd"/></span>
                                    </div>
                                </div>
                                <div class="col-sm-4">

                                    <div class="w-like">
                                        <a href="${title.url}"> <span
                                                class="bi bi-box-arrow-down-right"></span></a>
                                        <sec:authorize access="hasRole('ADMIN')">
                                            <a href='<c:url value="/editWork/${title.id}"/>'> <span
                                                    class="bi bi-arrow-counterclockwise"></span></a>
                                        </sec:authorize>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>
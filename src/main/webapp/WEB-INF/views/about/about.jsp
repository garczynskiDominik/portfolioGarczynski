<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%@include file="../dynamic/css.jspf" %>
<body>
<%@include file="../dynamic/navBar.jspf" %>


<!-- ======= About Section ======= -->
<section id="about" class="about-mf sect-pt4 route">
    <div class="container">
        <div class="row">

            <div class="col-sm-12">
                <div class="box-shadow-full">
                    <c:forEach items="${about}" var="title">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="row">
                                    <div class="col-sm-6 col-md-5">
                                        <div class="about-img">
                                            <img SRC="${title.img}"
                                                 width="150" height="200">
                                        </div>
                                    </div>


                                    <div class="col-sm-6 col-md-7">
                                        <div class="about-info">

                                            <p><span class="title-s">Name: </span> <span>${title.name}</span></p>
                                            <p><span class="title-s">Profile: </span> <span>${title.profile}</span></p>
                                            <p><span class="title-s">Email: </span> <span>${title.email}</span></p>
                                            <p><span class="title-s">Phone: </span> <span>${title.number}</span></p>

                                        </div>
                                    </div>


                                </div>
                                <div class="skill-mf">
                                    <p class="title-s">Skill</p>
                                    <span>JAVA</span> <span class="pull-right">${title.java}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.java}%;"
                                             aria-valuenow="${title.java}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>GIT</span> <span class="pull-right">${title.git}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.git}%"
                                             aria-valuenow="${title.git}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>SPRING</span> <span class="pull-right">${title.spring}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.spring}%"
                                             aria-valuenow="${title.spring}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>SQL</span> <span class="pull-right">${title.mySql}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.mySql}%"
                                             aria-valuenow="${title.mySql}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>HIBERNATE</span> <span class="pull-right">${title.hibernate}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.hibernate}%"
                                             aria-valuenow="${title.hibernate}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>HTML/CSS</span> <span class="pull-right">${title.htmlCss}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.htmlCss}%"
                                             aria-valuenow="${title.htmlCss}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <span>JAVA SCRIPT</span> <span class="pull-right">${title.javaScript}%</span>
                                    <div class="progress">
                                        <div class="progress-bar" role="progressbar" style="width: ${title.javaScript}%"
                                             aria-valuenow="${title.javaScript}"
                                             aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                </div>
                            </div>


                            <div class="col-md-6">
                                <div class="about-me pt-4 pt-md-0">
                                    <div class="title-box-2">
                                        <h5 class="title-left">
                                            About me
                                        </h5>
                                    </div>
                                    <p class="lead">
                                            ${title.aboutMe}
                                    </p>

                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <sec:authorize access="hasRole('ADMIN')">
                        <c:forEach items="${about}" var="title">
                            <a href='<c:url value="/editAbout/${title.id}"/>'
                               class="btn-right btn btn-secondary" role="button"><i class="bx bx-edit"></i>Edit</a>
                        </c:forEach>
                    </sec:authorize>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>

<!-- End About Section -->

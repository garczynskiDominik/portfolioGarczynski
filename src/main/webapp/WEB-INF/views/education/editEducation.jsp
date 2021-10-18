<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%@include file="../dynamic/css.jspf" %>
<body>
<%@include file="../dynamic/navBar.jspf" %>


<section id="contact" class="paralax-mf footer-paralax bg-image sect-mt4 route"
         style="background-image: url(/resources/img/overlay-bg.jpg)">
    <div class="overlay-mf"></div>
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="contact-mf">
                    <div id="contact" class="box-shadow-full">
                        <div class="row">
                            <form name="send" method="post" action='<c:url value="/editEducation/${id}"/>'>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="box-shadow-full">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="row">
                                                        <div class="col-sm-6 col-md-7">
                                                            <div class="about-info">
                                                                <p><span class="title-s">Title: </span> <span><label
                                                                        class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="nameOfSchool"
                                                   value="${education.nameOfSchool}">
                                        </span></p>
                                                                <p><span class=" title-s">Type: </span>
                                                                    <span><input
                                                                            class="form-control"
                                                                            type="text"
                                                                            name="type"
                                                                            value="${education.type}"></span>
                                                                </p>
                                                                <p><span class="title-s">Date start: </span>
                                                                    <span><input
                                                                            class="form-control"
                                                                            type="date"
                                                                            name="dateStart"
                                                                            max="3000-12-31"
                                                                    ></span>
                                                                </p>
                                                                <p><span class="title-s">Date end: </span>
                                                                    <span><input
                                                                            class="form-control"
                                                                            type="date"
                                                                            name="dateEnd"
                                                                            max="3000-12-31"
                                                                    ></span>
                                                                </p>
                                                                <p><span class="title-s">Description:  </span>
                                                                    <span> <textarea class="form-control"
                                                                                     name="description" rows="5"
                                                                                     value="${education.description}"
                                                                    ></textarea></span>
                                                                </p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <input class="button button-a button-big button-rouded" type="submit" value="Save"
                                       id="searchButton"></input>
                            </form>
                            <form name="send" method="POST"
                                  action='<c:url value="/deleteEducation/${education.id}"/>'>
                                <input type="submit" class="button button-b button-big button-rouded"
                                       name="delete" value="Delete"/>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>
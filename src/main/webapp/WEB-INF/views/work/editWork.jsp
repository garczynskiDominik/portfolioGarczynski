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
                            <form name="send" method="post" action='<c:url value="/editWork/${id}"/>'>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="box-shadow-full">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="row">
                                                        <div class="col-sm-6 col-md-5">
                                                            <div class="about-img">
                                                                <img SRC="${work.img}"
                                                                     width="150" height="200">
                                                                </br>
                                                            </div>
                                                            <input class="form-control"
                                                                   type="text"
                                                                   name="img"
                                                                   value="${work.img}">
                                                        </div>
                                                        <div class="col-sm-6 col-md-7">
                                                            <div class="about-info">
                                                                <p><span class="title-s">Title: </span> <span><label
                                                                        class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="title" value="${work.title}">
                                        </span></p>
                                                                <p><span class=" title-s">Category: </span>
                                                                    <span><input
                                                                            class="form-control"
                                                                            type="text"
                                                                            name="category"
                                                                            value="${work.category}"></span>
                                                                </p>
                                                                <p><span class="title-s">Date create: </span>
                                                                    <span><input
                                                                            class="form-control"
                                                                            type="date"
                                                                            name="date"
                                                                            max="3000-12-31"
                                                                            min="<fmt:formatDate pattern="yyyy-MM-dd" value="${now}"/>"></span>
                                                                </p>
                                                                <p><span class="title-s">Url: </span> <span><label
                                                                        class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="url" value="${work.url}">
                                        </span></p>
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
                            <form name="send" method="POST" action='<c:url value="/deleteWork/${work.id}"/>'>
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
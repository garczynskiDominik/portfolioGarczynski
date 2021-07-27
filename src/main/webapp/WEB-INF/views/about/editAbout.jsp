<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%@include file="../dynamic/css.jspf" %>
<body>
<%@include file="../dynamic/navBar.jspf" %>


<section id="contact" class="paralax-mf footer-paralax bg-image sect-mt4 route"
         style="background-image: url(../resources/img/overlay-bg.jpg)">
    <div class="overlay-mf"></div>
    <div class="container">
        <form name="send" method="post" action='<c:url value="/editAbout/${about.id}"/>'>
            <div class="row">
                <div class="col-sm-12">
                    <div class="contact-mf">
                        <div id="contact" class="box-shadow-full">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="row">
                                        <div class="col-sm-6 col-md-5">
                                            <div class="about-img">
                                                <img SRC="${about.img}"
                                                     width="150" height="200">
                                                </br>
                                            </div>
                                            <input class="form-control"
                                                   type="text"
                                                   name="img"
                                                   value="${about.img}">
                                        </div>
                                        <div class="col-sm-6 col-md-7">
                                            <div class="about-info">
                                                <p><span class="title-s">Name: </span> <span><label
                                                        class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="name" value="${about.name}">
                                        </span></p>
                                                <p><span class=" title-s">Profile: </span> <span>

                                                <input class="form-control"
                                                       type="text"
                                                       name="profile"
                                                       value="${about.profile}">
                                            </span>
                                                </p>
                                                <p><span class="title-s">Email: </span> <span><input
                                                        class="form-control"
                                                        type="text"
                                                        name="email"
                                                        value="${about.email}"></span>
                                                </p>
                                                <p><span class="title-s">Phone: </span> <span><input
                                                        class="form-control"
                                                        type="text"
                                                        name="number"
                                                        value="${about.number}"></span>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-12 col-md-12 mb-12">
                                        <div class="card shadow mb-4">
                                            <div class="card-header py-3">

                                                <div class="row">
                                                    <div class="col-2">
                                                        <label class="col-form-label">Java</label>
                                                        <input class="form-control" type="text" name="java"
                                                               value="${about.java}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">Git</label>
                                                        <input class="form-control" type="text" name="git"
                                                               value="${about.git}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">Hibernate</label>
                                                        <input class="form-control" type="text" name="hibernate"
                                                               value="${about.hibernate}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">Spring</label>
                                                        <input class="form-control" type="text" name="spring"
                                                               value="${about.spring}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">SQL</label>
                                                        <input class="form-control" type="text" name="mySql"
                                                               value="${about.mySql}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">HTML/CSS</label>
                                                        <input class="form-control" type="text" name="htmlCss"
                                                               value="${about.htmlCss}">
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="col-form-label">JAVA SCRIPT</label>
                                                        <input class="form-control" type="text" name="JavaScript"
                                                               value="${about.javaScript}">
                                                    </div>
                                                </div>
                                            </div>
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
                                        <div class="col-10">
                                <textarea class="form-control" rows="5" id="start" name="aboutMe"
                                >${about.aboutMe}</textarea>
                                        </div>
                                        </p>
                                        <p><span class="title-s">Address</span> <span><input class="form-control"
                                                                                             type="text"
                                                                                             name="address"
                                                                                             value="${about.address}"></span>
                                        </p>
                                        <p><span class="title-s">Facebook</span> <span><input class="form-control"
                                                                                              type="text"
                                                                                              name="facebook"
                                                                                              value="${about.facebook}"></span>
                                        </p>
                                        <p><span class="title-s">GitHub</span> <span><input class="form-control"
                                                                                            type="text"
                                                                                            name="github"
                                                                                            value="${about.github}"></span>
                                        </p>
                                        <p><span class="title-s">Linkedin</span> <span><input class="form-control"
                                                                                              type="text"
                                                                                              name="linkedin"
                                                                                              value="${about.linkedin}"></span>
                                        </p>
                                    </div>
                                </div>
                                <div class="col-10">
                                    <input class="button button-a button-big button-rouded" type="submit" value="Save"
                                           id="searchButton"></input>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<%@include file="../dynamic/css.jspf" %>
<%@include file="../dynamic/navBar.jspf" %>


<section id="contact" class="paralax-mf footer-paralax bg-image sect-mt4 route"
         style="background-image: url(../resources/img/overlay-bg.jpg)">
    <div class="overlay-mf"></div>
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="contact-mf">
                    <div id="contact" class="box-shadow-full">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="title-box-2">
                                    <h5 class="title-left">
                                        Add Education
                                    </h5>
                                </div>
                                <div>
                                    <form action='<c:url value="/addEducation"/>' method="post" name="send">
                                        <div class="row">
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input type="text" name="nameOfSchool" class="form-control"
                                                           id="nameOfSchool"
                                                           placeholder="enter name of school" required>
                                                </div>
                                                <div class="form-group">
                                                    <input type="text" name="type" class="form-control" id="type"
                                                           placeholder="enter type" required>
                                                </div>
                                                <div class="form-group">
                                                    <input type="text" name="description" class="form-control"
                                                           id="description"
                                                           placeholder="enter description" required>
                                                </div>
                                            </div>
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input class="form-control"
                                                           type="date"
                                                           name="dateStart"
                                                           max="3000-12-31"
                                                    ></span>
                                                </div>
                                            </div>
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input class="form-control"
                                                           type="date"
                                                           name="dateEnd"
                                                           max="3000-12-31"
                                                    ></span>
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="form-group">
                                                    <input type="text" name="img" class="form-control" id="img"
                                                           placeholder="enter link to IMG" required>
                                                </div>
                                            </div>
                                            <div class="col-md-12 text-center">
                                                <input class="button button-a button-big button-rouded" type="submit"
                                                       value="Save"
                                                       id="searchButton"></input>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>
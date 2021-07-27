<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@include file="../dynamic/css.jspf" %>

<section id="contact" class="paralax-mf footer-paralax bg-image sect-mt4 route"
         style="background-image: url(../resources/img/overlay-bg.jpg)">
    <div class="overlay-mf"></div>
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="contact-mf">
                    <div id="contact" class="box-shadow-full">
                        <div class="row">
                            <div class="col-md-offset-12">
                                <div class="title-box-2">
                                    <h5 class="title-left">
                                        Register
                                    </h5>
                                </div>
                                <form name="send" method="post" action='<c:url value="/addUser"/>' class="box">
                                    <div>
                                        <div class="col-md-12 mb-3">
                                            <div class="form-group">
                                                <input type="text" name="username" class="form-control" id="username"
                                                       placeholder="Please enter your username" required>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-3">
                                            <div class="form-group">
                                                <input type="password" class="form-control" name="password"
                                                       id="password" placeholder="Please enter your password" required>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-3">
                                            <div class="form-group">
                                                <input type="text" class="form-control" name="company"
                                                       id="company" placeholder="Please enter compnay name" required>
                                            </div>
                                        </div>
                                        <input type="submit" class="button button-a button-big button-rouded"
                                               value="Register">
                                    </div>
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
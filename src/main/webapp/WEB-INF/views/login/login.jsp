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
                            <div class="col-md-6">
                                <div class="title-box-2">
                                    <h5 class="title-left">
                                        Login
                                    </h5>
                                </div>
                                <form method="post" action='<c:url value="/login"/>'>
                                    <div>
                                        <div class="col-md-12 mb-3">
                                            <div class="form-group">
                                                <input type="text" name="username" class="form-control"
                                                       placeholder="user" required>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-3">
                                            <div class="form-group">
                                                <input type="password" class="form-control" name="password"
                                                       placeholder="password" required>
                                            </div>
                                        </div>
                                        <input type="submit" class="button button-a button-big button-rouded"
                                               value="Login">
                                    </div>

                                </form>
                                <p class="lead">
                                    If you don't have account on my portfolio web app, please register to check how
                                    working my code.
                                    Default i give you role USER. ADMIN can more... Code have all CRUD functions
                                </p>
                                <a href='<c:url value="/register"/>' class="button button-a button-big button-rouded"
                                   role="button"><i
                                        class="bx bx-edit"></i>Register</a>
                            </div>
                            <div class="col-md-6">
                                <div class="title-box-2 pt-4 pt-md-0">
                                    <h5 class="title-left">
                                        Hello this is my portfolio
                                    </h5>
                                </div>
                                <div class="more-info">
                                    <p class="lead">
                                        My name is Dominik... This web application shows my achievements so far.
                                        After logging in as admin, the user will have additional options to add, modify,
                                        delete data in each one of the tabs. Everything is connected to the Postgres database.
                                    </p>
                                    <ul class="list-ico">
                                        <li><span class="bi bi-geo-alt"></span> Rzeszów</li>
                                        <li><span class="bi bi-phone"></span> 725248347</li>
                                        <li><span class="bi bi-envelope"></span> garczynski.dominik@gmail.com</li>
                                    </ul>
                                </div>
                                <div class="socials">
                                    <ul>
                                        <li><a href="https://www.facebook.com/zgarniacz"><span class="ico-circle"><i
                                                class="bi bi-facebook"></i></span></a></li>
                                        <li><a href="https://github.com/garczynskiDominik"><span class="ico-circle"><i
                                                class="bi bi-github"></i></span></a></li>
                                        <li>
                                            <a href="https://www.linkedin.com/in/dominik-garczy%C5%84ski-84139a12a/"><span
                                                    class="ico-circle"><i
                                                    class="bi bi-linkedin"></i></span></a></li>
                                    </ul>
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
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
                                        Message me
                                    </h5>
                                </div>
                                <div>
                                    <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                                        <div class="row">
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input type="text" name="name" class="form-control" id="name"
                                                           placeholder="Your Name" required>
                                                </div>
                                            </div>
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input type="email" class="form-control" name="email" id="email"
                                                           placeholder="Your Email" required>
                                                </div>
                                            </div>
                                            <div class="col-md-12 mb-3">
                                                <div class="form-group">
                                                    <input type="text" class="form-control" name="subject" id="subject"
                                                           placeholder="Subject" required>
                                                </div>
                                            </div>
                                            <div class="col-md-12">
                                                <div class="form-group">
                                                    <textarea class="form-control" name="message" rows="5"
                                                              placeholder="Message" required></textarea>
                                                </div>
                                            </div>
                                            <div class="col-md-12 text-center my-3">
                                                <div class="loading">Loading</div>
                                                <div class="error-message"></div>
                                                <div class="sent-message">Your message has been sent. Thank you!</div>
                                            </div>
                                            <div class="col-md-12 text-center">
                                                <button type="submit" class="button button-a button-big button-rouded">
                                                    Send Message
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="title-box-2 pt-4 pt-md-0">
                                    <h5 class="title-left">
                                        Get in Touch
                                    </h5>
                                </div>
                                <c:forEach items="${about}" var="title">
                                <div class="more-info">
                                    <p class="lead">
                                        If You want work with me..
                                    </p>
                                    <ul class="list-ico">
                                        <li><span class="bi bi-geo-alt"></span> ${title.address}</li>
                                        <li><span class="bi bi-phone"></span> ${title.number}</li>
                                        <li><span class="bi bi-envelope"></span> ${title.email}</li>
                                    </ul>
                                </div>
                                <div class="socials">
                                    <ul>
                                        <li><a href="${title.facebook}"><span class="ico-circle"><i
                                                class="bi bi-facebook"></i></span></a></li>
                                        <li><a href="${title.github}"><span class="ico-circle"><i
                                                class="bi bi-github"></i></span></a></li>
                                        <li><a href="${title.linkedin}"><span class="ico-circle"><i
                                                class="bi bi-linkedin"></i></span></a></li>
                                    </ul>
                                </div>
                            </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<%@include file="../dynamic/footer.jspf" %>
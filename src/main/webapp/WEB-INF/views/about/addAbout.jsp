
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
                    <div class="row">
                        <div class="col-md-6">
                            <div class="row">
                                <div class="col-sm-6 col-md-5">
                                    <div class="about-img">
                                        <img src='<c:url value="/resources/img/testimonial-2.jpg"/>'
                                             class="img-fluid rounded b-shadow-a" alt="">
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-7">
                                    <div class="about-info">
                                        <p><span class="title-s">Name: </span> <span><label class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="name" placeholder="enter your name">
                                        </span></p>
                                        <p><span class="title-s">Profile: </span> <span><input class="form-control" type="text" name="profile" placeholder="enter your profile"></span></p>
                                        <p><span class="title-s">Email: </span> <span><input class="form-control" type="text" name="email"
                                                                                             placeholder="enter your email"></span></p>
                                        <p><span class="title-s">Phone: </span> <span><input class="form-control" type="text" name="number"
                                                                                             placeholder="enter your number"></span></p>
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
                                    <input class="form-control" type="text" name="aboutMe"
                                           placeholder="write somethink about you">
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End About Section -->

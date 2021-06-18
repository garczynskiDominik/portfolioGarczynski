<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>


<%@include file="dynamic/css.jspf" %>


<body>

<%@include file="dynamic/navBar.jspf" %>

<%@include file="home/home.jsp" %>

<main id="main">

    <%@include file="about/about.jsp" %>

    <%@include file="services/services.jsp" %>

    <%@include file="dynamic/counter.jspf" %>

    <%@include file="work/work.jsp" %>

    <!-- ======= Testimonials Section ======= -->
    <div class="testimonials paralax-mf bg-image" style="background-image: url(/resources/img/overlay-bg.jpg)">
        <div class="overlay-mf"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">

                    <div class="testimonials-slider swiper-container" data-aos="fade-up" data-aos-delay="100">
                        <div class="swiper-wrapper">

                            <div class="swiper-slide">
                                <div class="testimonial-box">
                                    <div class="author-test">
                                        <img src="../resources/img/testimonial-2.jpg" alt=""
                                             class="rounded-circle b-shadow-a">
                                        <span class="author">Xavi Alonso</span>
                                    </div>
                                    <div class="content-test">
                                        <p class="description lead">
                                            Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Lorem ipsum
                                            dolor sit amet,
                                            consectetur adipiscing elit.
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <div class="testimonial-box">
                                    <div class="author-test">
                                        <img src="../resources/img/testimonial-4.jpg" alt=""
                                             class="rounded-circle b-shadow-a">
                                        <span class="author">Marta Socrate</span>
                                    </div>
                                    <div class="content-test">
                                        <p class="description lead">
                                            Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Lorem ipsum
                                            dolor sit amet,
                                            consectetur adipiscing elit.
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>

                    <!-- <div id="testimonial-mf" class="owl-carousel owl-theme">

                </div> -->
                </div>
            </div>
        </div>
    </div><!-- End Testimonials Section -->


    <%@include file="blog/blog.jsp" %>


    <%@include file="contactSection/contact.jsp" %>


</main><!-- End #main -->

<%@include file="dynamic/footer.jspf" %>

<div id="preloader"></div>
<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
        class="bi bi-arrow-up-short"></i></a>

<%@include file="dynamic/javaScript.jspf" %>


</body>

</html>
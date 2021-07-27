<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<%@include file="../dynamic/css.jspf" %>
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
                            <form action='<c:url value="/editTechnologies/${id}"/>' method="post" name="send">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="title-box-2">
                                            <h5 class="title-left">
                                                Edit ${technologies.title}
                                            </h5>
                                        </div>
                                        <div>
                                            <div class="row">
                                                <div class="col-md-12 mb-3">
                                                    <div class="form-group">
                                                        <input type="text" name="title" class="form-control" id="title"
                                                               value="${technologies.title}" required>
                                                    </div>
                                                </div>
                                                <div class="col-md-12 mb-3">
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" name="logo" id="logo"
                                                               value="${technologies.logo}" required>
                                                    </div>
                                                </div>
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                    <textarea class="form-control" name="description" rows="5"
                                                              value="${technologies.description}" required></textarea>
                                                    </div>
                                                    </br>
                                                </div>
                                                <div class="col-md-12 text-left">
                                                    <button type="submit"
                                                            class="button button-a button-big button-rouded">
                                                        Save
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <form name="send" method="POST" action='<c:url value="/deleteTechnologies/${technologies.id}"/>'>
                                <input type="submit" class="button button-b button-big button-rouded"
                                       name="delete" value="Delete"/>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../dynamic/footer.jspf" %>
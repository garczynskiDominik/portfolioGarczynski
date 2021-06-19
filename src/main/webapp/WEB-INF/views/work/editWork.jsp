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
        <form name="send" method="post" action='<c:url value="/editWork/${work.id}"/>'>
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
                                               placeholder="enter link to new photo">
                                    </div>
                                    <div class="col-sm-6 col-md-7">
                                        <div class="about-info">
                                            <p><span class="title-s">Title: </span> <span><label
                                                    class="col-2 col-form-label"></label>
                                            <input class="form-control" type="text" name="title" value="${work.title}">
                                        </span></p>
                                            <p><span class=" title-s">Category: </span> <span><input
                                                    class="form-control"
                                                    type="text"
                                                    name="category"
                                                    value="${work.category}"></span>
                                            </p>
                                            <p><span class="title-s">Date: </span> <span><input class="form-control"
                                                                                                type="date"
                                                                                                name="deadline"
                                                                                                max="3000-12-31"
                                                                                                min="<fmt:formatDate pattern="yyyy-MM-dd" value="${now}"/>"></span>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <input class="button button-a button-big button-rouded" type="submit" value="Save"
                           id="searchButton"></input>
                    <form name="send" method="POST" action='<c:url value="/deleteWork/${id}"/>'>
                    <button type="button" class="btn btn-danger button-big button-rouded" data-toggle="modal" data-target="#myModal">
                        Usuń
                    </button>
                    </form>

                    </div>

                </div>
            </div>

        </form>
    </div>
</section><!-- End About Section -->


<%@include file="../dynamic/footer.jspf" %>
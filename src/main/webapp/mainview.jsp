<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header.jsp" %>

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">



            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">Witaj w mojej aplikacji</h1>

                </div>

                <!-- Content Row -->




                <div class="row">

                    <!-- Area Chart -->
                    <div class="col-xl-8 col-lg-7">
                        <div class="card shadow mb-4">
                            <!-- Card Header - Dropdown -->


                        </div>
                    </div>

                    <!-- Pie Chart -->
                    <div class="col-xl-4 col-lg-5">
                        <div class="card shadow mb-4">



                        </div>
                    </div>
                </div>

                <!-- Content Row -->
                <div class="row">

                    <!-- Content Column -->
                    <div class="col-lg-6 mb-4">


                        <!-- Approach -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">Użytkownicy</h6>
                            </div>
                            <div class="card-body">
                                <c:forEach items="${users}" var="user">
                                    <p>${user.id}</p>
                                </n>
                                    <p>${user.userName}</p>
                                    </n>
                                    <p>${user.email}</p>
                                    </n>
                                    <p><a href="<c:url value="/editeuser?id=${user.id}"/>">Edytuj użytkownika</a></p>
                                    </n>
                                    <p><a href="<c:url value="/deleteuser?id=${user.id}"/>">Usuń użytkownika</a></p>
                                    </n>
                                </c:forEach>
                                <p></p>

                            </div>
                        </div>

                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

<%@ include file="/footer.jsp" %>
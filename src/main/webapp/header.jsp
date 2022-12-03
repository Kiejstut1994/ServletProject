<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Mój projekt servlety</title>

    <!-- Custom fonts for this template-->
    <link href="<c:url value="vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet" type="text/css">
    <link
            href="<c:url value="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"/>"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="css/sb-admin-2.min.css"/>" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/mainview">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Mój projekt servlety </div>
        </a>
        <!-- Divider -->
        <hr class="sidebar-divider my-0">
        <!-- Heading -->
        <div class="sidebar-heading">
            Wybierz co chcesz zrobić
        </div>
        <!-- Nav Item - Charts -->
        <li class="nav-item">
            <a class="nav-link" href="/mainview">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Wyświetl użytkowników</span></a>
        </li>

        <!-- Nav Item - Tables -->
        <li class="nav-item">
            <a class="nav-link" href="/adduser">
                <i class="fas fa-fw fa-table"></i>
                <span>Dodaj użytkownika</span></a>
        </li>
    </ul>
    <div id="content-wrapper" class="d-flex flex-column">

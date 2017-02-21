<%-- 
Document   : home
Created on : 25/07/2016, 06:27:44 PM
Author     : nalvarez
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Home</title>

    </head>
    <body>
        <div class="container cont-form">
            <h3>Home!</h3>
            ${user}

        </div>    
    </body>
</html>
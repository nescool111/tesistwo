<%-- 
    Document   : navegador
    Created on : 21/11/2013, 12:06:14 AM
    Author     : lacastrillov
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String ExtJSLib="https://ext-js-4-dot-proven-signal-88616.appspot.com/ext";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion Novaventa</title>
        <link rel="icon" type="image/icon" href="/img/favicon.ico" /> 
        
        <script type="text/javascript">
            var ExtJSLib="<%=ExtJSLib%>";
        </script>
        
        <script src="<%=ExtJSLib%>/examples/shared/include-ext.js"></script>
        <!--<script src="<%=ExtJSLib%>/examples/shared/options-toolbar.js"></script>-->
        
        <!-- ############################ IMPORT LAYOUTS ################################ -->
        
        <c:set var="basePath" value="/vista" ></c:set>
        
        <!-- ############################ IMPORT MODELS ################################### -->
        
        <c:import url="${basePath}/${entityRef}/reportExtModel/${reportName}.htm"/>
        
        <!-- ############################ IMPORT STORES ################################### -->
        
        <c:import url="${basePath}/${entityRef}/reportExtStore/${reportName}.htm"/>
        
        <!-- ############################ IMPORT VIEWS ################################### -->
        
        <c:import url="${basePath}/${entityRef}/reportExtView/${reportName}.htm"/>
        
        <c:import url="${basePath}/${entityRef}/reportExtController/${reportName}.htm"/>
        
        <c:import url="${basePath}/${entityRef}/reportViewportExtView/${reportName}.htm"/>
        
        <c:import url="${basePath}/${entityRef}/reportExtInit/${reportName}.htm"/>
        
        <!-- ############################ IMPORT COMPONENTS ################################### -->
        
        <jsp:include page="/WEB-INF/views/generic/scripts/components/GridExtComponent.jsp" />
        <jsp:include page="/WEB-INF/views/generic/scripts/components/CommonExtView.jsp" />
        
        <!-- ############################ IMPORT CONFIG ################################### -->
        
        <jsp:include page="/WEB-INF/views/generic/scripts/config/MVCExtController.jsp" />
        
        <script src="<%=request.getContextPath()%>/js/util/Util.js"></script>
        
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/navegador.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/gridTemplateStyles.css">
        
    </head>
    <body>
        <div id="headerHtml" style="display:none;">
            <h1 >
                Administraci&oacute;n Novaventa
                <a class="logout" href="<%=request.getContextPath()%>/j_spring_security_logout">&nbsp;Cerrar sesi&oacute;n&nbsp;</a>
                <a class="home" href="<%=request.getContextPath()%>/home">&nbsp;Home&nbsp;</a>
            </h1>
        </div>
        <script type="text/javascript">
            var navegadorExtInit= new ReportExtInit();
        </script>
    </body>
</html>

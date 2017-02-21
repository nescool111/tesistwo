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
        <title>Formulario de Registro</title>
        <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=request.getContextPath()%>/css/bootstrap-formhelpers.min.css" rel="stylesheet">
        <link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/fonts/font-awesome.css">
        <script src="<%=request.getContextPath()%>/js/libs/jquery-3.1.0.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/libs/jquery.validate.js"></script> 
        <script src="<%=request.getContextPath()%>/js/util/validar.js"></script>    
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/bootstrap.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/bootstrap-formhelpers.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/util/Util.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/util/Validacion.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/util/Ubicacion.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/Registro.js"></script> 

    </head>
    <body>
        <div class="container cont-form">

            <div class="row">

                <div id="loginingtwo" class="modal-loading">

                    <div class="row" id="after_check" name="after_check" style="display: none">
                        <h3>Se ha registrado correctamente!</h3>
                        <i class="fa fa-thumbs-up"></i>
                        <a id="aceptarok" href="/" class="aceptar_check">Aceptar</a>
                    </div>
                </div>

                <form id="FormReg" action="<%=request.getContextPath()%>/ajax/registro" method="post" autocomplete="off">
                    <div class="row">
                        <div class="form-group col-sm-6 col-md-6">		    							
                            <label for="NombreContacto">Nombre y Apellidos</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de contacto">				
                        </div>

                        <div class="form-group col-sm-6 col-md-6">
                            <label for="tipo_documento">Tipo de identificaci&oacute;n</label>    							
                            <select class="form-control" id="tipoDocumento" name="tipoDocumento">
                                <option selected>CC</option>
                                <option>TI</option>
                                <option>NIT</option>
                                <option>CE</option>
                                <option>Pasaporte</option>
                                <option>Otros</option>						  
                            </select>					
                        </div> 
                    </div>

                    <div class="row">
                        <div class="form-group col-sm-6 col-md-6">
                            <label for="documento">N&uacute;mero de documento</label>
                            <input type="text" class="form-control" id="documento" name="documento" placeholder="N&uacute;mero de documento">			
                        </div>
                        <div class="form-group col-sm-6 col-md-6" style="">
                            <label for="documento">Departamento</label>
                            <select class="form-control"  name="departamentoId" id="departamento"  onchange="ubicacion.validateDepartamento()" >
                                <option value ="" disabled selected >Seleccione Departamento</option>
                                <c:forEach var="departamento" items="${departamentos}">
                                    <option value="${departamento.id}"> ${departamento.nombre} </option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group col-sm-6 col-md-6">
                        <label for="NumCel">N&uacute;mero celular</label>
                        <input type="text" class="form-control" id="telefono" name="telefono" placeholder="N&uacute;mero celular">			
                    </div>
                    <div class="form-group col-sm-6 col-md-6">
                        <label for="documento">Ciudad</label>
                        <select class="form-control" name="ciudadId"  id="ciudadId" class="required" >
                            <option value =""> Seleccione Ciudad... </option>
                        </select>
                    </div>



                    <div class="row">
                        <div class="form-group col-sm-6 col-md-6">
                            <label for="email">Correo electr&oacute;nico</label>
                            <input type="email" class="form-control" id="correoElectronico" name="correoElectronico" placeholder="Correo electr&oacute;nico">			
                        </div>

                    </div>
                    
                    <div class="row">
                        <div class="form-group col-sm-6 col-md-6">
                            <label for="contrasena">Contraseña</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Password">			
                        </div>

                    </div>


                    <div class="col-md-12">	
                

                    </div>
                    <div class="row">
                        <input id="enviar" type="button" class="btn btn-default enviar" value="Registrar" >
                    </div>
                </form>
            </div>
        </div>    
    </body>
</html>
<%-- 
Document   : login
Created on : 10/12/2016, 1:27:44 PM
Author     : nalvarez
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>REGISTRO</title>

        <!-- Bootstrap Core CSS -->
        <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=request.getContextPath()%>/css/registro.css" rel="stylesheet">



        <!-- Custom Fonts -->
        <link href="<%=request.getContextPath()%>/css/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

        <!-- Theme CSS -->
        <link href="<%=request.getContextPath()%>/css/grayscale.min.css" rel="stylesheet">

    </head>

    <body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
        <!-- About register -->
        <section id="login" class="container content-section text-center">
            <div class="download-section">
                <div class="container-fluid">
                    <h2>Registro</h2>

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
                        <div class="row">
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

                        </div>

                        <div class="row">
                            <div class="form-group col-sm-6 col-md-6">
                                <label for="email">Correo electr&oacute;nico</label>
                                <input type="email" class="form-control" id="correoElectronico" name="correoElectronico" placeholder="Correo electr&oacute;nico">			
                            </div>
                            <div class="form-group col-sm-6 col-md-6">
                                <label for="contrasena">Contraseña</label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Password">			
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-sm-12 ">
                                <input id="enviar" type="button" class="btn btn-default enviar" value="Registrar" >
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <!-- Footer -->
        <footer>
            <div class="container text-center">
                <p>Copyright &copy; HoriCoop 2017</p>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="/js/libs/jquery-3.1.0.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="/js/libs/bootstrap.js"></script>

        <!-- Plugin JavaScript -->


        <!-- Theme JavaScript -->
        <script src="js/grayscale.min.js"></script>

    </body>

</html>
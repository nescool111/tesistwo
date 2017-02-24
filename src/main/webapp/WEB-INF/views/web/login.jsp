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

        <title>LOGIN</title>

        <!-- Bootstrap Core CSS -->
        <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet">



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
                <div class="container">
                    <h2>Login</h2>
                    <div class="form-login">
                        <div class="row login-input-uno">
                            <div class="col-md-12">
                                <p class="ingresa-correo">Tu correo electr&oacute;nico es tu usuario</p>
                            </div>
                        </div>
                        <form id="formLogin" action="<%=request.getContextPath()%>/ajax/acceder" method="post">
                            <div class="row login-inputs">
                                <div class="col-md-12">
                                    <div class="input-field">
                                        <span class="icon-mail icons-form prefix invertido"></span>
                                        <input placeholder="usuario@correo.com" id="j_username" type="text" class="validate" name="j_username" value="" maxlength="50" minlength="3">
                                    </div>
                                </div>
                                 </br>
                                 </br>
                                <div class="col-md-12">
                                    <div class="input-field">
                                        <span class="icon-llave icons-form prefix invertido"></span>
                                        <input placeholder="Contrase&ntilde;a" id="j_password" type="password" class="validate" name="j_password" value="" maxlength="50" minlength="3">
                                    </div>
                                </div>
                            </div>

                            </br>
                            <div style="margin: auto 1em; display: inline-block;">
                                <div class="row btn-ingresar pass-forget " >
                                    <div class="btn-pay col-md-12 col-centered top-form20">  
                                        <p><a onclick="autenticacionUsuario.changeForm('changePasswordDiv')" href="javascript:void(0);">&iquest;Olvidaste tu contrase&ntilde;a?</a></p>
                                        <a id="linkIngresar" href="#"  class="btn btn-default btn-lg">ingresar</a>
                                    </div>
                                    
                                     </br>
                                      <div style="margin: auto 1em; display: inline-block;">
                                           </div>
                                     </br>
                                    <div class="btn-pay col-md-12 col-centered top-form20">  
                                        <a id="linkIngresar" href="<%=request.getContextPath()%>"  class="btn btn-default btn-lg">Volver</a>
                                    </div>
                                     </div>
                                </div>

                            </div>
                        </form>
                    </div>

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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
    PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Iniciar Sesion</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/AutenticacionUsuario.js"></script>
        <script src="<%=request.getContextPath()%>/js/libs/jquery-3.1.0.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/libs/jquery.validate.js"></script> 
        <script src="<%=request.getContextPath()%>/js/Login.js"></script>    
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/bootstrap.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/bootstrap-formhelpers.min.js"></script>

        <script>
            var autenticacionUsuario = new AutenticacionUsuario();
        </script>

        <style>
            .message{font-weight: bold; font-size: 15px; color: orangered;}
        </style>
    </head>

    <body>
        <div id="banner-bg" class="container-fluid login clear-padding-responsive">
            <div class="center-info">
                <div class="row box-right-title">
                    <div class="col-md-5 no_padding">
                        <div class="col-md-9 col-md-offset-3">
                         
                        </div>
                    </div>
                    <div class="col-md-7"></div>
                </div>
                <div class="row no_margin">
                    <div class="col-md-5 usuario-clave sin_padding clear-padding-responsive">

                        <div class="col-md-7 col-md-offset-5 user-key">
                            <p class="blanco-color slider-text">
                         
                            </p>
                        </div>


                    </div>
                    <div class="col-md-6 sin_padding clear-padding-responsive">
                        <div id="loginDiv" class="arma-paquete login login-ingresa">

                            <!-- modales append -->

                            <div id="modal-acepta">
                                <div id="modal-general-aceptar">
                                    <div class="row col-md-9 col-centered">
                                        <h3><span>Todavia no eres usuario</span> Horicoop!</h3>
                                        <div class="btn-pay">
                                            <a href="/web/registro" class="pay btn-green-pay verde-bg col-md-8 col-md-offset-2 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">Registrate</a>
                                        </div>			
                                    </div>
                                </div>
                            </div>

                            <div class="arma-letter">
                                <div class="cont-letter gris-oscuro-bg">
                                    <h3 class="verde-color">Ingresa</h3>
                                </div>
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
                                            <div class="col-md-12">
                                                <div class="input-field">
                                                    <span class="icon-llave icons-form prefix invertido"></span>
                                                    <input placeholder="Contrase&ntilde;a" id="j_password" type="password" class="validate" name="j_password" value="" maxlength="50" minlength="3">
                                                </div>
                                            </div>
                                        </div>


                                        <div class="row btn-ingresar pass-forget">
                                            <div class="btn-pay col-md-8 col-centered top-form20">  
                                                <p><a onclick="autenticacionUsuario.changeForm('changePasswordDiv')" href="javascript:void(0);">&iquest;Olvidaste tu contrase&ntilde;a?</a></p>
                                                <a id="linkIngresar" href="#" class="pay btn-green-pay verde-bg col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-12">ingresar</a>
                                            </div>
                                        </div>


                                    </form>
                                </div>
                            </div>
                        </div>

                        <div id="changePasswordDiv" style="display:none;" class="arma-paquete login login-ingresa">
                            <div class="arma-letter">
                                <div class="cont-letter gris-oscuro-bg">
                                    <h3 class="verde-color">Recuperar contrase&ntilde;a</h3>
                                </div>
                                <div class="form-login login-inputs">
                                    <div class="row login-input-uno">
                                        <div class="col-md-12">
                                            <p class="ingresa-correo">Tu correo electr&oacute;nico es tu usuario</p>
                                        </div>
                                    </div>
                                    <form id="changePasswordForm" action="<%=request.getContextPath()%>/web/usuario/ajax/recuperarContrasena" method="post">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="input-field">

                                                    <span class="icon-mail icons-form prefix invertido"></span>
                                                    <input id="correoElectronico" name="correoElectronico" type="text" class="validate" placeholder="carlos.fernando@gmail.com" />

                                                </div>
                                            </div>
                                        </div>
                                        <div class="row btn-ingresar">
                                            <div class="btn-pay col-centered top-form20 col-md-12">
                                                <p><a onclick="autenticacionUsuario.changeForm('loginDiv')" href="javascript:void(0);">Volver</a></p>
                                                <a href="javascript:autenticacionUsuario.resetPassword();" class="pay btn-green-pay verde-bg col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-12">enviar</a>
                                            </div>

                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>

<%-- 
Document   : index
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

        <title>HORICOOP</title>

        <!-- Bootstrap Core CSS -->
        <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="<%=request.getContextPath()%>/css/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

        <!-- Theme CSS -->
        <link href="<%=request.getContextPath()%>/css/grayscale.min.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

        <!-- Navigation -->
        <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                        Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">
                        <i class="fa fa-play-circle"></i> <span class="light">HORICOOP</span> APP
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                    <ul class="nav navbar-nav">
                        <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#register">Registro</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#about">Acerca</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#download">Descarga</a>
                        </li>
                        <li>
                            <a class="page-scroll" href="#contact">Contacto</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Intro Header -->
        <header class="intro">
            <div class="intro-body">
                <div class="container">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <h1 class="brand-heading">HoriCoop</h1>
                            <p class="intro-text">Projecto de Tesis.
                                <br>Creado por Nestor alvarez.</p>
                            <a href="#about" class="btn btn-circle page-scroll">
                                <i class="fa fa-angle-double-down animated"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        
        
        
        <!-- About register -->
        <section id="register" class="container content-section text-center">
            <div class="download-section">
                  <div class="container">
                    <h2>Registro</h2>
                    <p>El operador logístico podrá acceder a la aplicación luego de registrarse</p>
                    <a href="web/registro" class="btn btn-default btn-lg">Reg&iacute;strate</a>
                    <p>-</p>
                </div>
            </div>
        </section>
        
        <!-- About Section -->
        <section id="about" class="container content-section text-center">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>Acerca de HoriCoop</h2>
                    <p>HoriCoop es el prototipo creado para el proyecto de investigaci&oacute;n enfocado en Cooperaci&oacute;n horizontal . Puede obtener la informaci&oacute;n de distintas plataformas de Comercio electr&oacute;nico, simple y f&aacute;cil de usar, importando la informaci&oacute;n referente al transporte de mercanc&iacute;a de: <a href="http://190.147.21.171:81/prestashopstore/">Prestashop</a>,<a href="http://190.147.21.171:81/magentostore/"> Magento</a>  y <a href="http://190.147.21.171:81/opencartstore/">OpenCart</a>.</p>
                    <p>Facilitando al operador log&iacute;stico obtener la informaci&oacute;n referente al transporte de mercanc&iacute;a, de manera f&aacute;cil y r&aacute;pida.</p>
                    <p>-</p>
                </div>
            </div>
        </section>

        <!-- Download Section -->
        <section id="download" class="content-section text-center">
            <div class="download-section">
                <div class="container">
                    <div class="col-lg-8 col-lg-offset-2">
                        <h2>Aplicaci&oacute;n movil</h2>
                        <p>Puedes descargar la aplicaci&oacute;n gratis siguiendo el siguiente enlace:</p>
                        <a href="http://190.147.21.171:81/prestashopstore/" class="btn btn-default btn-lg">Visita la P&aacute;gina de descargas</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- Contact Section -->
        <section id="contact" class="container content-section text-center">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>Contacto</h2>
                    <p>Sientete libre de contactarte para resolver cualquier inquietud, sugerencias, comentarios, o solo decir Hola!</p>
                    <p><a href="mailto:nescool101@gmail.com">nescool101@gmail.com</a>
                    </p>
                    <ul class="list-inline banner-social-buttons">
                        <li>
                            <a href="https://twitter.com/nescool101" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                        </li>
                        <li>
                            <a href="https://libraries.io/github/nescool101/" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                        </li>
                        <li>
                            <a href="https://plus.google.com/+nescool101" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name">Google+</span></a>
                        </li>
                    </ul>
                </div>
            </div>
        </section>

        <!-- Map Section -->
        <div id="map"></div>

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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

        <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

        <script>
            // Note: This example requires that you consent to location sharing when
            // prompted by your browser. If you see the error "The Geolocation service
            // failed.", it means you probably did not give permission for the browser to
            // locate you.

            function initMap() {
                var map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: 4.6279338, lng: -74.0676211}
                    ,
                    zoom: 6
                }
                );
                var infoWindow = new google.maps.InfoWindow({map: map});

                // Try HTML5 geolocation.
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(function (position) {
                        var pos = {
                            lat: position.coords.latitude,
                            lng: position.coords.longitude
                        };

                        infoWindow.setPosition(pos);
                        infoWindow.setContent('Location found.');
                        map.setCenter(pos);
                    }, function () {
                        handleLocationError(true, infoWindow, map.getCenter());
                    });
                } else {
                    // Browser doesn't support Geolocation
                    handleLocationError(false, infoWindow, map.getCenter());
                }
            }

            function handleLocationError(browserHasGeolocation, infoWindow, pos) {
                infoWindow.setPosition(pos);
                infoWindow.setContent(browserHasGeolocation ?
                        'Error: The Geolocation service failed.' :
                        'Error: Your browser doesn\'t support geolocation.');
            }
        </script>

        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwL-8XzTMaPLMg-64rL1_mwWCOUzbzGfc&sensor=false"></script>
        <!-- Theme JavaScript -->
        <script src="js/grayscale.min.js"></script>

    </body>

</html>
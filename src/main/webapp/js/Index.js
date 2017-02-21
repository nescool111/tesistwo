
function Index() {

    var Instance = this;

    Instance.init = function () {
        Instance.minutos = 0;
        Instance.datos = 0;
        Instance.vigencia = 1;

        $(document).ready(function () {

            var util = new Util();
            // validacion.validateRecargaForm();

            $('#back_home').click(function (event) {
                $("#select_uno").show();
                $("#select_seis").hide();
                   Instance.progressBar('first');
            });

            $('.sector ul li').click(function (event) {
                var sectorvar = $(this).html();
                if (sectorvar === "Sector Colegio" || sectorvar === "Sector Cafeteria") {
                    $("#select_tres").show();
                    $("#select_uno").hide();
                    Instance.progressBar('third');
                } else {
                    $("#select_dos").show();
                    $("#select_uno").hide();
                    Instance.progressBar('second');
                }
                $("#spanuno").text(sectorvar);
                $("#sector").val($(this).attr("id"));
            });




            $('.cantidadempleados ul li').click(function (event) {
                if ($(this).attr("id") !== "back_cantidad_empleados") {
                    $("#select_tres").show();
                    $("#select_dos").hide();
                    var empleadosvar = $(this).html();
                    $("#spandos").text(empleadosvar);
                    $("#empleados").val($(this).attr("id"));
                    $("#spantresid").show();
                    Instance.progressBar('third');
                } else {
                    $("#select_dos").hide();
                    $("#select_uno").show();
                    Instance.progressBar('first');
                }
            });

            $('.cantidadclientes ul li').click(function (event) {
                if ($(this).attr("id") !== "back_cantidad_clientes") {
                    $("#select_cuatro").show();
                    $("#select_tres").hide();
                    var clientesvar = $(this).html();
                    $("#spantres").text(clientesvar);
                    $("#clientes").val($(this).attr("id"));
                    Instance.progressBar('four');
                } else {
                    $("#select_tres").hide();
                    $("#select_dos").show();
                    Instance.progressBar('second');
                }
            });

            $('.maquinaclass  ul li').click(function (event) {
                if ($(this).attr("id") !== "back_cantidad_maquinas") {
                    $("#select_seis").show();
                    $("#select_cuatro").hide();
                    var tipoMaquinavar = $(this).html();
                    $("#spancuatro").text(tipoMaquinavar);
                    $("#tipoMaquina").val($(this).attr("id"));
                } else {
                    $("#select_cuatro").hide();
                    $("#select_tres").show();
                    Instance.progressBar('third');
                }
            });

            Instance.progressBar('first');

        });
    };

    Instance.validateFormRg = function () {
        if (validacion.checkValidForm("usuarioForm")) {
            Instance.enviarRegistro();
        } else {
        }
    };

    Instance.enviarRegistro = function () {
        $("#logining").show();
        $.ajax({
            url: $("#usuarioForm").attr("action"),
            timeout: 60000,
            type: "POST",
            data: $("#usuarioForm").serialize(),
            cache: false,
            dataType: "json",
            error: function (xhr, status) {
            },
            success: function (response, status) {
                if (response.respuesta === "1") {
                    $("#select_cinco").show();
                    $("#select_seis").hide();
                    $("#imagen_maquina").attr("src", response.maquina.imagen);
                    $("#descripcion_maquina").html(response.maquina.descripcion);
                } else if (response.respuesta === "2") {
                    $("#select_importante").show();
                    $("#select_seis").hide();
                }
//                Instance.loading.hideLoading();
            }
        });
    };

    Instance.progressBar = function (position) {
        if (position === 'first') {
            $('#progress-bar').val('0');
            $('#first-item').nextAll().removeClass('border-change');
            $('.percent').html("0% Complete");
        } else if (position === 'second') {
            $('#second-item').nextAll().removeClass('border-change');
            $('#progress-bar').val('34');
            $('#second-item').prevAll().addClass('border-change');
            $('#second-item').addClass('border-change');
            $('.percent').html("33% Complete");
        } else if (position === 'third') {
            $('#third-item').nextAll().removeClass('border-change');
            $('#progress-bar').val('67');
            $('#third-item').prevAll().addClass('border-change');
            $('#third-item').addClass('border-change');
            $('.percent').html("66% Complete");
        } else {
            $('#progress-bar').val('100');
            $('#fourth-item').addClass('border-change');
            $('#fourth-item').prevAll().addClass('border-change');
            $('.percent').html("100% Complete");
        }
    };



    Instance.init();
}
var index = new Index();










function Contacto() {

    var Instance = this;

    Instance.init = function () {
        Instance.minutos = 0;
        Instance.datos = 0;
        Instance.vigencia = 1;

        $(document).ready(function () {
             ubicacion= new Ubicacion();
            $("#enviar").click(function (event) {
                Instance.validateFormCon();
            });

            $("#aceptarok").click(function (event) {
                $("#loginingone").hide();

                $('#FormNova').trigger("reset");
            });
        });
    };


    Instance.validateFormCon = function () {
        if (validacion.checkValidForm("FormReg")) {
            Instance.enviarRegistro();
        } else {
        }
    };




    Instance.enviarRegistro = function () {
        $("#loginingone").show();
        $("#paisval").val($("#departamentos").val());
        $("#departamentoval").val($("#ciudad").val());
        $.ajax({
            url: $("#FormReg").attr("action"),
            timeout: 60000,
            type: "POST",
            data: $("#FormReg").serialize(),
            cache: false,
            dataType: "json",
            error: function (xhr, status) {
            },
            success: function (response, status) {
                if (response.respuesta === "1") {
                    $("#loginingtwo").show();
                    $('#FormReg').trigger("reset");
                                    $("#after_check").show();
                } else if (response.respuesta === "2") {
                    $("#loginingtwo").show();
                    alert("Se ha presentado un problema");
                    $('#FormReg').trigger("reset");
                }
//                Instance.loading.hideLoading();
            }
        });
    };


    Instance.init();
}
var contacto = new Contacto();

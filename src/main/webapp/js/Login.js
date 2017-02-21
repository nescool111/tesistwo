
function Login() {

    var Instance = this;

    Instance.init = function () {
        Instance.minutos = 0;
        Instance.datos = 0;
        Instance.vigencia = 1;

        $(document).ready(function () {
            ubicacion = new Ubicacion();
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

        $.ajax({
            url: $("#formLogin").attr("action"),
            timeout: 60000,
            type: "POST",
            data: $("#formLogin").serialize(),
            cache: false,
            dataType: "json",
            error: function (xhr, status) {
            },
            success: function (response, status) {
                if (response.respuesta === "1") {
                    //$("#loginingtwo").show();
                    window.location.replace("/web/productos");
                } else if (response.respuesta === "2") {
                    //$("#loginingtwo").show();
                    alert("Datos Incorrectos");
                    $('#formLogin').trigger("reset");
                 } else if (response.respuesta === "3") {
                    //$("#loginingtwo").show();
                    alert("Usuario No Existe");
                    $('#formLogin').trigger("reset");
                }
//                Instance.loading.hideLoading();
            }
        });
    };


    Instance.init();
}
var login = new Login();

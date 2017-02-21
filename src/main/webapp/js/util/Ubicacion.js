/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function Ubicacion() {

    var Instance = this;

    Instance.init = function () {

    };

    Instance.validateDepartamento = function () {

        var departamentoval = $("#departamento").val();
        if (departamentoval == "x") {
            $("#otraubidiv").show();
            $('#ciudadId').html("");
            $('#ciudadId').append('<option value="x" selected>Otra ciudad</option>');
        } else
        {
            var data = "filter={eq: {departamento:" + departamentoval + "} }";
            $.ajax({
                url: "/rest/ciudad/find.htm",
                type: "POST",
                cache: false,
                data: data,
                dataType: 'json',
                timeout: 10000,
                success: function (response) {
                    var opts = response.data;
                    $('#ciudadId').html("");
                    $('#ciudadId').append('<option value="" disabled selected>Seleccione una ciudad</option>');
                    $.each(opts, function (i, ciudad) {
                        $('#ciudadId').append('<option value="' + ciudad.id + '">' + ciudad.nombre + '</option>');
                    });
                    // $('#ciudad').material_select();
                },
                error: function (e) {
                    $("#otraubidiv").show();
                    $('#ciudad').append('<option value="x" selected>Otra Ciudad</option>');

                },
                done: function (e) {
                    console.log("DONE");
                }
            });
        }
    }
    ;


    Instance.init();
}

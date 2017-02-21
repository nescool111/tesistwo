
$(document).ready(function () {
    // Metodo para validad correo
    $.validator.addMethod("email", function (email) {
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    });
    // Metodo para validad cadena de caracteres
    $.validator.addMethod("string", function (value, element) {
        return this.optional(element) || /^[a-z" "ñÑáé&iacute;ó&uacute;ÁÉÍÓÚ,.;]+$/i.test(value)
    });
    $("#FormReg").validate({
        rules: {
            nombreContacto: {
                required: true,
                string: true,
                minlength: 4,
                maxlength: 100
            },
           
            tipo_documento: {
                required: true,
                minlength: 1
            },
            documento: {
                required: true,
                digits: true,
                minlength: 7
              },
            telefono: {
                required: true,
                digits: true,
                minlength: 7
            },
            
            email: {
                required: true,
                email: true
            },
            password: {
                required: true
            },
            departamentoId: {
                required: true
            },
            ciudadId: {
                required: true
            }
        },
        messages: {
            nombreContacto: {
                required: "Por favor, ingrese sus  nombres completos",
                string: "Por favor, ingrese sólo caracteres",
                minlength: "Por favor, m&iacute;nimo 4 caracteres",
                maxlength: 'El nombre es demasiado largo'
            },
       
            tipo_documento: {
                required: "Por favor, seleccione uno",
                minlength: "Seleccione una opción"
            },
            documento: {
                required: "Por favor, ingrese el N&uacute;mero de documento",
                digits: "Por favor, escriba sólo n&uacute;meros",
                minlength: "Por favor, m&iacute;nimo 7 d&iacute;gitos"
            },
            telefono: {
                required: "Por favor, ingrese el N&uacute;mero de documento",
                digits: "Por favor, escriba sólo n&uacute;meros",
                minlength: "Por favor, m&iacute;nimo 7 d&iacute;gitos"
            },
            email: {
                required: "Por favor escriba su correo",
                email: "Correo inv&aacute;lido."
            },
            ciudadId: {
                required: "Por favor, escriba su motivo de contacto "
            },
            departamentoId: {
                required: "Por favor, escriba su motivo de contacto "
            },
            motivo: {
                required: "Por favor, escriba su motivo de contacto "
            }
            
        }
    });

   
});
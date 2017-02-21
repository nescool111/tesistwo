
function Validacion() {

    var Instance = this;
    var util = new Util();

    Instance.init = function () {

        var util = new Util();

        $(document).ready(function () {
            Instance.validateUsuarioForm();
        });



    };

    this.checkValidForm = function (idForm) {
        var validator = $("#" + idForm).validate();
        var $inputs = $('#' + idForm + ' :input');
        $inputs.each(function () {
            $(this).valid();
        });
        return validator.checkForm();
    };

    this.validateUsuarioForm = function () {
        $("#FormReg").validate({
            errorClass: "error",
            validClass: "valid",
            errorElement: "label",
            ignore: "",
            rules: {
                nombre: {
                    required: true,
                    lettersonly: true,
                    minlength: 3,
                    maxlength: 40
                },
                telefono: {
                    required: true,
                    number: util.fieldNumber,
                    maxlength: 13,
                    minlength: 7
                },
                correoElectronico: {
                    required: true,
                    email: true,
                    minlength: 5,
                    maxlength: 40
                },
                departamento: {
                    required: true
                },
                ciudadId: {
                    required: true
                },
                tipoDocumento: {
                    required: true
                },
                documento: {
                    required: true, //Por favor, ingresa un documento válido
                    minlength: 5,
                    maxlength: 40,
                    number: {
                        depends: function () {
                            return ($("#tipoDocumento").val() === "ID" || $("#tipoDocumento").val() === "NIT");
                        }
                    },
                    alphanumeric: {
                        depends: function () {
                            return ($("#tipoDocumento").val() === "FOREIGN_ID" || $("#tipoDocumento").val() === "PASSPORT");
                        }
                    }

                },
                password: {
                    required: true
                }
            },
            messages: {
                nombre: {
                    required: util.fieldRequired,
                    lettersonly: util.fieldLettersonly,
                    minlength: util.minlength,
                    maxlength: util.maxlength
                },

                correoElectronico: {
                    required: util.fieldRequired,
                    email: util.fieldEmail,
                    minlength: util.minlength,
                    maxlength: util.maxlength
                },
                tipoDocumento: {
                    required: util.fieldRequired
                },
                telefono: {
                    required: util.fieldRequired,
                    number: util.fieldNumber,
                    minlength: util.minlength,
                    maxlength: util.maxlength
                },
                departamentoId: {
                    required: util.fieldRequired
                },
                ciudadId: {
                    required: util.fieldRequired
                },
                documento: {
                    required: util.fieldRequired,
                    number: util.fieldNumber,
                    alphanumeric: util.alphanumeric,
                    minlength: util.minlength,
                    maxlength: util.maxlength
                },
                password: {
                    required: util.fieldRequired
                }
            }

        });
    };


//VALIDATE TRANSVERSALES


    Instance.init();
}

var validacion = new Validacion();

/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function Util() {

    var Instance = this;

    Instance.fieldRequired = "Campo obligatorio";
    Instance.fieldEmail = "Correo inv&aacute;lido";
    Instance.fieldLettersonly = "Campo solo letras";
    Instance.fieldCardsonly = "Tarjeta inv&aacute;lida";
    Instance.fieldNumber = "Campo num&eacute;rico";
    Instance.alphanumeric = "Campo Alfanum&eacute;rico";
    Instance.minlength = "Al menos {0} caracteres";
    Instance.maxlength = "Solo {0} caracteres";
  
 

    Instance.init = function () {
        Instance.jssImported = {};

        Instance.HtmlEntitiesMap = {
            "'": "&apos;", "<": "&lt;", ">": "&gt;",
            " ": "&nbsp;", "¡": "&iexcl;", "¢": "&cent;",
            "£": "&pound;", "¤": "&curren;", "¥": "&yen;",
            "¦": "&brvbar;", "§": "&sect;", "¨": "&uml;",
            "©": "&copy;", "ª": "&ordf;", "«": "&laquo;",
            "¬": "&not;", "®": "&reg;", "¯": "&macr;",
            "°": "&deg;", "±": "&plusmn;", "²": "&sup2;",
            "³": "&sup3;", "´": "&acute;", "µ": "&micro;",
            "¶": "&para;", "·": "&middot;", "¸": "&cedil;",
            "¹": "&sup1;", "º": "&ordm;", "»": "&raquo;",
            "¼": "&frac14;", "½": "&frac12;", "¾": "&frac34;",
            "¿": "&iquest;", "À": "&Agrave;", "Á": "&Aacute;",
            "Â": "&Acirc;", "Ã": "&Atilde;", "Ä": "&Auml;",
            "Å": "&Aring;", "Æ": "&AElig;", "Ç": "&Ccedil;",
            "È": "&Egrave;", "É": "&Eacute;", "Ê": "&Ecirc;",
            "Ë": "&Euml;", "Ì": "&Igrave;", "Í": "&Iacute;",
            "Î": "&Icirc;", "Ï": "&Iuml;", "Ð": "&ETH;",
            "Ñ": "&Ntilde;", "Ò": "&Ograve;", "Ó": "&Oacute;",
            "Ô": "&Ocirc;", "Õ": "&Otilde;", "Ö": "&Ouml;",
            "×": "&times;", "Ø": "&Oslash;", "Ù": "&Ugrave;",
            "Ú": "&Uacute;", "Û": "&Ucirc;", "Ü": "&Uuml;",
            "Ý": "&Yacute;", "Þ": "&THORN;", "ß": "&szlig;",
            "à": "&agrave;", "á": "&aacute;", "â": "&acirc;",
            "ã": "&atilde;", "ä": "&auml;", "å": "&aring;",
            "æ": "&aelig;", "ç": "&ccedil;", "è": "&egrave;",
            "é": "&eacute;", "ê": "&ecirc;", "ë": "&euml;",
            "ì": "&igrave;", "í": "&iacute;", "î": "&icirc;",
            "ï": "&iuml;", "ð": "&eth;", "ñ": "&ntilde;",
            "ò": "&ograve;", "ó": "&oacute;", "ô": "&ocirc;",
            "õ": "&otilde;", "ö": "&ouml;", "÷": "&divide;",
            "ø": "&oslash;", "ù": "&ugrave;", "ú": "&uacute;",
            "û": "&ucirc;", "ü": "&uuml;", "ý": "&yacute;",
            "þ": "&thorn;", "ÿ": "&yuml;", "Œ": "&OElig;",
            "œ": "&oelig;", "Š": "&Scaron;", "š": "&scaron;",
            "Ÿ": "&Yuml;", "ƒ": "&fnof;", "ˆ": "&circ;",
            "˜": "&tilde;", "Α": "&Alpha;", "Β": "&Beta;",
            "Γ": "&Gamma;", "Δ": "&Delta;", "Ε": "&Epsilon;",
            "Ζ": "&Zeta;", "Η": "&Eta;", "Θ": "&Theta;",
            "Ι": "&Iota;", "Κ": "&Kappa;", "Λ": "&Lambda;",
            "Μ": "&Mu;", "Ν": "&Nu;", "Ξ": "&Xi;",
            "Ο": "&Omicron;", "Π": "&Pi;", "Ρ": "&Rho;",
            "Σ": "&Sigma;", "Τ": "&Tau;", "Υ": "&Upsilon;",
            "Φ": "&Phi;", "Χ": "&Chi;", "Ψ": "&Psi;",
            "Ω": "&Omega;", "α": "&alpha;", "β": "&beta;",
            "γ": "&gamma;", "δ": "&delta;", "ε": "&epsilon;",
            "ζ": "&zeta;", "η": "&eta;", "θ": "&theta;",
            "ι": "&iota;", "κ": "&kappa;", "λ": "&lambda;",
            "μ": "&mu;", "ν": "&nu;", "ξ": "&xi;",
            "ο": "&omicron;", "π": "&pi;", "ρ": "&rho;",
            "ς": "&sigmaf;", "σ": "&sigma;", "τ": "&tau;",
            "υ": "&upsilon;", "φ": "&phi;", "χ": "&chi;",
            "ψ": "&psi;", "ω": "&omega;", "ϑ": "&thetasym;",
            "ϒ": "&Upsih;", "ϖ": "&piv;", "–": "&ndash;",
            "—": "&mdash;", "‘": "&lsquo;", "’": "&rsquo;",
            "‚": "&sbquo;", "“": "&ldquo;", "”": "&rdquo;",
            "„": "&bdquo;", "†": "&dagger;", "‡": "&Dagger;",
            "•": "&bull;", "…": "&hellip;", "‰": "&permil;",
            "′": "&prime;", "″": "&Prime;", "‹": "&lsaquo;",
            "›": "&rsaquo;", "‾": "&oline;", "⁄": "&frasl;",
            "€": "&euro;", "ℑ": "&image;", "℘": "&weierp;",
            "ℜ": "&real;", "™": "&trade;", "ℵ": "&alefsym;",
            "←": "&larr;", "↑": "&uarr;", "→": "&rarr;",
            "↓": "&darr;", "↔": "&harr;", "↵": "&crarr;",
            "⇐": "&lArr;", "⇑": "&UArr;", "⇒": "&rArr;",
            "⇓": "&dArr;", "⇔": "&hArr;", "∀": "&forall;",
            "∂": "&part;", "∃": "&exist;", "∅": "&empty;",
            "∇": "&nabla;", "∈": "&isin;", "∉": "&notin;",
            "∋": "&ni;", "∏": "&prod;", "∑": "&sum;",
            "−": "&minus;", "∗": "&lowast;", "√": "&radic;",
            "∝": "&prop;", "∞": "&infin;", "∠": "&ang;",
            "∧": "&and;", "∨": "&or;", "∩": "&cap;",
            "∪": "&cup;", "∫": "&int;", "∴": "&there4;",
            "∼": "&sim;", "≅": "&cong;", "≈": "&asymp;",
            "≠": "&ne;", "≡": "&equiv;", "≤": "&le;",
            "≥": "&ge;", "⊂": "&sub;", "⊃": "&sup;",
            "⊄": "&nsub;", "⊆": "&sube;", "⊇": "&supe;",
            "⊕": "&oplus;", "⊗": "&otimes;", "⊥": "&perp;",
            "⋅": "&sdot;", "⌈": "&lceil;", "⌉": "&rceil;",
            "⌊": "&lfloor;", "⌋": "&rfloor;", "⟨": "&lang;",
            "⟩": "&rang;", "◊": "&loz;", "♠": "&spades;",
            "♣": "&clubs;", "♥": "&hearts;", "♦": "&diams;"
        };
        
    };

    Instance.configurarDatepicker = function (elemnt, max, min) {
        $(elemnt).pickadate({
            labelMonthNext: 'Siguiente mes',
            labelMonthPrev: 'Anterior mes',
            labelMonthSelect: 'seleccione mes',
            labelYearSelect: 'seleccione año',
            monthsFull: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            monthsShort: ['ENE', 'FEB', 'MAR', 'ABR', 'MAY', 'JUN', 'JUL', 'AGO', 'SEP', 'OCT', 'NOV', 'DIC'],
            weekdaysFull: ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'],
            weekdaysShort: ['Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sa', 'Do'],
            weekdaysLetter: ['D', 'L', 'M', 'X', 'J', 'V', 'S'],
            today: 'Hoy',
            clear: 'Borrar',
            close: 'Ok',
            selectYears: 60,
            selectMonths: true,
            format: 'dd/mm/yyyy',
            max: max,
            min: min
        });
    };

    Instance.configurarDatepickerMonth = function (elemnt, max, min) {
        $(elemnt).pickadate({
            labelMonthNext: 'Siguiente mes',
            labelMonthPrev: 'Anterior mes',
            labelMonthSelect: 'seleccione mes',
            labelYearSelect: 'seleccione año',
            monthsFull: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            monthsShort: ['ENE', 'FEB', 'MAR', 'ABR', 'MAY', 'JUN', 'JUL', 'AGO', 'SEP', 'OCT', 'NOV', 'DIC'],
            weekdaysFull: ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'],
            weekdaysShort: ['Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sa', 'Do'],
            weekdaysLetter: ['D', 'L', 'M', 'X', 'J', 'V', 'S'],
            today: 'Hoy',
            clear: 'Borrar',
            close: 'Ok',
            selectYears: 60,
            selectMonths: true,
            format: 'yyyy/mm',
            max: max,
            min: min
        });
    };

    Instance.addmetodValidator = function () {
        jQuery.validator.addMethod("lettersonly", function (value, element) {
            return this.optional(element) || /^[a-zA-Z\s]+$/i.test(value);
        }, "Only alphabetical characters");
    };

    Instance.getPath = function (url) {
        var path = "";
        var index = url.indexOf("?");
        if (index !== -1) {
            path = url.substring(0, index);
        } else {
            path = url;
        }
        return path;
    };

    Instance.getParameters = function (url) {
        var valor = "";
        var index = url.indexOf("?");

        if (url.charAt(index) === "?") {
            valor = url.substring(index + 1, url.length);
        }

        return decodeURIComponent(valor);
    };

    Instance.getParameter = function (url, parameter) {
        var valor = "";
        var index = url.indexOf(parameter + "=") + parameter.length;

        if (url.charAt(index) === "=") {
            var result = url.indexOf("&", index);
            if (result === -1) {
                result = url.length;
            }
            ;
            valor = url.substring(index + 1, result);
        }

        return valor;
    };

    this.importJS = function (jsLib) {
        if (!(jsLib in Instance.jssImported)) {
            $.holdReady(true);
            $.getScript(jsLib, function () {
                $.holdReady(false);
            });
            Instance.jssImported[jsLib] = "1";
        }
    };

    this.setValue = function (id, value) {
        var s = document.getElementById(id);
        if (s !== null)
            s.value = value;
    };

    this.setHtml = function (id, html) {
        var s = document.getElementById(id);
        if (s !== null)
            s.innerHTML = html;
    };

    this.getHtml = function (id) {
        var s = document.getElementById(id);
        if (s !== null) {
            return s.innerHTML;
        }
        return "";
    };

    this.addUrlParameter = function (url, parameter, value) {
        if (url !== undefined) {
            var href = url;
            if (url.indexOf(parameter) !== -1) {
                href = Instance.removeUrlParameter(url, parameter);
            }
            if (href.indexOf("?") !== -1) {
                href += "&" + parameter + "=" + value;
            } else {
                href += "?" + parameter + "=" + value;
            }

            return href;
        }
        return "";
    };

    this.removeUrlParameter = function (url, parameter) {
        var value = Instance.getParameter(url, parameter);
        if (value !== '') {
            url = url.replace(parameter + "=" + value, "");
            url = url.replace("?&", "?").replace("&&", "&");
            var caracter = url.charAt(url.length - 1);
            if (caracter === "?" || caracter === "&") {
                url = url.substr(0, url.length - 1);
            }
        }

        return url;
    };

    this.replaceAll = function (texto, origen, remplazo) {
        var textoFinal = texto;
        while (textoFinal.indexOf(origen) !== -1) {
            textoFinal = textoFinal.replace(origen, remplazo);
        }
        return textoFinal;
    };
    
    this.createForm= function(config){
        var form = document.createElement("form");
        if ('id' in config) {
            $(form).attr("id", config.id);
        }
        if ('action' in config) {
            $(form).attr("action", config.action);
        }
        if ('method' in config) {
            $(form).attr("method", config.method);
        }
        if ('target' in config) {
            $(form).attr("target", config.target);
        }
        if('data' in config){
            config.data.forEach(function(param){
                var input= '<input ';
                if('type' in param){
                    input+='type="'+param.type+'" ';
                }else{
                    input+='type="hidden" ';
                }
                if('id' in param){
                    input+='id="'+param.id+'" ';
                }
                if('name' in param){
                    input+='name="'+param.name+'" ';
                }
                if('value' in param){
                    input+='value="'+param.value+'" ';
                }
                input+=' />';
                $(form).append(input);
            });
        }
        document.body.appendChild(form);
        
        return form;
    };

    this.getCookie = function (nombre) {
        var cookies = document.cookie;
        if (!cookies)
            return false;
        var comienzo = cookies.indexOf(nombre);
        if (comienzo === -1)
            return false;
        comienzo = comienzo + nombre.length + 1;
        cantidad = cookies.indexOf("; ", comienzo) - comienzo;
        if (cantidad <= 0)
            cantidad = cookies.length;
        return cookies.substr(comienzo, cantidad);
    };

    this.setCookie = function (name, value) {
        var argv = Instance.setCookie.arguments;
        var argc = Instance.setCookie.arguments.length;
        var expires = (argc > 2) ? argv[2] : null;
        var path = (argc > 3) ? argv[3] : null;
        var domain = (argc > 4) ? argv[4] : null;
        var secure = (argc > 5) ? argv[5] : false;
        document.cookie = name + "=" + escape(value) +
                ((expires === null) ? "" : ("; expires=" + expires.toGMTString())) +
                ((path === null) ? ";path=/" : (";path=" + path)) +
                ((domain === null) ? "" : ("; domain=" + domain)) +
                ((secure === true) ? "; secure" : "");
    };

    this.htmlEntitiesEncode = function (string) {
        string = string.replace(/&/g, '&amp;');
        string = string.replace(/"/g, '&quot;');
        for (var key in Instance.HtmlEntitiesMap) {
            var entity = Instance.HtmlEntitiesMap[key];
            var regex = new RegExp(key, 'g');
            string = string.replace(regex, entity);
        }
        return string;
    };

    this.htmlEntitiesDecode = function (string) {
        for (var key in Instance.HtmlEntitiesMap) {
            var entity = Instance.HtmlEntitiesMap[key];
            var regex = new RegExp(entity, 'g');
            string = string.replace(regex, key);
        }
        string = string.replace(/&quot;/g, '"');
        string = string.replace(/&amp;/g, '&');
        return string;
    };

    Instance.init();
}
var util = new Util();
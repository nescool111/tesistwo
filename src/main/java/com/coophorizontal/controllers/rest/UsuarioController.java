package com.coophorizontal.controllers.rest;

import com.dot.gcpbasedot.controller.RestController;
import com.coophorizontal.mappers.UsuarioMapper;
import com.coophorizontal.services.UsuarioService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nalvarez
 */
@Controller
@RequestMapping(value = "/rest/usuario")
public class UsuarioController extends RestController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioMapper usuarioMapper;

    @PostConstruct
    public void init() {
        super.addControlMapping("usuario", usuarioService, usuarioMapper);
    }

}

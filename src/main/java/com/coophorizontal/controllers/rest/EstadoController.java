package com.coophorizontal.controllers.rest;

import com.dot.gcpbasedot.controller.RestController;
import com.coophorizontal.mappers.EstadoMapper;
import com.coophorizontal.services.EstadoService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nalvarez
 */
@Controller
@RequestMapping(value = "/rest/estado")
public class EstadoController extends RestController {

    @Autowired
    EstadoService EstadoService;

    @Autowired
    EstadoMapper EstadoMapper;

    @PostConstruct
    public void init() {
        super.addControlMapping("Estado", EstadoService, EstadoMapper);
    }

}

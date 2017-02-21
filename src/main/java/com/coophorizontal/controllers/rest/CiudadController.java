package com.coophorizontal.controllers.rest;

import com.dot.gcpbasedot.controller.RestController;
import com.coophorizontal.mappers.CiudadMapper;
import com.coophorizontal.services.CiudadService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nalvarez
 */
@Controller
@RequestMapping(value = "/rest/ciudad")
public class CiudadController extends RestController {

    @Autowired
    CiudadService ciudadService;

    @Autowired
    CiudadMapper ciudadMapper;

    @PostConstruct
    public void init() {
        super.addControlMapping("ciudad", ciudadService, ciudadMapper);
    }

}

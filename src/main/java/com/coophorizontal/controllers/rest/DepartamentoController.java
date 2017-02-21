
package com.coophorizontal.controllers.rest;

import com.dot.gcpbasedot.controller.RestController;
import com.coophorizontal.mappers.DepartamentoMapper;
import com.coophorizontal.services.DepartamentoService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nalvarez
 */
@Controller
@RequestMapping(value="/rest/departamento")
public class DepartamentoController extends RestController {
    
    @Autowired
    DepartamentoService departamentoService;
    
    @Autowired
    DepartamentoMapper departamentoMapper;
    
    @PostConstruct
    public void init(){
        super.addControlMapping("departamento", departamentoService, departamentoMapper);
    }
}

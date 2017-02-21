package com.coophorizontal.controllers.view;

import com.dot.gcpbasedot.controller.ExtViewController;
import com.dot.gcpbasedot.controller.MenuComponent;
import com.dot.gcpbasedot.dto.MenuItem;
import com.coophorizontal.dtos.DepartamentoDto;
import com.coophorizontal.mappers.DepartamentoMapper;
import com.coophorizontal.services.DepartamentoService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lacastrillov
 */
@Controller
@RequestMapping(value = "/vista/departamento")
public class DepartamentoViewController extends ExtViewController {

    @Autowired
    DepartamentoService departamentoService;

    @Autowired
    MenuComponent menuComponent;

    @Autowired
    DepartamentoMapper departamentoMapper;

    @PostConstruct
    public void init() {
        super.addControlMapping("departamento", "nombre", departamentoService, DepartamentoDto.class);
        MenuItem menuItem = new MenuItem("Configuraci&oacute;n", "departamento", "Gestionar Departamentos");
        menuComponent.addItemMenu(menuItem);
        super.addMenuComponent(menuComponent);
    }
    
}

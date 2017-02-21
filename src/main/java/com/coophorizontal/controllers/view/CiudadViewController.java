
package com.coophorizontal.controllers.view;

import com.dot.gcpbasedot.controller.ExtViewController;
import com.dot.gcpbasedot.controller.MenuComponent;
import com.dot.gcpbasedot.dto.MenuItem;
import com.coophorizontal.dtos.CiudadDto;
import com.coophorizontal.mappers.CiudadMapper;
import com.coophorizontal.services.CiudadService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lacastrillov
 */
@Controller
@RequestMapping(value="/vista/ciudad")
public class CiudadViewController extends ExtViewController {
    
    @Autowired
    CiudadService ciudadService;
    
    @Autowired
    MenuComponent menuComponent;
    
    @Autowired
    CiudadMapper ciudadMapper;
    
    @PostConstruct
    public void init(){
        super.addControlMapping("ciudad", "nombre", ciudadService, CiudadDto.class);
        MenuItem menuItem= new MenuItem("Configuraci&oacute;n", "ciudad", "Gestionar Ciudades");
        menuComponent.addItemMenu(menuItem);
        super.addMenuComponent(menuComponent);
    }
    
}
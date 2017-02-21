
package com.coophorizontal.controllers.view;

import com.dot.gcpbasedot.controller.ExtViewController;
import com.dot.gcpbasedot.controller.MenuComponent;
import com.dot.gcpbasedot.dto.MenuItem;
import com.coophorizontal.dtos.EstadoDto;
import com.coophorizontal.mappers.EstadoMapper;
import com.coophorizontal.services.EstadoService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lacastrillov
 */
@Controller
@RequestMapping(value="/vista/estado")
public class EstadoViewController extends ExtViewController {
    
    @Autowired
    EstadoService estadoService;
    
    @Autowired
    MenuComponent menuComponent;
    
    @Autowired
    EstadoMapper estadoMapper;
    
    @PostConstruct
    public void init(){
        super.addControlMapping("estado", "descripcion", estadoService, EstadoDto.class);
        MenuItem menuItem= new MenuItem("Configuraci&oacute;n", "estado", "Gestionar Estados");
        menuComponent.addItemMenu(menuItem);
        super.addMenuComponent(menuComponent);
    }
    
}
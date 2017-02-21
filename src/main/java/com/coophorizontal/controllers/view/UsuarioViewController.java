
package com.coophorizontal.controllers.view;

import com.dot.gcpbasedot.controller.ExtViewController;
import com.dot.gcpbasedot.controller.MenuComponent;
import com.dot.gcpbasedot.dto.MenuItem;
import com.coophorizontal.dtos.UsuarioDto;
import com.coophorizontal.mappers.UsuarioMapper;
import com.coophorizontal.services.UsuarioService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lacastrillov
 */
@Controller
@RequestMapping(value="/vista/usuario")
public class UsuarioViewController extends ExtViewController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @Autowired
    MenuComponent menuComponent;
    
    @Autowired
    UsuarioMapper usuarioMapper;
    
    @PostConstruct
    public void init(){
        super.addControlMapping("usuario", "nombre", usuarioService, UsuarioDto.class);
        MenuItem menuItem= new MenuItem("Seguridad", "usuario", "Gestionar Usuarios");
        menuComponent.addItemMenu(menuItem);
        super.addMenuComponent(menuComponent);
    }
    
}
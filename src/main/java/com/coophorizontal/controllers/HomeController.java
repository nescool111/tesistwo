package com.coophorizontal.controllers;

import com.coophorizontal.dtos.UsuarioDto;
import com.coophorizontal.dtos.ProductoMagDto;
import com.coophorizontal.dtos.ProductoPreDto;
import com.coophorizontal.dtos.ProductoOpeDto;

import com.coophorizontal.entities.Ciudad;
import com.coophorizontal.entities.Departamento;
import com.coophorizontal.entities.Usuario;
import com.coophorizontal.services.CiudadService;
import com.coophorizontal.services.DepartamentoService;
import com.coophorizontal.services.EstadoService;
import com.coophorizontal.services.UsuarioService;
import com.coophorizontal.services.security.SecurityService;
import com.dot.gcpbasedot.reflection.EntityReflection;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    DepartamentoService departamentoService;

    @Autowired
    CiudadService ciudadService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EstadoService estadoService;

    //@Autowired
    //SecurityService securityService;
    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView getIndex(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }

    @RequestMapping(value = "/web/registro", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView Registro() {
        ModelAndView mav = new ModelAndView("web/registro");
        //List<Departamento> departamentos = departamentoService.listAll();
       // mav.addObject("departamentos", departamentos);

        return mav;
    }

    @RequestMapping(value = "/web/login", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView Login() {
        ModelAndView mav = new ModelAndView("web/login");

        return mav;
    }

    @RequestMapping(value = "/home", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView getHome(HttpServletRequest request) {
        // Usuario user = securityService.getCurrentUser();
        ModelAndView mav = new ModelAndView("/home");
        //mav.addObject("user", user.getNombre());
        return mav;
    }

    @RequestMapping(value = "/ajax/registro", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String registrar(@ModelAttribute("registro") UsuarioDto usuarioDto, HttpServletRequest request, HttpServletResponse response) {
        Map result = new HashMap();

        Departamento departamento = departamentoService.findById(Integer.parseInt(request.getParameter("departamentoId")));
        Ciudad ciudad = ciudadService.findById(Integer.parseInt(request.getParameter("ciudadId")));

        Usuario usuario = new Usuario();
        EntityReflection.updateEntity(usuarioDto, usuario);
        usuario.setDepartamento(departamento);
        usuario.setCiudad(ciudad);
        usuarioService.create(usuario);

        result.put("respuesta", "1");
        return new Gson().toJson(result);
    }

     //List<ProductoMagDto> ingredientsList= new  ArrayList<ProductoMagDto>(); 
    
        @RequestMapping(value = "/web/productos", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView getProductos(HttpServletRequest request) {
        // Usuario user = securityService.getCurrentUser();
        ModelAndView mav = new ModelAndView("/web/productos");
        //mav.addObject("user", user.getNombre());
    /*ProductoMagDto i= new ProductoMagDto.
    *ingredientsList.add(i);
    Ingredient i1= new Ingredient("bar");   
    ingredientsList.add(i1);*/

        return mav;
    }
    
    
    @RequestMapping(value = "/ajax/acceder", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String iraProductos(@ModelAttribute("acceder") UsuarioDto usuarioDto, HttpServletRequest request, HttpServletResponse response) {
        Map result = new HashMap();
        Usuario usuarioSesion=null;
        usuarioSesion=usuarioService.findUniqueByParameter("correoElectronico", request.getParameter("j_username"));
        if (usuarioSesion!=null) {
          if (usuarioSesion.getNombre().equalsIgnoreCase(request.getParameter("j_password"))) {
        result.put("respuesta", "1");    
        } else {
        result.put("respuesta", "2");
        }   
        } else {
            result.put("respuesta", "3");
        }
        return new Gson().toJson(result);
    }
    
}

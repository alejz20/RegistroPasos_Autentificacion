package com.alejandra.registropasos_autent.controller;


import com.alejandra.registropasos_autent.model.Colecciones;
import com.alejandra.registropasos_autent.model.Datos;
import jakarta.servlet.http.HttpSession;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/")
@Controller
public class Controlador {

    @ResponseBody
    @ModelAttribute("listagenero")
    private Map<String,String> devuelvelistagenero(){ return Colecciones.getListagenero();
    }
    @ResponseBody
    @ModelAttribute("listapaises")
    private Map<String,String> devuelvelistaPaises(){ return Colecciones.getListaPaises();
    }

   @ResponseBody
    @ModelAttribute("listatratamiento")
    private Map<String,String> devuelvelistatratamiento(){ return Colecciones.getListatratamiento();
    }
    @GetMapping("datos-personales")
    public String devuelveDatosPersonales(Model model, @ModelAttribute Datos datos, HttpSession session) {

        return "DatosPersonales";
    }

    @PostMapping("recibe-datos-personales")
    public String recibeDatosPersonales(Model model, @ModelAttribute Datos datos, HttpSession session) {

//        session.setAttribute("datosPersonales", datos);
//        System.out.println("Personales=" + session.getAttribute("datosPersonales"));
//
//        datos.setNombre(datos.getNombre());
//        datos.setApellido(datos.getApellido());
//        datos.setFechaNacimiento(datos.getFechaNacimiento());
//        datos.setGenero(datos.getGenero());
//        datos.setCasado_pareja(datos.isCasado_pareja());
//        datos.setHijos(datos.isHijos());
////        datos.setlistaPaises(datos.getListaPais());
//
//        session.setAttribute("datosPersonales", datos);
        return "redirect:/datos-profesionales";
    }

    @GetMapping("datos-profesionales")
    public String devuelveDatosProfesionales(Model model, @ModelAttribute Datos datos, HttpSession session){

        return "DatosProfesionales";
    }

    @PostMapping("recibe-datos-profesionales")
    public String recibeDatosProfesionales(Model model, @ModelAttribute Datos datos, HttpSession session){

        return "redirect:/datos-bancarios";
    }

    @GetMapping("datos-bancarios")
    public String devuelveDatosBancarios(Model model, @ModelAttribute Datos datos, HttpSession session){

         return "DatosBancarios";
    }

    @PostMapping("recibe-datos-bancarios")
    public String recibeDatosBancarios(Model model, @ModelAttribute Datos datos, HttpSession session){

        return "redirect:/resumen";
    }

    @GetMapping("resumen")
    public String devuelveResumen(Model model, @ModelAttribute Datos datos, HttpSession session){

        return "Resumen";
    }
}

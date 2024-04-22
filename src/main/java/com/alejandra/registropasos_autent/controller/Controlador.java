package com.alejandra.registropasos_autent.controller;


import com.alejandra.registropasos_autent.model.Colecciones;
import com.alejandra.registropasos_autent.model.Datos;
import jakarta.servlet.http.HttpSession;
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
    @GetMapping("/datos-personales")
    public String devuelveDatosPersonales(Model model, @ModelAttribute Datos datos, HttpSession session) {
       if (session.getAttribute("datosPersonales") != null) {
        return "DatosPersonales";
    }

    @PostMapping("/recibe-datos-personales")
    public String recibeDatosPersonales(Model model, @ModelAttribute Datos datos){
        return "DatosPersonales";
    }

    @GetMapping("/datos-profesionales")
    public String devuelveDatosProfesionales(Model model, @ModelAttribute Datos datos){
        return "DatosProfesionales";
    }

    @PostMapping("/recibe-datos-profesionales")
    public String recibeDatosProfesionales(Model model, @ModelAttribute Datos datos){
        return "DatosProfesionales";
    }
}

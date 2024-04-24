package com.alejandra.registropasos_autent.controller;


import com.alejandra.registropasos_autent.model.DatosRegistro;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("registro")
@Controller
public class ControladorRegistro {
   @GetMapping("/")
    public String devuelveDatosPersonales(){
        return "registro/DatosPersonales";
    }


    @PostMapping("recibe-datos-personales")
    public String recibeDatosPersonales( HttpSession session,
    @RequestParam(name = "nombre", required = true) String nombre,
    @RequestParam(name = "apellido", required = true) String apellido,
    @RequestParam(name = "fechaNacimiento", required = true) Date fechaNacimiento,
//    @RequestParam(name = "listagenero", required = true) Colecciones.listagenero,
    @RequestParam(name = "casado_pareja", required = true) Boolean casado_pareja
    ) {


        return "redirect:/datos-profesionales";
    }

    @GetMapping("datos-profesionales")
    public String devuelveDatosProfesionales(Model model, @ModelAttribute DatosRegistro datos, HttpSession session){

        return "DatosProfesionales2";
    }

    @PostMapping("recibe-datos-profesionales")
    public String recibeDatosProfesionales(Model model, @ModelAttribute DatosRegistro datos, HttpSession session){

        return "redirect:/datos-bancarios";
    }

    @GetMapping("datos-bancarios")
    public String devuelveDatosBancarios(Model model, @ModelAttribute DatosRegistro datos, HttpSession session){

         return "DatosBancarios3";
    }

    @PostMapping("recibe-datos-bancarios")
    public String recibeDatosBancarios(Model model, @ModelAttribute DatosRegistro datos, HttpSession session){

        return "redirect:/resumen";
    }

    @GetMapping("resumen")
    public String devuelveResumen(Model model, @ModelAttribute DatosRegistro datos, HttpSession session){

        return "Resumen";
    }
}

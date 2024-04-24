package com.alejandra.registropasos_autent.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("login")
@Controller
public class ControladorSession {

    @GetMapping("/autentificacion")
    public String devuelveUsuario(){

        return "login/vista usuario";
    }

    @PostMapping("/recibe-usuario")
    public String recogeUsuario( @RequestParam(name ="nameUsuario", required = false) String nameUsuario,
                                 HttpSession session){
        session.setAttribute("nameUsuario", nameUsuario);

        return "redirect:/login/vista-password";
    }

    @GetMapping("/vista-password")
    public String devuelvePassword(@RequestParam(name ="nameUsuario", required = false) String nameUsuario,
                                   HttpSession session){
        session.setAttribute("nameUsuario", nameUsuario);
        return "login/vista-password";
    }


    @PostMapping("/recibe-password")
    public String recogePassword( @RequestParam(name ="password", required = false) String password,
                                  HttpSession session){
        session.setAttribute("password", password);
        return "redirect:/login/vista-area-personal";
    }

    @GetMapping("/vista-area-personal")
    public String devuelveAreaPersonal(){
        return "login/recibe-area-personal";
    }


}

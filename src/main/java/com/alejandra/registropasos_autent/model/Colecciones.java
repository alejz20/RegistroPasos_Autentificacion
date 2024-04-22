package com.alejandra.registropasos_autent.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Colecciones {

    @Getter
    private static final Map<String, String> listatratamiento = new HashMap<>();

    @Getter
    private static final Map<String, String> listagenero = new HashMap<>();

    @Getter
    private static final Map<String, String> listaPaises = new HashMap<>();

    static {

        listatratamiento.put("SRA", "Señora");
        listatratamiento.put("SR", "Señor");
        listatratamiento.put("SRTA", "Señorita");
        listatratamiento.put("SRTO", "Señorito");
        listatratamiento.put("CO", "Caballero");
        listatratamiento.put("CA", "Caballera");
        listatratamiento.put("AA", "Amazona");
        listatratamiento.put("AO", "Amazono");

        listagenero.put("M", "Masculino");
        listagenero.put("F", "Femenino");
        listagenero.put("O", "Otro");

        listaPaises.put("AR", "Argentina");
        listaPaises.put("BR", "Brasil");
        listaPaises.put("CL", "Chile");
        listaPaises.put("CO", "Colombia");
        listaPaises.put("EC", "Ecuador");
        listaPaises.put("PE", "Perú");
        listaPaises.put("ES", "España");


    }

}

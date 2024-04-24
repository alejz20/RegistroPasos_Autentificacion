package com.alejandra.registropasos_autent.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class DatosRegistro {

//    <!-- Datos usuarios -->

    private String nombre;
    private String clave;
    private String confirmaClave;

//    <!-- Datos personales -->

    private String tratamiento;

    private String apellido;

    private Date fechaNacimiento;

    private Integer edad;

    private String genero;

    private boolean casado_pareja;

    private boolean hijos;

    private List<String> nacionalidades;

//    <!-- Datos profesionales -->

    private String departamento;

    private  Integer salario;

    private String comentarios;

//    <!-- Datos bancarios -->

    private Integer cuenta_corriente;


}

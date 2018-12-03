/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.ArrayList;

/**
 *
 * @author Sulay2016
 */
public class BD {

    private static ArrayList<PersonaVO> personas;
    public BD() {
        if (personas == null) {
            this.personas = new ArrayList<>();
            this.personas.add(new PersonaVO(1014, "Tania", "Cupitra", "thania@hotmail.com", "Ing quimica", "Direccion Tecnica", "SIG", "jefe"));
            this.personas.add(new PersonaVO(2845, "Nicolas", "Leon", "nickLuckas@hotmail.com", "geofisico", "Direccion Tecnica", "Geofisica", "trabajador"));
            this.personas.add(new PersonaVO(17895,"Julian","Aldan","oniichan@hotmail.com","Admin Empresa","Direccion Administrativa","Revisora Fiscal","jefe"));
            this.personas.add(new PersonaVO(5021,"Lina","Yepes","YepesLin@hotmail.com","contadora","Direccion Administrativa","Contaduria","trabajador"));
         this.personas.add(new PersonaVO(423,"Carolina","Castro","Castrocc@hotmail.com","Revision fisical","Gerente","","jefe"));
         this.personas.add(new PersonaVO(58745,"Paula","Sequera","sepa@hotmail.com","Ing Hidrologia","Gerente","","asistente"));
        }
    }

    public void addPersona(PersonaVO persona) {
        this.personas.add(persona);
    }

    public ArrayList<PersonaVO> getPersonas() {
        return personas;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Labing I5
 */
public class PersonaVO {


     private int Cedula;//cedula INT NOT NULL PRIMARY KEY, 
    private String nombre;//nombre varchar(30) NOT NULL,
    private String apellido;//apellido varchar(30) NOT NULL,
    private String correo;//correo varchar(30) NOT NULL,
    private String Carrera;//    carrera varchar(30) NOT NULL,
    private String areaTrabajo;//  areaTrabajo varchar(30) NOT NULL,
    private String especialidad;//    especialidad varchar(30) NOT NULL,
    private String tipoEmpleado;//    tipoEmpleado varchar(30) NOT NULL*/

    public PersonaVO(int Cedula, String nombre, String apellido, String correo, String Carrera, String areaTrabajo, String especialidad, String tipoEmpleado) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.Carrera = Carrera;
        this.areaTrabajo = areaTrabajo;
        this.especialidad = especialidad;
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public PersonaVO() {
       
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    public  PersonaVO cast(Object t) {
        PersonaVO mobj = PersonaVO.class.cast(t);
        return mobj;
     }
}

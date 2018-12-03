/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Sulay2016
 */
public class VOproyectoXempresa {
   private int idProEm;
   private int idEmpresa;
   private int idProyecto;

    public VOproyectoXempresa(int idProem, int idEmpresa, int idProyecto) {
        this.idProEm = idProem;
        this.idEmpresa = idEmpresa;
        this.idProyecto = idProyecto;
    }
    public VOproyectoXempresa() {
        
    }

    public int getIdProem() {
        return idProEm;
    }

    public void setIdProem(int idProem) {
        this.idProEm = idProem;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
   
   
   public  VOproyectoXempresa cast(Object t) {
        VOproyectoXempresa mobj = VOproyectoXempresa.class.cast(t);
        return mobj;
     }
}

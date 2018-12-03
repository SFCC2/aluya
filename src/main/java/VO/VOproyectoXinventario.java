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
public class VOproyectoXinventario {
   private int idProYi;
   private int idInvent;
   private int idProyecto;

    public VOproyectoXinventario(int idProYi, int idInvent, int idProyecto) {
        this.idProYi = idProYi;
        this.idInvent = idInvent;
        this.idProyecto = idProyecto;
    }

    public VOproyectoXinventario() {
        
    }

    public int getIdProyi() {
        return idProYi;
    }

    public void setIdProyi(int idProyi) {
        this.idProYi = idProyi;
    }

    public int getIdInvent() {
        return idInvent;
    }

    public void setIdInvent(int idInvent) {
        this.idInvent = idInvent;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
   
   
   public  VOproyectoXinventario cast(Object t) {
        VOproyectoXinventario mobj = VOproyectoXinventario.class.cast(t);
        return mobj;
     }
}

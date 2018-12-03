/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.VOproyectoXarchivo;
import VO.VOproyectoXpersona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class proyectoXpersonaDOT implements DAO {

    private ArrayList<VOproyectoXpersona> bdVOproyectoXarchivos;

    public proyectoXpersonaDOT() {
        this.bdVOproyectoXarchivos = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        VOproyectoXpersona proyecto = null;
        proyecto.cast(t);

        if (this.search(proyecto.getIdPropE()) == null) {
            return this.bdVOproyectoXarchivos.add(proyecto);
        }
        return false;
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        VOproyectoXpersona proyecto = null;
        proyecto.cast(t);
        return this.bdVOproyectoXarchivos.remove(proyecto);
    }

    @Override
    public boolean update(int id, Object t) {
        VOproyectoXpersona proyecto = null;
        proyecto.cast(t);
        for (int i = 0; i < this.bdVOproyectoXarchivos.size(); i++) {
            VOproyectoXpersona aux = this.bdVOproyectoXarchivos.get(i);
            if (aux.getIdProyecto() == id) {
                this.bdVOproyectoXarchivos.get(i).setCedula(proyecto.getCedula());
                this.bdVOproyectoXarchivos.get(i).setIdProyecto(proyecto.getIdProyecto());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (VOproyectoXpersona inventario : bdVOproyectoXarchivos) {
            if (inventario.getIdProyecto() == id) {
                return inventario;
            }
        }
        return null;
    }
}

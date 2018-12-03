/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.ProyectoVO;
import VO.VOproyectoXarchivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class proyectoXarchivoDOT implements DAO {

    private ArrayList<VOproyectoXarchivo> bdVOproyectoXarchivos;

    public proyectoXarchivoDOT() {
        this.bdVOproyectoXarchivos = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        VOproyectoXarchivo proyecto = null;
        proyecto.cast(t);

        if (this.search(proyecto.getIdProAR()) == null) {
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
        VOproyectoXarchivo proyecto = null;
        proyecto.cast(t);
        return this.bdVOproyectoXarchivos.remove(proyecto);
    }

    @Override
    public boolean update(int id, Object t) {
        VOproyectoXarchivo proyecto = null;
        proyecto.cast(t);
        for (int i = 0; i < this.bdVOproyectoXarchivos.size(); i++) {
            VOproyectoXarchivo aux = this.bdVOproyectoXarchivos.get(i);
            if (aux.getIdProyecto() == id) {
                this.bdVOproyectoXarchivos.get(i).setidArchivo(proyecto.getidArchivo());;
                this.bdVOproyectoXarchivos.get(i).setIdProyecto(proyecto.getIdProyecto());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (VOproyectoXarchivo inventario : bdVOproyectoXarchivos) {
            if (inventario.getIdProyecto() == id) {
                return inventario;
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.InventarioVO;
import VO.ProyectoVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class proyectoDOT implements DAO {

    private ArrayList<ProyectoVO> bdproyecto;

    public proyectoDOT() {
        this.bdproyecto = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        ProyectoVO proyecto = null;
        proyecto.cast(t);

        if (this.search(proyecto.getIdProyecto()) == null) {
            return this.bdproyecto.add(proyecto);
        }
        return false;
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        ProyectoVO proyecto = null;
        proyecto.cast(t);
        return this.bdproyecto.remove(proyecto);
    }

    @Override
    public boolean update(int id, Object t) {
        ProyectoVO proyecto = null;
        proyecto.cast(t);
        for (int i = 0; i < this.bdproyecto.size(); i++) {
            ProyectoVO aux = this.bdproyecto.get(i);
            if (aux.getIdProyecto() == id) {
                this.bdproyecto.get(i).setNombre(proyecto.getNombre(id, proyecto.getIdEmpresa(),
                        proyecto.getIdArchivo(), proyecto.getFechaRealizada()));
                this.bdproyecto.get(i).setIdEmpresa(proyecto.getIdEmpresa());
                this.bdproyecto.get(i).setIdArchivo(proyecto.getIdArchivo());
                this.bdproyecto.get(i).setFechaRealizada(proyecto.getFechaRealizada());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (ProyectoVO inventario : bdproyecto) {
            if (inventario.getIdProyecto() == id) {
                return inventario;
            }
        }
        return null;
    }
}

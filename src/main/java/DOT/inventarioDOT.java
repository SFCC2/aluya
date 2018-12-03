/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.InventarioVO;
import VO.PersonaVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class inventarioDOT implements DAO {

    private ArrayList<InventarioVO> bdinvetario;

    public inventarioDOT() {
        this.bdinvetario = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        InventarioVO inventario = null;
        inventario.cast(t);

        if (this.search(inventario.getIdInventario()) == null) {
            return this.bdinvetario.add(inventario);
        }
        return false;
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        InventarioVO inventario = null;
        inventario.cast(t);
        return this.bdinvetario.remove(inventario);
    }

    @Override
    public boolean update(int id, Object t) {
         InventarioVO inventario = null;
        inventario.cast(t);
        for (int i = 0; i < this.bdinvetario.size(); i++) {
            InventarioVO aux = this.bdinvetario.get(i);
            if (aux.getIdInventario()== id) {
                this.bdinvetario.get(i).setNombre(inventario.getNombre());
                this.bdinvetario.get(i).setAreaTrabajo(inventario.getAreaTrabajo());
                this.bdinvetario.get(i).setCantidad(inventario.getCantidad());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (InventarioVO inventario : bdinvetario) {
            if (inventario.getIdInventario()== id) {
                return inventario;
            }
        }
        return null;
    }
}

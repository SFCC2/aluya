/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.ArchivoVO;
import VO.InventarioVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class ArchivoDOT implements DAO {

    private ArrayList<ArchivoVO> bdarchivo;

    public ArchivoDOT() {
        this.bdarchivo = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        ArchivoVO archivo = null;
        archivo.cast(t);

        if (this.search(archivo.getIdArchivo()) == null) {
            return this.bdarchivo.add(archivo);
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
        return this.bdarchivo.remove(inventario);
    }

    @Override
    public boolean update(int id, Object t) {
         ArchivoVO archivo = null;
        archivo.cast(t);
        for (int i = 0; i < this.bdarchivo.size(); i++) {
            ArchivoVO aux = this.bdarchivo.get(i);
            if (aux.getIdArchivo()== id) {
                
                this.bdarchivo.get(i).setFechaRealizacion(archivo.getFechaRealizacion());                
                this.bdarchivo.get(i).setNombre(archivo.getNombre(id, archivo.getFechaRealizacion(), archivo.getEmpresaPatrocina(), archivo.getCoordenadasOrigen()));
                this.bdarchivo.get(i).setEmpresaPatrocina(archivo.getEmpresaPatrocina());
                this.bdarchivo.get(i).setCoordenadasOrigen(archivo.getCoordenadasOrigen());                
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (ArchivoVO archivo : bdarchivo) {
            if (archivo.getIdArchivo()== id) {
                return archivo;
            }
        }
        return null;
    }
}

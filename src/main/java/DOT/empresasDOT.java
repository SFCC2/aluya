/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.EmpresaVO;
import VO.InventarioVO;
import VO.PersonaVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class empresasDOT implements DAO {

    private ArrayList<EmpresaVO> bdempresa;

    public empresasDOT() {
        this.bdempresa = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        EmpresaVO empresa = null;
        empresa.cast(t);

        if (this.search(empresa.getIdEmpresa()) == null) {
            return this.bdempresa.add(empresa);
        }
        return false;
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        EmpresaVO empresa = null;
        empresa.cast(t);
        return this.bdempresa.remove(empresa);
    }

    @Override
    public boolean update(int id, Object t) {
          EmpresaVO empresa = null;
        empresa.cast(t);
        for (int i = 0; i < this.bdempresa.size(); i++) {
            EmpresaVO aux = this.bdempresa.get(i);
            if (aux.getIdEmpresa()== id) {
                this.bdempresa.get(i).setNombre(empresa.getNombre());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (EmpresaVO empresa : bdempresa) {
            if (empresa.getIdEmpresa()== id) {
                return empresa;
            }
        }
        return null;
    }
}

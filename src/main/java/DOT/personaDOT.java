/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import DAOs.DAO;
import VO.PersonaVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class personaDOT implements DAO {

    private ArrayList<PersonaVO> bdPersonas;

    public personaDOT() {
        this.bdPersonas = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        PersonaVO persona = null;
        persona.cast(t);

        if (this.search(persona.getCedula()) == null) {
            return this.bdPersonas.add(persona);
        }
        return false;
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        PersonaVO persona = null;
        persona.cast(t);
        return this.bdPersonas.remove(persona);
    }

    @Override
    public boolean update(int id, Object t) {
        PersonaVO persona = null;
        persona.cast(t);
        for (int i = 0; i < this.bdPersonas.size(); i++) {
            PersonaVO aux = this.bdPersonas.get(i);
            if (aux.getCedula() == id) {
                this.bdPersonas.get(i).setNombre(persona.getNombre());
                this.bdPersonas.get(i).setApellido(persona.getApellido());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object search(int id) {
        for (PersonaVO persona : bdPersonas) {
            if (persona.getCedula() == id) {
                return persona;
            }
        }
        return null;
    }
}

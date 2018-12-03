/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.PersonaVO;
import java.util.ArrayList;
import VO.ProyectoVO;
import VO.EmpresaVO;
import VO.VOproyectoXempresa;
/**
 *
 * @author Labing I5
 */
public class bdProyectoXEmpresa {

    private static ArrayList<VOproyectoXempresa> vpe;
 private static ArrayList<ProyectoVO> p;
  private static ArrayList<EmpresaVO> a;
  
    public bdProyectoXEmpresa(ArrayList<ProyectoVO> a,ArrayList<EmpresaVO> b) {
        int cont1=0;
        int cont=0;
        if (vpe == null) {
            cont++;
            this.vpe = new ArrayList<>();
           
            this.vpe.add(new VOproyectoXempresa(cont, a.get(cont1).getIdProyecto(), b.get(cont1).getIdEmpresa()) );
        ;
            
        }
    }


    public void addProyectoXEmpresa(VOproyectoXempresa vpe) {
        this.vpe.add(vpe);
    }

    public ArrayList<VOproyectoXempresa> getProyectoXEmpresa() {
        return vpe;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.InventarioVO;
import VO.PersonaVO;
import VO.VOproyectoXarchivo;
import VO.ProyectoVO;
import VO.ArchivoVO;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class bdProyectoXArchivo {

    private static ArrayList<VOproyectoXarchivo> vpa;
 private static ArrayList<ProyectoVO> a;
  private static ArrayList<ArchivoVO> b;
  
    public bdProyectoXArchivo(ArrayList<ProyectoVO> c,ArrayList<ArchivoVO> d) {
        int cont1=0;
        int cont=0;
        a=c; b=d;
        if (vpa == null) {
            cont++;
            this.vpa = new ArrayList<>();
           
            this.vpa.add(new VOproyectoXarchivo(cont, a.get(cont1).getIdProyecto(), b.get(cont1).getIdArchivo()) );
        ;
            
        }
    }

    public void addProyectoXArchivo(VOproyectoXarchivo vpa) {
        this.vpa.add(vpa);
    }

    public ArrayList<VOproyectoXarchivo> getProyectoXArchivo() {
        return vpa;
    }

}

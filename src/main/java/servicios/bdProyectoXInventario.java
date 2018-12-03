/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.InventarioVO;
import VO.ProyectoVO;
import VO.VOproyectoXinventario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class bdProyectoXInventario {

    private static ArrayList<VOproyectoXinventario> Vpi;
 private static ArrayList<ProyectoVO> p;
  private static ArrayList<InventarioVO> a;
    public bdProyectoXInventario(ArrayList<ProyectoVO> a,ArrayList<InventarioVO> b) {
        int cont = 1;
        int cont1=0;
        if (Vpi == null) {
            cont++;
            this.Vpi = new ArrayList<>();

        
            //this.Vpi.add(new VOproyectoXinventario(cont, a.get(cont1).getIdProyecto(), b.get(cont1).getIdInventario()));
            this.Vpi.add(new VOproyectoXinventario(cont,a.get(cont1).getIdProyecto(),b.get(cont1).getIdInventario()));
            cont++;
        }
    }

    public void addEmpresas(VOproyectoXinventario Vpi) {
        this.Vpi.add(Vpi);
    }

    public ArrayList<VOproyectoXinventario> getEmpresas() {
        return Vpi;
    }

}

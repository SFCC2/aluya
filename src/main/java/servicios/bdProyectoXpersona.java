/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.PersonaVO;
import VO.ProyectoVO;
import VO.VOproyectoXpersona;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class bdProyectoXpersona {

    private static ArrayList<VOproyectoXpersona> Vpp;
    
private static ArrayList<ProyectoVO> a;
private static ArrayList<PersonaVO> b;
    /*	idArchivo INT NOT NULL auto_increment PRIMARY KEY, 
    fechaRealizacion varchar(30) NOT NULL,
    nombre varchar(250) NOT NULL,
    coordenadaOrigen varchar(30) NOT NULL,
     idEmpresa INT NOT NULL ,     */
    public bdProyectoXpersona(ArrayList<ProyectoVO> c,ArrayList<PersonaVO> d) {
       
        int cont1=1;
        int cont=0;
        a=c; b=d;
        if (Vpp == null) {
            this.Vpp = new ArrayList<>();
            this.Vpp.add(new VOproyectoXpersona(cont, a.get(cont1).getIdProyecto(), b.get(cont1).getCedula()) );
             this.Vpp.add(new VOproyectoXpersona(cont, a.get(cont1).getIdProyecto(), b.get(cont1).getCedula()) );

        }
    }

    public void addProyectoXpersona(VOproyectoXpersona Vpp) {
       // int cont = 1;

        this.Vpp.add(Vpp);
        //cont++;
    }

    public ArrayList<VOproyectoXpersona> getProyectoXpersona() {
        return Vpp;
    }

}

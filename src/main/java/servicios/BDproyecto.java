/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.PersonaVO;
import VO.ProyectoVO;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BDproyecto {

    private static ArrayList<ProyectoVO> proyectos;

    public BDproyecto() {
          int cont = 1;
        if (proyectos == null) {
              
            this.proyectos= new ArrayList<>();
            
            //insert into Proyecto (nombre,fechaRealizacion,idEmpresa,idArchivo) values ('ROCK','2008 Nombiembre 13',1,1);
//insert into Proyecto (nombre,fechaRealizacion,idEmpresa,idArchivo) values ('TALL','2015 Agosto 30',2,2);

            /*     private int idProyecto;
    private String nombre;
    private int  idEmpresa;
    private int  idArchivo;
    private String fechaRealizada;*/
            
            ProyectoVO admin= new ProyectoVO();
            String nombre=   admin.getNombre(cont, 1, 1,"2008 Nombiembre 13");            
            this.proyectos.add(new ProyectoVO(cont, nombre,1,1,"2008 Nombiembre 13"));
            cont++;
            String nombre2=   admin.getNombre(cont, 2,2,"2015 Agosto 30");
            //'TALL','2015 Agosto 30',2,2
            this.proyectos.add(new ProyectoVO(cont, nombre,2,2,"2015 Agosto 30"));
        }
    }

    public void addProyecto(ProyectoVO proyectos) {
        this.proyectos.add(proyectos);
    }

    public ArrayList<ProyectoVO> getproyectos() {
        return proyectos;
    }

}
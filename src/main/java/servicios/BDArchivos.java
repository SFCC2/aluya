/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.ArchivoVO;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BDArchivos {

    private static ArrayList<ArchivoVO> archivo;

    /*	idArchivo INT NOT NULL auto_increment PRIMARY KEY, 
    fechaRealizacion varchar(30) NOT NULL,
    nombre varchar(250) NOT NULL,
    coordenadaOrigen varchar(30) NOT NULL,
     idEmpresa INT NOT NULL ,     */
    public BDArchivos() {
        int cont = 1;
        if (archivo == null) {
            /*insert into PersonaVO values(1014,"Tania","Cupitra","thania@hotmail.com","Ing quimica","Direccion Tecnica","SIG","jefe");
insert into PersonaVO values(2845,"Nicolas","Leon","nickLuckas@hotmail.com","geofisico","Direccion Tecnica","Geofisica","trabajador");
insert into PersonaVO values(17895,"Julian","Aldan","oniichan@hotmail.com","Admin Empresa","Direccion Administrativa","Revisora Fiscal","jefe");
insert into PersonaVO values(5021,"Lina","Yepes","YepesLin@hotmail.com","contadora","Direccion Administrativa","Contaduria","trabajador");
insert into PersonaVO values(423,"Carolina","Castro","Castrocc@hotmail.com","Revision fisical","Gerente","","jefe");
insert into PersonaVO values(58745,"Paula","Sequera","sepa@hotmail.com","Ing Hidrologia","Gerente","","asistente");*/
            this.archivo = new ArrayList<>();
            
            
            

            ///this.personas.add(new PersonaVO(0, nombre, apellido, correo, Carrera, especialidad, areaTrabajo))
            ArchivoVO admin = new ArchivoVO();
            String nombre = admin.getNombre(cont, "2017 Abril 3", 2, "4.8, -74.05");
            this.archivo.add(new ArchivoVO(cont, nombre, "2017 Abril 3", "4.8, -74.05", 2));
            cont++;
            String nombre1 = admin.getNombre(cont, "2002 febrero 5", 3, "35.8, -98.5");
            this.archivo.add(new ArchivoVO(cont, nombre, "2002 febrero 5", "35.8, -98.5",3));

        }
    }

    public void addArchivo(ArchivoVO Archivos) {
       // int cont = 1;

        this.archivo.add(Archivos);
        //cont++;
    }

    public ArrayList<ArchivoVO> getArchivo() {
        return archivo;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.InventarioVO;
import VO.PersonaVO;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BDinventario {

    private static ArrayList<InventarioVO> inventarios;

    public BDinventario() {
        int cont=0;
        if (inventarios == null) {
            
            /*insert into Inventario (fechaRealizacion,nombre, descripcion,areaTrabajo,cantidad) values ("1990  Agosto 2","Calculadora","permite realizar no solo realziar operacion numericas", "Direccion Administrativa",2);
insert into Inventario (fechaRealizacion,nombre, descripcion,areaTrabajo,cantidad) values ("1985 Julio 30","Metro","Medir el area de trabajo o zona afectada ", "Geofisica",4);
insert into Inventario (fechaRealizacion,nombre, descripcion,areaTrabajo,cantidad) values ("2012 Septiembre 12","Computadora escritorio","Almacenar, buscar, editar documentos ", "Direccion Administrativa",4);
insert into Inventario (fechaRealizacion,nombre, descripcion,areaTrabajo,cantidad) values ("2018  marzo 5","Laptop","Almacenar, buscar, editar documentos ", "Gerente",2);*/
            this.inventarios = new ArrayList<>();
            
            ///this.personas.add(new PersonaVO(0, nombre, apellido, correo, Carrera, especialidad, areaTrabajo))
            /*private int idInventario;
   private String fechaRealizacion;
   private String nombre;
   private String descripcion;
   private String areaTrabajo;
   private int cantidad;*/
              cont++;
            this.inventarios.add(new InventarioVO(  cont,"Calculadora", "Direccion Administrativa",2));
            cont++;
            this.inventarios.add(new InventarioVO(  cont,"Metro", "Geofisica",4));
            cont++;
            this.inventarios.add(new InventarioVO(  cont,"Computadora escritorio", "Direccion Administrativa",9));
            cont++;
            this.inventarios.add(new InventarioVO(  cont,"Laptop", "Gerente",3));
            
            /*
            this.inventarios.add(new InventarioVO(2845,"Nicolas","Leon","nickLuckas@hotmail.com","geofisico","Direccion Tecnica","Geofisica","trabajador"));
            this.inventarios.add(new InventarioVO(17895,"Julian","Aldan","oniichan@hotmail.com","Admin Empresa","Direccion Administrativa","Revisora Fiscal","jefe"));
            this.inventarios.add(new InventarioVO(5021,"Lina","Yepes","YepesLin@hotmail.com","contadora","Direccion Administrativa","Contaduria","trabajador"));
            this.inventarios.add(new InventarioVO(423,"Carolina","Castro","Castrocc@hotmail.com","Revision fisical","Gerente","","jefe"));
            this.inventarios.add(new InventarioVO(58745,"Paula","Sequera","sepa@hotmail.com","Ing Hidrologia","Gerente","","asistente"));*/
        }
    }

    public void addInventario(InventarioVO inventarios) {
        this.inventarios.add(inventarios);
    }

    public ArrayList<InventarioVO> getInventario() {
        return inventarios;
    }

}

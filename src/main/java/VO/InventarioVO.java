/*
 * Copyright 2018 Sulay2016.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package VO;

/**
 *
 * @author Sulay2016
 */
public class InventarioVO {
    
    
   private int idInventario;
   private String nombre;
   private String areaTrabajo;
   private int cantidad;

    public InventarioVO(int idInventario,  String nombre, String areaTrabajo, int cantidad) {
        this.idInventario = idInventario;
      
        this.nombre = nombre;
        this.areaTrabajo = areaTrabajo;
        this.cantidad = cantidad;
    }

    public InventarioVO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

public  InventarioVO cast(Object t) {
        InventarioVO mobj = InventarioVO.class.cast(t);
        return mobj;
     }
   
}

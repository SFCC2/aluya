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
public class ProyectoVO {
     private int idProyecto;
    private String nombre;
    private int  idEmpresa;
    private int  idArchivo;
    private String fechaRealizada;

    public ProyectoVO(int idProyecto, String nombre, int idEmpresa, int idArchivo, String fechaRealizada) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.idArchivo = idArchivo;
        this.fechaRealizada = fechaRealizada;
    }
 public ProyectoVO() {
    }
    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre( int idProyecto,int idEmpresa,
            int idArchivo, String fechaRealizada) {
        String nombres = idArchivo + "-" + idEmpresa + "-" + idArchivo + "-" + fechaRealizada;
        nombre = nombres;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    public String getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(String fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }
    public  ProyectoVO cast(Object t) {
        ProyectoVO mobj = ProyectoVO.class.cast(t);
        return mobj;
     }

}
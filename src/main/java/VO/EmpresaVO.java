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
public class EmpresaVO {
    private int idEmpresa;
    private String nombre;
    private String sobrenombre;

    public EmpresaVO(int idEmpresa, String nombre, String sobrenombre) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.sobrenombre = sobrenombre;
    }
     public EmpresaVO() {
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    
    public  EmpresaVO cast(Object t) {
        EmpresaVO mobj = EmpresaVO.class.cast(t);
        return mobj;
     }
    
}

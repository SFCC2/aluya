/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import VO.EmpresaVO;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BDempresa {

    private static ArrayList<EmpresaVO> empresas;

    public BDempresa() {
        int cont = 1;
        if (empresas == null) {
            cont++;
            this.empresas = new ArrayList<>();

            ///this.personas.add(new PersonaVO(0, nombre, apellido, correo, Carrera, especialidad, areaTrabajo))
            this.empresas.add(new EmpresaVO(cont, "Agreca Ltda-", ""));

            this.empresas.add(new EmpresaVO(cont, "Alcaldía del Municipio De La Primavera (Vichada))", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Alcaldía Del Municipio Unión Panamericana (Chocó))", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Bocacolina S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cafeaseo del Quindío S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cantera Quindingua", ""));

            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cartón de Colombia S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cementos de Tequendama S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cementos Andino S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cemex Colombia S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cerámicas Solafe", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Cerro Matoso S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Concretos Diamante - Samper", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Consorcio Gia-Geocing", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Consultecnica", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Consultoria Colombiana", "Concol"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Corporación Autónoma Regional del Valle del Cauca ", "CVC"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Corporación Autónoma Regional de Cundinamarca  ", "CAR"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Corporación Autónoma Regional Para Desarrollo Sostenible Del Chocó", "CODECHOCÓ"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Corporación Para El Desarrollo Sostenible del Área De Manejo Especial La Macarena", "CORMACARENA"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Diaco S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Empresa Colombiana de Petróleosecopetrol", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Empresa Nacional Minera Ltda.", "MINERCOL"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Estudios Tecnicos S.A - Etsa", "Etsa"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Fondo De Prevención Y Atención De Emergencias De Bogotá", "FOPAE"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Fondo Financiero De Proyectos De Desarrollo", "FONADE"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Gran Tierra Energy Inc.", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Geoespectro S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Geoingeniería ", "Antea Group"));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Gobernación De Cundinamarca", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Golden Arrow Resources Corporation", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Geoespectro S.A.S", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Gobernación De Antioquia", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Hocol S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Ingeniería Y Minería Ltda.", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Ingeniero Jorge Carvajal Barrera", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Instituto Colombiano De Geología Y Mineríaingeominas", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Instituto Nacional De Viasinvias", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Inversiones Colco S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Ministerio De Minas Y Energia", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Nativa Ltda.", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Ogx Petroleo E Gas", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Pacific Rubiales Energy", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Petrobras International S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Petrotesting Colombia S.A", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Promicar Ltda.", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Petronova Colombia", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Servicio Geologico Colombiano", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Sociedad Educacional Andina", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Unión Temporal D&R Ingeniería", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Universidad Nacional De Colombia", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Unidad De Planeación Minero Energetica Upme", ""));
            cont++;
            this.empresas.add(new EmpresaVO(cont, "Xira Investments Inc Colombia", ""));
            cont++;
        }
    }

    public void addEmpresas(EmpresaVO empresas) {
        this.empresas.add(empresas);
    }

    public ArrayList<EmpresaVO> getEmpresas() {
        return empresas;
    }

}

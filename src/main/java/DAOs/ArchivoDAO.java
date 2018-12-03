package DAOs;

import VO.ArchivoVO;
import VO.IBaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import VO.PersonaVO;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2 Clase que permite la gestion de la tabla Depto en la base de
 * datos.
 */
public  class ArchivoDAO implements IBaseDatos<ArchivoVO> {

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<ArchivoVO> findAll() throws SQLException {
        List<ArchivoVO> archivos = null;
        String query = "SELECT * FROM Archivo";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            /*	idArchivo INT NOT NULL auto_increment PRIMARY KEY, 
    fechaRealizacion varchar(30) NOT NULL,
    nombre varchar(250) NOT NULL,
    coordenadaOrigen varchar(30) NOT NULL,
     idEmpresa INT NOT NULL ,     */
            int idS = 0, idEmpresa = 0;
            String nombre = null, fecha = null, coordenadaOrigen = null,
                    Carrera = null, areaTrabajo = null, especialidad = null,
                    tipoEmpleado = null;

            while (rs.next()) {
                if (archivos == null) {
                    archivos = new ArrayList<ArchivoVO>();
                }

                ArchivoVO registro = new ArchivoVO();
                idS = rs.getInt(Integer.parseInt("id"));
                registro.setIdArchivo(idS);

                coordenadaOrigen = rs.getString("Nombre");
                registro.setNombre(nombre);
                fecha = rs.getString("fechaRealizacion");
                registro.setFechaRealizacion(fecha);

                coordenadaOrigen = rs.getString("coordenadaOrigen");
                registro.setCoordenadasOrigen(coordenadaOrigen);

                idEmpresa = rs.getInt("idEmpresa");
                registro.setEmpresaPatrocina(idEmpresa);

                archivos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return archivos;
    }

    /**
     * Funcion que permite realizar la insercion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de insercion es exitosa.
     */
    public boolean insert(ArchivoVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        /*

insert into Archivo (fechaRealizacion,nombre, coordenadaOrigen,idEmpresa) values ('2017 Abril 3','Primera vez','4.8, -74.05',2);
insert into Archivo (fechaRealizacion,nombre,coordenadaOrigen,idEmpresa) values ('2002 febrero 5','Segunda Vez','35.8, -98.5',2);*/
        String query = " insert into Archivo (fechaRealizacion,nombre, coordenadaOrigen,idEmpresa) " + " values (?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);

            /*idArchivo INT NOT NULL auto_increment PRIMARY KEY, 
    fechaRealizacion varchar(30) NOT NULL,
    nombre varchar(250) NOT NULL,
    coordenadaOrigen varchar(30) NOT NULL,
     idEmpresa INT NOT NULL ,     */
            preparedStmt.setString(1, t.getFechaRealizacion());
            preparedStmt.setString(2, t.getNombre(t.getIdArchivo(), t.getFechaRealizacion(),
                    t.getEmpresaPatrocina(), t.getCoordenadasOrigen()));

            preparedStmt.setString(2, t.getCoordenadasOrigen());
            preparedStmt.setInt(2, t.getEmpresaPatrocina());
            t.getEmpresaPatrocina();

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Funcion que permite realizar la actualizacion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de actualizacion es exitosa.
     */
    
    /*idArchivo INT NOT NULL auto_increment PRIMARY KEY, 
    fechaRealizacion varchar(30) NOT NULL,
    nombre varchar(250) NOT NULL,
    coordenadaOrigen varchar(30) NOT NULL,
     idEmpresa INT NOT NULL ,     */
    public boolean update(ArchivoVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE PersonaVO 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        
        
        String query = "update Persona set fechaRealizacion = ?,nombre=?,"
                + "coordenadaOrigen=?,  idEmpresa=?" + " where cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            
       
            preparedStmt.setString(1, t.getFechaRealizacion());
            preparedStmt.setString(2, t.getNombre(t.getIdArchivo(), t.getFechaRealizacion(), t.getEmpresaPatrocina(), t.getCoordenadasOrigen()));
            preparedStmt.setInt(3, t.getEmpresaPatrocina()); 
            preparedStmt.setString(4,t.getCoordenadasOrigen());

            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Funcion que permite realizar la eliminario de registro en la tabla
     * Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de borrado es exitosa.
     */
    public boolean delete(ArchivoVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from Archivo where idArchivo = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdArchivo());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


   


    
}

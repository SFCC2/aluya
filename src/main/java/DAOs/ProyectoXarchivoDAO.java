package DAOs;

import VO.IBaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import VO.VOproyectoXarchivo;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2 Clase que permite la gestion de la tabla Depto en la base de
 * datos.
 */
public class ProyectoXarchivoDAO implements IBaseDatos<VOproyectoXarchivo> {

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<VOproyectoXarchivo> findAll() throws SQLException {
        List<VOproyectoXarchivo> departamentos = null;
        String query = "SELECT * FROM ProyectoXArchivo";
        Connection connection=Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idS = 0, idArchivo=0,    idProyecto =0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<VOproyectoXarchivo>();
                }

                VOproyectoXarchivo registro = new VOproyectoXarchivo();
                
                idS = rs.getInt(Integer.parseInt("IDproyecArchvio"));
                registro.setIdProAR(idS);
                
                idArchivo = rs.getInt(Integer.parseInt("idArchivo"));
                registro.setidArchivo(idArchivo);
                idProyecto = rs.getInt(Integer.parseInt("idProyecto"));
                registro.setIdProAR(idProyecto);
                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    /**
     * Funcion que permite realizar la insercion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de insercion es exitosa.
     */
    public boolean insert(VOproyectoXarchivo t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        //insert into ProyectoXArchivo (idArchivo,idProyecto) values (1,1);
        String query = " insert into ProyectoXArchivo (idArchivo,idProyecto) " + " values (?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getidArchivo());
            preparedStmt.setInt(2, t.getIdProyecto());
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
    public boolean update(VOproyectoXarchivo t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE PersonaVO 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        String query = "update ProyectoXArchivo set idArchivo = ?"
                + "idProyecto=?"+ " where idArP = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdProyecto());
            preparedStmt.setInt(2, t.getidArchivo());

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
    public boolean delete(VOproyectoXarchivo t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from ProyectoXArchivo where idArP = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdProAR());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}

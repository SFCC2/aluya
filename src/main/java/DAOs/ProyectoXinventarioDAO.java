package DAOs;

import VO.IBaseDatos;
import VO.VOproyectoXarchivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import VO.VOproyectoXinventario;
/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2 Clase que permite la gestion de la tabla Depto en la base de
 * datos.
 */
public class ProyectoXinventarioDAO implements IBaseDatos<VOproyectoXinventario> {

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<VOproyectoXinventario> findAll() throws SQLException {
        List<VOproyectoXinventario> departamentos = null;
        String query = "SELECT * FROM ProyectoXArchivo";
        Connection connection=Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idS = 0, idInvent=0,    idProyecto =0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<VOproyectoXinventario>();
                }

                VOproyectoXinventario registro = new VOproyectoXinventario();
                
                idS = rs.getInt(Integer.parseInt("IDproyecArchvio"));
                registro.setIdProyi(idS);
                
                idInvent = rs.getInt(Integer.parseInt("idInvent"));
                registro.setIdInvent(idInvent);
                idProyecto = rs.getInt(Integer.parseInt("idProyecto"));
                
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
    public boolean insert(VOproyectoXinventario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        //insert into ProyectoXArchivo (idArchivo,idProyecto) values (1,1);
        String query = " insert into ProyectoXInventario (idArchivo,idProyecto) " + " values (?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdInvent());
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
    public boolean update(VOproyectoXinventario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE PersonaVO 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        String query = "update ProyectoXInventario set idInventario = ?,"
                + "idProyecto=?"+ " where idInP = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdInvent());
            preparedStmt.setInt(2, t.getIdProyecto());

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
    public boolean delete(VOproyectoXinventario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from ProyectoXInventario where idInP = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdProyi());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}

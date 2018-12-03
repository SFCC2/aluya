package DAOs;

import VO.IBaseDatos;
import VO.InventarioVO;
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
public class InventarioDAO implements IBaseDatos<InventarioVO> {
    

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<InventarioVO> findAll() throws SQLException {
        List<InventarioVO> inventarioS = null;
        //insert into Inventario (nombre, areaTrabajo,cantidad) values ('Calculadora', 'Direccion Administrativa',2);
        //select* from Inventario;
        String query = "SELECT * FROM Inventario";
        Connection connection=Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idS = 0,cantidad=0;
            String nombre = null, areaTrabajo = null;

            while (rs.next()) {
                if (inventarioS == null) {
                    inventarioS = new ArrayList<InventarioVO>();
                }

                InventarioVO registro = new InventarioVO();
                idS = rs.getInt(Integer.parseInt("idInventario"));
                registro.setCantidad(idS);;

                nombre = rs.getString("Nombre");
                registro.setNombre(nombre);

                areaTrabajo = rs.getString("areaTrabajo");
                registro.setAreaTrabajo(areaTrabajo);

                cantidad = rs.getInt("cantidad");
                registro.setCantidad(cantidad);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return inventarioS;
    }

    /**
     * Funcion que permite realizar la insercion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de insercion es exitosa.
     */
    public boolean insert(InventarioVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        //insert into Inventario (nombre, areaTrabajo,cantidad) values ('Calculadora', 'Direccion Administrativa',2);
        String query = " insert into Persona (nombre, areaTrabajo,cantidad) " + " values (?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
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
    public boolean update(InventarioVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE PersonaVO 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        String query = "update Inventario set nombre = areaTrabajo=?,"
                + "cantidad=?" + " where idInventario = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getAreaTrabajo());
            preparedStmt.setInt(3, t.getCantidad());
            

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
    public boolean delete(InventarioVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from Inventario where idInventario = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdInventario());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}

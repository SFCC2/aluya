package DAOs;

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
public class PersonaDAO implements IBaseDatos<PersonaVO> {

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<PersonaVO> findAll() throws SQLException {
        List<PersonaVO> departamentos = null;
        String query = "SELECT * FROM Persona";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idS = 0;
            String nombre = null, apellido = null, correo = null,
                    Carrera = null, areaTrabajo = null, especialidad = null,
                    tipoEmpleado = null;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<PersonaVO>();
                }

                PersonaVO registro = new PersonaVO();
                idS = rs.getInt(Integer.parseInt("cEDULA"));
                registro.setCedula(idS);

                nombre = rs.getString("Nombre");
                registro.setNombre(nombre);

                apellido = rs.getString("apellido");
                registro.setApellido(apellido);

                correo = rs.getString("correo");
                registro.setCorreo(correo);
                Carrera = rs.getString("Carrera");
                registro.setCarrera(Carrera);
                areaTrabajo = rs.getString("areaTrabajo");
                registro.setAreaTrabajo(areaTrabajo);
                especialidad = rs.getString("especialidad");
                registro.setEspecialidad(especialidad);
                tipoEmpleado = rs.getString("tipoEmpleado");
                registro.setEspecialidad(tipoEmpleado);

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
    public boolean insert(PersonaVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        //insert into PersonaVO values(1014,'Tania','Cupitra','thania@hotmail.com','Ing quimica','Direccion Tecnica','SIG','jefe');
        String query = " insert into Persona " + " values (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getApellido());
            preparedStmt.setString(3, t.getCorreo());
            preparedStmt.setString(4, t.getCarrera());
            preparedStmt.setString(5, t.getAreaTrabajo());
            preparedStmt.setString(6, t.getEspecialidad());
            preparedStmt.setString(7, t.getTipoEmpleado());

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
    public boolean update(PersonaVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE PersonaVO 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        String query = "update Persona set nombre = ?,apellido=?,"
                + "correo=?,  carrera=?,areaTrabajo=?,"
                + "        especialidad=?,tipoEmpleado=?" + " where cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getApellido());
            preparedStmt.setString(3, t.getCorreo());
            preparedStmt.setString(4, t.getCarrera());
            preparedStmt.setString(5, t.getAreaTrabajo());
            preparedStmt.setString(6, t.getEspecialidad());
            preparedStmt.setString(7, t.getTipoEmpleado());

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
    public boolean delete(PersonaVO t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from Persona where cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCedula());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}

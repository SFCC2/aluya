package DAOs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DAO<T> {

    boolean insert(T t) ;//?? AGREGAR throws SQLException A TODOS LOS DE AQUI PRESENE
    List<T> findAll() ;    //ArrayList<T> listALL();  
    boolean delete(T t) ;
    boolean update(int id,T t);
    T search(int id);
    /*  
     T search(int id);*/

}

package com.escom.ipn.dao;

import com.escom.ipn.modelo.Articulo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.escom.ipn.modelo.Categoria;

public class CategoriaDao extends ConnectionDB {

    private static final String SQL_SELECT_ALL = "select * from categoria";
    private static final String selectByNombre = "select idcategoria from categoria where nombreCategoria ='?'";
     private static final String insert = "insert into categoria (nombreCategoria,descripcion)values(?,?) ";

    public List<Categoria> loadAll() throws SQLException {
        List<Categoria> listUsers = new ArrayList<>();

        try {
            con = getConnection();
            prState = con.prepareStatement(SQL_SELECT_ALL);
            result = prState.executeQuery();
            while (result.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(Integer.parseInt(result.getString(1)));
                categoria.setNombre(result.getString(2));
                categoria.setDescripcion(result.getString(3));

                listUsers.add(categoria);
            }

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {

            closeConnection(con);
        }

        return listUsers;
    }
    
    
       public void insert(Categoria cat) throws SQLException {
        try {
            con = getConnection();
            prState = con.prepareStatement(insert);
            prState.setString(1, cat.getNombre());
            prState.setString(2, cat.getDescripcion());
            prState.executeUpdate();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {
            closeConnection(con);

        }

    }

    

   

}

package com.escom.ipn.dao;

import com.escom.ipn.modelo.Articulo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticuloDao extends ConnectionDB {

    private static final String insert = "insert into articulo (nombre,precio,existencia,categoria_idcategoria)values(?,?,?,?)";
    private static final String loadAll = "select * from articulo";
    private static final String loadById="select * from articulo where idarticulo = ?";
    private static final String SQL_UPDATE = "update articulo set nombre=? , precio=? , existencia=? , categoria_idcategoria= ? where idarticulo =?";
    private static final String delete = "delete from articulo where idarticulo=?";
    public void insertArticulo(Articulo art) throws SQLException {
        try {
            con = getConnection();
            prState = con.prepareStatement(insert);
            prState.setString(1, art.getNombre());
            prState.setDouble(2, art.getPrecio());
            prState.setInt(3, art.getExistencia());
            prState.setInt(4, art.getCategoria());
            prState.executeUpdate();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {
            closeConnection(con);

        }

    }
    public List<Articulo> loadAll() throws SQLException {
        List<Articulo> listUsers = new ArrayList<>();

        try {
            con = getConnection();
            prState = con.prepareStatement(loadAll);
            result = prState.executeQuery();
            while (result.next()) {
                Articulo usuario = new Articulo();
                usuario.setIdArticulo(Integer.parseInt(result.getString(1)));
                usuario.setNombre(result.getString(2));
                usuario.setPrecio(Double.parseDouble(result.getString(3)));
                usuario.setExistencia(Integer.parseInt(result.getString(4)));
                usuario.setCategoria(Integer.parseInt(result.getString(5)));
                
                listUsers.add(usuario);
            }

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {

            closeConnection(con);
        }

        return listUsers;
    }
    
     public Articulo loadByid(int idArt) throws SQLException {

        Articulo usuario = new Articulo();
        try {
            con = getConnection();
            prState = con.prepareStatement(loadById);
            prState.setInt(1, idArt);
            result = prState.executeQuery();
            while (result.next()) {
                usuario.setIdArticulo(Integer.parseInt(result.getString(1)));
                usuario.setNombre(result.getString(2));
                usuario.setPrecio(Double.parseDouble(result.getString(3)));
                usuario.setExistencia(Integer.parseInt(result.getString(4)));
                usuario.setCategoria(Integer.parseInt(result.getString(5)));
                

            }

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {
            closeConnection(con);
        }

        return usuario;
    }
     
      public void updateArticulo (Articulo art) throws SQLException {

        try {
            con = getConnection();
            prState = con.prepareStatement(SQL_UPDATE);
            prState.setString(1, art.getNombre());
            prState.setDouble(2, art.getPrecio());
            prState.setInt(3, art.getExistencia());
            prState.setInt(4, art.getCategoria());
            prState.setInt(5, art.getIdArticulo());
            prState.executeUpdate();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        } finally {
            closeConnection(con);
        }

        
    }
      
       public void delete(int idUsuario) throws SQLException, InstantiationException {

        try {
            con = getConnection();
            prState = con.prepareStatement(delete);
            prState.setInt(1, idUsuario);
            prState.executeUpdate();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
        } finally {

            closeConnection(con);
        }

        
    }
}

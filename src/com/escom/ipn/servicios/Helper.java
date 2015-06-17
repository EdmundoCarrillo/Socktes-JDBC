package com.escom.ipn.servicios;

import com.escom.ipn.modelo.Articulo;
import com.escom.ipn.modelo.Categoria;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Helper {

    Socket sCliente;
    private final int puerto = 9000;
    private final String ip = "127.0.0.1";
    BufferedReader entrada;
    DataOutputStream salida;
    ObjectOutputStream mandar;
    ObjectInputStream recibe;

    public ArrayList<Categoria> llenarCategorias() {
        ArrayList<Categoria> lista = null;
        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(2);// clave para traer categorias
            // recibe arraylist
            recibe = new ObjectInputStream(sCliente.getInputStream());
            lista = (ArrayList<Categoria>) recibe.readObject();
            recibe.close();
            salida.close();
            sCliente.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
        return lista;
    }

    public ArrayList<Articulo> listar() {
        ArrayList<Articulo> lista = null;
        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(3);// clave para traer articulos
            // recibe arraylist
            recibe = new ObjectInputStream(sCliente.getInputStream());
            lista = (ArrayList<Articulo>) recibe.readObject();
            recibe.close();
            salida.close();
            sCliente.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
        return lista;
    }

}

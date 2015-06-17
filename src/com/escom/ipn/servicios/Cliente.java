package com.escom.ipn.servicios;

import com.escom.ipn.modelo.Articulo;
import com.escom.ipn.modelo.Categoria;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    Socket sCliente;
    private final int puerto = 9000;
    private final String ip = "127.0.0.1";
    BufferedReader entrada;
    DataOutputStream salida;
    ObjectOutputStream mandar;
    ObjectInputStream inFromServer;

    public void insert(Articulo articulo) {

        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(1);// clave para hacer un insert
            // manda el objeto articulo
            mandar = new ObjectOutputStream(sCliente.getOutputStream());
            mandar.writeObject(articulo);
            mandar.close();
            salida.close();
            sCliente.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
    
     public Articulo loadById(int idArt) {
         Articulo art = null;
        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(4);// clave para hacer  tarer un Articulo
            // manda el id articulo
            salida.writeInt(idArt);
            //recibe objeto Articulo
            inFromServer = new ObjectInputStream(sCliente.getInputStream());
            art = (Articulo)inFromServer.readObject();
            inFromServer.close();
            salida.close();
            sCliente.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return art;
    }
     
     public void editar(Articulo articulo) {

        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(5);// clave para hacer un update
            // manda el objeto articulo
            mandar = new ObjectOutputStream(sCliente.getOutputStream());
            mandar.writeObject(articulo);
            mandar.close();
            salida.close();
            sCliente.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
     
         public void insertCat(Categoria cat) {

        try {
            sCliente = new Socket(ip, puerto);
            salida = new DataOutputStream(sCliente.getOutputStream());
            salida.writeInt(6);// clave para hacer un insert
            // manda el objeto articulo
            mandar = new ObjectOutputStream(sCliente.getOutputStream());
            mandar.writeObject(cat);
            mandar.close();
            salida.close();
            sCliente.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

   /* public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Articulo art  = new Articulo ();
        art.setNombre("Patines");
        cliente.insert(art);
    }*/
}

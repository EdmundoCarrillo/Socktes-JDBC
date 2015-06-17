/*
 * MServidor.java
 *
 * Created on 1 de noviembre de 2007, 22:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.escom.ipn.servicios;

import com.escom.ipn.dao.ArticuloDao;
import com.escom.ipn.dao.CategoriaDao;
import com.escom.ipn.modelo.Articulo;
import com.escom.ipn.modelo.Categoria;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Server extends Thread {

    ServerSocket serverSocket;
    Socket socket;
    DataInputStream entrada;
    DataOutputStream salida;
    ObjectInputStream inFromClient;
    ObjectOutputStream mandar;
    private final int puerto = 9000;
    private final JFrame ventana;

    public Server(JFrame ventana) {

        this.ventana = ventana;
    }

    @Override
    public void run() {

        try {
            serverSocket = new ServerSocket(puerto);
            JOptionPane.showMessageDialog(ventana, " Servidor Encendido");
            while (true) {
                socket = serverSocket.accept();
                entrada = new DataInputStream(socket.getInputStream());
                int accion = entrada.readInt();
                switch (accion) {
                    case 1: // insert
                        inFromClient = new ObjectInputStream(socket.getInputStream());
                        try {
                            Articulo articulo = (Articulo) inFromClient.readObject();
                            //llama a las persistenciaa 
                            ArticuloDao op = new ArticuloDao();
                            op.insertArticulo(articulo);

                            inFromClient.close();
                        } catch (ClassNotFoundException | SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;
                    case 2: // ArrayList con categorias
                        try {

                            List<Categoria> lista = (new CategoriaDao().loadAll());
                            mandar = new ObjectOutputStream(socket.getOutputStream());
                            mandar.writeObject(lista);
                            mandar.close();
                        } catch (SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;

                    case 3: // ArrayList con articulos
                        try {

                            List<Articulo> lista = (new ArticuloDao().loadAll());
                            mandar = new ObjectOutputStream(socket.getOutputStream());
                            mandar.writeObject(lista);
                            mandar.close();
                        } catch (SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;

                    case 4: // Regresa un articulo
                        try {

                            List<Articulo> lista = (new ArticuloDao().loadAll());
                            entrada = new DataInputStream(socket.getInputStream());
                            int idArt = entrada.readInt();
                            ArticuloDao op = new ArticuloDao();
                            Articulo art = op.loadByid(idArt);
                            mandar = new ObjectOutputStream(socket.getOutputStream());
                            mandar.writeObject(art);
                            mandar.close();
                            entrada.close();
                        } catch (SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;
                    case 5: // update
                        inFromClient = new ObjectInputStream(socket.getInputStream());
                        try {
                            Articulo articulo = (Articulo) inFromClient.readObject();
                            //llama a las persistenciaa 
                            ArticuloDao op = new ArticuloDao();
                            op.updateArticulo(articulo);

                            inFromClient.close();
                        } catch (ClassNotFoundException | SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;

                    case 6: // insert
                        inFromClient = new ObjectInputStream(socket.getInputStream());
                        try {
                            Categoria cat = (Categoria) inFromClient.readObject();
                            //llama a las persistenciaa 
                            CategoriaDao op = new CategoriaDao();
                            op.insert(cat);

                            inFromClient.close();
                        } catch (ClassNotFoundException | SQLException ex) {
                            System.out.println(ex.toString());
                        }

                        break;

                }

                socket.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

}

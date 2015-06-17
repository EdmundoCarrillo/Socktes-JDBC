/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.ipn.vista;

import com.escom.ipn.dao.ArticuloDao;
import com.escom.ipn.modelo.Articulo;
import com.escom.ipn.modelo.Categoria;
import com.escom.ipn.servicios.Cliente;
import com.escom.ipn.servicios.Helper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DARTH VADER
 */
public class FrameProdcutos extends javax.swing.JInternalFrame {

    int id;
    public FrameProdcutos() {
        initComponents();
        cargarCombo();
        listarArticulos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textExistencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        avisoLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");

        jLabel1.setText("Nombre:");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio:");

        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });

        jLabel3.setText("Existencia");

        jLabel4.setText("Categoria");

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gestión de Prodcutos");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id Articulo", "Nombre", "Precio", "Stock", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaArticulos);

        avisoLabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textExistencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(avisoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addGap(3, 3, 3)
                .addComponent(avisoLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Articulo articulo = new Articulo();
        articulo.setNombre(textNombre.getText());
        articulo.setPrecio(Double.parseDouble(textPrecio.getText()));
        articulo.setExistencia(Integer.parseInt(textExistencia.getText()));
        articulo.setCategoria(((Categoria) comboCategoria.getSelectedItem()).getIdCategoria());
        //System.out.println(articulo.getNombre()+articulo.getCategoria());

        Cliente cliente = new Cliente();
        cliente.insert(articulo);
        listarArticulos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       cargarCombo();
       listarArticulos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
         DefaultTableModel modelo = null;
        modelo = (DefaultTableModel) tablaArticulos.getModel();
       int fila = tablaArticulos.rowAtPoint(evt.getPoint());
       //int columna = tablaArticulos.columnAtPoint(evt.getPoint());
       //if ((fila > -1) && (columna > -1))
       // System.out.println(modelo.getValueAt(fila,columna));
        //System.out.println(modelo.getValueAt(fila, 0));
        int idArticulo= Integer.parseInt((String) modelo.getValueAt(fila,0)) ;
        id=idArticulo;
        System.out.println(idArticulo);
        Cliente cliente  = new Cliente ();
       Articulo art  = cliente.loadById(idArticulo);
       textNombre.setText("");textNombre.setText(art.getNombre());
       textPrecio.setText("");textPrecio.setText(Double.toString(art.getPrecio()));
       textExistencia.setText("");textExistencia.setText(Integer.toString(art.getExistencia()));
       avisoLabel.setText("Para Editar Elija nuevamente la Categoria");
       
    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Articulo articulo = new Articulo();
        articulo.setIdArticulo(id);
        articulo.setNombre(textNombre.getText());
        articulo.setPrecio(Double.parseDouble(textPrecio.getText()));
        articulo.setExistencia(Integer.parseInt(textExistencia.getText()));
        articulo.setCategoria(((Categoria) comboCategoria.getSelectedItem()).getIdCategoria());
        Cliente c = new Cliente();
        c.editar(articulo);
        listarArticulos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
     
        try {
            ArticuloDao op  = new ArticuloDao ();
            op.delete(id);
            listarArticulos();
        } catch (SQLException ex) {
            Logger.getLogger(FrameProdcutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FrameProdcutos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void cargarCombo() {
        Helper help = new Helper();
        List<Categoria> lista;
        lista = help.llenarCategorias();
        for (int i = 0; i < lista.size(); i++) {

            comboCategoria.addItem(lista.get(i));

        }

    }

    private void listarArticulos() {
        Helper help = new Helper();
        List<Articulo> lista;
        lista = help.listar();
        DefaultTableModel modelo = null;
        try {
            modelo = (DefaultTableModel) tablaArticulos.getModel();
            int a = modelo.getRowCount();
            for (int i = 0; i < a; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        String datos[] = new String[5];

        for (int i = 0; i < lista.size(); i++) {
            datos[0] = Integer.toString(lista.get(i).getIdArticulo());
            datos[1] = lista.get(i).getNombre();
            datos[2] = Double.toString(lista.get(i).getPrecio());
            datos[3] = Integer.toString(lista.get(i).getExistencia());
            datos[4] = Integer.toString(lista.get(i).getCategoria());
            modelo.addRow(datos);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoLabel;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField textExistencia;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}

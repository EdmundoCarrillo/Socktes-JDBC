/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.escom.ipn.vista;
import com.escom.ipn.dao.ConnectionDB;
 import com.escom.ipn.vista.FrameProdcutos;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DARTH VADER
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemProductos = new javax.swing.JMenuItem();
        itemCategorias = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemReportes = new javax.swing.JMenuItem();
        itemGraficas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(652, 519));
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Formas");

        itemProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        jMenu2.add(itemProductos);

        itemCategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        itemCategorias.setText("Categorias");
        itemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(itemCategorias);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Herramientas");

        itemReportes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK));
        itemReportes.setText("Reportes");
        itemReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemReportesMouseClicked(evt);
            }
        });
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        jMenu4.add(itemReportes);

        itemGraficas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        itemGraficas.setText("Graficas");
        jMenu4.add(itemGraficas);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesActionPerformed
//        try {
//         ConnectionDB con  = new ConnectionDB();
//        Connection conn = con.getConnection();
//         JasperReport Jas_Rep= JasperCompileManager.compileReport("reportes/report1.jrxml");
//         JasperPrint Jas_Prin= JasperFillManager.fillReport(Jas_Rep, null,conn);
//        JasperViewer.viewReport(Jas_Prin,false);
//        } catch (Exception e) {
//        System.out.println(e.toString());
        
//        }
    }//GEN-LAST:event_itemReportesActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        FrameProdcutos frameUno  = new FrameProdcutos();
        desktop.add(frameUno);
        frameUno.setVisible(true);
    }//GEN-LAST:event_itemProductosActionPerformed

    private void itemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCategoriasActionPerformed
         FrameCategorias frameUno  = new FrameCategorias();
        desktop.add(frameUno);
        frameUno.setVisible(true);
    }//GEN-LAST:event_itemCategoriasActionPerformed

    private void itemReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemReportesMouseClicked
//       try {
//         ConnectionDB con  = new ConnectionDB();
//        Connection conn = con.getConnection();
//         JasperReport Jas_Rep= JasperCompileManager.compileReport("C:\\Users\\DARTH VADER\\Desktop\\escom\\Sistemas Distribuidos\\Ejercicios\\Ejercicio2\\src\\com\\escom\\ipn\\reportes\\report1.jrxml");
//         JasperPrint Jas_Prin= JasperFillManager.fillReport(Jas_Rep, null,conn);
//        JasperViewer.viewReport(Jas_Prin,false);
//        } catch (Exception e) {
//        System.out.println(e.toString());
//        
//        }
    }//GEN-LAST:event_itemReportesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemCategorias;
    private javax.swing.JMenuItem itemGraficas;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
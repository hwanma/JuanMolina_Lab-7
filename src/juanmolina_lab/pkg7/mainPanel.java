/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmolina_lab.pkg7;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainPanel extends javax.swing.JFrame {

    /**
     * Creates new form mainPanel
     */
    public mainPanel() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        //cargarClientes();
        cargarArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        EquiposMenu = new javax.swing.JMenu();
        ItemCrear = new javax.swing.JMenuItem();
        ItemModificar = new javax.swing.JMenuItem();
        ItemEliminar = new javax.swing.JMenuItem();
        ItemCargar = new javax.swing.JMenuItem();
        ItemGuardar = new javax.swing.JMenuItem();
        PartidosMenu = new javax.swing.JMenu();
        ItemSimulacion = new javax.swing.JMenuItem();
        ItemTabla = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EquiposMenu.setText("Equipos");

        ItemCrear.setText("Crear");
        ItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCrearActionPerformed(evt);
            }
        });
        EquiposMenu.add(ItemCrear);

        ItemModificar.setText("Modificar");
        EquiposMenu.add(ItemModificar);

        ItemEliminar.setText("Eliminar");
        ItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEliminarActionPerformed(evt);
            }
        });
        EquiposMenu.add(ItemEliminar);

        ItemCargar.setText("Cargar");
        ItemCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCargarActionPerformed(evt);
            }
        });
        EquiposMenu.add(ItemCargar);

        ItemGuardar.setText("Guardar");
        ItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGuardarActionPerformed(evt);
            }
        });
        EquiposMenu.add(ItemGuardar);

        jMenuBar1.add(EquiposMenu);

        PartidosMenu.setText("Partidos");

        ItemSimulacion.setText("Simulacion");
        PartidosMenu.add(ItemSimulacion);

        ItemTabla.setText("Tabla");
        PartidosMenu.add(ItemTabla);

        jMenuBar1.add(PartidosMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCrearActionPerformed
        File archivo=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        
            try{
                archivo = new File("./fifa.txt");
                fw=new FileWriter(archivo,true);
                bw=new BufferedWriter(fw);
                
                String nombre;
                nombre=JOptionPane.showInputDialog("Nombre del equipo: ");
                
                
                bw.write(nombre+";0;0;0;0;0;0;0;0\n");
                bw.flush();
                
            } catch(Exception e){
                
            }
        
    }//GEN-LAST:event_ItemCrearActionPerformed

    private void ItemCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCargarActionPerformed
        try {
            cargarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemCargarActionPerformed

    private void ItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEliminarActionPerformed
        equipos.remove(seleccionar());
    }//GEN-LAST:event_ItemEliminarActionPerformed

    private void ItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGuardarActionPerformed
        try {
            guardarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainPanel().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EquiposMenu;
    private javax.swing.JMenuItem ItemCargar;
    private javax.swing.JMenuItem ItemCrear;
    private javax.swing.JMenuItem ItemEliminar;
    private javax.swing.JMenuItem ItemGuardar;
    private javax.swing.JMenuItem ItemModificar;
    private javax.swing.JMenuItem ItemSimulacion;
    private javax.swing.JMenuItem ItemTabla;
    private javax.swing.JMenu PartidosMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
    
    ArrayList<equipo> equipos = new ArrayList();
    
    public void cargarArchivo() throws IOException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileInputStream file = null;

        try {
            archivo = new File("./fifa.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String str;
            while ((str = br.readLine()) != null) {
                String[] ar = str.split(";");
                equipo leer = new equipo(ar[0],Integer.parseInt(ar[1]),Integer.parseInt(ar[2]),Integer.parseInt(ar[3]),Integer.parseInt(ar[4]),Integer.parseInt(ar[5]),Integer.parseInt(ar[6]),Integer.parseInt(ar[7]));
                equipos.add(leer);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(mainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        br.close();
        fr.close();
        
    }
    
    public void guardarArchivo() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./fifa.txt"));
        
        String acum = "";
        for (equipo temp : equipos) {
            acum += temp.toString();
        }

        bw.write(acum + "\n");
        bw.flush();
    }

    public int seleccionar(){
        String selecciones = "";
        for (equipo temp : equipos) {
            selecciones += (equipos.indexOf(temp)+". " + temp.getNombre()+"\n");
        }
        JOptionPane.showMessageDialog(null,selecciones);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que indice selecciona? "));
        return opcion;
    }

}

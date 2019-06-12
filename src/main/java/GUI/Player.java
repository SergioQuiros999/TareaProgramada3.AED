/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Busqueda;
import System.PokeManager;
import System.PokeMap;

/**
 *
 * @author Fanny Brenes
 */
public class Player extends javax.swing.JFrame {
   Busqueda busqueda;

    public Busqueda getBusqueda() {
        return busqueda;
    }
   
    /**
     * Creates new form Player
     */
    public Player() {
        initComponents();
         int x = PokeManager.getInstance().GetBusquedaa().size();
         int y= PokeManager.getInstance().GetLugarespreterminados().size();
         for(int i=0;i<x;i++){
         String corx=PokeManager.getInstance().GetBusqueda(i).getX();
         String cory=PokeManager.getInstance().GetBusqueda(i).getY();
         String dir=PokeManager.getInstance().GetBusqueda(i).getDireccion();
         combocorx.addItem(corx);
         combocory.addItem(cory);
         Combodir.addItem(dir);
         }
         for(int s=0;s<y;s++){
         String corx=PokeManager.getInstance().GetPreterminado(s).getX();
         String cory=PokeManager.getInstance().GetPreterminado(s).getY();
         String dir=PokeManager.getInstance().GetPreterminado(s).getDireccion();
         combocorx.addItem(corx);
         combocory.addItem(cory);
         Combodir.addItem(dir);
         
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combocorx = new javax.swing.JComboBox<>();
        Combodir = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        combocory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar por coordenadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("Buscar por dirección");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 120, -1));

        getContentPane().add(combocorx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, -1));

        Combodir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombodirActionPerformed(evt);
            }
        });
        getContentPane().add(Combodir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 280, -1));

        jButton1.setText("Siguiente");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 430, 150));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 610, 240));

        jButton2.setText("Buscar por coordenadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jButton4.setText("Buscar por dirección");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 150, -1));

        getContentPane().add(combocory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, -1));

        jLabel3.setText("Cordenada x");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setText("Cordenada y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Ventanainicial usuario = new Ventanainicial();
        usuario.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    PokeMap metodo=new PokeMap();
    String corx=String.valueOf(combocorx.getSelectedItem());
    String cory=String.valueOf(combocory.getSelectedItem());
    String nombre="";
    String direccion="";
    int x=PokeManager.getInstance().GetBusquedaa().size();
    int y=PokeManager.getInstance().GetLugarespreterminados().size();
    for (int i=0;i<x;i++) {
    if(PokeManager.getInstance().GetBusqueda(i).getX()==corx&&PokeManager.getInstance().GetBusqueda(i).getY()==cory){        
     nombre=PokeManager.getInstance().GetBusqueda(i).getName();
     direccion=PokeManager.getInstance().GetBusqueda(i).getDireccion();
    }}
    for (int s=0;s<y;s++) {
     if(PokeManager.getInstance().GetPreterminado(s).getX()==corx&&PokeManager.getInstance().GetPreterminado(s).getY()==cory){        
     nombre=PokeManager.getInstance().GetPreterminado(s).getName();
     direccion=PokeManager.getInstance().GetPreterminado(s).getDireccion();
     }
            }
    metodo.puntoespecifico(panel1.getGraphics(), nombre);
    txt.setText("Nombre    "+nombre+"       Dirección exacta     "+direccion);
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    PokeMap metodo=new PokeMap();
    String direccion=String.valueOf(Combodir.getSelectedItem());
    String nombre="";
    String corx="";
    String cory="";
    int x=PokeManager.getInstance().GetBusquedaa().size();
    int y=PokeManager.getInstance().GetLugarespreterminados().size();
    for (int i=0;i<x;i++) {
    if(PokeManager.getInstance().GetBusqueda(i).getDireccion()==direccion){        
     nombre=PokeManager.getInstance().GetBusqueda(i).getName();
     corx=PokeManager.getInstance().GetBusqueda(i).getX();
     cory=PokeManager.getInstance().GetBusqueda(i).getY();
    }}
    for (int s=0;s<y;s++) {
     if(PokeManager.getInstance().GetPreterminado(s).getDireccion()==direccion){        
     nombre=PokeManager.getInstance().GetPreterminado(s).getName();
     corx=PokeManager.getInstance().GetPreterminado(s).getX();
     cory=PokeManager.getInstance().GetPreterminado(s).getY();
     }
            }
    metodo.puntoespecifico(panel1.getGraphics(), nombre);
    txt.setText("Nombre    "+nombre+"  Corx= "+corx+"  Cory= "+cory);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CombodirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombodirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombodirActionPerformed

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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combodir;
    private javax.swing.JComboBox<String> combocorx;
    private javax.swing.JComboBox<String> combocory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorUsuario;
import ec.ups.edu.dao.TelefonoDAOImpl;
import ec.ups.edu.dao.UsuarioDAOImpl;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private UsuarioDAOImpl usuarioDao;
    private TelefonoDAOImpl telefonoDao;
    private ControladorUsuario controladorU;

    private VentanaInicioSesion ventanaInicioSesion;
    private VentanaRegistrarUsuario ventanaRegistrarUsuario;
    private VentanaGestionTelefonos ventanaGestionTelefonos;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocation(450, 200);
        gestiónMenu.setVisible(false);
        cerrarSesionMenuItem.setVisible(false);

        telefonoDao = new TelefonoDAOImpl();
        usuarioDao = new UsuarioDAOImpl();
        controladorU = new ControladorUsuario(usuarioDao, telefonoDao);

        ventanaInicioSesion = new VentanaInicioSesion(controladorU, this);
        ventanaRegistrarUsuario = new VentanaRegistrarUsuario(controladorU);
        ventanaGestionTelefonos = new VentanaGestionTelefonos(controladorU);

    }

    public JMenuItem getCerrarSesionMenuItem() {
        return cerrarSesionMenuItem;
    }

    public JMenu getGestiónMenu() {
        return gestiónMenu;
    }

    public JMenuItem getIniciarSesionMenuItem() {
        return iniciarSesionMenuItem;
    }

    public JMenuItem getRegistrarUsuarioMenuItem() {
        return registrarUsuarioMenuItem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        iniciarSesionMenuItem = new javax.swing.JMenuItem();
        registrarUsuarioMenuItem = new javax.swing.JMenuItem();
        listarMenuItem = new javax.swing.JMenuItem();
        cerrarSesionMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        gestiónMenu = new javax.swing.JMenu();
        gestionTelefonosMenuItem = new javax.swing.JMenuItem();
        gestionUsuarioMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fileMenu.setMnemonic('f');
        fileMenu.setText("Menú");

        iniciarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        iniciarSesionMenuItem.setMnemonic('o');
        iniciarSesionMenuItem.setText("Iniciar sesión");
        iniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(iniciarSesionMenuItem);

        registrarUsuarioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        registrarUsuarioMenuItem.setMnemonic('a');
        registrarUsuarioMenuItem.setText("Registrar usuario");
        registrarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(registrarUsuarioMenuItem);

        listarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listarMenuItem.setText("Listar teléfonos");
        fileMenu.add(listarMenuItem);

        cerrarSesionMenuItem.setText("Cerrar sesión");
        cerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(cerrarSesionMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        gestiónMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestiónMenu.setText("Gestión");

        gestionTelefonosMenuItem.setText("Teléfonos");
        gestionTelefonosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionTelefonosMenuItemActionPerformed(evt);
            }
        });
        gestiónMenu.add(gestionTelefonosMenuItem);

        gestionUsuarioMenuItem.setText("Usuario");
        gestiónMenu.add(gestionUsuarioMenuItem);

        menuBar.add(gestiónMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void iniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionMenuItemActionPerformed
        // TODO add your handling code here:

        desktopPane.add(ventanaInicioSesion);
        ventanaInicioSesion.setVisible(true);

    }//GEN-LAST:event_iniciarSesionMenuItemActionPerformed

    private void registrarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioMenuItemActionPerformed
        // TODO add your handling code here:

        desktopPane.add(ventanaRegistrarUsuario);
        ventanaRegistrarUsuario.setVisible(true);
    }//GEN-LAST:event_registrarUsuarioMenuItemActionPerformed

    private void cerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionMenuItemActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, "Usted ha cerrado sesión");

        gestiónMenu.setVisible(false);
        cerrarSesionMenuItem.setVisible(false);

        registrarUsuarioMenuItem.setVisible(true);
        iniciarSesionMenuItem.setVisible(true);
    }//GEN-LAST:event_cerrarSesionMenuItemActionPerformed

    private void gestionTelefonosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionTelefonosMenuItemActionPerformed
        // TODO add your handling code here:

        desktopPane.add(ventanaGestionTelefonos);
        ventanaGestionTelefonos.setVisible(true);

    }//GEN-LAST:event_gestionTelefonosMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cerrarSesionMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem gestionTelefonosMenuItem;
    private javax.swing.JMenuItem gestionUsuarioMenuItem;
    private javax.swing.JMenu gestiónMenu;
    private javax.swing.JMenuItem iniciarSesionMenuItem;
    private javax.swing.JMenuItem listarMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registrarUsuarioMenuItem;
    // End of variables declaration//GEN-END:variables

}
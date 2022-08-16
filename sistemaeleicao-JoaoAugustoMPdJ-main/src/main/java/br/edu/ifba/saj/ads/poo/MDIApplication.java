/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.saj.ads.poo;

import br.edu.ifba.saj.ads.poo.model.User;
import br.edu.ifba.saj.ads.poo.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Operador
 */
public class MDIApplication extends javax.swing.JFrame {

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Creates new form MDIApplication
     */
    public MDIApplication() {
        extracted2();
    }

    private void extracted2() {
        usuario.initComponents(this);
    }

    public void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> extracted());
    }

    /**
     * 
     */
    private static void extracted() {
        EntityManager em = Persistence.createEntityManagerFactory("LoginModal_PU").createEntityManager();
         final List<User> users = em.createQuery("SELECT c FROM User c WHERE c.login = :login").setParameter("login", "admin").getResultList();
        if (!(users != null && users.size() == 1)) {
            User user = new User();
           // user.setLogin("admin");
            //user.setNome("Leandro");
            //user.setSenha("admin");
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }
        MDIApplication application = new MDIApplication();
        application.setVisible(true);
        LoginDialog dialog = new LoginDialog(application, true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem aboutMenuItem;
    public javax.swing.JMenuItem contentMenuItem;
    public javax.swing.JMenuItem copyMenuItem;
    public javax.swing.JMenuItem cutMenuItem;
    public javax.swing.JMenuItem deleteMenuItem;
    public javax.swing.JDesktopPane desktopPane;
    public javax.swing.JMenu editMenu;
    public javax.swing.JMenuItem exitMenuItem;
    public javax.swing.JMenu fileMenu;
    public javax.swing.JMenu helpMenu;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenuItem openMenuItem;
    public javax.swing.JMenuItem pasteMenuItem;
    public javax.swing.JMenuItem saveAsMenuItem;
    public javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    void setUsuario(Usuario usuario) {
        this.usuario = usuario;

        JOptionPane.showMessageDialog(rootPane, "Bem vindo " + usuario.getNome());

        this.setTitle(usuario.getNome() + " - Logado");
    }

}

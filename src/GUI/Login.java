package GUI;

import controllers.Acc;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
 
public class Login extends javax.swing.JFrame {
    private final Acc Account;
    boolean isLogin = false;
    private Object JOptionPanel;
    
    public Login() throws ClassNotFoundException, SQLException {
        Account = new Acc();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        KolomUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        KolomPass = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 170, 70, 20);
        getContentPane().add(KolomUser);
        KolomUser.setBounds(250, 190, 208, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 220, 70, 20);

        KolomPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolomPassActionPerformed(evt);
            }
        });
        getContentPane().add(KolomPass);
        KolomPass.setBounds(250, 240, 208, 22);

        Login.setBackground(new java.awt.Color(204, 204, 204));
        Login.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(102, 102, 102));
        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(300, 290, 100, 33);

        jLabel5.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("FRUITIES STORE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 40, 400, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/login.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 750, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KolomPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolomPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KolomPassActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        String Username = KolomUser.getText();
        String Password = KolomPass.getText();
        
        ListMenu m1 = new ListMenu();
        
        try {
            this.isLogin = Account.authentication(Username, Password);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (this.isLogin) {
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            this.dispose();
            new ListMenu().setVisible(true);                  
        } else{
            JOptionPane.showMessageDialog(null, "Login Gagal");
            try {
                new Login().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_LoginMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KolomPass;
    private javax.swing.JTextField KolomUser;
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

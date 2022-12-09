package GUI;

import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ListMenu extends javax.swing.JFrame {

    public ListMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DataBuah = new javax.swing.JButton();
        DataJenis = new javax.swing.JButton();
        Logout = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 29, 58, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Kelola Data ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(53, 82, 152, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Informasi Jenis");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(53, 126, 152, 20);

        DataBuah.setBackground(new java.awt.Color(204, 204, 204));
        DataBuah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataBuah.setForeground(new java.awt.Color(102, 102, 102));
        DataBuah.setText("Mulai");
        DataBuah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBuahMouseClicked(evt);
            }
        });
        DataBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBuahActionPerformed(evt);
            }
        });
        getContentPane().add(DataBuah);
        DataBuah.setBounds(261, 79, 72, 23);

        DataJenis.setBackground(new java.awt.Color(204, 204, 204));
        DataJenis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataJenis.setForeground(new java.awt.Color(102, 102, 102));
        DataJenis.setText("Mulai");
        DataJenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataJenisMouseClicked(evt);
            }
        });
        getContentPane().add(DataJenis);
        DataJenis.setBounds(261, 123, 72, 23);

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(102, 102, 102));
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(158, 224, 120, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/listmenu.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-180, -60, 720, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void DataBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBuahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataBuahActionPerformed

    private void DataBuahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBuahMouseClicked
        try {
            new DataBuah().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DataBuahMouseClicked

    private void DataJenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataJenisMouseClicked
        try {
            new DataJenis().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DataJenisMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        JOptionPane.showMessageDialog(null, "ANDA AKAN LOGOUT");
        try {
            new Login().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); 
    }//GEN-LAST:event_LogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataBuah;
    private javax.swing.JButton DataJenis;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

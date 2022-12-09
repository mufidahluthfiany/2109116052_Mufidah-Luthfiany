package GUI;
import javax.swing.*;
import controllers.Jenis;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataJenis extends javax.swing.JFrame {
    Jenis B1;


    public DataJenis() throws ClassNotFoundException, SQLException {
        B1 = new Jenis();
        initComponents();
        this.showData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("JENIS BUAH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 30, 120, 26);

        tbData.setBackground(new java.awt.Color(204, 204, 204));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis ", "Keunggulan"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 70, 649, 78);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 180, 90, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/datajenis.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 760, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       new ListMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            B1.showJenis(),
            new String [] {
                "Jenis", "Keunggulan"
            }
        )); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables
}

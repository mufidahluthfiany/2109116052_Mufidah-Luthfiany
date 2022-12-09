package GUI;

import controllers.Buah;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TambahBuah extends javax.swing.JFrame {
    Buah B1;

    public TambahBuah() throws ClassNotFoundException, SQLException {
        B1 = new Buah();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FormNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FormJenis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FormHarga = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Tambah Buah");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 130, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama Buah");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 69, 100, 20);

        FormNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormNamaActionPerformed(evt);
            }
        });
        getContentPane().add(FormNama);
        FormNama.setBounds(34, 91, 265, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Jenis");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(34, 131, 80, 20);
        getContentPane().add(FormJenis);
        FormJenis.setBounds(34, 153, 265, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Harga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 193, 70, 20);
        getContentPane().add(FormHarga);
        FormHarga.setBounds(34, 215, 265, 22);

        Add.setBackground(new java.awt.Color(204, 204, 204));
        Add.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 102, 102));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(72, 276, 80, 26);

        Cancel.setBackground(new java.awt.Color(204, 204, 204));
        Cancel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(102, 102, 102));
        Cancel.setText("Cancel");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(253, 276, 90, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 390, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormNamaActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        try {    
            String hb = FormNama.getText();
            String jb = FormJenis.getText();
            String kb = FormHarga.getText();

            B1.insertbuah(hb, jb, kb);

            JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");

            new DataBuah().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "TAMBAH DATA GAGAL");
            try {
                new TambahBuah().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TambahBuah.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TambahBuah.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
                    
        }
        this.dispose();
    }//GEN-LAST:event_AddMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        try {
            DataBuah m1 = new DataBuah();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            new DataBuah().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahBuah.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahBuah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField FormHarga;
    private javax.swing.JTextField FormJenis;
    private javax.swing.JTextField FormNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

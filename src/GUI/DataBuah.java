package GUI;
import javax.swing.*;
import controllers.Buah;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBuah extends javax.swing.JFrame {
    Buah B1;

    public DataBuah() throws ClassNotFoundException, SQLException {
        B1 = new Buah();
        initComponents();
        this.showData();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("FRUITIES STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 150, 26);

        tbdata.setBackground(new java.awt.Color(204, 204, 204));
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID buah", "Nama buah", "Jenis ", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tbdata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(18, 78, 441, 155);

        Update.setBackground(new java.awt.Color(204, 204, 204));
        Update.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(102, 102, 102));
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(20, 280, 90, 20);

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(102, 102, 102));
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(110, 280, 90, 20);

        Add.setBackground(new java.awt.Color(204, 204, 204));
        Add.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 102, 102));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(200, 280, 70, 20);

        Back.setBackground(new java.awt.Color(204, 204, 204));
        Back.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 102, 102));
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(380, 280, 72, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/databuah.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 490, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        try{ 
            String id = JOptionPane.showInputDialog("Masukan ID : ", null); 
            this.dispose();
            if (id == null) { 
                try { 
                    new DataBuah().setVisible(true); 
                } catch (ClassNotFoundException ex) { 
                    Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                this.dispose(); 
            } else { 
                    new UpBuah(Integer.parseInt(id)).setVisible(true); 
                try {
                    this.showData(); 
                } catch (SQLException e) { 
                    // TODO Auto-generated catch block 
                    e.printStackTrace(); 
                } 
            } 
        } catch (Exception e) { 
            try { 
                new DataBuah().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose(); 
        }                           
    }//GEN-LAST:event_UpdateMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        try{ 
            String id = JOptionPane.showInputDialog("Masukan ID : ", null); 
            if (id == null) { 
                try { 
                    new DataBuah().setVisible(true); 
                } catch (ClassNotFoundException ex) { 
                    Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                this.dispose(); 
            } else { 
                try { 
                    B1.deletebuah(Integer.parseInt(id)); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                try { 
                    this.showData(); 
                } catch (SQLException e) { 
                    // TODO Auto-generated catch block 
                    e.printStackTrace(); 
                } 
            } 
        } catch (Exception e) { 
            try { 
                new DataBuah().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose(); 
        } 
    }//GEN-LAST:event_DeleteMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        try {
            new TambahBuah().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBuah.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_AddMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new ListMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked
    public void showData() throws SQLException {
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            B1.showbuah(),
            new String [] {
                "ID", "Nama Buah", "Jenis", "Harga"
            }
        ));
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdata;
    // End of variables declaration//GEN-END:variables
}

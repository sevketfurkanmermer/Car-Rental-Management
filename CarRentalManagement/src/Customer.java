
import java.awt.DisplayMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
public class Customer extends javax.swing.JFrame {

  
    public Customer() {
        initComponents();
        DisplayCustomers();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    private void DisplayCustomers(){
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
        statement = connection.createStatement();
        resultset=statement.executeQuery("select * from customers ");
        tableCustList.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch(SQLException e ){
        
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbCustName = new javax.swing.JTextField();
        tbCustAddress = new javax.swing.JTextField();
        tbCustPhone = new javax.swing.JTextField();
        tbCustId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustList = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ÇIKIŞ YAP");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("İADE ET");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KİRALA");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ARABA");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1048, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1319, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 0, 1450, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("MÜŞTERİ YÖNETİMİ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 380, 50));

        tbCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tbCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 190, 40));

        tbCustAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tbCustAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 370, 40));

        tbCustPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tbCustPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 190, 190, 40));

        tbCustId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tbCustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("MÜŞTERİ LİSTESİ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 215, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ADRES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("TELEFON");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 150, 120, 30));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(153, 0, 0));
        btnSave.setText("KAYDET");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 150, 40));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 0, 0));
        btnUpdate.setText("DÜZENLE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 150, 40));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("SİL");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 150, 40));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(153, 0, 0));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 270, 150, 40));

        tableCustList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableCustList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMARA", "AD", "ADRES", "TELEFON"
            }
        ));
        tableCustList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 880, 380));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("MÜŞTERİ ADI");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("MÜŞTERİ NO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(tbCustId.getText().isEmpty() || tbCustName.getText().isEmpty() || tbCustAddress.getText().isEmpty() || tbCustPhone.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Eksik bilgi girildiği için araç eklenemedi");
    } else {
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar", "root", "Aa457511");
            
            // Musterinin zaten var olup olmadığını kontrol et
            String checkQuery = "SELECT * FROM customers WHERE Id=?";
            try (PreparedStatement checkStatement = connection.prepareStatement(checkQuery)) {
                checkStatement.setString(1, tbCustId.getText());
                ResultSet resultSet = checkStatement.executeQuery();
                
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Bu müşteri numarası zaten mevcut", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Müşteri ekle
                    String insertQuery = "INSERT INTO customers VALUES(?,?,?,?)";
                    try (PreparedStatement add = connection.prepareStatement(insertQuery)) {
                        add.setString(1,tbCustId.getText());
                        add.setString(2, tbCustName.getText());
                        add.setString(3, tbCustAddress.getText());
                        add.setString(4, (tbCustPhone.getText()));
                        int row = add.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Müşteri başarıyla eklendi");
                        DisplayCustomers();
                        Reset();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Müşteri eklenirken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnSaveActionPerformed
    private void Reset(){
    tbCustId.setText("");
    tbCustName.setText("");
    tbCustAddress.setText("");
    tbCustPhone.setText("");
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableCustListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustListMouseClicked
       DefaultTableModel model = (DefaultTableModel)tableCustList.getModel();
        int sec  = tableCustList.getSelectedRow();
        tbCustId.setText(model.getValueAt(sec, 0).toString());
        tbCustName.setText(model.getValueAt(sec, 1).toString());
        tbCustAddress.setText(model.getValueAt(sec, 2).toString());
        tbCustPhone.setText(model.getValueAt(sec, 3).toString());
    }//GEN-LAST:event_tableCustListMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       if(tbCustId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Silinecek Müşteriyi seçiniz");
        }else{}
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            int Id = Integer.valueOf(tbCustId.getText());
            String Query = "DELETE FROM rentacar.customers WHERE Id='" + Id + "'";
            Statement add = connection.createStatement();
            add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Müşteri başarıyla silindi");
            DisplayCustomers();
            Reset();
        }
        catch(Exception e ){
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          if (tbCustId.getText().isEmpty() || tbCustName.getText().isEmpty() || tbCustAddress.getText().isEmpty() || tbCustPhone.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Düzenlenecek müşteriyi seçiniz");
    } else {
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar", "root", "Aa457511");

            
            String checkQuery = "SELECT * FROM customers WHERE Id=? AND Id <> ?";
            try (PreparedStatement checkStatement = connection.prepareStatement(checkQuery)) {
                checkStatement.setString(1, tbCustId.getText());
                checkStatement.setString(2, tbCustId.getText());
                ResultSet resultSet = checkStatement.executeQuery();

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Bu müşteri numarası zaten kullanımda", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Müşteriyi güncelle
                    int Id = Integer.valueOf(tbCustId.getText());
                    String updateQuery = "UPDATE customers SET MusteriAdi=?, MusteriAdresi=?, MusteriTelefonu=? WHERE Id=?";
                    try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                        updateStatement.setString(1, tbCustName.getText());
                        updateStatement.setString(2, tbCustAddress.getText());
                        updateStatement.setString(3, tbCustPhone.getText());
                        updateStatement.setInt(4, Id);

                        int row = updateStatement.executeUpdate();
                        if (row > 0) {
                            JOptionPane.showMessageDialog(this, "Müşteri başarıyla düzenlendi");
                            DisplayCustomers();
                            Reset();
                        } else {
                            JOptionPane.showMessageDialog(this, "Düzenleme başarısız", "Hata", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Müşteri düzenlenirken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Rents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Cars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         new ReturnCars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       new LogIn().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustList;
    private javax.swing.JTextField tbCustAddress;
    private javax.swing.JTextField tbCustId;
    private javax.swing.JTextField tbCustName;
    private javax.swing.JTextField tbCustPhone;
    // End of variables declaration//GEN-END:variables
}

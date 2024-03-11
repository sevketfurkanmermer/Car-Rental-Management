
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
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
public class ReturnCars extends javax.swing.JFrame {

    /**
     * Creates new form ReturnCars
     */
    public ReturnCars() {
        initComponents();
        DisplayRents();
        GetCustomers();
        DisplayReturns();
        tbcust.setEditable(false);
        tbcarno.setEditable(false);
        tbfine.setEditable(false);
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    
    private void DisplayRents(){
        
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
        statement = connection.createStatement();
        resultset=statement.executeQuery("SELECT * FROM renttable");
        tablecarsonrent.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch(SQLException e ){
        
        }
    }
    private void DisplayReturns(){
        
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
        statement = connection.createStatement();
        resultset=statement.executeQuery("SELECT * FROM returntable");
        returntable.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch(SQLException e ){
        
        }
    }
    public void GetCustomers(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            statement = connection.createStatement();
            String query ="select * from customers";
            resultset=statement.executeQuery(query);
            while(resultset.next()){
                String customer = resultset.getString("MusteriAdi");
                
            }

        }catch(Exception exception){
            exception.printStackTrace();
        }
    
    }
    private void UpdateCar(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            statement=connection.createStatement();
            String num=tbcarno.getText();
            String durum="UYGUN";
            String query="UPDATE cars set DURUM='"+durum+"' where NUMARA='"+num+"'";
            Statement Add = connection.createStatement();
            Add.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Araç başarıyla güncellendi");
            
        }catch(Exception e){   
            e.printStackTrace();
        
        }
    
    }
    private void RemoveFromRent(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            String num = tbcarno.getText();
           String Query = "DELETE FROM rentacar.renttable WHERE RENTID=" + Rid;

            Statement add = connection.createStatement();
            add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Araç başarıyla kiralanan araçlardan silindi");
            DisplayRents();
        }
        catch(Exception e ){
        
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tbreturnıd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbfine = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        datereturn = new com.toedter.calendar.JDateChooser();
        tbcarno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tbcust = new javax.swing.JTextField();
        btnreturn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        returntable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablecarsonrent = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        kaydetbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tbdelay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ÇIKIŞ YAP");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MÜŞTERİ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ARABA");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1060));

        tbreturnıd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbreturnıd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbreturnıdActionPerformed(evt);
            }
        });
        jPanel1.add(tbreturnıd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("GERİ GELEN ARAÇLAR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 200, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("CEZA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 160, 30));

        tbfine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbfine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbfineActionPerformed(evt);
            }
        });
        jPanel1.add(tbfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 190, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("BİTİŞ TARİHİ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));
        jPanel1.add(datereturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 190, 40));

        tbcarno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tbcarno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 190, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("ARAÇ NUMARASI");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 160, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("GECİKME");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 160, 30));

        tbcust.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tbcust, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 190, 40));

        btnreturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnreturn.setForeground(new java.awt.Color(153, 0, 0));
        btnreturn.setText("CEZA");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 120, 40));

        returntable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KİRALAMA ID", "ARAÇ NUMARASI", "MÜŞTERİ", "DÖNÜŞ TARİHİ", "GECİKME", "CEZA"
            }
        ));
        returntable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returntableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(returntable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 720, 260));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("GERİ DÖNÜŞ ID ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 30));

        tablecarsonrent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablecarsonrent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RENTID", "NUMARA", "MÜŞTERİ", "KİRALAMA TARİHİ", "DÖNÜŞ TARİHİ", "FİYAT"
            }
        ));
        tablecarsonrent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecarsonrentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablecarsonrent);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 720, 250));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("KİRADAKİ ARAÇLAR");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 200, 30));

        kaydetbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kaydetbtn.setForeground(new java.awt.Color(153, 0, 0));
        kaydetbtn.setText("KAYDET");
        kaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(kaydetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 670, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("MÜŞTERİ ADI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, 30));

        tbdelay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(tbdelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 1570, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbreturnıdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbreturnıdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbreturnıdActionPerformed
    int fee=0;
    int fine;
    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        if(fee==0){
            JOptionPane.showMessageDialog(this, "Geri gelen aracı seçiniz");
        }
        else{
            fine=fee*Integer.valueOf(tbdelay.getText());
            tbfine.setText("Rs"+fine);
        }
    }//GEN-LAST:event_btnreturnActionPerformed

    private void returntableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returntableMouseClicked
        

    }//GEN-LAST:event_returntableMouseClicked
    int Rid;
    private void tablecarsonrentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecarsonrentMouseClicked
    DefaultTableModel model = (DefaultTableModel) tablecarsonrent.getModel();
    int selectedRow = tablecarsonrent.getSelectedRow();

    if (selectedRow != -1) {
        tbcarno.setText(model.getValueAt(selectedRow, 1).toString());
        tbcust.setText(model.getValueAt(selectedRow, 2).toString());
        Rid=Integer.valueOf((model.getValueAt(selectedRow, 0).toString()));
        fee = Integer.valueOf(model.getValueAt(selectedRow, 5).toString());
    }
    }//GEN-LAST:event_tablecarsonrentMouseClicked

    private void tbfineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbfineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbfineActionPerformed

    private void kaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetbtnActionPerformed

        if(tbcarno.getText().isEmpty() || tbcust.getText().isEmpty() || tbfine.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Eksik bilgi girildiği için araç eklenemedi");
        } else {
            try {
                

                java.util.Date Daterent = datereturn.getDate();
                java.sql.Date Rentdat = new java.sql.Date(Daterent.getTime());

                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar", "root", "Aa457511");

                String insertQuery = "INSERT INTO returntable (RetId, CarReg, CustName, RetDate, Delay, Fine) VALUES(?,?,?,?,?,?)";
                try (PreparedStatement add = connection.prepareStatement(insertQuery)) {
                    add.setInt(1, Integer.valueOf(tbreturnıd.getText()));
                    add.setString(2, tbcarno.getText());
                    add.setString(3, tbcust.getText());
                    add.setDate(4, Rentdat);
                    
                    add.setInt(5, Integer.valueOf(tbdelay.getText()));
                    add.setInt(6, Integer.valueOf(tbfine.getText().replace("Rs", "")));
                    
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Araç başarıyla iade edildi");
                    UpdateCar();
                    RemoveFromRent();
                    DisplayReturns();
                    
                    

                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "İade edilirken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_kaydetbtnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       new LogIn().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Rents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Cars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreturn;
    private com.toedter.calendar.JDateChooser datereturn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton kaydetbtn;
    private javax.swing.JTable returntable;
    private javax.swing.JTable tablecarsonrent;
    private javax.swing.JTextField tbcarno;
    private javax.swing.JTextField tbcust;
    private javax.swing.JTextField tbdelay;
    private javax.swing.JTextField tbfine;
    private javax.swing.JTextField tbreturnıd;
    // End of variables declaration//GEN-END:variables
}

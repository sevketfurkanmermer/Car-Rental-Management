
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
public class Rents extends javax.swing.JFrame {

    /**
     * Creates new form Rents
     */
    public Rents() {
        initComponents();
        DisplayCars();
        DisplayRents();
        GetCustomers();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    private void DisplayCars(){
        String Durum="UYGUN";
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
        statement = connection.createStatement();
        String query="SELECT * FROM cars where DURUM ='"+Durum+"'";
        resultset=statement.executeQuery(query);
        tablearac.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch(SQLException e ){
        
        }
    }
    private void UpdateCar(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            statement=connection.createStatement();
            String num=kayittb.getText();
            String durum="KİRALANDI";
            String query="UPDATE cars set DURUM='"+durum+"' where NUMARA='"+num+"'";
            Statement Add = connection.createStatement();
            Add.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Araç başarıyla güncellendi");
            DisplayCars();
            Reset();
            
        }catch(Exception e){   
            e.printStackTrace();
        
        }
    
    }
    private void UpdateCars2(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            statement=connection.createStatement();
            String num=kayittb.getText();
            String durum="UYGUN";
            String query="UPDATE cars set DURUM='"+durum+"' where NUMARA='"+num+"'";
            Statement Add = connection.createStatement();
            Add.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Araç başarıyla güncellendi");
            DisplayCars();
            Reset();
            
        }catch(Exception e){   
            e.printStackTrace();
        
        }
    
    }
    private void DisplayRents(){
        
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
        statement = connection.createStatement();
        resultset=statement.executeQuery("SELECT * FROM renttable");
        tablekiradakiaraclar.setModel(DbUtils.resultSetToTableModel(resultset));
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
                musteriadicb.addItem(customer);
            }

        }catch(Exception exception){
            exception.printStackTrace();
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kayittb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ucrettb = new javax.swing.JTextField();
        kiralamatb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        musteriadicb = new javax.swing.JComboBox<>();
        kaydetbtn = new javax.swing.JButton();
        duzenlebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablearac = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kiralamadate = new com.toedter.calendar.JDateChooser();
        bitisdate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablekiradakiaraclar = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        silbtn = new javax.swing.JButton();
        yazdirbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

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
        jLabel9.setText("İADE ET");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ARABA");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1054, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1217, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ARAÇ KİRALA");

        kayittb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ÜCRET");

        ucrettb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        kiralamatb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("ARABA LİSTESİ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("MÜŞTERİ ADI");

        musteriadicb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        musteriadicb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriadicbActionPerformed(evt);
            }
        });

        kaydetbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kaydetbtn.setForeground(new java.awt.Color(153, 0, 0));
        kaydetbtn.setText("KAYDET");
        kaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetbtnActionPerformed(evt);
            }
        });

        duzenlebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duzenlebtn.setForeground(new java.awt.Color(153, 0, 0));
        duzenlebtn.setText("DÜZENLE");
        duzenlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenlebtnActionPerformed(evt);
            }
        });

        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(153, 0, 0));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        tablearac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablearac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUMARA", "MARKA", "MODEL", "DURUM", "FİYAT"
            }
        ));
        tablearac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablearacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablearac);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("KAYIT");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("KİRALAMA ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("KİRALAMA TARİHİ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("BİTİŞ TARİHİ");

        tablekiradakiaraclar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablekiradakiaraclar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KİRALAMA ID", "NUMARA", "MÜŞTERİ", "KİRALAMA TARİHİ", "DÖNÜŞ TARİHİ", "FİYAT"
            }
        ));
        tablekiradakiaraclar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablekiradakiaraclarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablekiradakiaraclar);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("KİRADAKİ ARAÇLAR");

        silbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        silbtn.setForeground(new java.awt.Color(153, 0, 0));
        silbtn.setText("SİL");
        silbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbtnActionPerformed(evt);
            }
        });

        yazdirbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yazdirbtn.setForeground(new java.awt.Color(153, 0, 0));
        yazdirbtn.setText("YAZDIR");
        yazdirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazdirbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(480, 480, 480)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(kiralamatb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(37, 37, 37)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(kayittb, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(musteriadicb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(256, 256, 256)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(220, 220, 220)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ucrettb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(257, 257, 257)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(150, 150, 150)
                                                    .addComponent(kaydetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(81, 81, 81)
                                                    .addComponent(duzenlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(54, 54, 54)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(83, 83, 83)
                                                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(kiralamadate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bitisdate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGap(111, 111, 111))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(yazdirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kayittb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kiralamatb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(musteriadicb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kiralamadate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bitisdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ucrettb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duzenlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kaydetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(yazdirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteriadicbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriadicbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteriadicbActionPerformed

    private void tablearacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablearacMouseClicked
        DefaultTableModel model = (DefaultTableModel)tablearac.getModel();
        int sec  = tablearac.getSelectedRow();
        //kiralamatb.setText(model.getValueAt(sec, 0).toString());
        kayittb.setText(model.getValueAt(sec, 0).toString());
        ucrettb.setText(model.getValueAt(sec, 4).toString());
        
    }//GEN-LAST:event_tablearacMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tablekiradakiaraclarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablekiradakiaraclarMouseClicked
       DefaultTableModel model =(DefaultTableModel)tablekiradakiaraclar.getModel();
       int sec = tablekiradakiaraclar.getSelectedRow();
       kiralamatb.setText(model.getValueAt(sec, 0).toString());
       kayittb.setText(model.getValueAt(sec, 1).toString());
       musteriadicb.setSelectedItem(model.getValueAt(sec, 2).toString());
       ucrettb.setText(model.getValueAt(sec, 5).toString());
       
       
    }//GEN-LAST:event_tablekiradakiaraclarMouseClicked

    private void kaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetbtnActionPerformed
                                          
    if(kiralamatb.getText().isEmpty() || ucrettb.getText().isEmpty() || kayittb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Eksik bilgi girildiği için araç eklenemedi");
    } else {
        try {
            java.util.Date DateRent = kiralamadate.getDate();
            java.sql.Date RentDat = new java.sql.Date(DateRent.getTime());

            java.util.Date Daterent = bitisdate.getDate();
            java.sql.Date Rentdat = new java.sql.Date(Daterent.getTime());
            
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar", "root", "Aa457511");
                    
            String insertQuery = "INSERT INTO renttable (RentId, CarReg, CustName, RentDate, ReturnDate, RentFee) VALUES(?,?,?,?,?,?)";
            try (PreparedStatement add = connection.prepareStatement(insertQuery)) {
                add.setInt(1, Integer.valueOf(kiralamatb.getText()));
                add.setString(2, kayittb.getText());
                add.setString(3, musteriadicb.getSelectedItem().toString());
                add.setDate(4, RentDat);
                add.setDate(5, Rentdat);
                add.setInt(6,Integer.valueOf(ucrettb.getText()));
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Araç başarıyla kiralandı");
                
                DisplayRents();
                UpdateCar();
                DisplayCars();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kiralanırken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }


    }//GEN-LAST:event_kaydetbtnActionPerformed
    private void Reset(){
    kayittb.setText("");
    kiralamatb.setText("");
    ucrettb.setText("");
    musteriadicb.setSelectedIndex(0);
    
    }
    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
       Reset();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void duzenlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duzenlebtnActionPerformed
             if(kiralamatb.getText().isEmpty() || ucrettb.getText().isEmpty() || kayittb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Düzenlenecek kiralamayı seçiniz");
    } else {
        java.util.Date DateRent = kiralamadate.getDate();
        java.sql.Date RentDat = new java.sql.Date(DateRent.getTime());

        java.util.Date Daterent = bitisdate.getDate();
        java.sql.Date Rentdat = new java.sql.Date(Daterent.getTime());

        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar", "root", "Aa457511");

            String updateQuery = "UPDATE renttable SET CarReg=?, CustName=?, RentDate=?, ReturnDate=?, RentFee=? WHERE RentId=?";
            
            try (PreparedStatement update = connection.prepareStatement(updateQuery)) {
                update.setString(1, kayittb.getText());
                update.setString(2, musteriadicb.getSelectedItem().toString());
                update.setDate(3, RentDat);
                update.setDate(4, Rentdat);
                update.setString(5, ucrettb.getText());
                update.setInt(6, Integer.parseInt(kiralamatb.getText()));

                int row = update.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Kiralama başarıyla düzenlendi");
                DisplayRents();
                Reset();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kiralama düzenlenirken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_duzenlebtnActionPerformed

    private void silbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbtnActionPerformed
        if(kiralamatb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Silinecek kiralamayı seçiniz");
        }else{}
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","Aa457511");
            String Id = kiralamatb.getText();
            String Query = "DELETE FROM rentacar.renttable WHERE RentId='" + Id + "'";
            Statement add = connection.createStatement();
            add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Kiralama başarıyla silindi");
            DisplayRents();
            UpdateCars2();
            DisplayCars();
            Reset();
        }
        catch(Exception e ){
            e.printStackTrace();
        
        }
    }//GEN-LAST:event_silbtnActionPerformed

    private void yazdirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazdirbtnActionPerformed
        try{
            tablekiradakiaraclar.print();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_yazdirbtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Cars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bitisdate;
    private javax.swing.JButton duzenlebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kaydetbtn;
    private javax.swing.JTextField kayittb;
    private com.toedter.calendar.JDateChooser kiralamadate;
    private javax.swing.JTextField kiralamatb;
    private javax.swing.JComboBox<String> musteriadicb;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton silbtn;
    private javax.swing.JTable tablearac;
    private javax.swing.JTable tablekiradakiaraclar;
    private javax.swing.JTextField ucrettb;
    private javax.swing.JButton yazdirbtn;
    // End of variables declaration//GEN-END:variables
}

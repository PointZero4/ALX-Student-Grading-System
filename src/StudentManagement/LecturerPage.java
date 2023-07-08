
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentManagement;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 
 * 
 */
public class LecturerPage extends javax.swing.JFrame {

    /**
     * Creates new form Student_Result
     */
    Connection con;
      PreparedStatement pst;
      ResultSet rs;
      
    public LecturerPage() {
        initComponents();
        courses();
    }
    
    
    public void courses()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
            
            pst = con.prepareStatement("select * from course");
            rs = pst.executeQuery();
            
            txtCourse.removeAllItems();
            
            while(rs.next())
            {
              txtCourse.addItem(rs.getString(2));  
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturerPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
    
    
    public void perAttendace(){
        //calculating for the EG value first 
        String userAtt;
        String resultEGS;
        String resultPerS;
        double valueCon = 100;
        double attTotal = 20;
        double resultEG;
        double resultPer;
        double userAttInt;
        
       userAtt = jTextField7.getText();
       userAttInt = Double.parseDouble(userAtt);
       
       //calculating for the EG
       //converting EG back to string 
       
       resultEG = (userAttInt/attTotal)* valueCon;
       resultEGS =Double.toString(resultEG);
       
       //inserting it into the EG textfield
       jTextField8.setText(resultEGS);
       
       
       //calculating for the 10% 
       resultPer = (userAttInt/attTotal)*10;
       resultPerS = Double.toString(resultPer);
       
       jTextField9.setText(resultPerS);
       
        
    
    
    }
    
    public void writtenQuiz(){
        //calculating for the EG and 10%
        String userQ;
        String wResultEGS;
        String wresultPerS;
        double wValueConn = 100,wAttTotal=50;
        double wresultEG;
        double wresultPer;
        double wUserAttInt;
        
        userQ =jTextField10.getText();
        wUserAttInt = Double.parseDouble(userQ);
        wresultEG = (wUserAttInt/wAttTotal)*wValueConn;
        wResultEGS = Double.toString(wresultEG);
        jTextField11.setText(wResultEGS);
        
        
        
        
        wresultPer = (wUserAttInt/wAttTotal)*10;
        wresultPerS = Double.toString(wresultPer);
        jTextField12.setText(wresultPerS);
        
        
        
        
        
    }
    
    
    public void practicalQuiz(){
        
        //calculating for the EG and 10%
        String userQP;
        String wResultEGSP;
        String wresultPerSP;
        double wValueConnP = 100,wAttTotalP=50;
        double wresultEGP;
        double wresultPerP;
        double wUserAttIntP;
        
        userQP =jTextField10.getText();
        wUserAttIntP = Double.parseDouble(userQP);
        wresultEGP = (wUserAttIntP/wAttTotalP)*wValueConnP;
        wResultEGSP = Double.toString(wresultEGP);
        jTextField26.setText(wResultEGSP);
        
        
        
        
        wresultPerP = (wUserAttIntP/wAttTotalP)*20;
        wresultPerSP = Double.toString(wresultPerP);
        jTextField27.setText(wresultPerSP);
    
    
    
    }
    
    public void projectPer(){
        
        //calculating for the EG and 10%
        String userQPP;
        String wResultEGSPP;
        String wresultPerSPP;
        double wValueConnPP = 100,wAttTotalPP=100;
        double wresultEGPP;
        double wresultPerPP;
        double wUserAttIntPP;
        
        userQPP =jTextField16.getText();
        wUserAttIntPP = Double.parseDouble(userQPP);
        wresultEGPP = (wUserAttIntPP/wAttTotalPP)*wValueConnPP;
        wResultEGSPP = Double.toString(wresultEGPP);
        jTextField17.setText(wResultEGSPP);
        
        
        
        
        wresultPerPP = (wUserAttIntPP/wAttTotalPP)*30;
        wresultPerSPP = Double.toString(wresultPerPP);
        jTextField18.setText(wresultPerSPP);
    
        
        
    }
    
    public void prelimExam(){
        //calculating for the EG and 10%
        String userQPPE;
        String wResultEGSPPE;
        String wresultPerSPPE;
        double wValueConnPPE = 100,wAttTotalPPE=100;
        double wresultEGPPE;
        double wresultPerPPE;
        double wUserAttIntPPE;
        
        userQPPE =jTextField4.getText();
        wUserAttIntPPE = Double.parseDouble(userQPPE);
        wresultEGPPE = (wUserAttIntPPE/wAttTotalPPE)*wValueConnPPE;
        wResultEGSPPE = Double.toString(wresultEGPPE);
        jTextField5.setText(wResultEGSPPE);
        
        
        
        
        wresultPerPPE = (wUserAttIntPPE/wAttTotalPPE)*30;
        wresultPerSPPE = Double.toString(wresultPerPPE);
        jTextField6.setText(wresultPerSPPE);
        
    }
    
    
    public void totalMarks(){
        double total;
        String totalS;
        //calculating for the EG value first 
        String userAtt;
        String resultEGS;
        String resultPerS;
        double valueCon = 100;
        double attTotal = 20;
        double resultEG;
        double resultPer;
        double userAttInt;
        
       userAtt = jTextField7.getText();
       userAttInt = Double.parseDouble(userAtt);
       
       //calculating for the EG
       //converting EG back to string 
       
       resultEG = (userAttInt/attTotal)* valueCon;
       resultEGS =Double.toString(resultEG);
       
       //inserting it into the EG textfield
       //jTextField8.setText(resultEGS);
       
       
       //calculating for the 10% 
       resultPer = (userAttInt/attTotal)*10;
       resultPerS = Double.toString(resultPer);
       
       //jTextField9.setText(resultPerS);
       
        
    
    
   
        //calculating for the EG and 10%
        String userQ;
        String wResultEGS;
        String wresultPerS;
        double wValueConn = 100,wAttTotal=50;
        double wresultEG;
        double wresultPer;
        double wUserAttInt;
        
        userQ =jTextField10.getText();
        wUserAttInt = Double.parseDouble(userQ);
        wresultEG = (wUserAttInt/wAttTotal)*wValueConn;
        wResultEGS = Double.toString(wresultEG);
       // jTextField11.setText(wResultEGS);
        
        
        
        
        wresultPer = (wUserAttInt/wAttTotal)*10;
        wresultPerS = Double.toString(wresultPer);
       // jTextField12.setText(wresultPerS);
        
        
        
        
        
    
    
    
        
        //calculating for the EG and 10%
        String userQP;
        String wResultEGSP;
        String wresultPerSP;
        double wValueConnP = 100,wAttTotalP=50;
        double wresultEGP;
        double wresultPerP;
        double wUserAttIntP;
        
        userQP =jTextField10.getText();
        wUserAttIntP = Double.parseDouble(userQP);
        wresultEGP = (wUserAttIntP/wAttTotalP)*wValueConnP;
        wResultEGSP = Double.toString(wresultEGP);
        //jTextField26.setText(wResultEGSP);
        
        
        
        
        wresultPerP = (wUserAttIntP/wAttTotalP)*20;
        wresultPerSP = Double.toString(wresultPerP);
       // jTextField27.setText(wresultPerSP);
    
    
    
   
        //calculating for the EG and 10%
        String userQPP;
        String wResultEGSPP;
        String wresultPerSPP;
        double wValueConnPP = 100,wAttTotalPP=100;
        double wresultEGPP;
        double wresultPerPP;
        double wUserAttIntPP;
        
        userQPP =jTextField16.getText();
        wUserAttIntPP = Double.parseDouble(userQPP);
        wresultEGPP = (wUserAttIntPP/wAttTotalPP)*wValueConnPP;
        wResultEGSPP = Double.toString(wresultEGPP);
        //jTextField17.setText(wResultEGSPP);
        
        
        
        
        wresultPerPP = (wUserAttIntPP/wAttTotalPP)*30;
        wresultPerSPP = Double.toString(wresultPerPP);
       // jTextField18.setText(wresultPerSPP);
    
        
        
  
        //calculating for the EG and 10%
        String userQPPE;
        String wResultEGSPPE;
        String wresultPerSPPE;
        double wValueConnPPE = 100,wAttTotalPPE=100;
        double wresultEGPPE;
        double wresultPerPPE;
        double wUserAttIntPPE;
        
        userQPPE =jTextField4.getText();
        wUserAttIntPPE = Double.parseDouble(userQPPE);
        wresultEGPPE = (wUserAttIntPPE/wAttTotalPPE)*wValueConnPPE;
        wResultEGSPPE = Double.toString(wresultEGPPE);
        //jTextField5.setText(wResultEGSPPE);
        
        
        
        
        wresultPerPPE =(wUserAttIntPPE/wAttTotalPPE)*30;
        wresultPerSPPE = Double.toString(wresultPerPPE);
       // jTextField6.setText(wresultPerSPPE);
        
    total = (int)(resultPer + wresultPer + wresultPerP + wresultPerPP + wresultPerPPE);
    totalS =Double.toString(total);
    jTextField22.setText(totalS);
    
    //calculating for the grade using if else statement
    
    if(total >79 && total<101){
        jTextField23.setText("A");
        jTextField24.setText("EXCELLENT");
    
    }
    else if (total > 69 && total < 80){
    jTextField23.setText("B");
    jTextField24.setText("VERY GOOD");
    
    }
    
    else if (total > 59&& total<70){
        jTextField23.setText("C");
        jTextField24.setText("GOOD");
    
    }
    else if (total >49 && total<60){
        jTextField23.setText("D");
        jTextField24.setText("AVERAGE");
    
    }
    else if (total >0 && total<48){
        jTextField23.setText("F");
        jTextField24.setText("FAILED");
    
    }
    
    
        
        
        
    }
    
    public void clearField(){
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField16.setText(null);
        jTextField17.setText(null);
        jTextField18.setText(null);
        jTextField22.setText(null);
        jTextField23.setText(null);
        jTextField24.setText(null);
        jTextField25.setText(null);
        jTextField26.setText(null);
        jTextField27.setText(null);
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Result");
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("Grading System"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT GRADE RECORDS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(396, 396, 396))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel2.setFont(new java.awt.Font("London Olympics 2012", 1, 14)); // NOI18N
        jLabel2.setText("Sudent ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, 20));

        jTextField1.setToolTipText("");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prelim Exam", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel5.setText("100");

        jLabel6.setText("EG");

        jLabel7.setText("30%");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Score:");

        jTextField4.setToolTipText("");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel9.setText("20");

        jLabel10.setText("EG");

        jLabel11.setText("10%");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Score:");

        jTextField7.setToolTipText("");
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));

        jTextField9.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Written Quiz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel13.setText("50");

        jLabel14.setText("EG");

        jLabel15.setText("10%");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 204));
        jLabel16.setText("Score:");

        jTextField10.setToolTipText("");
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));

        jTextField12.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 80));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel21.setText("100");

        jLabel22.setText("EG");

        jLabel23.setText("30%");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 204));
        jLabel24.setText("Score:");

        jTextField16.setToolTipText("");
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });

        jTextField17.setBackground(new java.awt.Color(204, 204, 204));

        jTextField18.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, 80));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Results");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "First Name", "Last Name", "20", "EG", "1st 10", "2nd 10", "1st 30", "2nd 30", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel25)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 540, 320));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("Compute");
        jButton2.setToolTipText("press here to calculate for the total ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 120, -1));

        insert.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 102, 255));
        insert.setText("Save");
        insert.setToolTipText("press here to save the inputted data");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 102, 255));
        jbtnReset.setText("Reset");
        jbtnReset.setToolTipText("clear all the fields #");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jbtnExit.setBackground(new java.awt.Color(255, 51, 51));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Logout");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 160, 70));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Marks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jTextField22.setBackground(new java.awt.Color(204, 204, 204));
        jTextField22.setToolTipText("");

        jTextField23.setBackground(java.awt.Color.lightGray);

        jTextField24.setBackground(java.awt.Color.lightGray);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(java.awt.Color.blue);
        jLabel26.setText("Total:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.blue);
        jLabel17.setText("Grade:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.blue);
        jLabel18.setText("Remarks:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jTextField24)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 200, 80));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Practical Quiz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel34.setText("50");

        jLabel35.setText("EG");

        jLabel36.setText("20%");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 51, 204));
        jLabel37.setText("Score:");

        jTextField25.setToolTipText("");
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField25KeyTyped(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(204, 204, 204));

        jTextField27.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(34, 34, 34))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 80));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Course:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 20));

        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("View Registered Students");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 280, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 255));
        jButton3.setText("View Students Results");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 240, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        
        clearField();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame,"Confirm If You Want To Logout","This Page",
                JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION ){
           // System.exit(0);
           setVisible(false);
                    new Login().setVisible(true);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
     try{    
        
    //perAttendance code goes here 
     //calculating for the EG value first 
        String userAtt;
        String resultEGS;
        String resultPerS;
        double valueCon = 100;
        double attTotal = 20;
        double resultEG;
        double resultPer;
        double userAttInt;
        
       userAtt = jTextField7.getText();
       userAttInt = Double.parseDouble(userAtt);
       
       //calculating for the EG
       //converting EG back to string 
       
       resultEG = (userAttInt/attTotal)* valueCon;
       resultEGS =Double.toString(resultEG);
       
       //inserting it into the EG textfield
       jTextField8.setText(resultEGS);
       
       
       //calculating for the 10% 
       resultPer = (userAttInt/attTotal)*10;
       resultPerS = Double.toString(resultPer);
       
       jTextField9.setText(resultPerS);
       
       //perAttendance code ends here
       
       
       //...written quiz code start here
       
       //calculating for the EG and 10%
        String userQ;
        String wResultEGS;
        String wresultPerS;
        double wValueConn = 100,wAttTotal=50;
        double wresultEG;
        double wresultPer;
        double wUserAttInt;
        
        userQ =jTextField10.getText();
        wUserAttInt = Double.parseDouble(userQ);
        wresultEG = (wUserAttInt/wAttTotal)*wValueConn;
        wResultEGS = Double.toString(wresultEG);
        jTextField11.setText(wResultEGS);
        
        
        
        
        wresultPer = (wUserAttInt/wAttTotal)*10;
        wresultPerS = Double.toString(wresultPer);
        jTextField12.setText(wresultPerS);
        
        
        
        //....written quiz code ends here
        
        
        //...practical quiz starts here
        //calculating for the EG and 10%
        String userQP;
        String wResultEGSP;
        String wresultPerSP;
        double wValueConnP = 100,wAttTotalP=50;
        double wresultEGP;
        double wresultPerP;
        double wUserAttIntP;
        
        userQP =jTextField10.getText();
        wUserAttIntP = Double.parseDouble(userQP);
        wresultEGP = (wUserAttIntP/wAttTotalP)*wValueConnP;
        wResultEGSP = Double.toString(wresultEGP);
        jTextField26.setText(wResultEGSP);
        
        
        
        
        wresultPerP = (wUserAttIntP/wAttTotalP)*20;
        wresultPerSP = Double.toString(wresultPerP);
        jTextField27.setText(wresultPerSP);
        
        ///........practical quiz code ends here
        
        //......project per code starts here 
        
        //calculating for the EG and 10%
        String userQPP;
        String wResultEGSPP;
        String wresultPerSPP;
        double wValueConnPP = 100,wAttTotalPP=100;
        double wresultEGPP;
        double wresultPerPP;
        double wUserAttIntPP;
        
        userQPP =jTextField16.getText();
        wUserAttIntPP = Double.parseDouble(userQPP);
        wresultEGPP = (wUserAttIntPP/wAttTotalPP)*wValueConnPP;
        wResultEGSPP = Double.toString(wresultEGPP);
        jTextField17.setText(wResultEGSPP);
        
        
        
        
        wresultPerPP = (wUserAttIntPP/wAttTotalPP)*30;
        wresultPerSPP = Double.toString(wresultPerPP);
        jTextField18.setText(wresultPerSPP);
        
        //........project per ends here
        
        //......prelim code starts here 
         //calculating for the EG and 10%
        String userQPPE;
        String wResultEGSPPE;
        String wresultPerSPPE;
        double wValueConnPPE = 100,wAttTotalPPE=100;
        double wresultEGPPE;
        double wresultPerPPE;
        double wUserAttIntPPE;
        
        userQPPE =jTextField4.getText();
        wUserAttIntPPE = Double.parseDouble(userQPPE);
        wresultEGPPE = (wUserAttIntPPE/wAttTotalPPE)*wValueConnPPE;
        wResultEGSPPE = Double.toString(wresultEGPPE);
        jTextField5.setText(wResultEGSPPE);
        
        
        
        
        wresultPerPPE = (wUserAttIntPPE/wAttTotalPPE)*30;
        wresultPerSPPE = Double.toString(wresultPerPPE);
        jTextField6.setText(wresultPerSPPE);
        
        //........prelim code ends here
        
        
        ///total codes goes here
        
         double total = (int)(resultPer + wresultPer + wresultPerP + wresultPerPP + wresultPerPPE);
   String totalS =Double.toString(total);
    jTextField22.setText(totalS);
        
          
        // TODO add your handling code here:
        //validation for not to leave blank data
        if(jTextField1.getText().equals("") ||
                jTextField2.getText().equals("") ||
                jTextField3.getText().equals("") ||
                jTextField4.getText().equals("") ||
                //jTextField5.getText().equals("") ||
                //jTextField6.getText().equals("") ||
                jTextField7.getText().equals("") ||
                //jTextField8.getText().equals("") ||
                //jTextField9.getText().equals("") ||
                jTextField10.getText().equals("") ||
                //jTextField11.getText().equals("") ||
                //jTextField12.getText().equals("") ||
                jTextField16.getText().equals("") ||
                jTextField25.getText().equals("") 
                 ){
            JOptionPane.showMessageDialog(this,"Please Enter All Fields");
            }
        else{
            //if all fields are correctly entered
            //then store entered data into a string array 
            
            String data [] = {jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField27.getText(),jTextField26.getText(),
                              jTextField9.getText(),jTextField12.getText(),jTextField18.getText(),jTextField6.getText(),jTextField22.getText(),
                              jTextField11.getText(),jTextField12.getText(),jTextField17.getText(),jTextField18.getText()
            };
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            
            //calculating the various percentages and inserting them 
            //into the required textFields
            //calculatng the percentage and EG value for Attendance
            
           
 // perAttendace();
  //writtenQuiz();
  //practicalQuiz();
  //prelimExam();
  //projectPer();
  //totalMarks();


//adding string array data 
            
            tblModel.addRow(data); //row added
            
           
//successfully added message
           // JOptionPane.showMessageDialog(this,"Added Data Successfully!");
           
           // clearField();   
            
            
        }
         {
              String Student_ID = jTextField1.getText();
              String Fname = jTextField2.getText();
              String Lname = jTextField3.getText();
              String Attendance = jTextField7.getText();
              String Project = jTextField16.getText();
              String Written_Quiz = jTextField10.getText();
              String Prelim_Exam = jTextField4.getText();
              String Practical_Quiz = jTextField25.getText();
              String course = txtCourse.getSelectedItem().toString();
              String Total_Score = jTextField22.getText();
              String Grade = jTextField23.getText();
              String Remarks = jTextField24.getText();
              
              try{
                  /*if(jTextField1.getText().equals("") ||
                jTextField2.getText().equals("") ||
                jTextField3.getText().equals("") ||
                jTextField4.getText().equals("") ||
                //jTextField5.getText().equals("") ||
                //jTextField6.getText().equals("") ||
                jTextField7.getText().equals("") ||
                //jTextField8.getText().equals("") ||
                //jTextField9.getText().equals("") ||
                jTextField10.getText().equals("") ||
                //jTextField11.getText().equals("") ||
                //jTextField12.getText().equals("") ||
                jTextField16.getText().equals("") ||
                jTextField25.getText().equals("") 
                 ){
            JOptionPane.showMessageDialog(this,"Please Enter All Fields");
            } else{*/
                  int s1 = Integer.parseInt(Attendance);
                  int s2 = Integer.parseInt(Project);
                  int s3 = Integer.parseInt(Written_Quiz);
                  int s4 = Integer.parseInt(Prelim_Exam);
                  int s5 = Integer.parseInt(Practical_Quiz);
                  if(s1 > 20 || s2 > 100 || s3 > 50 || s4 > 100 || s5 > 50){
                     JOptionPane.showMessageDialog(this, "Some field(s) have more than the expected marks! ");
                  }else{
                    Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
            pst = con.prepareStatement("select * from student where student_id = ? and fname = ? and lname = ?");
            pst.setString(1, Student_ID);
            pst.setString(2, Fname);
            pst.setString(3, Lname);
            rs = pst.executeQuery();
            if(rs.next())
            {
                
            pst = con.prepareStatement("insert into lecturer(student_id,fname,lname,attendance,project,written_quiz,prelim_exam,practical_quiz,course,total_score,grade,remarks)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, Student_ID);
            pst.setString(2, Fname);
            pst.setString(3, Lname);
            pst.setString(4, Attendance);
            pst.setString(5, Project);
            pst.setString(6, Written_Quiz);
            pst.setString(7, Prelim_Exam);
            pst.setString(8, Practical_Quiz);
            pst.setString(9, course);
            pst.setString(10,Total_Score);
            pst.setString(11, Grade);
            pst.setString(12, Remarks);
            
            
             pst.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Records Saved to Database!");
                  jTextField1.setText("");
                  jTextField2.setText("");
                  jTextField3.setText("");
                  jTextField4.setText("");
                  jTextField7.setText("");
                  jTextField10.setText("");
                  jTextField16.setText("");
                  jTextField25.setText("");
                  jTextField22.setText("");
                  jTextField23.setText("");
                  jTextField24.setText("");
                  txtCourse.setSelectedIndex(-1);
                  
                  setVisible(true);
               //new LecturerPage().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Student ID or Name does not exist in Database!");
                //setVisible(true);
            }}
                 // }
              } catch (ClassNotFoundException ex) {
            //Logger.getLogger(LecturerPage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (SQLException ex) {
            //Logger.getLogger(LecturerPage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
         clearField();
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(this, "Please Enter All Fields To Save!");
      }     
    }//GEN-LAST:event_insertActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(jTextField1.getText().equals("") ||
                jTextField2.getText().equals("") ||
                jTextField3.getText().equals("") ||
                jTextField4.getText().equals("") ||
                //jTextField5.getText().equals("") ||
                //jTextField6.getText().equals("") ||
                jTextField7.getText().equals("") ||
                //jTextField8.getText().equals("") ||
                //jTextField9.getText().equals("") ||
                jTextField10.getText().equals("") ||
                //jTextField11.getText().equals("") ||
                //jTextField12.getText().equals("") ||
                jTextField16.getText().equals("") ||
                jTextField25.getText().equals("") 
                 ){
            JOptionPane.showMessageDialog(this,"Please Enter All Fields");
            }
         else{
        
        
  perAttendace();
  writtenQuiz();
  practicalQuiz();
  prelimExam();
  projectPer();
  totalMarks();
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
          char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyTyped
        // TODO add your handling code here:
          char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTextField25KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
          char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
          char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisteredStudents Rs = new RegisteredStudents();
     Rs.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     StudentResults Sr = new StudentResults();
     Sr.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
   char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
           ||(iNumber == KeyEvent.VK_BACK_SPACE)
           ||(iNumber == KeyEvent.VK_DELETE)){
        evt.consume();}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new LecturerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> txtCourse;
    // End of variables declaration//GEN-END:variables
}

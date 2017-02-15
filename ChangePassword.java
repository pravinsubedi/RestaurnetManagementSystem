/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.sql.Connection;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class ChangePassword extends javax.swing.JFrame
/*     */ {
/*  19 */   Connection conn = null;
/*  20 */   java.sql.ResultSet rs = null;
/*  21 */   PreparedStatement ps = null;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   
/*     */   public ChangePassword() {
/*  26 */     initComponents();
/*     */   }
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JPanel jPanel1;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   private void initComponents()
/*     */   {
/*  38 */     this.jPanel1 = new JPanel();
/*  39 */     this.jLabel1 = new JLabel();
/*  40 */     this.jLabel2 = new JLabel();
/*  41 */     this.jTextField1 = new JTextField();
/*  42 */     this.jLabel3 = new JLabel();
/*  43 */     this.jLabel4 = new JLabel();
/*  44 */     this.jButton1 = new JButton();
/*  45 */     this.jTextField2 = new JTextField();
/*  46 */     this.jButton2 = new JButton();
/*     */     
/*  48 */     setDefaultCloseOperation(2);
/*     */     
/*  50 */     this.jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
/*     */     
/*  52 */     this.jLabel1.setFont(new Font("Montserrat Hairline", 0, 18));
/*  53 */     this.jLabel1.setText("Password:");
/*  54 */     this.jPanel1.add(this.jLabel1, new AbsoluteConstraints(48, 72, 98, 27));
/*     */     
/*  56 */     this.jLabel2.setFont(new Font("Montserrat Hairline", 0, 18));
/*  57 */     this.jLabel2.setText("For Admin Panel");
/*  58 */     this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(50, 130, 171, 27));
/*     */     
/*  60 */     this.jTextField1.setFont(new Font("Tahoma", 0, 14));
/*  61 */     this.jTextField1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  63 */         ChangePassword.this.jTextField1ActionPerformed(evt);
/*     */       }
/*  65 */     });
/*  66 */     this.jPanel1.add(this.jTextField1, new AbsoluteConstraints(170, 190, 159, 27));
/*     */     
/*  68 */     this.jLabel3.setFont(new Font("Montserrat Hairline", 0, 18));
/*  69 */     this.jLabel3.setText("Password:");
/*  70 */     this.jPanel1.add(this.jLabel3, new AbsoluteConstraints(50, 190, 112, 27));
/*     */     
/*  72 */     this.jLabel4.setFont(new Font("Montserrat Hairline", 0, 18));
/*  73 */     this.jLabel4.setText("For General Login");
/*  74 */     this.jPanel1.add(this.jLabel4, new AbsoluteConstraints(50, 20, 171, 27));
/*     */     
/*  76 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 14));
/*  77 */     this.jButton1.setText("CHANGE");
/*  78 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  80 */         ChangePassword.this.jButton1ActionPerformed(evt);
/*     */       }
/*  82 */     });
/*  83 */     this.jPanel1.add(this.jButton1, new AbsoluteConstraints(370, 80, -1, -1));
/*     */     
/*  85 */     this.jTextField2.setFont(new Font("Tahoma", 0, 14));
/*  86 */     this.jPanel1.add(this.jTextField2, new AbsoluteConstraints(164, 73, 165, 27));
/*     */     
/*  88 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 14));
/*  89 */     this.jButton2.setText("CHANGE");
/*  90 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  92 */         ChangePassword.this.jButton2ActionPerformed(evt);
/*     */       }
/*  94 */     });
/*  95 */     this.jPanel1.add(this.jButton2, new AbsoluteConstraints(370, 190, -1, -1));
/*     */     
/*  97 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  98 */     getContentPane().setLayout(layout);
/*  99 */     layout.setHorizontalGroup(layout
/* 100 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 101 */       .addComponent(this.jPanel1, -1, 475, 32767));
/*     */     
/* 103 */     layout.setVerticalGroup(layout
/* 104 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 105 */       .addComponent(this.jPanel1, -2, 246, -2));
/*     */     
/*     */ 
/* 108 */     pack();
/* 109 */     setLocationRelativeTo(null);
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 114 */       this.conn = JavaConnect.connectDb();
/* 115 */       String e = this.jTextField2.getText();
/* 116 */       String sql = "update password_tbl set general='" + e + "'";
/* 117 */       this.ps = this.conn.prepareStatement(sql);
/* 118 */       this.ps.execute();
/*     */     }
/*     */     catch (Exception e) {
/* 121 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 127 */       this.conn = JavaConnect.connectDb();
/* 128 */       String e = this.jTextField1.getText();
/* 129 */       String sql = "update password_tbl set admin='" + e + "'";
/* 130 */       this.ps = this.conn.prepareStatement(sql);
/* 131 */       this.ps.execute();
/*     */     }
/*     */     catch (Exception e) {
/* 134 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 152 */       for (UIManager.LookAndFeelInfo info : ) {
/* 153 */         if ("Nimbus".equals(info.getName())) {
/* 154 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 155 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 159 */       Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 161 */       Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 163 */       Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 165 */       Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 170 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 172 */         new ChangePassword().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\ChangePassword.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
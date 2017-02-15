/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Expense extends javax.swing.JFrame
/*     */ {
/*  21 */   java.sql.Connection conn = null;
/*  22 */   java.sql.ResultSet rs = null;
/*  23 */   PreparedStatement ps = null;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public Expense() {
/*  28 */     initComponents();
/*     */   }
/*     */   
/*     */ 
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private JTextField jTextField1;
/*     */   
/*     */   private JTextField jTextField2;
/*     */   
/*     */   private void initComponents()
/*     */   {
/*  40 */     this.jLabel1 = new JLabel();
/*  41 */     this.jLabel2 = new JLabel();
/*  42 */     this.jTextField1 = new JTextField();
/*  43 */     this.jTextField2 = new JTextField();
/*  44 */     this.jButton1 = new JButton();
/*     */     
/*  46 */     setDefaultCloseOperation(2);
/*     */     
/*  48 */     this.jLabel1.setFont(new Font("Montserrat Hairline", 0, 24));
/*  49 */     this.jLabel1.setText("Name:");
/*     */     
/*  51 */     this.jLabel2.setFont(new Font("Montserrat Hairline", 0, 24));
/*  52 */     this.jLabel2.setText("Amount:");
/*     */     
/*  54 */     this.jTextField1.setFont(new Font("Poppins", 0, 18));
/*     */     
/*  56 */     this.jTextField2.setFont(new Font("Poppins Light", 0, 18));
/*  57 */     this.jTextField2.setText("Rs.");
/*  58 */     this.jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  60 */         Expense.this.jTextField2MouseClicked(evt);
/*     */       }
/*     */       
/*  63 */       public void mouseEntered(MouseEvent evt) { Expense.this.jTextField2MouseEntered(evt);
/*     */       }
/*     */ 
/*  66 */     });
/*  67 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 18));
/*  68 */     this.jButton1.setText("SAVE");
/*  69 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  71 */         Expense.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  74 */     });
/*  75 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  76 */     getContentPane().setLayout(layout);
/*  77 */     layout.setHorizontalGroup(layout
/*  78 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  79 */       .addGroup(layout.createSequentialGroup()
/*  80 */       .addGap(34, 34, 34)
/*  81 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  82 */       .addComponent(this.jTextField1, -2, 180, -2)
/*  83 */       .addComponent(this.jLabel1))
/*  84 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  85 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  86 */       .addComponent(this.jTextField2, -2, 180, -2)
/*  87 */       .addComponent(this.jLabel2))
/*  88 */       .addGap(34, 34, 34))
/*  89 */       .addGroup(layout.createSequentialGroup()
/*  90 */       .addGap(225, 225, 225)
/*  91 */       .addComponent(this.jButton1, -2, 97, -2)
/*  92 */       .addContainerGap(225, 32767)));
/*     */     
/*  94 */     layout.setVerticalGroup(layout
/*  95 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  96 */       .addGroup(layout.createSequentialGroup()
/*  97 */       .addGap(41, 41, 41)
/*  98 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  99 */       .addComponent(this.jLabel1)
/* 100 */       .addComponent(this.jLabel2))
/* 101 */       .addGap(30, 30, 30)
/* 102 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 103 */       .addComponent(this.jTextField1, -2, 42, -2)
/* 104 */       .addComponent(this.jTextField2, -2, 42, -2))
/* 105 */       .addGap(53, 53, 53)
/* 106 */       .addComponent(this.jButton1, -2, 44, -2)
/* 107 */       .addContainerGap(53, 32767)));
/*     */     
/*     */ 
/* 110 */     pack();
/* 111 */     setLocationRelativeTo(null);
/*     */   }
/*     */   
/*     */   private void jTextField2MouseClicked(MouseEvent evt) {
/* 115 */     this.jTextField2.setText("");
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try {
/* 121 */       this.conn = JavaConnect.connectDb();
/* 122 */       String e = this.jTextField1.getText();
/* 123 */       int a = Integer.parseInt(this.jTextField2.getText());
/* 124 */       String date = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 125 */       String day = new SimpleDateFormat("dd").format(new Date());
/* 126 */       String month = new SimpleDateFormat("MM").format(new Date());
/* 127 */       String year = new SimpleDateFormat("YYYY").format(new Date());
/* 128 */       String t = new SimpleDateFormat("HH:mm:ss").format(new Date());
/* 129 */       String sql = "insert into expense_table(name,amount,day,month,year,date,time)values(?,?,?,?,?,?,?)";
/* 130 */       this.ps = this.conn.prepareStatement(sql);
/* 131 */       this.ps.setString(1, e);
/* 132 */       this.ps.setInt(2, a);
/* 133 */       this.ps.setString(3, day);
/* 134 */       this.ps.setString(4, month);
/* 135 */       this.ps.setString(5, year);
/* 136 */       this.ps.setString(6, date);
/* 137 */       this.ps.setString(7, t);
/* 138 */       this.ps.execute();
/*     */     }
/*     */     catch (Exception e) {
/* 141 */       System.out.println(e);
/*     */     }
/* 143 */     close();
/*     */   }
/*     */   
/*     */   private void jTextField2MouseEntered(MouseEvent evt) {
/* 147 */     this.jTextField2.setText("");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 160 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 161 */         if ("Nimbus".equals(info.getName())) {
/* 162 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 163 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 167 */       Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 169 */       Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 171 */       Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 173 */       Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 178 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 180 */         new Expense().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void close()
/*     */   {
/* 193 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 194 */     java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Expense.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
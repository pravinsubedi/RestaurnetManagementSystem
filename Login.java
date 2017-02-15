/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JToggleButton;
/*     */ 
/*     */ public class Login extends javax.swing.JFrame
/*     */ {
/*  22 */   java.sql.Connection conn = null;
/*  23 */   ResultSet rs = null;
/*  24 */   java.sql.PreparedStatement ps = null;
/*     */   private JToggleButton enter;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JPasswordField passWordField;
/*     */   private JTextField userNameField;
/*     */   
/*  35 */   public Login() { initComponents();
/*  36 */     Toolkit tk = Toolkit.getDefaultToolkit();
/*  37 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  38 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  39 */     setSize(xsize, ysize);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  51 */     this.jPanel1 = new JPanel();
/*  52 */     this.jPanel2 = new JPanel();
/*  53 */     this.userNameField = new JTextField();
/*  54 */     this.jLabel1 = new JLabel();
/*  55 */     this.jLabel2 = new JLabel();
/*  56 */     this.passWordField = new JPasswordField();
/*  57 */     this.enter = new JToggleButton();
/*  58 */     this.jButton1 = new JButton();
/*  59 */     this.jLabel3 = new JLabel();
/*     */     
/*  61 */     setDefaultCloseOperation(2);
/*     */     
/*  63 */     this.jPanel2.setBackground(new Color(255, 255, 255));
/*  64 */     this.jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 5, 3, new Color(235, 235, 235)));
/*     */     
/*  66 */     this.userNameField.setFont(new Font("Arial Unicode MS", 0, 18));
/*  67 */     this.userNameField.setForeground(new Color(51, 51, 51));
/*  68 */     this.userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
/*     */       public void focusGained(java.awt.event.FocusEvent evt) {
/*  70 */         Login.this.userNameFieldFocusGained(evt);
/*     */       }
/*  72 */     });
/*  73 */     this.userNameField.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  75 */         Login.this.userNameFieldMouseClicked(evt);
/*     */       }
/*  77 */     });
/*  78 */     this.userNameField.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  80 */         Login.this.userNameFieldActionPerformed(evt);
/*     */       }
/*     */       
/*  83 */     });
/*  84 */     this.jLabel1.setFont(new Font("Montserrat", 0, 24));
/*  85 */     this.jLabel1.setForeground(new Color(102, 102, 102));
/*  86 */     this.jLabel1.setText("Username:");
/*     */     
/*  88 */     this.jLabel2.setFont(new Font("Montserrat", 0, 24));
/*  89 */     this.jLabel2.setForeground(new Color(102, 102, 102));
/*  90 */     this.jLabel2.setText("Password:");
/*     */     
/*  92 */     this.passWordField.setFont(new Font("Arial Unicode MS", 0, 18));
/*  93 */     this.passWordField.setForeground(new Color(51, 51, 51));
/*     */     
/*  95 */     this.enter.setFont(new Font("Montserrat Hairline", 0, 18));
/*  96 */     this.enter.setText("LOGIN");
/*  97 */     this.enter.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  99 */         Login.this.enterActionPerformed(evt);
/*     */       }
/*     */       
/* 102 */     });
/* 103 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 18));
/* 104 */     this.jButton1.setText("LOGIN AS ADMIN");
/* 105 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 107 */         Login.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/* 110 */     });
/* 111 */     this.jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/logo.png")));
/*     */     
/* 113 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 114 */     this.jPanel2.setLayout(jPanel2Layout);
/* 115 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/* 116 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 117 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 118 */       .addContainerGap()
/* 119 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 120 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 121 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 122 */       .addComponent(this.jLabel1)
/* 123 */       .addComponent(this.jLabel2)
/* 124 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 125 */       .addComponent(this.enter, -2, 200, -2)
/* 126 */       .addGap(18, 18, 18)
/* 127 */       .addComponent(this.jButton1, -2, 201, -2)))
/* 128 */       .addGap(0, 0, 32767))
/* 129 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/* 130 */       .addGap(0, 0, 32767)
/* 131 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 132 */       .addComponent(this.passWordField, GroupLayout.Alignment.TRAILING, -2, 419, -2)
/* 133 */       .addComponent(this.userNameField, GroupLayout.Alignment.TRAILING, -2, 419, -2))))
/* 134 */       .addContainerGap())
/* 135 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 136 */       .addGap(115, 115, 115)
/* 137 */       .addComponent(this.jLabel3)
/* 138 */       .addContainerGap(-1, 32767)));
/*     */     
/* 140 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/* 141 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 142 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 143 */       .addContainerGap(35, 32767)
/* 144 */       .addComponent(this.jLabel3, -2, 174, -2)
/* 145 */       .addGap(18, 18, 18)
/* 146 */       .addComponent(this.jLabel1)
/* 147 */       .addGap(35, 35, 35)
/* 148 */       .addComponent(this.userNameField, -2, 54, -2)
/* 149 */       .addGap(18, 18, 18)
/* 150 */       .addComponent(this.jLabel2)
/* 151 */       .addGap(28, 28, 28)
/* 152 */       .addComponent(this.passWordField, -2, 49, -2)
/* 153 */       .addGap(42, 42, 42)
/* 154 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 155 */       .addComponent(this.enter, -2, 43, -2)
/* 156 */       .addComponent(this.jButton1, -2, 43, -2))
/* 157 */       .addGap(51, 51, 51)));
/*     */     
/*     */ 
/* 160 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 161 */     this.jPanel1.setLayout(jPanel1Layout);
/* 162 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 163 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 164 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 165 */       .addContainerGap(468, 32767)
/* 166 */       .addComponent(this.jPanel2, -2, -1, -2)
/* 167 */       .addGap(274, 274, 274)));
/*     */     
/* 169 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 170 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 171 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 172 */       .addGap(57, 57, 57)
/* 173 */       .addComponent(this.jPanel2, -2, -1, -2)
/* 174 */       .addContainerGap(566, 32767)));
/*     */     
/*     */ 
/* 177 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 178 */     getContentPane().setLayout(layout);
/* 179 */     layout.setHorizontalGroup(layout
/* 180 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 181 */       .addGroup(layout.createSequentialGroup()
/* 182 */       .addContainerGap()
/* 183 */       .addComponent(this.jPanel1, -1, -1, 32767)
/* 184 */       .addGap(178, 178, 178)));
/*     */     
/* 186 */     layout.setVerticalGroup(layout
/* 187 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 188 */       .addGroup(layout.createSequentialGroup()
/* 189 */       .addContainerGap()
/* 190 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 191 */       .addContainerGap(-1, 32767)));
/*     */     
/*     */ 
/* 194 */     pack();
/*     */   }
/*     */   
/*     */ 
/*     */   private void userNameFieldActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void enterActionPerformed(ActionEvent evt)
/*     */   {
/* 202 */     String userName = this.userNameField.getText();
/* 203 */     String passWord = this.passWordField.getText();
/* 204 */     String password = null;
/* 205 */     String d = new java.text.SimpleDateFormat("dd-MM-YYYY").format(new java.util.Date());
/* 206 */     java.sql.Connection conn = null;
/* 207 */     conn = JavaConnect.connectDb();
/*     */     try {
/* 209 */       String sql = "select * from password_tbl";
/* 210 */       this.ps = conn.prepareStatement(sql);
/* 211 */       this.rs = this.ps.executeQuery();
/* 212 */       while (this.rs.next()) {
/* 213 */         password = this.rs.getString("general");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 217 */       System.out.println(e);
/*     */     }
/*     */     
/* 220 */     if ((userName.equalsIgnoreCase("cafe")) && (passWord.equalsIgnoreCase(password))) {
/* 221 */       this.userNameField.setText("");
/* 222 */       this.passWordField.setText("");
/* 223 */       Welcome w = new Welcome();
/* 224 */       w.setVisible(true);
/* 225 */       close();
/*     */     }
/*     */     else {
/* 228 */       javax.swing.JOptionPane.showMessageDialog(null, "this password is wrong \n click ok and try agian", "wrong pass", 0);
/* 229 */       this.passWordField.setText("");
/* 230 */       this.userNameField.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/* 241 */     String userName = this.userNameField.getText();
/* 242 */     String passWord = this.passWordField.getText();
/* 243 */     java.sql.Connection conn = null;
/* 244 */     conn = JavaConnect.connectDb();
/* 245 */     String password = null;
/*     */     try {
/* 247 */       String sql = "select * from password_tbl";
/* 248 */       this.ps = conn.prepareStatement(sql);
/* 249 */       this.rs = this.ps.executeQuery();
/* 250 */       while (this.rs.next()) {
/* 251 */         password = this.rs.getString("admin");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 255 */       System.out.println(e);
/*     */     }
/* 257 */     if ((userName.equalsIgnoreCase("cafe")) && (passWord.equalsIgnoreCase(password))) {
/* 258 */       this.userNameField.setText("");
/* 259 */       this.passWordField.setText("");
/* 260 */       close();
/* 261 */       AdminPanel a = new AdminPanel();
/* 262 */       a.setVisible(true);
/*     */     }
/*     */     else {
/* 265 */       javax.swing.JOptionPane.showMessageDialog(null, "this password is wrong \n click ok and try agian", "wrong pass", 0);
/* 266 */       this.passWordField.setText("");
/* 267 */       this.userNameField.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private void userNameFieldFocusGained(java.awt.event.FocusEvent evt) {}
/*     */   
/*     */   private void userNameFieldMouseClicked(java.awt.event.MouseEvent evt)
/*     */   {
/* 276 */     this.userNameField.setText("");
/*     */   }
/*     */   
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
/* 290 */       for (javax.swing.UIManager.LookAndFeelInfo info : )
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 295 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*     */       }
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 300 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 302 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 304 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 306 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 311 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 313 */         new Login().setVisible(true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void close()
/*     */   {
/* 330 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 331 */     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Login.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
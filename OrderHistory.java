/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.print.PageFormat;
/*     */ import java.awt.print.PrinterJob;
/*     */ import java.sql.Connection;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ import javax.swing.table.TableColumn;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ public class OrderHistory extends javax.swing.JFrame
/*     */ {
/*     */   int orderId;
/*  34 */   int x = 2;
/*  35 */   Connection conn = null;
/*  36 */   ResultSet rs = null;
/*  37 */   PreparedStatement ps = null;
/*  38 */   int total = 0;
/*  39 */   float discount = 0.0F;
/*  40 */   float serviceCharge = 0.0F;
/*  41 */   int pay = 0;
/*     */   int payM;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   
/*     */   public OrderHistory() {
/*  48 */     initComponents();
/*  49 */     Toolkit tk = Toolkit.getDefaultToolkit();
/*  50 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  51 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  52 */     setSize(xsize, ysize);
/*     */   }
/*     */   
/*  55 */   public OrderHistory(int id) { initComponents();
/*  56 */     Toolkit tk = Toolkit.getDefaultToolkit();
/*  57 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  58 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  59 */     setSize(xsize, ysize);
/*  60 */     this.orderId = id;
/*  61 */     this.conn = JavaConnect.connectDb();
/*  62 */     this.jLabel14.setVisible(false);
/*  63 */     updateTable();
/*     */   }
/*     */   
/*     */   private void updateTable() {
/*  67 */     try { int s = 1;
/*  68 */       String sql = "select * from res_table where order_id=" + this.orderId;
/*  69 */       this.ps = this.conn.prepareStatement(sql);
/*  70 */       this.rs = this.ps.executeQuery();
/*  71 */       int i = 0;
/*     */       
/*  73 */       while (this.rs.next()) {
/*  74 */         Object name = this.rs.getString("item");
/*  75 */         Object type = this.rs.getString("type");
/*  76 */         Object number = this.rs.getString("quantity");
/*  77 */         Object subTotal = this.rs.getString("sub_total");
/*  78 */         Object paymen = this.rs.getString("payment");
/*  79 */         int st = Integer.parseInt((String)subTotal);
/*  80 */         this.pay = Integer.parseInt((String)paymen);
/*  81 */         int c = this.rs.getInt("order_id");
/*  82 */         this.total = (st + this.total);
/*  83 */         this.jTable1.getModel().setValueAt(name, i, 0);
/*  84 */         this.jTable3.getModel().setValueAt(name, i, 0);
/*  85 */         this.jTable1.getModel().setValueAt(type, i, 1);
/*  86 */         this.jTable3.getModel().setValueAt(type, i, 1);
/*  87 */         this.jTable1.getModel().setValueAt(number, i, 2);
/*  88 */         this.jTable3.getModel().setValueAt(number, i, 2);
/*  89 */         this.jTable1.getModel().setValueAt(subTotal, i, 3);
/*  90 */         this.jTable3.getModel().setValueAt(subTotal, i, 3);
/*  91 */         i++;
/*     */       }
/*     */       
/*  94 */       int newT = this.total - this.pay;
/*  95 */       this.jTextField1.setText(String.valueOf(this.orderId));
/*  96 */       this.jTextField2.setText(String.valueOf(newT));
/*  97 */       this.jTextField10.setText(String.valueOf(this.pay));
/*  98 */       this.jTextField4.setText(String.valueOf(this.total));
/*  99 */       String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(new Date());
/* 100 */       this.jTextField3.setText(date);
/*     */     }
/*     */     catch (Exception e) {
/* 103 */       JOptionPane.showMessageDialog(null, "oops..  \n click ok and try again", "", 0);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private JButton jButton4;
/*     */   
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   private JLabel jLabel1;
/*     */   private void initComponents()
/*     */   {
/* 116 */     this.jPanel1 = new JPanel();
/* 117 */     this.jScrollPane1 = new JScrollPane();
/* 118 */     this.jTable1 = new JTable();
/* 119 */     this.jButton1 = new JButton();
/* 120 */     this.jButton2 = new JButton();
/* 121 */     this.jTextField2 = new JTextField();
/* 122 */     this.jLabel2 = new JLabel();
/* 123 */     this.jTextField1 = new JTextField();
/* 124 */     this.jLabel1 = new JLabel();
/* 125 */     this.jPanel2 = new JPanel();
/* 126 */     this.jScrollPane3 = new JScrollPane();
/* 127 */     this.jTable3 = new JTable();
/* 128 */     this.jLabel3 = new JLabel();
/* 129 */     this.jTextField3 = new JTextField();
/* 130 */     this.jLabel4 = new JLabel();
/* 131 */     this.jLabel5 = new JLabel();
/* 132 */     this.jTextField4 = new JTextField();
/* 133 */     this.jLabel11 = new JLabel();
/* 134 */     this.jLabel12 = new JLabel();
/* 135 */     this.jTextField7 = new JTextField();
/* 136 */     this.jTextField8 = new JTextField();
/* 137 */     this.jLabel13 = new JLabel();
/* 138 */     this.jTextField9 = new JTextField();
/* 139 */     this.jLabel6 = new JLabel();
/* 140 */     this.jButton3 = new JButton();
/* 141 */     this.jLabel7 = new JLabel();
/* 142 */     this.jLabel8 = new JLabel();
/* 143 */     this.jTextField5 = new JTextField();
/* 144 */     this.jTextField6 = new JTextField();
/* 145 */     this.jButton4 = new JButton();
/* 146 */     this.jButton5 = new JButton();
/* 147 */     this.jLabel9 = new JLabel();
/* 148 */     this.jLabel10 = new JLabel();
/* 149 */     this.jButton6 = new JButton();
/* 150 */     this.jTextField10 = new JTextField();
/* 151 */     this.jButton7 = new JButton();
/* 152 */     this.jLabel14 = new JLabel();
/*     */     
/* 154 */     setDefaultCloseOperation(2);
/*     */     
/* 156 */     this.jTable1.setFont(new Font("Poppins Light", 0, 14));
/* 157 */     this.jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "ITEM", "TYPE", "QUANTITY", "SUB-TOTAL" }));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */     this.jTable1.setRowHeight(30);
/* 185 */     this.jScrollPane1.setViewportView(this.jTable1);
/* 186 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 187 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
/* 188 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
/* 189 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
/* 190 */       this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
/*     */     }
/*     */     
/* 193 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 18));
/* 194 */     this.jButton1.setText("PAY");
/* 195 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 197 */         OrderHistory.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/* 200 */     });
/* 201 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 12));
/* 202 */     this.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/left-arrow.png")));
/* 203 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 205 */         OrderHistory.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/* 208 */     });
/* 209 */     this.jTextField2.setEditable(false);
/* 210 */     this.jTextField2.setFont(new Font("Tahoma", 0, 18));
/*     */     
/* 212 */     this.jLabel2.setFont(new Font("Montserrat Hairline", 0, 18));
/* 213 */     this.jLabel2.setText("Total:");
/*     */     
/* 215 */     this.jTextField1.setEditable(false);
/* 216 */     this.jTextField1.setFont(new Font("Poppins", 0, 18));
/* 217 */     this.jTextField1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 219 */         OrderHistory.this.jTextField1ActionPerformed(evt);
/*     */       }
/*     */       
/* 222 */     });
/* 223 */     this.jLabel1.setFont(new Font("Montserrat Hairline", 0, 18));
/* 224 */     this.jLabel1.setText("Order Id");
/*     */     
/* 226 */     this.jPanel2.setBackground(new java.awt.Color(255, 255, 255));
/* 227 */     this.jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
/*     */     
/* 229 */     this.jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
/* 230 */     this.jTable3.setFont(new Font("Poppins", 0, 12));
/* 231 */     this.jTable3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Item", "Type", "Quantity", "Sub-Total" }));
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
/* 253 */     this.jTable3.setShowHorizontalLines(false);
/* 254 */     this.jScrollPane3.setViewportView(this.jTable3);
/* 255 */     if (this.jTable3.getColumnModel().getColumnCount() > 0) {
/* 256 */       this.jTable3.getColumnModel().getColumn(0).setPreferredWidth(60);
/* 257 */       this.jTable3.getColumnModel().getColumn(1).setPreferredWidth(50);
/* 258 */       this.jTable3.getColumnModel().getColumn(2).setPreferredWidth(30);
/* 259 */       this.jTable3.getColumnModel().getColumn(3).setPreferredWidth(30);
/*     */     }
/*     */     
/* 262 */     this.jLabel3.setFont(new Font("Montserrat Hairline", 0, 11));
/* 263 */     this.jLabel3.setText("Date:");
/*     */     
/* 265 */     this.jTextField3.setEditable(false);
/*     */     
/* 267 */     this.jLabel4.setFont(new Font("Montserrat Hairline", 0, 11));
/* 268 */     this.jLabel4.setText("Thank you for Visiting Us :)");
/*     */     
/* 270 */     this.jLabel5.setFont(new Font("Montserrat Hairline", 0, 11));
/* 271 */     this.jLabel5.setText("Total");
/*     */     
/* 273 */     this.jTextField4.setEditable(false);
/*     */     
/* 275 */     this.jLabel11.setFont(new Font("Montserrat Hairline", 0, 11));
/* 276 */     this.jLabel11.setText("Service Charge");
/*     */     
/* 278 */     this.jLabel12.setFont(new Font("Montserrat Hairline", 0, 11));
/* 279 */     this.jLabel12.setText("Discount");
/*     */     
/* 281 */     this.jTextField7.setEditable(false);
/* 282 */     this.jTextField7.setText("Rs.0");
/*     */     
/* 284 */     this.jTextField8.setEditable(false);
/* 285 */     this.jTextField8.setText("Rs.0");
/* 286 */     this.jTextField8.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 288 */         OrderHistory.this.jTextField8ActionPerformed(evt);
/*     */       }
/*     */       
/* 291 */     });
/* 292 */     this.jLabel13.setFont(new Font("Montserrat Hairline", 0, 11));
/* 293 */     this.jLabel13.setText("Name:");
/*     */     
/* 295 */     this.jTextField9.setFont(new Font("Poppins Light", 0, 11));
/*     */     
/* 297 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 298 */     this.jPanel2.setLayout(jPanel2Layout);
/* 299 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/* 300 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 301 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/* 302 */       .addContainerGap(-1, 32767)
/* 303 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 304 */       .addComponent(this.jLabel12)
/* 305 */       .addComponent(this.jLabel11)
/* 306 */       .addComponent(this.jLabel5))
/* 307 */       .addGap(18, 18, 18)
/* 308 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 309 */       .addComponent(this.jTextField4)
/* 310 */       .addComponent(this.jTextField8, -1, 91, 32767)
/* 311 */       .addComponent(this.jTextField7))
/* 312 */       .addGap(18, 18, 18))
/* 313 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 314 */       .addContainerGap()
/* 315 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 316 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/* 317 */       .addGap(0, 0, 32767)
/* 318 */       .addComponent(this.jLabel4, -2, 147, -2)
/* 319 */       .addContainerGap(-1, 32767))
/* 320 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 321 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 322 */       .addComponent(this.jScrollPane3, -2, 0, 32767)
/* 323 */       .addGroup(jPanel2Layout.createSequentialGroup()
/* 324 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 325 */       .addComponent(this.jLabel13)
/* 326 */       .addComponent(this.jLabel3))
/* 327 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 328 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 329 */       .addComponent(this.jTextField3, -2, 169, -2)
/* 330 */       .addComponent(this.jTextField9, -2, 168, -2))
/* 331 */       .addGap(0, 143, 32767)))
/* 332 */       .addContainerGap()))));
/*     */     
/* 334 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/* 335 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 336 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/* 337 */       .addContainerGap()
/* 338 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 339 */       .addComponent(this.jTextField3, -2, -1, -2)
/* 340 */       .addComponent(this.jLabel3))
/* 341 */       .addGap(16, 16, 16)
/* 342 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 343 */       .addComponent(this.jLabel13)
/* 344 */       .addComponent(this.jTextField9, -2, -1, -2))
/* 345 */       .addGap(18, 18, 18)
/* 346 */       .addComponent(this.jScrollPane3, -2, 285, -2)
/* 347 */       .addGap(18, 18, 18)
/* 348 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 349 */       .addComponent(this.jLabel11)
/* 350 */       .addComponent(this.jTextField7, -2, -1, -2))
/* 351 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 352 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 353 */       .addComponent(this.jLabel12)
/* 354 */       .addComponent(this.jTextField8, -2, -1, -2))
/* 355 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 356 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 357 */       .addComponent(this.jLabel5)
/* 358 */       .addComponent(this.jTextField4, -2, -1, -2))
/* 359 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 360 */       .addComponent(this.jLabel4, -2, 30, -2)
/* 361 */       .addContainerGap()));
/*     */     
/*     */ 
/* 364 */     this.jLabel6.setFont(new Font("Montserrat Hairline", 0, 18));
/* 365 */     this.jLabel6.setText("RECEIPET");
/*     */     
/* 367 */     this.jButton3.setFont(new Font("Montserrat Hairline", 0, 18));
/* 368 */     this.jButton3.setText("PRINT");
/* 369 */     this.jButton3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 371 */         OrderHistory.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 374 */     });
/* 375 */     this.jLabel7.setFont(new Font("Montserrat Hairline", 0, 18));
/* 376 */     this.jLabel7.setText("SERVICE CHARGE:");
/*     */     
/* 378 */     this.jLabel8.setFont(new Font("Montserrat Hairline", 0, 18));
/* 379 */     this.jLabel8.setText("DISCOUNT:");
/*     */     
/* 381 */     this.jTextField5.setFont(new Font("Poppins", 0, 18));
/*     */     
/* 383 */     this.jTextField6.setFont(new Font("Poppins", 0, 18));
/*     */     
/* 385 */     this.jButton4.setFont(new Font("Montserrat Hairline", 0, 18));
/* 386 */     this.jButton4.setText("APPLY");
/* 387 */     this.jButton4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 389 */         OrderHistory.this.jButton4ActionPerformed(evt);
/*     */       }
/*     */       
/* 392 */     });
/* 393 */     this.jButton5.setFont(new Font("Montserrat Hairline", 0, 18));
/* 394 */     this.jButton5.setText("APPLY");
/* 395 */     this.jButton5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 397 */         OrderHistory.this.jButton5ActionPerformed(evt);
/*     */       }
/*     */       
/* 400 */     });
/* 401 */     this.jLabel9.setFont(new Font("Montserrat Hairline", 0, 18));
/* 402 */     this.jLabel9.setText("%");
/*     */     
/* 404 */     this.jLabel10.setFont(new Font("Montserrat Hairline", 0, 18));
/* 405 */     this.jLabel10.setText("%");
/*     */     
/* 407 */     this.jButton6.setFont(new Font("Montserrat Hairline", 0, 18));
/* 408 */     this.jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/signs.png")));
/* 409 */     this.jButton6.setText("ADD MORE ORDERS");
/* 410 */     this.jButton6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 412 */         OrderHistory.this.jButton6ActionPerformed(evt);
/*     */       }
/*     */       
/* 415 */     });
/* 416 */     this.jTextField10.setFont(new Font("Poppins", 0, 14));
/*     */     
/* 418 */     this.jButton7.setFont(new Font("Montserrat Hairline", 0, 18));
/* 419 */     this.jButton7.setText("PARTIAL PAYMENT");
/* 420 */     this.jButton7.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 422 */         OrderHistory.this.jButton7ActionPerformed(evt);
/*     */       }
/*     */       
/* 425 */     });
/* 426 */     this.jLabel14.setText("jLabel14");
/*     */     
/* 428 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 429 */     this.jPanel1.setLayout(jPanel1Layout);
/* 430 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 431 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 432 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 433 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 434 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 435 */       .addGap(29, 29, 29)
/* 436 */       .addComponent(this.jScrollPane1, -2, 469, -2))
/* 437 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 438 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 439 */       .addContainerGap()
/* 440 */       .addComponent(this.jTextField10, -2, 120, -2)
/* 441 */       .addGap(18, 18, 18)
/* 442 */       .addComponent(this.jButton7))
/* 443 */       .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 444 */       .addGap(296, 296, 296)
/* 445 */       .addComponent(this.jLabel2)
/* 446 */       .addGap(38, 38, 38)
/* 447 */       .addComponent(this.jTextField2, -2, 114, -2)))
/* 448 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 449 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 450 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 451 */       .addGap(25, 25, 25)
/* 452 */       .addComponent(this.jLabel1, -2, 92, -2))
/* 453 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 454 */       .addContainerGap()
/* 455 */       .addComponent(this.jButton2)))
/* 456 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 457 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 458 */       .addComponent(this.jLabel14)
/* 459 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 460 */       .addComponent(this.jTextField1, -2, 89, -2)
/* 461 */       .addGap(18, 18, 18)
/* 462 */       .addComponent(this.jButton6)))))
/* 463 */       .addGap(144, 144, 144)
/* 464 */       .addComponent(this.jButton1, -2, 181, -2)
/* 465 */       .addGap(106, 106, 106)
/* 466 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 467 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 468 */       .addComponent(this.jLabel6, -2, 96, -2)
/* 469 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 470 */       .addComponent(this.jButton3, -2, 90, -2))
/* 471 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 472 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 473 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 474 */       .addComponent(this.jLabel8, -2, 167, -2)
/* 475 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 476 */       .addComponent(this.jLabel9))
/* 477 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 478 */       .addComponent(this.jLabel7)
/* 479 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 480 */       .addComponent(this.jLabel10)))
/* 481 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 482 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 483 */       .addComponent(this.jTextField5, -1, 65, 32767)
/* 484 */       .addComponent(this.jTextField6))
/* 485 */       .addGap(18, 18, 18)
/* 486 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 487 */       .addComponent(this.jButton4)
/* 488 */       .addComponent(this.jButton5)))
/* 489 */       .addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -2, -1, -2))
/* 490 */       .addContainerGap(864, 32767)));
/*     */     
/* 492 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 493 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 494 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 495 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 496 */       .addComponent(this.jButton2, -2, 39, -2)
/* 497 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 498 */       .addContainerGap()
/* 499 */       .addComponent(this.jLabel14)))
/* 500 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 501 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 502 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 503 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 504 */       .addComponent(this.jButton3, -1, 43, 32767)
/* 505 */       .addComponent(this.jLabel6, -1, -1, 32767)
/* 506 */       .addComponent(this.jTextField1, GroupLayout.Alignment.TRAILING)
/* 507 */       .addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767))
/* 508 */       .addGap(202, 202, 202)
/* 509 */       .addComponent(this.jButton1, -2, 79, -2)
/* 510 */       .addGap(0, 0, 32767))
/* 511 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 512 */       .addComponent(this.jButton6, -1, 46, 32767)
/* 513 */       .addGap(18, 18, 18)
/* 514 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 515 */       .addComponent(this.jPanel2, -1, -1, 32767)
/* 516 */       .addComponent(this.jScrollPane1))))
/* 517 */       .addGap(18, 18, 18)
/* 518 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 519 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 520 */       .addComponent(this.jTextField2, -2, 28, -2)
/* 521 */       .addComponent(this.jLabel2))
/* 522 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 523 */       .addComponent(this.jLabel7)
/* 524 */       .addComponent(this.jLabel10)
/* 525 */       .addComponent(this.jTextField5, -2, 32, -2)
/* 526 */       .addComponent(this.jButton4, -2, 33, -2)))
/* 527 */       .addGap(18, 18, 18)
/* 528 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 529 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 530 */       .addComponent(this.jTextField10, -2, -1, -2)
/* 531 */       .addComponent(this.jButton7, -2, 33, -2))
/* 532 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 533 */       .addComponent(this.jLabel8)
/* 534 */       .addComponent(this.jLabel9)
/* 535 */       .addComponent(this.jTextField6, -2, 32, -2)
/* 536 */       .addComponent(this.jButton5, -2, 33, -2)))
/* 537 */       .addContainerGap()));
/*     */     
/*     */ 
/* 540 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 541 */     getContentPane().setLayout(layout);
/* 542 */     layout.setHorizontalGroup(layout
/* 543 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 544 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 545 */       .addContainerGap()
/* 546 */       .addComponent(this.jPanel1, -1, -1, 32767)
/* 547 */       .addContainerGap()));
/*     */     
/* 549 */     layout.setVerticalGroup(layout
/* 550 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 551 */       .addGroup(layout.createSequentialGroup()
/* 552 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 553 */       .addGap(0, 236, 32767)));
/*     */     
/*     */ 
/* 556 */     pack();
/*     */   }
/*     */   
/*     */ 
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/* 564 */     Boolean status = Boolean.valueOf(false);
/*     */     
/*     */     try
/*     */     {
/* 568 */       String sql = "delete from res_table where order_id=" + this.orderId;
/* 569 */       this.ps = this.conn.prepareStatement(sql);
/* 570 */       this.ps.execute();
/*     */     }
/*     */     catch (Exception e) {
/* 573 */       JOptionPane.showMessageDialog(null, "oops..something went wrong  \n click ok and try again", "", 0);
/*     */     }
/*     */     try {
/* 576 */       String date = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 577 */       String day = new SimpleDateFormat("dd").format(new Date());
/* 578 */       String month = new SimpleDateFormat("MM").format(new Date());
/* 579 */       String year = new SimpleDateFormat("YYYY").format(new Date());
/* 580 */       String totalString = this.jTextField4.getText();
/* 581 */       int totalInt = Integer.parseInt(totalString);
/* 582 */       String sql = "insert into income_table(date,total,day,month,year)values(?,?,?,?,?)";
/* 583 */       this.ps = this.conn.prepareStatement(sql);
/* 584 */       this.ps.setString(1, date);
/* 585 */       this.ps.setInt(2, totalInt);
/* 586 */       this.ps.setString(3, day);
/* 587 */       this.ps.setString(4, month);
/* 588 */       this.ps.setString(5, year);
/* 589 */       this.ps.execute();
/* 590 */       JOptionPane.showMessageDialog(null, "sucess");
/*     */     }
/*     */     catch (Exception e) {
/* 593 */       JOptionPane.showMessageDialog(null, "oops..something went wrong  \n click ok and try again", "", 0);
/*     */     }
/* 595 */     close();
/* 596 */     this.jLabel14.setText("test");
/* 597 */     Welcome w = new Welcome();
/* 598 */     w.setVisible(true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void jButton2ActionPerformed(ActionEvent evt)
/*     */   {
/* 605 */     Welcome w = new Welcome();
/* 606 */     w.setVisible(true);
/* 607 */     close();
/*     */   }
/*     */   
/*     */ 
/*     */   private JLabel jLabel10;
/*     */   
/*     */   private JLabel jLabel11;
/*     */   
/*     */   private JLabel jLabel12;
/*     */   
/*     */   private JLabel jLabel13;
/*     */   
/*     */   private JLabel jLabel14;
/*     */   
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private JLabel jLabel3;
/*     */   
/*     */   private JLabel jLabel4;
/*     */   
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private void jButton3ActionPerformed(ActionEvent evt)
/*     */   {
/* 631 */     PrinterJob pj = PrinterJob.getPrinterJob();
/* 632 */     pj.setJobName(" Print Component ");
/* 633 */     pj.setCopies(1);
/* 634 */     PageFormat format = pj.defaultPage();
/* 635 */     java.awt.print.Paper paper = format.getPaper();
/* 636 */     format.setOrientation(0);
/*     */     
/* 638 */     double width = 576.0D;
/* 639 */     double height = 288.0D;
/* 640 */     double margin = 72.0D;
/* 641 */     paper.setSize(width, height);
/* 642 */     paper.setImageableArea(margin, margin, width - margin * 2.0D, height - margin * 2.0D);
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
/* 654 */     pj.setPrintable(new java.awt.print.Printable() {
/*     */       public int print(java.awt.Graphics pg, PageFormat pf, int pageNum) {
/* 656 */         if (pageNum > 0) {
/* 657 */           return 1;
/*     */         }
/*     */         
/* 660 */         java.awt.Graphics2D g2 = (java.awt.Graphics2D)pg;
/* 661 */         g2.translate(pf.getImageableX(), pf.getImageableY());
/* 662 */         OrderHistory.this.jPanel2.paint(g2);
/* 663 */         return 0;
/*     */       }
/*     */     });
/* 666 */     if (!pj.printDialog()) {
/* 667 */       return;
/*     */     }
/*     */     try {
/* 670 */       pj.print();
/*     */     }
/*     */     catch (java.awt.print.PrinterException ex) {}
/*     */   }
/*     */   
/*     */ 
/*     */   private void jTextField8ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try
/*     */     {
/* 682 */       float serviceChargeP = Float.parseFloat(this.jTextField5.getText());
/* 683 */       float percent = 100.0F;
/* 684 */       this.serviceCharge = (serviceChargeP / percent * this.total);
/* 685 */       this.jTextField7.setText("Rs." + String.valueOf(this.serviceCharge));
/* 686 */       float newTotal = this.total + this.serviceCharge - this.discount;
/* 687 */       this.jTextField4.setText("Rs." + String.valueOf(newTotal));
/*     */     }
/*     */     catch (Exception e) {
/* 690 */       JOptionPane.showMessageDialog(null, "please insert service charge  \n click ok and try again", "", 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 696 */       float discountP = Float.parseFloat(this.jTextField6.getText());
/* 697 */       float percent = 100.0F;
/* 698 */       this.discount = (discountP / percent * this.total);
/* 699 */       this.jTextField8.setText("Rs." + String.valueOf(this.discount));
/* 700 */       float newTotal = this.total - this.discount + this.serviceCharge;
/* 701 */       this.jTextField4.setText("Rs." + String.valueOf(newTotal));
/*     */     }
/*     */     catch (Exception e) {
/* 704 */       JOptionPane.showMessageDialog(null, "please insert discount  \n click ok and try again", "", 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 709 */     MakeOrders m = new MakeOrders(this.orderId);
/* 710 */     this.jLabel14.setText("test");
/* 711 */     m.setVisible(true);
/* 712 */     close();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jButton7ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try
/*     */     {
/* 724 */       String payment = this.jTextField10.getText();
/* 725 */       int p = Integer.parseInt(payment);
/* 726 */       this.conn = JavaConnect.connectDb();
/* 727 */       String sql = "update res_table set payment=payment+" + p + " where order_id=" + this.orderId;
/* 728 */       this.ps = this.conn.prepareStatement(sql);
/* 729 */       this.ps.execute();
/*     */       
/*     */ 
/* 732 */       close();
/* 733 */       this.jLabel14.setText("test");
/* 734 */       new OrderHistory(this.orderId).setVisible(true);
/*     */     }
/*     */     catch (Exception e) {
/* 737 */       JOptionPane.showMessageDialog(null, "please enter the payment   \n click ok and try again", "", 0);
/*     */     }
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
/* 751 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 752 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*     */       }
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 757 */       Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 759 */       Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 761 */       Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 763 */       Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 768 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 770 */         new OrderHistory().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */ 
/*     */   private JLabel jLabel7;
/*     */   
/*     */   private JLabel jLabel8;
/*     */   
/*     */   private JLabel jLabel9;
/*     */   
/*     */   private JPanel jPanel1;
/*     */   
/*     */   private JPanel jPanel2;
/*     */   
/*     */   private JScrollPane jScrollPane1;
/*     */   
/*     */   private JScrollPane jScrollPane3;
/*     */   
/*     */   private JTable jTable1;
/*     */   
/*     */   private JTable jTable3;
/*     */   
/*     */   private JTextField jTextField1;
/*     */   
/*     */   private JTextField jTextField10;
/*     */   
/*     */   private JTextField jTextField2;
/*     */   
/*     */   private JTextField jTextField3;
/*     */   
/*     */   private JTextField jTextField4;
/*     */   
/*     */   private JTextField jTextField5;
/*     */   
/*     */   private JTextField jTextField6;
/*     */   
/*     */   private JTextField jTextField7;
/*     */   
/*     */   private JTextField jTextField8;
/*     */   
/*     */   private JTextField jTextField9;
/*     */   private void close()
/*     */   {
/* 815 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 816 */     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\OrderHistory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.Connection;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Welcome extends javax.swing.JFrame
/*     */ {
/*     */   int id;
/*  29 */   Connection conn = null;
/*  30 */   ResultSet rs = null;
/*  31 */   PreparedStatement ps = null;
/*  32 */   Boolean status = Boolean.valueOf(true);
/*  33 */   Boolean status1 = Boolean.valueOf(true);
/*  34 */   Boolean status2 = Boolean.valueOf(true);
/*  35 */   Boolean status3 = Boolean.valueOf(true);
/*     */   int s1;
/*     */   int s2;
/*     */   int s3;
/*     */   int s4;
/*     */   int s5;
/*     */   int s6;
/*     */   int s7;
/*     */   int s8;
/*     */   int s9;
/*     */   int s10;
/*     */   String jpt;
/*     */   private JButton jButton1;
/*     */   private JButton jButton10;
/*     */   private JButton jButton11;
/*     */   private JButton jButton12;
/*     */   private JButton jButton13;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   private JButton jButton8;
/*     */   private JButton jButton9;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel4;
/*     */   private JPanel jPanel1;
/*     */   
/*     */   public Welcome()
/*     */   {
/*  66 */     initComponents();
/*  67 */     Toolkit tk = Toolkit.getDefaultToolkit();
/*  68 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  69 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  70 */     setSize(xsize, ysize);
/*  71 */     this.conn = JavaConnect.connectDb();
/*  72 */     this.jLabel2.setVisible(false);
/*     */     try {
/*  74 */       String sql = "select * from res_table where order_id=1";
/*  75 */       this.ps = this.conn.prepareStatement(sql);
/*  76 */       this.rs = this.ps.executeQuery();
/*  77 */       while (this.rs.next()) {
/*  78 */         this.s1 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  83 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/*  86 */       String sql = "select * from res_table where order_id=2";
/*  87 */       this.ps = this.conn.prepareStatement(sql);
/*  88 */       this.rs = this.ps.executeQuery();
/*  89 */       while (this.rs.next()) {
/*  90 */         this.s2 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/*  94 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/*  97 */       String sql = "select * from res_table where order_id=3";
/*  98 */       this.ps = this.conn.prepareStatement(sql);
/*  99 */       this.rs = this.ps.executeQuery();
/* 100 */       while (this.rs.next()) {
/* 101 */         this.s3 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 105 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 108 */       String sql = "select * from res_table where order_id=4";
/* 109 */       this.ps = this.conn.prepareStatement(sql);
/* 110 */       this.rs = this.ps.executeQuery();
/* 111 */       while (this.rs.next()) {
/* 112 */         this.s4 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 116 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 119 */       String sql = "select * from res_table where order_id=5";
/* 120 */       this.ps = this.conn.prepareStatement(sql);
/* 121 */       this.rs = this.ps.executeQuery();
/* 122 */       while (this.rs.next()) {
/* 123 */         this.s5 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 127 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 130 */       String sql = "select * from res_table where order_id=6";
/* 131 */       this.ps = this.conn.prepareStatement(sql);
/* 132 */       this.rs = this.ps.executeQuery();
/* 133 */       while (this.rs.next()) {
/* 134 */         this.s6 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 138 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 141 */       String sql = "select * from res_table where order_id=7";
/* 142 */       this.ps = this.conn.prepareStatement(sql);
/* 143 */       this.rs = this.ps.executeQuery();
/* 144 */       while (this.rs.next()) {
/* 145 */         this.s7 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 150 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 153 */       String sql = "select * from res_table where order_id=8";
/* 154 */       this.ps = this.conn.prepareStatement(sql);
/* 155 */       this.rs = this.ps.executeQuery();
/* 156 */       while (this.rs.next()) {
/* 157 */         this.s8 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 162 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 165 */       String sql = "select * from res_table where order_id=9";
/* 166 */       this.ps = this.conn.prepareStatement(sql);
/* 167 */       this.rs = this.ps.executeQuery();
/* 168 */       while (this.rs.next()) {
/* 169 */         this.s9 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 174 */       System.err.println("Got an exception! ");
/*     */     }
/*     */     try {
/* 177 */       String sql = "select * from res_table where order_id=10";
/* 178 */       this.ps = this.conn.prepareStatement(sql);
/* 179 */       this.rs = this.ps.executeQuery();
/* 180 */       while (this.rs.next()) {
/* 181 */         this.s10 = this.rs.getInt("status");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 186 */       System.err.println("Got an exception! ");
/*     */     }
/* 188 */     if (this.s1 == 1)
/*     */     {
/* 190 */       this.jButton2.setBorderPainted(false);
/* 191 */       this.jButton2.setFocusPainted(false);
/* 192 */       this.jButton2.setContentAreaFilled(false);
/* 193 */       this.jButton2.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 194 */       this.status1 = Boolean.valueOf(false);
/*     */     }
/* 196 */     if (this.s1 == 0)
/*     */     {
/* 198 */       this.jButton2.setBorderPainted(false);
/* 199 */       this.jButton2.setFocusPainted(false);
/* 200 */       this.jButton2.setContentAreaFilled(false);
/* 201 */       this.jButton2.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 203 */     if (this.s2 == 1)
/*     */     {
/* 205 */       this.jButton3.setBorderPainted(false);
/* 206 */       this.jButton3.setFocusPainted(false);
/* 207 */       this.jButton3.setContentAreaFilled(false);
/* 208 */       this.jButton3.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 209 */       this.status2 = Boolean.valueOf(false);
/*     */     }
/* 211 */     if (this.s2 == 0)
/*     */     {
/* 213 */       this.jButton3.setBorderPainted(false);
/* 214 */       this.jButton3.setFocusPainted(false);
/* 215 */       this.jButton3.setContentAreaFilled(false);
/* 216 */       this.jButton3.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 218 */     if (this.s3 == 1)
/*     */     {
/* 220 */       this.jButton4.setBorderPainted(false);
/* 221 */       this.jButton4.setFocusPainted(false);
/* 222 */       this.jButton4.setContentAreaFilled(false);
/* 223 */       this.jButton4.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 224 */       this.status3 = Boolean.valueOf(false);
/*     */     }
/* 226 */     if (this.s3 == 0)
/*     */     {
/* 228 */       this.jButton4.setBorderPainted(false);
/* 229 */       this.jButton4.setFocusPainted(false);
/* 230 */       this.jButton4.setContentAreaFilled(false);
/* 231 */       this.jButton4.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 233 */     if (this.s4 == 1)
/*     */     {
/* 235 */       this.jButton8.setBorderPainted(false);
/* 236 */       this.jButton8.setFocusPainted(false);
/* 237 */       this.jButton8.setContentAreaFilled(false);
/* 238 */       this.jButton8.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 239 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 241 */     if (this.s4 == 0)
/*     */     {
/* 243 */       this.jButton8.setBorderPainted(false);
/* 244 */       this.jButton8.setFocusPainted(false);
/* 245 */       this.jButton8.setContentAreaFilled(false);
/* 246 */       this.jButton8.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 248 */     if (this.s5 == 1)
/*     */     {
/* 250 */       this.jButton5.setBorderPainted(false);
/* 251 */       this.jButton5.setFocusPainted(false);
/* 252 */       this.jButton5.setContentAreaFilled(false);
/* 253 */       this.jButton5.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 254 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 256 */     if (this.s5 == 0)
/*     */     {
/* 258 */       this.jButton5.setBorderPainted(false);
/* 259 */       this.jButton5.setFocusPainted(false);
/* 260 */       this.jButton5.setContentAreaFilled(false);
/* 261 */       this.jButton5.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 263 */     if (this.s6 == 1)
/*     */     {
/* 265 */       this.jButton6.setBorderPainted(false);
/* 266 */       this.jButton6.setFocusPainted(false);
/* 267 */       this.jButton6.setContentAreaFilled(false);
/* 268 */       this.jButton6.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 269 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 271 */     if (this.s6 == 0)
/*     */     {
/* 273 */       this.jButton6.setBorderPainted(false);
/* 274 */       this.jButton6.setFocusPainted(false);
/* 275 */       this.jButton6.setContentAreaFilled(false);
/* 276 */       this.jButton6.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 278 */     if (this.s7 == 1)
/*     */     {
/* 280 */       this.jButton9.setBorderPainted(false);
/* 281 */       this.jButton9.setFocusPainted(false);
/* 282 */       this.jButton9.setContentAreaFilled(false);
/* 283 */       this.jButton9.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 284 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 286 */     if (this.s7 == 0)
/*     */     {
/* 288 */       this.jButton9.setBorderPainted(false);
/* 289 */       this.jButton9.setFocusPainted(false);
/* 290 */       this.jButton9.setContentAreaFilled(false);
/* 291 */       this.jButton9.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 293 */     if (this.s8 == 1)
/*     */     {
/* 295 */       this.jButton10.setBorderPainted(false);
/* 296 */       this.jButton10.setFocusPainted(false);
/* 297 */       this.jButton10.setContentAreaFilled(false);
/* 298 */       this.jButton10.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 299 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 301 */     if (this.s8 == 0)
/*     */     {
/* 303 */       this.jButton10.setBorderPainted(false);
/* 304 */       this.jButton10.setFocusPainted(false);
/* 305 */       this.jButton10.setContentAreaFilled(false);
/* 306 */       this.jButton10.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 308 */     if (this.s9 == 1)
/*     */     {
/* 310 */       this.jButton11.setBorderPainted(false);
/* 311 */       this.jButton11.setFocusPainted(false);
/* 312 */       this.jButton11.setContentAreaFilled(false);
/* 313 */       this.jButton11.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 314 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 316 */     if (this.s9 == 0)
/*     */     {
/* 318 */       this.jButton11.setBorderPainted(false);
/* 319 */       this.jButton11.setFocusPainted(false);
/* 320 */       this.jButton11.setContentAreaFilled(false);
/* 321 */       this.jButton11.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
/* 323 */     if (this.s10 == 1)
/*     */     {
/* 325 */       this.jButton12.setBorderPainted(false);
/* 326 */       this.jButton12.setFocusPainted(false);
/* 327 */       this.jButton12.setContentAreaFilled(false);
/* 328 */       this.jButton12.setIcon(new ImageIcon(getClass().getResource("full.png")));
/* 329 */       this.status = Boolean.valueOf(false);
/*     */     }
/* 331 */     if (this.s10 == 0)
/*     */     {
/* 333 */       this.jButton12.setBorderPainted(false);
/* 334 */       this.jButton12.setFocusPainted(false);
/* 335 */       this.jButton12.setContentAreaFilled(false);
/* 336 */       this.jButton12.setIcon(new ImageIcon(getClass().getResource("empty.png")));
/*     */     }
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
/*     */   private void initComponents()
/*     */   {
/* 350 */     this.jPanel1 = new JPanel();
/* 351 */     this.jButton1 = new JButton();
/* 352 */     this.jButton2 = new JButton();
/* 353 */     this.jButton3 = new JButton();
/* 354 */     this.jButton9 = new JButton();
/* 355 */     this.jButton10 = new JButton();
/* 356 */     this.jButton11 = new JButton();
/* 357 */     this.jButton12 = new JButton();
/* 358 */     this.jButton5 = new JButton();
/* 359 */     this.jButton6 = new JButton();
/* 360 */     this.jButton4 = new JButton();
/* 361 */     this.jButton8 = new JButton();
/* 362 */     this.jButton7 = new JButton();
/* 363 */     this.jLabel4 = new JLabel();
/* 364 */     this.jLabel2 = new JLabel();
/* 365 */     this.jButton13 = new JButton();
/*     */     
/* 367 */     setDefaultCloseOperation(2);
/* 368 */     getContentPane().setLayout(null);
/*     */     
/* 370 */     this.jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
/* 371 */     getContentPane().add(this.jPanel1);
/* 372 */     this.jPanel1.setBounds(0, 0, 0, 0);
/*     */     
/* 374 */     this.jButton1.setFont(new Font("Arial Rounded MT Bold", 0, 11));
/* 375 */     this.jButton1.setText("Log Out");
/* 376 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 378 */         Welcome.this.jButton1ActionPerformed(evt);
/*     */       }
/* 380 */     });
/* 381 */     getContentPane().add(this.jButton1);
/* 382 */     this.jButton1.setBounds(1270, 10, 86, 23);
/*     */     
/* 384 */     this.jButton2.setBackground(new Color(0, 255, 0));
/* 385 */     this.jButton2.setFont(new Font("Montserrat", 0, 24));
/* 386 */     this.jButton2.setText("1");
/* 387 */     this.jButton2.setBorderPainted(false);
/* 388 */     this.jButton2.setCursor(new Cursor(12));
/* 389 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 391 */         Welcome.this.jButton2ActionPerformed(evt);
/*     */       }
/* 393 */     });
/* 394 */     getContentPane().add(this.jButton2);
/* 395 */     this.jButton2.setBounds(1030, 40, 230, 110);
/*     */     
/* 397 */     this.jButton3.setBackground(new Color(0, 255, 0));
/* 398 */     this.jButton3.setFont(new Font("Montserrat", 0, 24));
/* 399 */     this.jButton3.setText("2");
/* 400 */     this.jButton3.setCursor(new Cursor(12));
/* 401 */     this.jButton3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 403 */         Welcome.this.jButton3ActionPerformed(evt);
/*     */       }
/* 405 */     });
/* 406 */     getContentPane().add(this.jButton3);
/* 407 */     this.jButton3.setBounds(1030, 156, 230, 104);
/*     */     
/* 409 */     this.jButton9.setBackground(new Color(0, 255, 0));
/* 410 */     this.jButton9.setFont(new Font("Montserrat", 0, 24));
/* 411 */     this.jButton9.setText("7");
/* 412 */     this.jButton9.setCursor(new Cursor(12));
/* 413 */     this.jButton9.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 415 */         Welcome.this.jButton9ActionPerformed(evt);
/*     */       }
/* 417 */     });
/* 418 */     getContentPane().add(this.jButton9);
/* 419 */     this.jButton9.setBounds(1030, 270, 230, 110);
/*     */     
/* 421 */     this.jButton10.setBackground(new Color(0, 255, 0));
/* 422 */     this.jButton10.setFont(new Font("Montserrat", 0, 24));
/* 423 */     this.jButton10.setText("8");
/* 424 */     this.jButton10.setCursor(new Cursor(12));
/* 425 */     this.jButton10.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 427 */         Welcome.this.jButton10ActionPerformed(evt);
/*     */       }
/* 429 */     });
/* 430 */     getContentPane().add(this.jButton10);
/* 431 */     this.jButton10.setBounds(1030, 390, 230, 110);
/*     */     
/* 433 */     this.jButton11.setBackground(new Color(0, 255, 0));
/* 434 */     this.jButton11.setFont(new Font("Montserrat", 0, 24));
/* 435 */     this.jButton11.setText("9");
/* 436 */     this.jButton11.setCursor(new Cursor(12));
/* 437 */     this.jButton11.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 439 */         Welcome.this.jButton11ActionPerformed(evt);
/*     */       }
/* 441 */     });
/* 442 */     getContentPane().add(this.jButton11);
/* 443 */     this.jButton11.setBounds(1030, 510, 230, 110);
/*     */     
/* 445 */     this.jButton12.setBackground(new Color(0, 255, 0));
/* 446 */     this.jButton12.setFont(new Font("Tahoma", 0, 24));
/* 447 */     this.jButton12.setText("10");
/* 448 */     this.jButton12.setCursor(new Cursor(12));
/* 449 */     this.jButton12.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 451 */         Welcome.this.jButton12ActionPerformed(evt);
/*     */       }
/* 453 */     });
/* 454 */     getContentPane().add(this.jButton12);
/* 455 */     this.jButton12.setBounds(1030, 630, 230, 110);
/*     */     
/* 457 */     this.jButton5.setBackground(new Color(0, 255, 0));
/* 458 */     this.jButton5.setFont(new Font("Montserrat", 0, 24));
/* 459 */     this.jButton5.setText("5");
/* 460 */     this.jButton5.setCursor(new Cursor(12));
/* 461 */     this.jButton5.setIconTextGap(0);
/* 462 */     this.jButton5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 464 */         Welcome.this.jButton5ActionPerformed(evt);
/*     */       }
/* 466 */     });
/* 467 */     getContentPane().add(this.jButton5);
/* 468 */     this.jButton5.setBounds(310, 250, 230, 110);
/*     */     
/* 470 */     this.jButton6.setBackground(new Color(0, 255, 0));
/* 471 */     this.jButton6.setFont(new Font("Montserrat", 0, 24));
/* 472 */     this.jButton6.setText("6");
/* 473 */     this.jButton6.setCursor(new Cursor(12));
/* 474 */     this.jButton6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 476 */         Welcome.this.jButton6ActionPerformed(evt);
/*     */       }
/* 478 */     });
/* 479 */     getContentPane().add(this.jButton6);
/* 480 */     this.jButton6.setBounds(310, 380, 230, 110);
/*     */     
/* 482 */     this.jButton4.setBackground(new Color(0, 255, 0));
/* 483 */     this.jButton4.setFont(new Font("Montserrat", 0, 24));
/* 484 */     this.jButton4.setText("3");
/* 485 */     this.jButton4.setCursor(new Cursor(12));
/* 486 */     this.jButton4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 488 */         Welcome.this.jButton4ActionPerformed(evt);
/*     */       }
/* 490 */     });
/* 491 */     getContentPane().add(this.jButton4);
/* 492 */     this.jButton4.setBounds(50, 250, 230, 110);
/*     */     
/* 494 */     this.jButton8.setBackground(new Color(0, 255, 0));
/* 495 */     this.jButton8.setFont(new Font("Montserrat", 0, 24));
/* 496 */     this.jButton8.setText("4");
/* 497 */     this.jButton8.setCursor(new Cursor(12));
/* 498 */     this.jButton8.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 500 */         Welcome.this.jButton8ActionPerformed(evt);
/*     */       }
/* 502 */     });
/* 503 */     getContentPane().add(this.jButton8);
/* 504 */     this.jButton8.setBounds(50, 380, 230, 110);
/*     */     
/* 506 */     this.jButton7.setIcon(new ImageIcon(getClass().getResource("/resturentapp/Users-icon.png")));
/* 507 */     this.jButton7.setText("0");
/* 508 */     this.jButton7.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 510 */         Welcome.this.jButton7ActionPerformed(evt);
/*     */       }
/* 512 */     });
/* 513 */     getContentPane().add(this.jButton7);
/* 514 */     this.jButton7.setBounds(32, 22, 135, 105);
/*     */     
/* 516 */     this.jLabel4.setIcon(new ImageIcon(getClass().getResource("/resturentapp/background1_1.png")));
/* 517 */     getContentPane().add(this.jLabel4);
/* 518 */     this.jLabel4.setBounds(30, 70, 1130, 580);
/*     */     
/* 520 */     this.jLabel2.setText("jLabel2");
/* 521 */     getContentPane().add(this.jLabel2);
/* 522 */     this.jLabel2.setBounds(0, 0, 34, 14);
/*     */     
/* 524 */     this.jButton13.setFont(new Font("Montserrat", 0, 18));
/* 525 */     this.jButton13.setText("ADD EXPENSE");
/* 526 */     this.jButton13.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 528 */         Welcome.this.jButton13ActionPerformed(evt);
/*     */       }
/* 530 */     });
/* 531 */     getContentPane().add(this.jButton13);
/* 532 */     this.jButton13.setBounds(640, 10, 170, 50);
/*     */     
/* 534 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 538 */     close();
/* 539 */     Login l = new Login();
/* 540 */     l.setVisible(true);
/*     */   }
/*     */   
/*     */ 
/*     */   private void jButton2ActionPerformed(ActionEvent evt)
/*     */   {
/* 546 */     this.jButton2.setOpaque(false);
/* 547 */     this.jButton2.setContentAreaFilled(false);
/* 548 */     this.jButton1.setBorderPainted(false);
/* 549 */     int id = Integer.parseInt(this.jButton2.getText());
/* 550 */     if (this.s1 == 0) {
/* 551 */       close();
/* 552 */       MakeOrders m = new MakeOrders(id);
/* 553 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 556 */       OrderHistory o = new OrderHistory(id);
/* 557 */       o.setVisible(true);
/* 558 */       close();
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 563 */     int id = Integer.parseInt(this.jButton3.getText());
/* 564 */     if (this.s2 == 0) {
/* 565 */       this.jLabel2.setText("try");
/* 566 */       close();
/* 567 */       MakeOrders m = new MakeOrders(id);
/* 568 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 571 */       this.jLabel2.setText("try");
/* 572 */       close();
/* 573 */       OrderHistory o = new OrderHistory(id);
/* 574 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 579 */     int id = Integer.parseInt(this.jButton4.getText());
/* 580 */     if (this.s3 == 0) {
/* 581 */       this.jLabel2.setText("try");
/* 582 */       close();
/* 583 */       MakeOrders m = new MakeOrders(id);
/* 584 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 587 */       this.jLabel2.setText("try");
/* 588 */       close();
/* 589 */       OrderHistory o = new OrderHistory(id);
/* 590 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton8ActionPerformed(ActionEvent evt) {
/* 595 */     int id = Integer.parseInt(this.jButton8.getText());
/* 596 */     if (this.s4 == 0) {
/* 597 */       this.jLabel2.setText("try");
/* 598 */       close();
/* 599 */       MakeOrders m = new MakeOrders(id);
/* 600 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 603 */       this.jLabel2.setText("try");
/* 604 */       close();
/* 605 */       OrderHistory o = new OrderHistory(id);
/* 606 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 611 */     int id = Integer.parseInt(this.jButton6.getText());
/* 612 */     if (this.s6 == 0) {
/* 613 */       this.jLabel2.setText("try");
/* 614 */       close();
/* 615 */       MakeOrders m = new MakeOrders(id);
/* 616 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 619 */       this.jLabel2.setText("try");
/* 620 */       close();
/* 621 */       OrderHistory o = new OrderHistory(id);
/* 622 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton7ActionPerformed(ActionEvent evt)
/*     */   {
/* 628 */     int id = Integer.parseInt(this.jButton7.getText());
/* 629 */     this.jLabel2.setText("try");
/* 630 */     close();
/* 631 */     MakeOrders m = new MakeOrders(id);
/* 632 */     m.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt)
/*     */   {
/* 637 */     int id = Integer.parseInt(this.jButton5.getText());
/* 638 */     if (this.s5 == 0) {
/* 639 */       this.jLabel2.setText("try");
/* 640 */       close();
/* 641 */       MakeOrders m = new MakeOrders(id);
/* 642 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 645 */       this.jLabel2.setText("try");
/* 646 */       close();
/* 647 */       OrderHistory o = new OrderHistory(id);
/* 648 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton9ActionPerformed(ActionEvent evt)
/*     */   {
/* 654 */     int id = Integer.parseInt(this.jButton9.getText());
/* 655 */     if (this.s7 == 0) {
/* 656 */       this.jLabel2.setText("try");
/* 657 */       close();
/* 658 */       MakeOrders m = new MakeOrders(id);
/* 659 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 662 */       this.jLabel2.setText("try");
/* 663 */       close();
/* 664 */       OrderHistory o = new OrderHistory(id);
/* 665 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton10ActionPerformed(ActionEvent evt)
/*     */   {
/* 671 */     int id = Integer.parseInt(this.jButton10.getText());
/* 672 */     if (this.s8 == 0) {
/* 673 */       this.jLabel2.setText("try");
/* 674 */       close();
/* 675 */       MakeOrders m = new MakeOrders(id);
/* 676 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 679 */       this.jLabel2.setText("try");
/* 680 */       close();
/* 681 */       OrderHistory o = new OrderHistory(id);
/* 682 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton11ActionPerformed(ActionEvent evt)
/*     */   {
/* 688 */     int id = Integer.parseInt(this.jButton11.getText());
/* 689 */     if (this.s9 == 0) {
/* 690 */       this.jLabel2.setText("try");
/* 691 */       close();
/* 692 */       MakeOrders m = new MakeOrders(id);
/* 693 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 696 */       this.jLabel2.setText("try");
/* 697 */       close();
/* 698 */       OrderHistory o = new OrderHistory(id);
/* 699 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton12ActionPerformed(ActionEvent evt)
/*     */   {
/* 705 */     int id = Integer.parseInt(this.jButton12.getText());
/* 706 */     if (this.s10 == 0) {
/* 707 */       this.jLabel2.setText("try");
/* 708 */       close();
/* 709 */       MakeOrders m = new MakeOrders(id);
/* 710 */       m.setVisible(true);
/*     */     }
/*     */     else {
/* 713 */       this.jLabel2.setText("try");
/* 714 */       close();
/* 715 */       OrderHistory o = new OrderHistory(id);
/* 716 */       o.setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton13ActionPerformed(ActionEvent evt)
/*     */   {
/* 722 */     Expense e = new Expense();
/* 723 */     e.setVisible(true);
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
/* 736 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 737 */         UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*     */       }
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 742 */       Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 744 */       Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 746 */       Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (UnsupportedLookAndFeelException ex) {
/* 748 */       Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 753 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 755 */         new Welcome().setVisible(true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void close()
/*     */   {
/* 779 */     WindowEvent winClosingEvent = new WindowEvent(this, 201);
/* 780 */     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Welcome.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
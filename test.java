/*     */ package resturentapp;
/*     */ 
/*     */ import datechooser.beans.DateChooserDialog;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.PrintStream;
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
/*     */ import javax.swing.JMenu;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ public class test extends javax.swing.JFrame
/*     */ {
/*  26 */   Connection conn = null;
/*  27 */   ResultSet rs = null;
/*  28 */   PreparedStatement ps = null;
/*     */   private DateChooserDialog dateChooserDialog1;
/*     */   private DateChooserDialog dateChooserDialog2;
/*     */   private DateChooserDialog dateChooserDialog3;
/*     */   
/*  33 */   public test() { initComponents();
/*  34 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*  35 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  36 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  37 */     setSize(xsize, ysize);
/*     */   }
/*     */   
/*     */   private DateChooserDialog dateChooserDialog4;
/*     */   private DateChooserDialog dateChooserDialog5;
/*     */   private DateChooserDialog dateChooserDialog6;
/*     */   private JButton jButton1;
/*     */   private JButton jButton10;
/*     */   private JButton jButton11;
/*     */   private JButton jButton2;
/*     */   
/*     */   private void initComponents() {
/*  49 */     this.dateChooserDialog1 = new DateChooserDialog();
/*  50 */     this.dateChooserDialog2 = new DateChooserDialog();
/*  51 */     this.dateChooserDialog3 = new DateChooserDialog();
/*  52 */     this.dateChooserDialog4 = new DateChooserDialog();
/*  53 */     this.dateChooserDialog5 = new DateChooserDialog();
/*  54 */     this.dateChooserDialog6 = new DateChooserDialog();
/*  55 */     this.jButton2 = new JButton();
/*  56 */     this.jButton1 = new JButton();
/*  57 */     this.jButton3 = new JButton();
/*  58 */     this.jScrollPane1 = new JScrollPane();
/*  59 */     this.jTable1 = new JTable();
/*  60 */     this.jButton4 = new JButton();
/*  61 */     this.jScrollPane2 = new JScrollPane();
/*  62 */     this.jTable2 = new JTable();
/*  63 */     this.jScrollPane3 = new JScrollPane();
/*  64 */     this.jTable3 = new JTable();
/*  65 */     this.jScrollPane4 = new JScrollPane();
/*  66 */     this.jTable4 = new JTable();
/*  67 */     this.jButton5 = new JButton();
/*  68 */     this.jButton6 = new JButton();
/*  69 */     this.jButton7 = new JButton();
/*  70 */     this.jButton8 = new JButton();
/*  71 */     this.jButton9 = new JButton();
/*  72 */     this.jButton10 = new JButton();
/*  73 */     this.jPanel1 = new javax.swing.JPanel();
/*  74 */     this.jButton11 = new JButton();
/*  75 */     this.jMenuBar1 = new javax.swing.JMenuBar();
/*  76 */     this.jMenu1 = new JMenu();
/*  77 */     this.jMenu2 = new JMenu();
/*     */     
/*  79 */     setDefaultCloseOperation(3);
/*     */     
/*  81 */     this.jButton2.setText("today max expense");
/*  82 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  84 */         test.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  87 */     });
/*  88 */     this.jButton1.setText("todays expense history");
/*  89 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  91 */         test.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  94 */     });
/*  95 */     this.jButton3.setText("today max sell");
/*  96 */     this.jButton3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  98 */         test.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 101 */     });
/* 102 */     this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6" }));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */     this.jScrollPane1.setViewportView(this.jTable1);
/* 137 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 138 */       this.jTable1.getColumnModel().getColumn(5).setResizable(false);
/*     */     }
/*     */     
/* 141 */     this.jButton4.setText("todays order history");
/* 142 */     this.jButton4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 144 */         test.this.jButton4ActionPerformed(evt);
/*     */       }
/*     */       
/* 147 */     });
/* 148 */     this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Title 1", "Title 2" }));
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
/*     */ 
/*     */ 
/* 255 */     this.jScrollPane2.setViewportView(this.jTable2);
/*     */     
/* 257 */     this.jTable3.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Title 1", "Title 2" }));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */     this.jScrollPane3.setViewportView(this.jTable3);
/*     */     
/* 293 */     this.jTable4.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
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
/*     */ 
/* 321 */     this.jScrollPane4.setViewportView(this.jTable4);
/*     */     
/* 323 */     this.jButton5.setText("this month order historyl");
/* 324 */     this.jButton5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 326 */         test.this.jButton5ActionPerformed(evt);
/*     */       }
/*     */       
/* 329 */     });
/* 330 */     this.jButton6.setText("this month expense history");
/* 331 */     this.jButton6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 333 */         test.this.jButton6ActionPerformed(evt);
/*     */       }
/*     */       
/* 336 */     });
/* 337 */     this.jButton7.setText("this month max sell");
/* 338 */     this.jButton7.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 340 */         test.this.jButton7ActionPerformed(evt);
/*     */       }
/*     */       
/* 343 */     });
/* 344 */     this.jButton8.setText("this month max expense");
/* 345 */     this.jButton8.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 347 */         test.this.jButton8ActionPerformed(evt);
/*     */       }
/*     */       
/* 350 */     });
/* 351 */     this.jButton9.setText("this year max sell");
/* 352 */     this.jButton9.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 354 */         test.this.jButton9ActionPerformed(evt);
/*     */       }
/*     */       
/* 357 */     });
/* 358 */     this.jButton10.setText("this year max expense");
/* 359 */     this.jButton10.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 361 */         test.this.jButton10ActionPerformed(evt);
/*     */       }
/*     */       
/* 364 */     });
/* 365 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 366 */     this.jPanel1.setLayout(jPanel1Layout);
/* 367 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 368 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 369 */       .addGap(0, 543, 32767));
/*     */     
/* 371 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 372 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 373 */       .addGap(0, 396, 32767));
/*     */     
/*     */ 
/* 376 */     this.jButton11.setText("jButton11");
/* 377 */     this.jButton11.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 379 */         test.this.jButton11ActionPerformed(evt);
/*     */       }
/*     */       
/* 382 */     });
/* 383 */     this.jMenu1.setText("File");
/* 384 */     this.jMenuBar1.add(this.jMenu1);
/*     */     
/* 386 */     this.jMenu2.setText("Edit");
/* 387 */     this.jMenuBar1.add(this.jMenu2);
/*     */     
/* 389 */     setJMenuBar(this.jMenuBar1);
/*     */     
/* 391 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 392 */     getContentPane().setLayout(layout);
/* 393 */     layout.setHorizontalGroup(layout
/* 394 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 395 */       .addGroup(layout.createSequentialGroup()
/* 396 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 397 */       .addGroup(layout.createSequentialGroup()
/* 398 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 399 */       .addGroup(layout.createSequentialGroup()
/* 400 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 401 */       .addComponent(this.jButton3)
/* 402 */       .addComponent(this.jButton4))
/* 403 */       .addGap(49, 49, 49)
/* 404 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 405 */       .addComponent(this.jButton2)
/* 406 */       .addComponent(this.jButton1))
/* 407 */       .addGap(0, 0, 32767))
/* 408 */       .addGroup(layout.createSequentialGroup()
/* 409 */       .addContainerGap()
/* 410 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 411 */       .addGroup(layout.createSequentialGroup()
/* 412 */       .addComponent(this.jButton9, -2, 149, -2)
/* 413 */       .addGap(18, 18, 18)
/* 414 */       .addComponent(this.jButton10, -1, -1, 32767))
/* 415 */       .addGroup(layout.createSequentialGroup()
/* 416 */       .addComponent(this.jButton5)
/* 417 */       .addGap(18, 18, 18)
/* 418 */       .addComponent(this.jButton6, -1, -1, 32767))
/* 419 */       .addGroup(layout.createSequentialGroup()
/* 420 */       .addComponent(this.jButton7, -2, 149, -2)
/* 421 */       .addGap(18, 18, 18)
/* 422 */       .addComponent(this.jButton8, -1, -1, 32767)))))
/* 423 */       .addGap(18, 18, 18)
/* 424 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 425 */       .addComponent(this.jScrollPane1, -2, 596, -2)
/* 426 */       .addComponent(this.jButton11))
/* 427 */       .addGap(125, 125, 125))
/* 428 */       .addGroup(layout.createSequentialGroup()
/* 429 */       .addGap(47, 47, 47)
/* 430 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 431 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 432 */       .addComponent(this.jScrollPane2, -2, 291, -2)
/* 433 */       .addGap(45, 45, 45)))
/* 434 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 435 */       .addComponent(this.jScrollPane4, -2, 385, -2)
/* 436 */       .addComponent(this.jScrollPane3, -2, 339, -2))
/* 437 */       .addGap(270, 270, 270)));
/*     */     
/* 439 */     layout.setVerticalGroup(layout
/* 440 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 441 */       .addGroup(layout.createSequentialGroup()
/* 442 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 443 */       .addGroup(layout.createSequentialGroup()
/* 444 */       .addGap(28, 28, 28)
/* 445 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 446 */       .addComponent(this.jButton4)
/* 447 */       .addComponent(this.jButton1))
/* 448 */       .addGap(18, 18, 18)
/* 449 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 450 */       .addComponent(this.jButton3)
/* 451 */       .addComponent(this.jButton2))
/* 452 */       .addGap(55, 55, 55)
/* 453 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 454 */       .addComponent(this.jButton5)
/* 455 */       .addComponent(this.jButton6))
/* 456 */       .addGap(18, 18, 18)
/* 457 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 458 */       .addComponent(this.jButton7)
/* 459 */       .addComponent(this.jButton8)))
/* 460 */       .addComponent(this.jScrollPane4, -1, 236, 32767)
/* 461 */       .addComponent(this.jScrollPane1, -2, 0, 32767))
/* 462 */       .addGap(3, 3, 3)
/* 463 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 464 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 465 */       .addComponent(this.jButton9)
/* 466 */       .addComponent(this.jButton10))
/* 467 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 468 */       .addComponent(this.jButton11)
/* 469 */       .addGap(56, 56, 56)))
/* 470 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 471 */       .addGroup(layout.createSequentialGroup()
/* 472 */       .addGap(88, 88, 88)
/* 473 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 474 */       .addComponent(this.jScrollPane3, -2, 266, -2)
/* 475 */       .addComponent(this.jScrollPane2, -2, 306, -2))
/* 476 */       .addContainerGap(-1, 32767))
/* 477 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 478 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, 32767)
/* 479 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 480 */       .addContainerGap()))));
/*     */     
/*     */ 
/* 483 */     pack(); }
/*     */   
/*     */   private JButton jButton3;
/*     */   
/* 487 */   private void jButton2ActionPerformed(ActionEvent evt) { int i = 0;int j = 0;
/* 488 */     String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*     */     try {
/* 490 */       this.conn = JavaConnect.connectDb();
/* 491 */       String sql = "select date,name from expense_table where date = '" + today + "' group by name";
/* 492 */       this.ps = this.conn.prepareStatement(sql);
/* 493 */       ResultSet a = this.ps.executeQuery();
/* 494 */       while (a.next()) {
/* 495 */         Object date = a.getString("date");
/*     */         
/* 497 */         i++;
/*     */       }
/*     */       
/* 500 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 501 */       dtm.setRowCount(i);
/* 502 */       String sql1 = "select date,name,sum(amount) from expense_table where date='" + today + "'group by name order by sum(amount) desc";
/* 503 */       this.ps = this.conn.prepareStatement(sql1);
/* 504 */       ResultSet rs = this.ps.executeQuery();
/* 505 */       while (rs.next())
/*     */       {
/*     */ 
/* 508 */         Object expense = rs.getString(2);
/* 509 */         int total = rs.getInt(3);
/* 510 */         this.jTable3.getModel().setValueAt(expense, j, 0);
/* 511 */         this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 512 */         j++;
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 517 */       System.out.println(e);
/*     */     } }
/*     */   
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   
/* 523 */   private void jButton1ActionPerformed(ActionEvent evt) { int i = 0;int j = 0;
/* 524 */     String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*     */     try {
/* 526 */       this.conn = JavaConnect.connectDb();
/* 527 */       String sql = "select * from expense_table";
/* 528 */       this.ps = this.conn.prepareStatement(sql);
/* 529 */       ResultSet a = this.ps.executeQuery();
/* 530 */       while (a.next()) {
/* 531 */         Object date = a.getString("date");
/* 532 */         if (date.equals(today)) {
/* 533 */           i++;
/*     */         }
/*     */       }
/* 536 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/* 537 */       dtm.setRowCount(i);
/* 538 */       String sql1 = "select * from expense_table order by time desc";
/* 539 */       this.ps = this.conn.prepareStatement(sql1);
/* 540 */       ResultSet rs = this.ps.executeQuery();
/* 541 */       while (rs.next()) {
/* 542 */         Object date = rs.getString("date");
/* 543 */         if (date.equals(today)) {
/* 544 */           Object time = rs.getString("time");
/* 545 */           Object name = rs.getString("name");
/* 546 */           Object amount = rs.getString("amount");
/* 547 */           this.jTable4.getModel().setValueAt(date, j, 0);
/* 548 */           this.jTable4.getModel().setValueAt(time, j, 1);
/* 549 */           this.jTable4.getModel().setValueAt(name, j, 2);
/* 550 */           this.jTable4.getModel().setValueAt(amount, j, 3);
/*     */         }
/* 552 */         j++;
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 556 */       System.out.println(e); } }
/*     */   
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   
/* 561 */   private void jButton3ActionPerformed(ActionEvent evt) { int i = 0;int j = 0;
/* 562 */     String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*     */     try {
/* 564 */       this.conn = JavaConnect.connectDb();
/* 565 */       String sql = "select date,item from history_table group by item";
/* 566 */       this.ps = this.conn.prepareStatement(sql);
/* 567 */       ResultSet a = this.ps.executeQuery();
/* 568 */       while (a.next()) {
/* 569 */         Object date = a.getString("date");
/* 570 */         if (date.equals(today)) {
/* 571 */           i++;
/*     */         }
/*     */       }
/* 574 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 575 */       dtm.setRowCount(i);
/* 576 */       String sql1 = "select date,item,sum(quantity) from history_table group by item order by sum(quantity) desc";
/* 577 */       this.ps = this.conn.prepareStatement(sql1);
/* 578 */       ResultSet rs = this.ps.executeQuery();
/* 579 */       while (rs.next()) {
/* 580 */         Object date = rs.getString(1);
/* 581 */         if (today.equals(date)) {
/* 582 */           Object type = rs.getString(2);
/* 583 */           System.out.println(type);
/* 584 */           int count = rs.getInt(3);
/* 585 */           this.jTable2.getModel().setValueAt(type, j, 0);
/* 586 */           this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 587 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 592 */       System.out.println(e); } }
/*     */   
/*     */   private JButton jButton8;
/*     */   private JButton jButton9;
/*     */   private JMenu jMenu1;
/* 597 */   private void jButton4ActionPerformed(ActionEvent evt) { int i = 0;int j = 0;
/* 598 */     String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*     */     try {
/* 600 */       this.conn = JavaConnect.connectDb();
/* 601 */       String sql = "select * from history_table";
/* 602 */       this.ps = this.conn.prepareStatement(sql);
/* 603 */       ResultSet a = this.ps.executeQuery();
/* 604 */       while (a.next()) {
/* 605 */         Object date = a.getString("date");
/* 606 */         if (date.equals(today)) {
/* 607 */           i++;
/*     */         }
/*     */       }
/* 610 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 611 */       dtm.setRowCount(i);
/* 612 */       String sql1 = "select * from history_table order by time desc";
/* 613 */       this.ps = this.conn.prepareStatement(sql1);
/* 614 */       ResultSet rs = this.ps.executeQuery();
/* 615 */       while (rs.next()) {
/* 616 */         Object date = rs.getString("date");
/* 617 */         if (date.equals(today)) {
/* 618 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/* 619 */           Object item = rs.getString("item");
/* 620 */           Object type = rs.getString("type");
/* 621 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/* 622 */           Object d = rs.getString("date");
/* 623 */           Object t = rs.getString("time");
/* 624 */           this.jTable1.getModel().setValueAt(o, j, 0);
/* 625 */           this.jTable1.getModel().setValueAt(d, j, 1);
/* 626 */           this.jTable1.getModel().setValueAt(t, j, 2);
/* 627 */           this.jTable1.getModel().setValueAt(item, j, 3);
/* 628 */           this.jTable1.getModel().setValueAt(type, j, 4);
/* 629 */           this.jTable1.getModel().setValueAt(q, j, 5);
/* 630 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 636 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 642 */       int i = 0;int j = 0;
/* 643 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 644 */       int m = Integer.parseInt(thisMonth);
/* 645 */       this.conn = JavaConnect.connectDb();
/* 646 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 647 */       dtm.setRowCount(100);
/* 648 */       String sql1 = "select * from history_table order by time desc";
/* 649 */       this.ps = this.conn.prepareStatement(sql1);
/* 650 */       ResultSet rs = this.ps.executeQuery();
/* 651 */       while (rs.next()) {
/* 652 */         Object month = rs.getString("month");
/* 653 */         int mm = Integer.parseInt((String)month);
/* 654 */         if (m == mm) {
/* 655 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/* 656 */           Object item = rs.getString("item");
/* 657 */           Object type = rs.getString("type");
/* 658 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/* 659 */           Object d = rs.getString("date");
/* 660 */           Object t = rs.getString("time");
/* 661 */           if (i < 100) {
/* 662 */             this.jTable1.getModel().setValueAt(o, j, 0);
/* 663 */             this.jTable1.getModel().setValueAt(d, j, 1);
/* 664 */             this.jTable1.getModel().setValueAt(t, j, 2);
/* 665 */             this.jTable1.getModel().setValueAt(item, j, 3);
/* 666 */             this.jTable1.getModel().setValueAt(type, j, 4);
/* 667 */             this.jTable1.getModel().setValueAt(q, j, 5);
/* 668 */             j++;
/* 669 */             i++;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 676 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try {
/* 683 */       int i = 0;int j = 0;
/* 684 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 685 */       int m = Integer.parseInt(thisMonth);
/* 686 */       this.conn = JavaConnect.connectDb();
/* 687 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/* 688 */       dtm.setRowCount(100);
/* 689 */       String sql1 = "select * from expense_table order by time desc";
/* 690 */       this.ps = this.conn.prepareStatement(sql1);
/* 691 */       ResultSet rs = this.ps.executeQuery();
/* 692 */       while (rs.next()) {
/* 693 */         Object month = rs.getString("month");
/* 694 */         int mm = Integer.parseInt((String)month);
/* 695 */         if (m == mm) {
/* 696 */           Object date = rs.getString("date");
/* 697 */           Object time = rs.getString("time");
/* 698 */           Object name = rs.getString("name");
/* 699 */           Object amount = rs.getString("amount");
/* 700 */           if (i < 100) {
/* 701 */             this.jTable4.getModel().setValueAt(date, j, 0);
/* 702 */             this.jTable4.getModel().setValueAt(time, j, 1);
/* 703 */             this.jTable4.getModel().setValueAt(name, j, 2);
/* 704 */             this.jTable4.getModel().setValueAt(amount, j, 3);
/* 705 */             j++;
/* 706 */             i++;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 712 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton7ActionPerformed(ActionEvent evt) {
/* 717 */     int i = 0;int j = 0;
/* 718 */     String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 719 */     int m = Integer.parseInt(thisMonth);
/*     */     try {
/* 721 */       this.conn = JavaConnect.connectDb();
/* 722 */       String sql = "select month,item from history_table where month='" + m + "'group by item";
/* 723 */       this.ps = this.conn.prepareStatement(sql);
/* 724 */       ResultSet a = this.ps.executeQuery();
/* 725 */       while (a.next()) {
/* 726 */         Object month = a.getString("month");
/* 727 */         int mm = Integer.parseInt((String)month);
/* 728 */         if (m == mm) {
/* 729 */           i++;
/*     */         }
/*     */       }
/* 732 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 733 */       dtm.setRowCount(i);
/* 734 */       String sql1 = "select month,item,sum(quantity) from history_table group by item order by sum(quantity) desc";
/* 735 */       this.ps = this.conn.prepareStatement(sql1);
/* 736 */       ResultSet rs = this.ps.executeQuery();
/* 737 */       while (rs.next()) {
/* 738 */         Object month = rs.getString("month");
/* 739 */         int mm = Integer.parseInt((String)month);
/* 740 */         if (m == mm) {
/* 741 */           Object type = rs.getString(2);
/* 742 */           System.out.println(type);
/* 743 */           int count = rs.getInt(3);
/* 744 */           this.jTable2.getModel().setValueAt(type, j, 0);
/* 745 */           this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 746 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 751 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton8ActionPerformed(ActionEvent evt) {
/* 756 */     int i = 0;int j = 0;
/* 757 */     String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 758 */     int m = Integer.parseInt(thisMonth);
/*     */     try {
/* 760 */       this.conn = JavaConnect.connectDb();
/* 761 */       String sql = "select month,name from expense_table group by name";
/* 762 */       this.ps = this.conn.prepareStatement(sql);
/* 763 */       ResultSet a = this.ps.executeQuery();
/* 764 */       while (a.next()) {
/* 765 */         Object month = a.getString("month");
/* 766 */         int mm = Integer.parseInt((String)month);
/* 767 */         if (m == mm) {
/* 768 */           i++;
/*     */         }
/*     */       }
/* 771 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 772 */       dtm.setRowCount(i);
/* 773 */       String sql1 = "select month,name,sum(amount) from expense_table group by name order by sum(amount) desc";
/* 774 */       this.ps = this.conn.prepareStatement(sql1);
/* 775 */       ResultSet rs = this.ps.executeQuery();
/* 776 */       while (rs.next()) {
/* 777 */         Object month = rs.getString("month");
/* 778 */         int mm = Integer.parseInt((String)month);
/* 779 */         if (m == mm) {
/* 780 */           Object expense = rs.getString(2);
/* 781 */           int total = rs.getInt(3);
/* 782 */           this.jTable3.getModel().setValueAt(expense, j, 0);
/* 783 */           this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 784 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 789 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton9ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try {
/* 796 */       int i = 0;int j = 0;
/* 797 */       String thisYear = new SimpleDateFormat("YYYY").format(new Date());
/* 798 */       this.conn = JavaConnect.connectDb();
/* 799 */       String sql = "select year,item from history_table group by item";
/* 800 */       this.ps = this.conn.prepareStatement(sql);
/* 801 */       ResultSet a = this.ps.executeQuery();
/* 802 */       while (a.next()) {
/* 803 */         Object year = a.getString("year");
/* 804 */         if (year.equals(thisYear)) {
/* 805 */           i++;
/*     */         }
/*     */       }
/* 808 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 809 */       dtm.setRowCount(i);
/* 810 */       String sql1 = "select year,item,sum(quantity) from history_table group by item order by sum(quantity) desc";
/* 811 */       this.ps = this.conn.prepareStatement(sql1);
/* 812 */       ResultSet rs = this.ps.executeQuery();
/* 813 */       while (rs.next()) {
/* 814 */         Object year = rs.getString("year");
/* 815 */         if (year.equals(thisYear)) {
/* 816 */           Object type = rs.getString(2);
/* 817 */           System.out.println(type);
/* 818 */           int count = rs.getInt(3);
/* 819 */           this.jTable2.getModel().setValueAt(type, j, 0);
/* 820 */           this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 821 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 826 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton10ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try {
/* 833 */       int i = 0;int j = 0;
/* 834 */       String thisYear = new SimpleDateFormat("YYYY").format(new Date());
/* 835 */       this.conn = JavaConnect.connectDb();
/* 836 */       String sql = "select year,name from expense_table group by name";
/* 837 */       this.ps = this.conn.prepareStatement(sql);
/* 838 */       ResultSet a = this.ps.executeQuery();
/* 839 */       while (a.next()) {
/* 840 */         Object year = a.getString("year");
/* 841 */         if (year.equals(thisYear)) {
/* 842 */           i++;
/*     */         }
/*     */       }
/* 845 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 846 */       dtm.setRowCount(i);
/* 847 */       String sql1 = "select year,name,sum(amount) from expense_table group by name order by sum(amount) desc";
/* 848 */       this.ps = this.conn.prepareStatement(sql1);
/* 849 */       ResultSet rs = this.ps.executeQuery();
/* 850 */       while (rs.next()) {
/* 851 */         Object year = rs.getString(1);
/* 852 */         if (year.equals(thisYear)) {
/* 853 */           Object expense = rs.getString(2);
/* 854 */           int total = rs.getInt(3);
/* 855 */           this.jTable3.getModel().setValueAt(expense, j, 0);
/* 856 */           this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 857 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 862 */       System.out.println(e);
/*     */     }
/*     */   }
/*     */   
/*     */   private JMenu jMenu2;
/*     */   private javax.swing.JMenuBar jMenuBar1;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JScrollPane jScrollPane2;
/*     */   private JScrollPane jScrollPane3;
/*     */   private JScrollPane jScrollPane4;
/*     */   private JTable jTable1;
/*     */   private JTable jTable2;
/*     */   private JTable jTable3;
/*     */   private JTable jTable4;
/*     */   private void jButton11ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   public static void main(String[] args) {
/* 880 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : )
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 885 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*     */       }
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 890 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 892 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 894 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 896 */       Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 901 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 903 */         new test().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\test.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
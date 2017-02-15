/*      */ package resturentapp;
/*      */ 
/*      */ import java.awt.Font;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.sql.Connection;
/*      */ import java.sql.PreparedStatement;
/*      */ import java.sql.ResultSet;
/*      */ import java.util.logging.Logger;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.table.DefaultTableModel;
/*      */ import javax.swing.table.TableModel;
/*      */ 
/*      */ public class Edit extends javax.swing.JFrame
/*      */ {
/*   23 */   Connection conn = JavaConnect.connectDb();
/*   24 */   ResultSet rs = null;
/*   25 */   PreparedStatement ps = null;
/*      */   private JButton jButton1;
/*      */   private JButton jButton10;
/*      */   
/*      */   public Edit() {
/*   30 */     initComponents();
/*   31 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*   32 */     int xsize = (int)tk.getScreenSize().getWidth();
/*   33 */     int ysize = (int)tk.getScreenSize().getHeight();
/*   34 */     setSize(xsize, ysize);
/*   35 */     this.jTextField5.setVisible(false);
/*   36 */     Admin ad = new Admin();
/*   37 */     ad.close();
/*      */   }
/*      */   
/*      */ 
/*      */   private JButton jButton11;
/*      */   private JButton jButton12;
/*      */   private JButton jButton13;
/*      */   private JButton jButton14;
/*      */   private JButton jButton15;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*   49 */     this.jButton1 = new JButton();
/*   50 */     this.jButton2 = new JButton();
/*   51 */     this.jButton3 = new JButton();
/*   52 */     this.jButton4 = new JButton();
/*   53 */     this.jButton5 = new JButton();
/*   54 */     this.jButton6 = new JButton();
/*   55 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*   56 */     this.jTable1 = new JTable();
/*   57 */     this.jTextField1 = new JTextField();
/*   58 */     this.jTextField2 = new JTextField();
/*   59 */     this.jTextField3 = new JTextField();
/*   60 */     this.jTextField4 = new JTextField();
/*   61 */     this.jButton7 = new JButton();
/*   62 */     this.jButton8 = new JButton();
/*   63 */     this.jButton9 = new JButton();
/*   64 */     this.jPanel1 = new javax.swing.JPanel();
/*   65 */     this.jPanel2 = new javax.swing.JPanel();
/*   66 */     this.jTextField5 = new JTextField();
/*   67 */     this.jButton10 = new JButton();
/*   68 */     this.jButton11 = new JButton();
/*   69 */     this.jButton12 = new JButton();
/*   70 */     this.jButton13 = new JButton();
/*   71 */     this.jButton14 = new JButton();
/*   72 */     this.jButton15 = new JButton();
/*   73 */     this.jButton16 = new JButton();
/*   74 */     this.jButton17 = new JButton();
/*   75 */     this.jButton18 = new JButton();
/*   76 */     this.jButton19 = new JButton();
/*   77 */     this.jButton20 = new JButton();
/*   78 */     this.jButton21 = new JButton();
/*   79 */     this.jButton22 = new JButton();
/*   80 */     this.jButton23 = new JButton();
/*   81 */     this.jButton24 = new JButton();
/*   82 */     this.jButton25 = new JButton();
/*   83 */     this.jButton26 = new JButton();
/*   84 */     this.jButton27 = new JButton();
/*   85 */     this.jButton28 = new JButton();
/*   86 */     this.jButton29 = new JButton();
/*   87 */     this.jButton30 = new JButton();
/*   88 */     this.jButton32 = new JButton();
/*   89 */     this.jLabel1 = new javax.swing.JLabel();
/*   90 */     this.jButton31 = new JButton();
/*   91 */     this.jButton33 = new JButton();
/*   92 */     this.jButton34 = new JButton();
/*      */     
/*   94 */     setDefaultCloseOperation(2);
/*   95 */     setBackground(new java.awt.Color(0, 0, 255));
/*      */     
/*   97 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 11));
/*   98 */     this.jButton1.setText("THUKPA");
/*   99 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  101 */         Edit.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  104 */     });
/*  105 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 11));
/*  106 */     this.jButton2.setText("FRIED RICE");
/*  107 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  109 */         Edit.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  112 */     });
/*  113 */     this.jButton3.setFont(new Font("Montserrat Hairline", 0, 11));
/*  114 */     this.jButton3.setText("SOUP");
/*  115 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  117 */         Edit.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  120 */     });
/*  121 */     this.jButton4.setFont(new Font("Montserrat Hairline", 0, 11));
/*  122 */     this.jButton4.setText("BIRYANI");
/*  123 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  125 */         Edit.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  128 */     });
/*  129 */     this.jButton5.setFont(new Font("Montserrat Hairline", 0, 11));
/*  130 */     this.jButton5.setText("CHOPSUEY");
/*  131 */     this.jButton5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  133 */         Edit.this.jButton5ActionPerformed(evt);
/*      */       }
/*      */       
/*  136 */     });
/*  137 */     this.jButton6.setFont(new Font("Montserrat Hairline", 0, 11));
/*  138 */     this.jButton6.setText("CHOWMIN");
/*  139 */     this.jButton6.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  141 */         Edit.this.jButton6ActionPerformed(evt);
/*      */       }
/*      */       
/*  144 */     });
/*  145 */     this.jTable1.setFont(new Font("Poppins Light", 0, 14));
/*  146 */     this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "NAME", "TYPE", "PRICE" })
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  193 */       boolean[] canEdit = { true, true, false, false };
/*      */       
/*      */ 
/*      */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*      */       {
/*  198 */         return this.canEdit[columnIndex];
/*      */       }
/*  200 */     });
/*  201 */     this.jTable1.setRowHeight(30);
/*  202 */     this.jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  204 */         Edit.this.jTable1MouseClicked(evt);
/*      */       }
/*  206 */     });
/*  207 */     this.jScrollPane1.setViewportView(this.jTable1);
/*  208 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/*  209 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  210 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
/*  211 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  212 */       this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  215 */     this.jTextField1.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  217 */     this.jTextField2.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  219 */     this.jTextField3.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  221 */     this.jTextField4.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  223 */     this.jButton7.setFont(new Font("Montserrat Hairline", 0, 24));
/*  224 */     this.jButton7.setText("DELETE ");
/*  225 */     this.jButton7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  227 */         Edit.this.jButton7ActionPerformed(evt);
/*      */       }
/*      */       
/*  230 */     });
/*  231 */     this.jButton8.setFont(new Font("Montserrat Hairline", 0, 24));
/*  232 */     this.jButton8.setText("UPDATE");
/*  233 */     this.jButton8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  235 */         Edit.this.jButton8ActionPerformed(evt);
/*      */       }
/*      */       
/*  238 */     });
/*  239 */     this.jButton9.setFont(new Font("Montserrat Hairline", 0, 24));
/*  240 */     this.jButton9.setText("INSERT ");
/*  241 */     this.jButton9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  243 */         Edit.this.jButton9ActionPerformed(evt);
/*      */       }
/*      */       
/*  246 */     });
/*  247 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  248 */     this.jPanel1.setLayout(jPanel1Layout);
/*  249 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  250 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  251 */       .addGap(0, 0, 32767));
/*      */     
/*  253 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  254 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  255 */       .addGap(0, 0, 32767));
/*      */     
/*      */ 
/*  258 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  259 */     this.jPanel2.setLayout(jPanel2Layout);
/*  260 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  261 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  262 */       .addGap(0, 147, 32767));
/*      */     
/*  264 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  265 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  266 */       .addGap(0, 0, 32767));
/*      */     
/*      */ 
/*  269 */     this.jButton10.setFont(new Font("Montserrat Hairline", 0, 11));
/*  270 */     this.jButton10.setText("BOILED ITEMS");
/*  271 */     this.jButton10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  273 */         Edit.this.jButton10ActionPerformed(evt);
/*      */       }
/*      */       
/*  276 */     });
/*  277 */     this.jButton11.setFont(new Font("Montserrat Hairline", 0, 11));
/*  278 */     this.jButton11.setText("CUTLET");
/*  279 */     this.jButton11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  281 */         Edit.this.jButton11ActionPerformed(evt);
/*      */       }
/*      */       
/*  284 */     });
/*  285 */     this.jButton12.setFont(new Font("Montserrat Hairline", 0, 11));
/*  286 */     this.jButton12.setText("PAKAUDA");
/*  287 */     this.jButton12.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  289 */         Edit.this.jButton12ActionPerformed(evt);
/*      */       }
/*      */       
/*  292 */     });
/*  293 */     this.jButton13.setFont(new Font("Montserrat Hairline", 0, 11));
/*  294 */     this.jButton13.setText("SIZZLER");
/*  295 */     this.jButton13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  297 */         Edit.this.jButton13ActionPerformed(evt);
/*      */       }
/*      */       
/*  300 */     });
/*  301 */     this.jButton14.setFont(new Font("Montserrat Hairline", 0, 11));
/*  302 */     this.jButton14.setText("KHANA SET");
/*  303 */     this.jButton14.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  305 */         Edit.this.jButton14ActionPerformed(evt);
/*      */       }
/*      */       
/*  308 */     });
/*  309 */     this.jButton15.setFont(new Font("Montserrat Hairline", 0, 11));
/*  310 */     this.jButton15.setText("ROTI PARAUTHA");
/*  311 */     this.jButton15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  313 */         Edit.this.jButton15ActionPerformed(evt);
/*      */       }
/*      */       
/*  316 */     });
/*  317 */     this.jButton16.setFont(new Font("Montserrat Hairline", 0, 11));
/*  318 */     this.jButton16.setText("CURRY ");
/*  319 */     this.jButton16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  321 */         Edit.this.jButton16ActionPerformed(evt);
/*      */       }
/*      */       
/*  324 */     });
/*  325 */     this.jButton17.setFont(new Font("Montserrat Hairline", 0, 11));
/*  326 */     this.jButton17.setText("SPRING ROLL");
/*  327 */     this.jButton17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  329 */         Edit.this.jButton17ActionPerformed(evt);
/*      */       }
/*      */       
/*  332 */     });
/*  333 */     this.jButton18.setFont(new Font("Montserrat Hairline", 0, 11));
/*  334 */     this.jButton18.setText("SALAD");
/*  335 */     this.jButton18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  337 */         Edit.this.jButton18ActionPerformed(evt);
/*      */       }
/*      */       
/*  340 */     });
/*  341 */     this.jButton19.setFont(new Font("Montserrat Hairline", 0, 11));
/*  342 */     this.jButton19.setText("KHAJA SET");
/*  343 */     this.jButton19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  345 */         Edit.this.jButton19ActionPerformed(evt);
/*      */       }
/*      */       
/*  348 */     });
/*  349 */     this.jButton20.setFont(new Font("Montserrat Hairline", 0, 11));
/*  350 */     this.jButton20.setText("LASSI");
/*  351 */     this.jButton20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  353 */         Edit.this.jButton20ActionPerformed(evt);
/*      */       }
/*      */       
/*  356 */     });
/*  357 */     this.jButton21.setFont(new Font("Montserrat Hairline", 0, 11));
/*  358 */     this.jButton21.setText("HOT BEVERAGE");
/*  359 */     this.jButton21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  361 */         Edit.this.jButton21ActionPerformed(evt);
/*      */       }
/*      */       
/*  364 */     });
/*  365 */     this.jButton22.setFont(new Font("Montserrat Hairline", 0, 11));
/*  366 */     this.jButton22.setText("PIZZA");
/*  367 */     this.jButton22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  369 */         Edit.this.jButton22ActionPerformed(evt);
/*      */       }
/*      */       
/*  372 */     });
/*  373 */     this.jButton23.setFont(new Font("Montserrat Hairline", 0, 11));
/*  374 */     this.jButton23.setText("TOAST/OMLETTE");
/*  375 */     this.jButton23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  377 */         Edit.this.jButton23ActionPerformed(evt);
/*      */       }
/*      */       
/*  380 */     });
/*  381 */     this.jButton24.setFont(new Font("Montserrat Hairline", 0, 11));
/*  382 */     this.jButton24.setText("MOMO");
/*  383 */     this.jButton24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  385 */         Edit.this.jButton24ActionPerformed(evt);
/*      */       }
/*      */       
/*  388 */     });
/*  389 */     this.jButton25.setFont(new Font("Montserrat Hairline", 0, 11));
/*  390 */     this.jButton25.setText("SANDWITCH");
/*  391 */     this.jButton25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  393 */         Edit.this.jButton25ActionPerformed(evt);
/*      */       }
/*      */       
/*  396 */     });
/*  397 */     this.jButton26.setFont(new Font("Montserrat Hairline", 0, 11));
/*  398 */     this.jButton26.setText("BURGER");
/*  399 */     this.jButton26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  401 */         Edit.this.jButton26ActionPerformed(evt);
/*      */       }
/*      */       
/*  404 */     });
/*  405 */     this.jButton27.setFont(new Font("Montserrat Hairline", 0, 11));
/*  406 */     this.jButton27.setText("SAUSAGE");
/*  407 */     this.jButton27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  409 */         Edit.this.jButton27ActionPerformed(evt);
/*      */       }
/*      */       
/*  412 */     });
/*  413 */     this.jButton28.setFont(new Font("Montserrat Hairline", 0, 11));
/*  414 */     this.jButton28.setText("KATTI ROLL");
/*  415 */     this.jButton28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  417 */         Edit.this.jButton28ActionPerformed(evt);
/*      */       }
/*      */       
/*  420 */     });
/*  421 */     this.jButton29.setFont(new Font("Montserrat Hairline", 0, 11));
/*  422 */     this.jButton29.setText("SNACKS VEG");
/*  423 */     this.jButton29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  425 */         Edit.this.jButton29ActionPerformed(evt);
/*      */       }
/*      */       
/*  428 */     });
/*  429 */     this.jButton30.setFont(new Font("Montserrat Hairline", 0, 11));
/*  430 */     this.jButton30.setText("SNACKS NON VEG");
/*  431 */     this.jButton30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  433 */         Edit.this.jButton30ActionPerformed(evt);
/*      */       }
/*      */       
/*  436 */     });
/*  437 */     this.jButton32.setFont(new Font("Montserrat Hairline", 0, 11));
/*  438 */     this.jButton32.setText("COLD BEVERAGE");
/*  439 */     this.jButton32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  441 */         Edit.this.jButton32ActionPerformed(evt);
/*      */       }
/*      */       
/*  444 */     });
/*  445 */     this.jLabel1.setFont(new Font("Montserrat Hairline", 0, 24));
/*  446 */     this.jLabel1.setText("MENU ITEMS");
/*      */     
/*  448 */     this.jButton31.setFont(new Font("Arial Rounded MT Bold", 0, 12));
/*  449 */     this.jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/left-arrow.png")));
/*  450 */     this.jButton31.setBorderPainted(false);
/*  451 */     this.jButton31.setContentAreaFilled(false);
/*  452 */     this.jButton31.setFocusPainted(false);
/*  453 */     this.jButton31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  455 */         Edit.this.jButton31ActionPerformed(evt);
/*      */       }
/*      */       
/*  458 */     });
/*  459 */     this.jButton33.setFont(new Font("Montserrat Hairline", 0, 11));
/*  460 */     this.jButton33.setText("NEW ITEMS");
/*  461 */     this.jButton33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  463 */         Edit.this.jButton33ActionPerformed(evt);
/*      */       }
/*      */       
/*  466 */     });
/*  467 */     this.jButton34.setFont(new Font("Montserrat Hairline", 0, 11));
/*  468 */     this.jButton34.setText("CIGRATTE/LIQUORS");
/*  469 */     this.jButton34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  471 */         Edit.this.jButton34ActionPerformed(evt);
/*      */       }
/*      */       
/*  474 */     });
/*  475 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  476 */     getContentPane().setLayout(layout);
/*  477 */     layout.setHorizontalGroup(layout
/*  478 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  479 */       .addGroup(layout.createSequentialGroup()
/*  480 */       .addGap(1344, 1344, 1344)
/*  481 */       .addComponent(this.jPanel1, -1, -1, 32767)
/*  482 */       .addGap(10, 10, 10)
/*  483 */       .addComponent(this.jPanel2, -2, -1, -2))
/*  484 */       .addGroup(layout.createSequentialGroup()
/*  485 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  486 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  487 */       .addContainerGap()
/*  488 */       .addComponent(this.jButton31)
/*  489 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  490 */       .addComponent(this.jLabel1)
/*  491 */       .addGap(80, 80, 80))
/*  492 */       .addGroup(layout.createSequentialGroup()
/*  493 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  494 */       .addGroup(layout.createSequentialGroup()
/*  495 */       .addGap(10, 10, 10)
/*  496 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  497 */       .addComponent(this.jButton6, -2, 131, -2)
/*  498 */       .addComponent(this.jButton2, -2, 131, -2)
/*  499 */       .addComponent(this.jButton3, -2, 131, -2)))
/*  500 */       .addGroup(layout.createSequentialGroup()
/*  501 */       .addContainerGap()
/*  502 */       .addComponent(this.jButton1, -2, 131, -2))
/*  503 */       .addGroup(layout.createSequentialGroup()
/*  504 */       .addContainerGap()
/*  505 */       .addComponent(this.jButton4, -2, 131, -2))
/*  506 */       .addGroup(layout.createSequentialGroup()
/*  507 */       .addContainerGap()
/*  508 */       .addComponent(this.jButton5, -2, 131, -2))
/*  509 */       .addGroup(layout.createSequentialGroup()
/*  510 */       .addContainerGap()
/*  511 */       .addComponent(this.jButton13, -2, 131, -2)))
/*  512 */       .addGap(50, 50, 50)
/*  513 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  514 */       .addComponent(this.jButton16, -2, 131, -2)
/*  515 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  516 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  517 */       .addComponent(this.jButton11, -2, 131, -2)
/*  518 */       .addComponent(this.jButton17, -2, 131, -2)
/*  519 */       .addComponent(this.jButton12, -2, 131, -2)
/*  520 */       .addComponent(this.jButton10, -2, 131, -2)
/*  521 */       .addComponent(this.jButton14, -2, 131, -2))
/*  522 */       .addComponent(this.jButton15, -2, 131, -2)))
/*  523 */       .addGap(50, 50, 50)
/*  524 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  525 */       .addComponent(this.jButton26, -2, 131, -2)
/*  526 */       .addComponent(this.jButton28, -2, 131, -2)
/*  527 */       .addComponent(this.jButton18, -2, 131, -2)
/*  528 */       .addComponent(this.jButton20, -2, 131, -2)
/*  529 */       .addComponent(this.jButton23, -2, 131, -2)
/*  530 */       .addComponent(this.jButton19, -2, 131, -2)
/*  531 */       .addComponent(this.jButton25, -2, 131, -2))))
/*  532 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  533 */       .addGroup(layout.createSequentialGroup()
/*  534 */       .addGap(57, 57, 57)
/*  535 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  536 */       .addComponent(this.jButton21, -2, 131, -2)
/*  537 */       .addComponent(this.jButton32, -2, 131, -2)
/*  538 */       .addComponent(this.jButton22, -2, 131, -2)
/*  539 */       .addComponent(this.jButton24, -2, 131, -2)
/*  540 */       .addComponent(this.jButton27, -2, 131, -2)
/*  541 */       .addComponent(this.jButton29, -2, 131, -2)
/*  542 */       .addComponent(this.jButton30, -2, 131, -2)))
/*  543 */       .addGroup(layout.createSequentialGroup()
/*  544 */       .addGap(147, 147, 147)
/*  545 */       .addComponent(this.jTextField5, -2, 88, -2)))
/*  546 */       .addGap(33, 33, 33)
/*  547 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  548 */       .addGroup(layout.createSequentialGroup()
/*  549 */       .addComponent(this.jTextField1, -2, 46, -2)
/*  550 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  551 */       .addComponent(this.jTextField2, -2, 142, -2)
/*  552 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  553 */       .addComponent(this.jTextField3, -2, 144, -2)
/*  554 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  555 */       .addComponent(this.jTextField4, -2, 44, -2))
/*  556 */       .addGroup(layout.createSequentialGroup()
/*  557 */       .addComponent(this.jScrollPane1, -2, 405, -2)
/*  558 */       .addGap(55, 55, 55)
/*  559 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  560 */       .addComponent(this.jButton7, -2, 133, -2)
/*  561 */       .addComponent(this.jButton8, -2, 135, -2)
/*  562 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  563 */       .addComponent(this.jButton33, -2, 131, -2)
/*  564 */       .addComponent(this.jButton9, -2, 133, -2)
/*  565 */       .addComponent(this.jButton34, -2, 131, -2)))))
/*  566 */       .addGap(0, 0, 32767)));
/*      */     
/*  568 */     layout.setVerticalGroup(layout
/*  569 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  570 */       .addGroup(layout.createSequentialGroup()
/*  571 */       .addGap(11, 11, 11)
/*  572 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  573 */       .addGroup(layout.createSequentialGroup()
/*  574 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  575 */       .addComponent(this.jTextField5, -2, 37, -2)
/*  576 */       .addComponent(this.jButton31, -2, 27, -2))
/*  577 */       .addGap(31, 31, 31)
/*  578 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  579 */       .addComponent(this.jPanel1, -1, -1, 32767)
/*  580 */       .addComponent(this.jPanel2, -1, -1, 32767))
/*  581 */       .addGap(1, 1, 1))
/*  582 */       .addGroup(layout.createSequentialGroup()
/*  583 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  584 */       .addComponent(this.jTextField3, -2, 36, -2)
/*  585 */       .addComponent(this.jTextField2, -2, 36, -2)
/*  586 */       .addComponent(this.jTextField1, -2, 35, -2)
/*  587 */       .addComponent(this.jLabel1, -2, 33, -2)
/*  588 */       .addComponent(this.jTextField4, -2, 36, -2))
/*  589 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)))
/*  590 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  591 */       .addGroup(layout.createSequentialGroup()
/*  592 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  593 */       .addGroup(layout.createSequentialGroup()
/*  594 */       .addComponent(this.jButton6, -2, 61, -2)
/*  595 */       .addGap(40, 40, 40)
/*  596 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  597 */       .addComponent(this.jButton1, -2, 61, -2)
/*  598 */       .addComponent(this.jButton17, -2, 61, -2)
/*  599 */       .addComponent(this.jButton28, -2, 61, -2)
/*  600 */       .addComponent(this.jButton32, -2, 61, -2))
/*  601 */       .addGap(40, 40, 40)
/*  602 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  603 */       .addComponent(this.jButton2, -2, 61, -2)
/*  604 */       .addComponent(this.jButton12, -2, 61, -2)
/*  605 */       .addComponent(this.jButton18, -2, 61, -2)
/*  606 */       .addComponent(this.jButton22, -2, 61, -2))
/*  607 */       .addGap(37, 37, 37)
/*  608 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  609 */       .addComponent(this.jButton3, -2, 61, -2)
/*  610 */       .addComponent(this.jButton10, -2, 61, -2)
/*  611 */       .addComponent(this.jButton20, -2, 61, -2)
/*  612 */       .addComponent(this.jButton24, -2, 61, -2))
/*  613 */       .addGap(37, 37, 37)
/*  614 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  615 */       .addComponent(this.jButton23, -2, 61, -2)
/*  616 */       .addComponent(this.jButton27, -2, 61, -2)
/*  617 */       .addComponent(this.jButton14, -2, 61, -2)
/*  618 */       .addComponent(this.jButton4, -2, 61, -2)))
/*  619 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  620 */       .addComponent(this.jButton11, -2, 61, -2)
/*  621 */       .addComponent(this.jButton19, -2, 61, -2)))
/*  622 */       .addGap(43, 43, 43)
/*  623 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  624 */       .addComponent(this.jButton26, -2, 61, -2)
/*  625 */       .addComponent(this.jButton15, -2, 61, -2)
/*  626 */       .addComponent(this.jButton5, -2, 61, -2)
/*  627 */       .addComponent(this.jButton29, -2, 61, -2))
/*  628 */       .addGap(34, 34, 34)
/*  629 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  630 */       .addComponent(this.jButton16, -2, 61, -2)
/*  631 */       .addComponent(this.jButton25, -2, 61, -2)
/*  632 */       .addComponent(this.jButton30, -2, 61, -2)
/*  633 */       .addComponent(this.jButton13, -2, 61, -2)))
/*  634 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  635 */       .addGroup(layout.createSequentialGroup()
/*  636 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  637 */       .addGroup(layout.createSequentialGroup()
/*  638 */       .addComponent(this.jButton21, -2, 61, -2)
/*  639 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767))
/*  640 */       .addGroup(layout.createSequentialGroup()
/*  641 */       .addGap(5, 5, 5)
/*  642 */       .addComponent(this.jButton34, -2, 61, -2)
/*  643 */       .addGap(41, 41, 41)
/*  644 */       .addComponent(this.jButton33, -2, 61, -2)
/*  645 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  646 */       .addComponent(this.jButton9, -2, 100, -2)
/*  647 */       .addGap(32, 32, 32)))
/*  648 */       .addComponent(this.jButton7, -2, 101, -2)
/*  649 */       .addGap(28, 28, 28)
/*  650 */       .addComponent(this.jButton8, -2, 100, -2))
/*  651 */       .addComponent(this.jScrollPane1, -2, 659, -2)))
/*  652 */       .addGap(196, 196, 196)));
/*      */     
/*      */ 
/*  655 */     pack(); }
/*      */   
/*      */   private JButton jButton16;
/*      */   
/*  659 */   private void jButton1ActionPerformed(ActionEvent evt) { clear();
/*      */     try {
/*  661 */       String sql = "select * from menu_table2";
/*  662 */       this.ps = this.conn.prepareStatement(sql);
/*  663 */       this.rs = this.ps.executeQuery();
/*  664 */       int i = 0;
/*  665 */       while (this.rs.next()) {
/*  666 */         Object code = this.rs.getString("item_code");
/*  667 */         Object name = this.rs.getString("item_name");
/*  668 */         Object type = this.rs.getString("item_type");
/*  669 */         Object price = this.rs.getString("item_price");
/*  670 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  671 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  672 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  673 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  674 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  678 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  680 */     this.jTextField5.setText("menu_table2"); }
/*      */   
/*      */   private JButton jButton17;
/*      */   
/*  684 */   private void jButton2ActionPerformed(ActionEvent evt) { clear();
/*      */     try {
/*  686 */       String sql = "select * from menu_table3";
/*  687 */       this.ps = this.conn.prepareStatement(sql);
/*  688 */       this.rs = this.ps.executeQuery();
/*  689 */       int i = 0;
/*  690 */       while (this.rs.next()) {
/*  691 */         Object code = this.rs.getString("item_code");
/*  692 */         Object name = this.rs.getString("item_name");
/*  693 */         Object type = this.rs.getString("item_type");
/*  694 */         Object price = this.rs.getString("item_price");
/*  695 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  696 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  697 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  698 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  699 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  703 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  705 */     this.jTextField5.setText("menu_table3"); }
/*      */   
/*      */   private JButton jButton18;
/*      */   
/*  709 */   private void jButton3ActionPerformed(ActionEvent evt) { clear();
/*      */     try {
/*  711 */       String sql = "select * from menu_table4";
/*  712 */       this.ps = this.conn.prepareStatement(sql);
/*  713 */       this.rs = this.ps.executeQuery();
/*  714 */       int i = 0;
/*  715 */       while (this.rs.next()) {
/*  716 */         Object code = this.rs.getString("item_code");
/*  717 */         Object name = this.rs.getString("item_name");
/*  718 */         Object type = this.rs.getString("item_type");
/*  719 */         Object price = this.rs.getString("item_price");
/*  720 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  721 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  722 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  723 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  724 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  728 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  730 */     this.jTextField5.setText("menu_table4"); }
/*      */   
/*      */   private JButton jButton19;
/*      */   
/*  734 */   private void jButton4ActionPerformed(ActionEvent evt) { clear();
/*      */     try {
/*  736 */       String sql = "select * from menu_table5";
/*  737 */       this.ps = this.conn.prepareStatement(sql);
/*  738 */       this.rs = this.ps.executeQuery();
/*  739 */       int i = 0;
/*  740 */       while (this.rs.next()) {
/*  741 */         Object code = this.rs.getString("item_code");
/*  742 */         Object name = this.rs.getString("item_name");
/*  743 */         Object type = this.rs.getString("item_type");
/*  744 */         Object price = this.rs.getString("item_price");
/*  745 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  746 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  747 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  748 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  749 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  753 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  755 */     this.jTextField5.setText("menu_table5"); }
/*      */   
/*      */   private JButton jButton2;
/*      */   private JButton jButton20;
/*  759 */   private void jButton5ActionPerformed(ActionEvent evt) { clear();
/*      */     try {
/*  761 */       String sql = "select * from menu_table6";
/*  762 */       this.ps = this.conn.prepareStatement(sql);
/*  763 */       this.rs = this.ps.executeQuery();
/*  764 */       int i = 0;
/*  765 */       while (this.rs.next()) {
/*  766 */         Object code = this.rs.getString("item_code");
/*  767 */         Object name = this.rs.getString("item_name");
/*  768 */         Object type = this.rs.getString("item_type");
/*  769 */         Object price = this.rs.getString("item_price");
/*  770 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  771 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  772 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  773 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  774 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  778 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  780 */     this.jTextField5.setText("menu_table6");
/*      */   }
/*      */   
/*      */   private void jButton6ActionPerformed(ActionEvent evt) {
/*  784 */     clear();
/*      */     try {
/*  786 */       String sql = "select * from menu_table1";
/*  787 */       this.ps = this.conn.prepareStatement(sql);
/*  788 */       this.rs = this.ps.executeQuery();
/*  789 */       int i = 0;
/*  790 */       while (this.rs.next()) {
/*  791 */         Object code = this.rs.getString("item_code");
/*  792 */         Object name = this.rs.getString("item_name");
/*  793 */         Object type = this.rs.getString("item_type");
/*  794 */         Object price = this.rs.getString("item_price");
/*  795 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  796 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  797 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  798 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  799 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  803 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  805 */     this.jTextField5.setText("menu_table1");
/*      */   }
/*      */   
/*      */   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/*  810 */       DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
/*  811 */       int selectedRowIndex = this.jTable1.getSelectedRow();
/*  812 */       this.jTextField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
/*  813 */       this.jTextField2.setText(model.getValueAt(selectedRowIndex, 1).toString());
/*  814 */       this.jTextField3.setText(model.getValueAt(selectedRowIndex, 2).toString());
/*  815 */       this.jTextField4.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (NullPointerException e) {
/*  818 */       JOptionPane.showMessageDialog(null, "please select some field \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton9ActionPerformed(ActionEvent evt)
/*      */   {
/*      */     try {
/*  825 */       String table = this.jTextField5.getText();
/*  826 */       String code = this.jTextField1.getText();
/*  827 */       String name = this.jTextField2.getText();
/*  828 */       String type = this.jTextField3.getText();
/*  829 */       String price = this.jTextField4.getText();
/*  830 */       String sql = "insert into '" + table + "'(item_name,item_type,item_price,item_code)values(?,?,?,?)";
/*  831 */       this.ps = this.conn.prepareStatement(sql);
/*  832 */       this.ps.setString(1, name);
/*  833 */       this.ps.setString(2, type);
/*  834 */       this.ps.setString(3, price);
/*  835 */       this.ps.setString(4, code);
/*  836 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/*  839 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/*  841 */     clear();
/*      */     try {
/*  843 */       String table = this.jTextField5.getText();
/*  844 */       String sql = "select * from '" + table + "'";
/*  845 */       this.ps = this.conn.prepareStatement(sql);
/*  846 */       this.rs = this.ps.executeQuery();
/*  847 */       int i = 0;
/*  848 */       while (this.rs.next()) {
/*  849 */         Object code = this.rs.getString("item_code");
/*  850 */         Object name = this.rs.getString("item_name");
/*  851 */         Object type = this.rs.getString("item_type");
/*  852 */         Object price = this.rs.getString("item_price");
/*  853 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  854 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  855 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  856 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  857 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  861 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton7ActionPerformed(ActionEvent evt) {
/*      */     try {
/*  867 */       String table = this.jTextField5.getText();
/*  868 */       this.conn = JavaConnect.connectDb();
/*  869 */       String code = this.jTextField1.getText();
/*  870 */       int codeInt = Integer.parseInt(code);
/*  871 */       String sql = "delete from '" + table + "' where item_code=" + codeInt;
/*  872 */       this.ps = this.conn.prepareStatement(sql);
/*  873 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/*  876 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/*  878 */     clear();
/*      */     try {
/*  880 */       String table = this.jTextField5.getText();
/*  881 */       String sql = "select * from '" + table + "'";
/*  882 */       this.ps = this.conn.prepareStatement(sql);
/*  883 */       this.rs = this.ps.executeQuery();
/*  884 */       int i = 0;
/*  885 */       while (this.rs.next()) {
/*  886 */         Object code = this.rs.getString("item_code");
/*  887 */         Object name = this.rs.getString("item_name");
/*  888 */         Object type = this.rs.getString("item_type");
/*  889 */         Object price = this.rs.getString("item_price");
/*  890 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  891 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  892 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  893 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  894 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  898 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton8ActionPerformed(ActionEvent evt) {
/*      */     try {
/*  904 */       String table = this.jTextField5.getText();
/*  905 */       this.conn = JavaConnect.connectDb();
/*  906 */       String code = this.jTextField1.getText();
/*  907 */       String name = this.jTextField2.getText();
/*  908 */       String type = this.jTextField3.getText();
/*  909 */       String price = this.jTextField4.getText();
/*  910 */       int codeInt = Integer.parseInt(code);
/*  911 */       String sql = "update '" + table + "' set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/*  912 */       this.ps = this.conn.prepareStatement(sql);
/*  913 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/*  916 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/*  918 */     clear();
/*      */     try {
/*  920 */       String table = this.jTextField5.getText();
/*  921 */       String sql = "select * from '" + table + "'";
/*  922 */       this.ps = this.conn.prepareStatement(sql);
/*  923 */       this.rs = this.ps.executeQuery();
/*  924 */       int i = 0;
/*  925 */       while (this.rs.next()) {
/*  926 */         Object code = this.rs.getString("item_code");
/*  927 */         Object name = this.rs.getString("item_name");
/*  928 */         Object type = this.rs.getString("item_type");
/*  929 */         Object price = this.rs.getString("item_price");
/*  930 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  931 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  932 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  933 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  934 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  938 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton10ActionPerformed(ActionEvent evt) {
/*  943 */     clear();
/*      */     try {
/*  945 */       String sql = "select * from menu_table11";
/*  946 */       this.ps = this.conn.prepareStatement(sql);
/*  947 */       this.rs = this.ps.executeQuery();
/*  948 */       int i = 0;
/*  949 */       while (this.rs.next()) {
/*  950 */         Object code = this.rs.getString("item_code");
/*  951 */         Object name = this.rs.getString("item_name");
/*  952 */         Object type = this.rs.getString("item_type");
/*  953 */         Object price = this.rs.getString("item_price");
/*  954 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  955 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  956 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  957 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  958 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  962 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  964 */     this.jTextField5.setText("menu_table11");
/*      */   }
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt) {
/*  968 */     clear();
/*      */     try {
/*  970 */       String sql = "select * from menu_table8";
/*  971 */       this.ps = this.conn.prepareStatement(sql);
/*  972 */       this.rs = this.ps.executeQuery();
/*  973 */       int i = 0;
/*  974 */       while (this.rs.next()) {
/*  975 */         Object code = this.rs.getString("item_code");
/*  976 */         Object name = this.rs.getString("item_name");
/*  977 */         Object type = this.rs.getString("item_type");
/*  978 */         Object price = this.rs.getString("item_price");
/*  979 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  980 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  981 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  982 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*  983 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  987 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  989 */     this.jTextField5.setText("menu_table8");
/*      */   }
/*      */   
/*      */   private void jButton12ActionPerformed(ActionEvent evt) {
/*  993 */     clear();
/*      */     try {
/*  995 */       String sql = "select * from menu_table10";
/*  996 */       this.ps = this.conn.prepareStatement(sql);
/*  997 */       this.rs = this.ps.executeQuery();
/*  998 */       int i = 0;
/*  999 */       while (this.rs.next()) {
/* 1000 */         Object code = this.rs.getString("item_code");
/* 1001 */         Object name = this.rs.getString("item_name");
/* 1002 */         Object type = this.rs.getString("item_type");
/* 1003 */         Object price = this.rs.getString("item_price");
/* 1004 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1005 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1006 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1007 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1008 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1012 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1014 */     this.jTextField5.setText("menu_table10");
/*      */   }
/*      */   
/*      */   private void jButton13ActionPerformed(ActionEvent evt) {
/* 1018 */     clear();
/*      */     try {
/* 1020 */       String sql = "select * from menu_table7";
/* 1021 */       this.ps = this.conn.prepareStatement(sql);
/* 1022 */       this.rs = this.ps.executeQuery();
/* 1023 */       int i = 0;
/* 1024 */       while (this.rs.next()) {
/* 1025 */         Object code = this.rs.getString("item_code");
/* 1026 */         Object name = this.rs.getString("item_name");
/* 1027 */         Object type = this.rs.getString("item_type");
/* 1028 */         Object price = this.rs.getString("item_price");
/* 1029 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1030 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1031 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1032 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1033 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1037 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1039 */     this.jTextField5.setText("menu_table7");
/*      */   }
/*      */   
/*      */   private void jButton14ActionPerformed(ActionEvent evt) {
/* 1043 */     clear();
/*      */     try {
/* 1045 */       String sql = "select * from menu_table12";
/* 1046 */       this.ps = this.conn.prepareStatement(sql);
/* 1047 */       this.rs = this.ps.executeQuery();
/* 1048 */       int i = 0;
/* 1049 */       while (this.rs.next()) {
/* 1050 */         Object code = this.rs.getString("item_code");
/* 1051 */         Object name = this.rs.getString("item_name");
/* 1052 */         Object type = this.rs.getString("item_type");
/* 1053 */         Object price = this.rs.getString("item_price");
/* 1054 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1055 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1056 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1057 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1058 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1062 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1064 */     this.jTextField5.setText("menu_table12");
/*      */   }
/*      */   
/*      */   private void jButton15ActionPerformed(ActionEvent evt) {
/* 1068 */     clear();
/*      */     try {
/* 1070 */       String sql = "select * from menu_table13";
/* 1071 */       this.ps = this.conn.prepareStatement(sql);
/* 1072 */       this.rs = this.ps.executeQuery();
/* 1073 */       int i = 0;
/* 1074 */       while (this.rs.next()) {
/* 1075 */         Object code = this.rs.getString("item_code");
/* 1076 */         Object name = this.rs.getString("item_name");
/* 1077 */         Object type = this.rs.getString("item_type");
/* 1078 */         Object price = this.rs.getString("item_price");
/* 1079 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1080 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1081 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1082 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1083 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1087 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1089 */     this.jTextField5.setText("menu_table13");
/*      */   }
/*      */   
/*      */   private void jButton16ActionPerformed(ActionEvent evt) {
/* 1093 */     clear();
/*      */     try {
/* 1095 */       String sql = "select * from menu_table14";
/* 1096 */       this.ps = this.conn.prepareStatement(sql);
/* 1097 */       this.rs = this.ps.executeQuery();
/* 1098 */       int i = 0;
/* 1099 */       while (this.rs.next()) {
/* 1100 */         Object code = this.rs.getString("item_code");
/* 1101 */         Object name = this.rs.getString("item_name");
/* 1102 */         Object type = this.rs.getString("item_type");
/* 1103 */         Object price = this.rs.getString("item_price");
/* 1104 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1105 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1106 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1107 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1108 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1112 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1114 */     this.jTextField5.setText("menu_table14");
/*      */   }
/*      */   
/*      */   private void jButton17ActionPerformed(ActionEvent evt) {
/* 1118 */     clear();
/*      */     try {
/* 1120 */       String sql = "select * from menu_table9";
/* 1121 */       this.ps = this.conn.prepareStatement(sql);
/* 1122 */       this.rs = this.ps.executeQuery();
/* 1123 */       int i = 0;
/* 1124 */       while (this.rs.next()) {
/* 1125 */         Object code = this.rs.getString("item_code");
/* 1126 */         Object name = this.rs.getString("item_name");
/* 1127 */         Object type = this.rs.getString("item_type");
/* 1128 */         Object price = this.rs.getString("item_price");
/* 1129 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1130 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1131 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1132 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1133 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1137 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1139 */     this.jTextField5.setText("menu_table9");
/*      */   }
/*      */   
/*      */   private void jButton18ActionPerformed(ActionEvent evt) {
/* 1143 */     clear();
/*      */     try {
/* 1145 */       String sql = "select * from menu_table17";
/* 1146 */       this.ps = this.conn.prepareStatement(sql);
/* 1147 */       this.rs = this.ps.executeQuery();
/* 1148 */       int i = 0;
/* 1149 */       while (this.rs.next()) {
/* 1150 */         Object code = this.rs.getString("item_code");
/* 1151 */         Object name = this.rs.getString("item_name");
/* 1152 */         Object type = this.rs.getString("item_type");
/* 1153 */         Object price = this.rs.getString("item_price");
/* 1154 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1155 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1156 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1157 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1158 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1162 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1164 */     this.jTextField5.setText("menu_table17");
/*      */   }
/*      */   
/*      */   private void jButton19ActionPerformed(ActionEvent evt) {
/* 1168 */     clear();
/*      */     try {
/* 1170 */       String sql = "select * from menu_table15";
/* 1171 */       this.ps = this.conn.prepareStatement(sql);
/* 1172 */       this.rs = this.ps.executeQuery();
/* 1173 */       int i = 0;
/* 1174 */       while (this.rs.next()) {
/* 1175 */         Object code = this.rs.getString("item_code");
/* 1176 */         Object name = this.rs.getString("item_name");
/* 1177 */         Object type = this.rs.getString("item_type");
/* 1178 */         Object price = this.rs.getString("item_price");
/* 1179 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1180 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1181 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1182 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1183 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1187 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1189 */     this.jTextField5.setText("menu_table15");
/*      */   }
/*      */   
/*      */   private void jButton20ActionPerformed(ActionEvent evt) {
/* 1193 */     clear();
/*      */     try {
/* 1195 */       String sql = "select * from menu_table18";
/* 1196 */       this.ps = this.conn.prepareStatement(sql);
/* 1197 */       this.rs = this.ps.executeQuery();
/* 1198 */       int i = 0;
/* 1199 */       while (this.rs.next()) {
/* 1200 */         Object code = this.rs.getString("item_code");
/* 1201 */         Object name = this.rs.getString("item_name");
/* 1202 */         Object type = this.rs.getString("item_type");
/* 1203 */         Object price = this.rs.getString("item_price");
/* 1204 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1205 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1206 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1207 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1208 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1212 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1214 */     this.jTextField5.setText("menu_table18");
/*      */   }
/*      */   
/*      */   private void jButton21ActionPerformed(ActionEvent evt) {
/* 1218 */     clear();
/*      */     try {
/* 1220 */       String sql = "select * from menu_table22";
/* 1221 */       this.ps = this.conn.prepareStatement(sql);
/* 1222 */       this.rs = this.ps.executeQuery();
/* 1223 */       int i = 0;
/* 1224 */       while (this.rs.next()) {
/* 1225 */         Object code = this.rs.getString("item_code");
/* 1226 */         Object name = this.rs.getString("item_name");
/* 1227 */         Object type = this.rs.getString("item_type");
/* 1228 */         Object price = this.rs.getString("item_price");
/* 1229 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1230 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1231 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1232 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1233 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1237 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1239 */     this.jTextField5.setText("menu_table22");
/*      */   }
/*      */   
/*      */   private void jButton22ActionPerformed(ActionEvent evt) {
/* 1243 */     clear();
/*      */     try {
/* 1245 */       String sql = "select * from menu_table24";
/* 1246 */       this.ps = this.conn.prepareStatement(sql);
/* 1247 */       this.rs = this.ps.executeQuery();
/* 1248 */       int i = 0;
/* 1249 */       while (this.rs.next()) {
/* 1250 */         Object code = this.rs.getString("item_code");
/* 1251 */         Object name = this.rs.getString("item_name");
/* 1252 */         Object type = this.rs.getString("item_type");
/* 1253 */         Object price = this.rs.getString("item_price");
/* 1254 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1255 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1256 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1257 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1258 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1262 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1264 */     this.jTextField5.setText("menu_table24");
/*      */   }
/*      */   
/*      */   private void jButton23ActionPerformed(ActionEvent evt) {
/* 1268 */     clear();
/*      */     try {
/* 1270 */       String sql = "select * from menu_table19";
/* 1271 */       this.ps = this.conn.prepareStatement(sql);
/* 1272 */       this.rs = this.ps.executeQuery();
/* 1273 */       int i = 0;
/* 1274 */       while (this.rs.next()) {
/* 1275 */         Object code = this.rs.getString("item_code");
/* 1276 */         Object name = this.rs.getString("item_name");
/* 1277 */         Object type = this.rs.getString("item_type");
/* 1278 */         Object price = this.rs.getString("item_price");
/* 1279 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1280 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1281 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1282 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1283 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1287 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1289 */     this.jTextField5.setText("menu_table19");
/*      */   }
/*      */   
/*      */   private void jButton24ActionPerformed(ActionEvent evt) {
/* 1293 */     clear();
/*      */     try {
/* 1295 */       String sql = "select * from menu_table25";
/* 1296 */       this.ps = this.conn.prepareStatement(sql);
/* 1297 */       this.rs = this.ps.executeQuery();
/* 1298 */       int i = 0;
/* 1299 */       while (this.rs.next()) {
/* 1300 */         Object code = this.rs.getString("item_code");
/* 1301 */         Object name = this.rs.getString("item_name");
/* 1302 */         Object type = this.rs.getString("item_type");
/* 1303 */         Object price = this.rs.getString("item_price");
/* 1304 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1305 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1306 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1307 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1308 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1312 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1314 */     this.jTextField5.setText("menu_table25");
/*      */   }
/*      */   
/*      */   private void jButton25ActionPerformed(ActionEvent evt) {
/* 1318 */     clear();
/*      */     try {
/* 1320 */       String sql = "select * from menu_table21";
/* 1321 */       this.ps = this.conn.prepareStatement(sql);
/* 1322 */       this.rs = this.ps.executeQuery();
/* 1323 */       int i = 0;
/* 1324 */       while (this.rs.next()) {
/* 1325 */         Object code = this.rs.getString("item_code");
/* 1326 */         Object name = this.rs.getString("item_name");
/* 1327 */         Object type = this.rs.getString("item_type");
/* 1328 */         Object price = this.rs.getString("item_price");
/* 1329 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1330 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1331 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1332 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1333 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1337 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1339 */     this.jTextField5.setText("menu_table21");
/*      */   }
/*      */   
/*      */   private void jButton26ActionPerformed(ActionEvent evt) {
/* 1343 */     clear();
/*      */     try {
/* 1345 */       String sql = "select * from menu_table20";
/* 1346 */       this.ps = this.conn.prepareStatement(sql);
/* 1347 */       this.rs = this.ps.executeQuery();
/* 1348 */       int i = 0;
/* 1349 */       while (this.rs.next()) {
/* 1350 */         Object code = this.rs.getString("item_code");
/* 1351 */         Object name = this.rs.getString("item_name");
/* 1352 */         Object type = this.rs.getString("item_type");
/* 1353 */         Object price = this.rs.getString("item_price");
/* 1354 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1355 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1356 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1357 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1358 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1362 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1364 */     this.jTextField5.setText("menu_table20");
/*      */   }
/*      */   
/*      */   private void jButton27ActionPerformed(ActionEvent evt) {
/* 1368 */     clear();
/*      */     try {
/* 1370 */       String sql = "select * from menu_table26";
/* 1371 */       this.ps = this.conn.prepareStatement(sql);
/* 1372 */       this.rs = this.ps.executeQuery();
/* 1373 */       int i = 0;
/* 1374 */       while (this.rs.next()) {
/* 1375 */         Object code = this.rs.getString("item_code");
/* 1376 */         Object name = this.rs.getString("item_name");
/* 1377 */         Object type = this.rs.getString("item_type");
/* 1378 */         Object price = this.rs.getString("item_price");
/* 1379 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1380 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1381 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1382 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1383 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1387 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1389 */     this.jTextField5.setText("menu_table26");
/*      */   }
/*      */   
/*      */   private void jButton28ActionPerformed(ActionEvent evt) {
/* 1393 */     clear();
/*      */     try {
/* 1395 */       String sql = "select * from menu_table16";
/* 1396 */       this.ps = this.conn.prepareStatement(sql);
/* 1397 */       this.rs = this.ps.executeQuery();
/* 1398 */       int i = 0;
/* 1399 */       while (this.rs.next()) {
/* 1400 */         Object code = this.rs.getString("item_code");
/* 1401 */         Object name = this.rs.getString("item_name");
/* 1402 */         Object type = this.rs.getString("item_type");
/* 1403 */         Object price = this.rs.getString("item_price");
/* 1404 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1405 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1406 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1407 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1408 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1412 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1414 */     this.jTextField5.setText("menu_table16");
/*      */   }
/*      */   
/*      */   private void jButton29ActionPerformed(ActionEvent evt) {
/* 1418 */     clear();
/*      */     try {
/* 1420 */       String sql = "select * from menu_table27";
/* 1421 */       this.ps = this.conn.prepareStatement(sql);
/* 1422 */       this.rs = this.ps.executeQuery();
/* 1423 */       int i = 0;
/* 1424 */       while (this.rs.next()) {
/* 1425 */         Object code = this.rs.getString("item_code");
/* 1426 */         Object name = this.rs.getString("item_name");
/* 1427 */         Object type = this.rs.getString("item_type");
/* 1428 */         Object price = this.rs.getString("item_price");
/* 1429 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1430 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1431 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1432 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1433 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1437 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1439 */     this.jTextField5.setText("menu_table27");
/*      */   }
/*      */   
/*      */   private void jButton30ActionPerformed(ActionEvent evt) {
/* 1443 */     clear();
/*      */     try {
/* 1445 */       String sql = "select * from menu_table28";
/* 1446 */       this.ps = this.conn.prepareStatement(sql);
/* 1447 */       this.rs = this.ps.executeQuery();
/* 1448 */       int i = 0;
/* 1449 */       while (this.rs.next()) {
/* 1450 */         Object code = this.rs.getString("item_code");
/* 1451 */         Object name = this.rs.getString("item_name");
/* 1452 */         Object type = this.rs.getString("item_type");
/* 1453 */         Object price = this.rs.getString("item_price");
/* 1454 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1455 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1456 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1457 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1458 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1462 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1464 */     this.jTextField5.setText("menu_table28");
/*      */   }
/*      */   
/*      */   private void jButton32ActionPerformed(ActionEvent evt) {
/* 1468 */     clear();
/*      */     try {
/* 1470 */       String sql = "select * from menu_table23";
/* 1471 */       this.ps = this.conn.prepareStatement(sql);
/* 1472 */       this.rs = this.ps.executeQuery();
/* 1473 */       int i = 0;
/* 1474 */       while (this.rs.next()) {
/* 1475 */         Object code = this.rs.getString("item_code");
/* 1476 */         Object name = this.rs.getString("item_name");
/* 1477 */         Object type = this.rs.getString("item_type");
/* 1478 */         Object price = this.rs.getString("item_price");
/* 1479 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1480 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1481 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1482 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1483 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1487 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1489 */     this.jTextField5.setText("menu_table23");
/*      */   }
/*      */   
/*      */   private void jButton31ActionPerformed(ActionEvent evt)
/*      */   {
/* 1494 */     AdminPanel a = new AdminPanel();
/* 1495 */     a.setVisible(true);
/* 1496 */     if (a.isVisible() == true) {
/* 1497 */       close();
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton33ActionPerformed(ActionEvent evt) {
/* 1502 */     clear();
/*      */     try {
/* 1504 */       String sql = "select * from menu_table30";
/* 1505 */       this.ps = this.conn.prepareStatement(sql);
/* 1506 */       this.rs = this.ps.executeQuery();
/* 1507 */       int i = 0;
/* 1508 */       while (this.rs.next()) {
/* 1509 */         Object code = this.rs.getString("item_code");
/* 1510 */         Object name = this.rs.getString("item_name");
/* 1511 */         Object type = this.rs.getString("item_type");
/* 1512 */         Object price = this.rs.getString("item_price");
/* 1513 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1514 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1515 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1516 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1517 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1521 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1523 */     this.jTextField5.setText("menu_table30");
/*      */   }
/*      */   
/*      */   private void jButton34ActionPerformed(ActionEvent evt) {
/* 1527 */     clear();
/*      */     try {
/* 1529 */       String sql = "select * from menu_table29";
/* 1530 */       this.ps = this.conn.prepareStatement(sql);
/* 1531 */       this.rs = this.ps.executeQuery();
/* 1532 */       int i = 0;
/* 1533 */       while (this.rs.next()) {
/* 1534 */         Object code = this.rs.getString("item_code");
/* 1535 */         Object name = this.rs.getString("item_name");
/* 1536 */         Object type = this.rs.getString("item_type");
/* 1537 */         Object price = this.rs.getString("item_price");
/* 1538 */         this.jTable1.getModel().setValueAt(code, i, 0);
/* 1539 */         this.jTable1.getModel().setValueAt(name, i, 1);
/* 1540 */         this.jTable1.getModel().setValueAt(type, i, 2);
/* 1541 */         this.jTable1.getModel().setValueAt(price, i, 3);
/* 1542 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1546 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1548 */     this.jTextField5.setText("menu_table29");
/*      */   }
/*      */   
/*      */   private JButton jButton21;
/*      */   private JButton jButton22;
/*      */   private JButton jButton23;
/*      */   private JButton jButton24;
/*      */   private JButton jButton25;
/*      */   private JButton jButton26;
/*      */   private JButton jButton27;
/*      */   private JButton jButton28;
/*      */   private JButton jButton29;
/*      */   public static void main(String[] args) {
/* 1561 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1562 */         if ("Nimbus".equals(info.getName())) {
/* 1563 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1564 */           break;
/*      */         }
/*      */       }
/*      */     } catch (ClassNotFoundException ex) {
/* 1568 */       Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 1570 */       Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 1572 */       Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1574 */       Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1579 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 1581 */         new Edit().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */ 
/*      */   private JButton jButton3;
/*      */   
/*      */   private JButton jButton30;
/*      */   
/*      */   private JButton jButton31;
/*      */   
/*      */   private JButton jButton32;
/*      */   
/*      */   private JButton jButton33;
/*      */   
/*      */   private JButton jButton34;
/*      */   
/*      */   private JButton jButton4;
/*      */   
/*      */   private JButton jButton5;
/*      */   
/*      */   private JButton jButton6;
/*      */   
/*      */   private JButton jButton7;
/*      */   
/*      */   private JButton jButton8;
/*      */   
/*      */   private JButton jButton9;
/*      */   
/*      */   private javax.swing.JLabel jLabel1;
/*      */   
/*      */   private javax.swing.JPanel jPanel1;
/*      */   
/*      */   private javax.swing.JPanel jPanel2;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   
/*      */   private JTable jTable1;
/*      */   
/*      */   private JTextField jTextField1;
/*      */   
/*      */   private JTextField jTextField2;
/*      */   
/*      */   private JTextField jTextField3;
/*      */   
/*      */   private JTextField jTextField4;
/*      */   
/*      */   private JTextField jTextField5;
/*      */   
/*      */   private void clear()
/*      */   {
/* 1633 */     for (int i = 0; i < this.jTable1.getRowCount(); i++) {
/* 1634 */       for (int j = 0; j < this.jTable1.getColumnCount(); j++)
/* 1635 */         this.jTable1.setValueAt("", i, j);
/*      */     }
/*      */   }
/*      */   
/*      */   private void close() {
/* 1640 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 1641 */     java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*      */   }
/*      */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Edit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
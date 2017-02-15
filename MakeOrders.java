/*      */ package resturentapp;
/*      */ 
/*      */ import java.awt.Cursor;
/*      */ import java.awt.Font;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.sql.Connection;
/*      */ import java.sql.PreparedStatement;
/*      */ import java.sql.ResultSet;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Date;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.table.TableModel;
/*      */ 
/*      */ public class MakeOrders extends javax.swing.JFrame
/*      */ {
/*   28 */   Connection conn = JavaConnect.connectDb();
/*   29 */   ResultSet rs = null;
/*   30 */   PreparedStatement ps = null;
/*      */   int orderId;
/*   32 */   int pay = 0;
/*      */   private JButton jButton1;
/*      */   private JButton jButton10;
/*      */   private JButton jButton11;
/*      */   private JButton jButton13;
/*      */   private JButton jButton15;
/*      */   
/*      */   public MakeOrders()
/*      */   {
/*   41 */     initComponents();
/*   42 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*   43 */     int xsize = (int)tk.getScreenSize().getWidth();
/*   44 */     int ysize = (int)tk.getScreenSize().getHeight();
/*   45 */     setSize(xsize, ysize);
/*      */   }
/*      */   
/*      */   private JButton jButton16;
/*      */   private JButton jButton17;
/*      */   
/*   51 */   public MakeOrders(int id) { initComponents();
/*   52 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*   53 */     int xsize = (int)tk.getScreenSize().getWidth();
/*   54 */     int ysize = (int)tk.getScreenSize().getHeight();
/*   55 */     setSize(xsize, ysize);
/*   56 */     this.conn = JavaConnect.connectDb();
/*   57 */     this.orderId = id;
/*   58 */     this.jTextField1.setText(String.valueOf(this.orderId));
/*      */     
/*      */ 
/*   61 */     this.jTextField2.setVisible(false);
/*   62 */     this.jTextField5.setVisible(false); }
/*      */   
/*      */   private JButton jButton18;
/*      */   private JButton jButton19;
/*      */   private JButton jButton2;
/*      */   private JButton jButton20;
/*      */   private JButton jButton21;
/*      */   private JButton jButton22;
/*      */   private JButton jButton23;
/*      */   private JButton jButton24;
/*      */   
/*   73 */   private void initComponents() { this.jPanel1 = new JPanel();
/*   74 */     this.jPanel2 = new JPanel();
/*   75 */     this.jPanel3 = new JPanel();
/*   76 */     this.jButton7 = new JButton();
/*   77 */     this.jButton3 = new JButton();
/*   78 */     this.jButton4 = new JButton();
/*   79 */     this.jButton5 = new JButton();
/*   80 */     this.jButton21 = new JButton();
/*   81 */     this.jButton22 = new JButton();
/*   82 */     this.jButton23 = new JButton();
/*   83 */     this.jButton24 = new JButton();
/*   84 */     this.jButton25 = new JButton();
/*   85 */     this.jButton26 = new JButton();
/*   86 */     this.jButton27 = new JButton();
/*   87 */     this.jButton16 = new JButton();
/*   88 */     this.jButton11 = new JButton();
/*   89 */     this.jButton15 = new JButton();
/*   90 */     this.jButton9 = new JButton();
/*   91 */     this.jButton10 = new JButton();
/*   92 */     this.jButton13 = new JButton();
/*   93 */     this.jButton8 = new JButton();
/*   94 */     this.jButton17 = new JButton();
/*   95 */     this.jButton18 = new JButton();
/*   96 */     this.jButton19 = new JButton();
/*   97 */     this.jButton20 = new JButton();
/*   98 */     this.jButton28 = new JButton();
/*   99 */     this.jButton29 = new JButton();
/*  100 */     this.jButton30 = new JButton();
/*  101 */     this.jButton31 = new JButton();
/*  102 */     this.jButton32 = new JButton();
/*  103 */     this.jButton33 = new JButton();
/*  104 */     this.jButton34 = new JButton();
/*  105 */     this.jLabel1 = new JLabel();
/*  106 */     this.jLabel4 = new JLabel();
/*  107 */     this.jLabel5 = new JLabel();
/*  108 */     this.jLabel6 = new JLabel();
/*  109 */     this.jLabel10 = new JLabel();
/*  110 */     this.jLabel11 = new JLabel();
/*  111 */     this.jLabel12 = new JLabel();
/*  112 */     this.jLabel13 = new JLabel();
/*  113 */     this.jLabel14 = new JLabel();
/*  114 */     this.jLabel15 = new JLabel();
/*  115 */     this.jLabel16 = new JLabel();
/*  116 */     this.jLabel17 = new JLabel();
/*  117 */     this.jLabel18 = new JLabel();
/*  118 */     this.jLabel19 = new JLabel();
/*  119 */     this.jLabel20 = new JLabel();
/*  120 */     this.jLabel21 = new JLabel();
/*  121 */     this.jLabel22 = new JLabel();
/*  122 */     this.jLabel23 = new JLabel();
/*  123 */     this.jLabel24 = new JLabel();
/*  124 */     this.jLabel25 = new JLabel();
/*  125 */     this.jLabel26 = new JLabel();
/*  126 */     this.jLabel27 = new JLabel();
/*  127 */     this.jLabel28 = new JLabel();
/*  128 */     this.jLabel29 = new JLabel();
/*  129 */     this.jLabel31 = new JLabel();
/*  130 */     this.jLabel32 = new JLabel();
/*  131 */     this.jLabel33 = new JLabel();
/*  132 */     this.jLabel35 = new JLabel();
/*  133 */     this.jLabel36 = new JLabel();
/*  134 */     this.jButton35 = new JButton();
/*  135 */     this.jLabel30 = new JLabel();
/*  136 */     this.jPanel4 = new JPanel();
/*  137 */     this.jToggleButton2 = new javax.swing.JToggleButton();
/*  138 */     this.jButton2 = new JButton();
/*  139 */     this.jTextField6 = new JTextField();
/*  140 */     this.jTextField4 = new JTextField();
/*  141 */     this.jLabel7 = new JLabel();
/*  142 */     this.jTextField3 = new JTextField();
/*  143 */     this.jLabel8 = new JLabel();
/*  144 */     this.jLabel2 = new JLabel();
/*  145 */     this.jTextField1 = new JTextField();
/*  146 */     this.jButton1 = new JButton();
/*  147 */     this.jLabel3 = new JLabel();
/*  148 */     this.jScrollPane10 = new javax.swing.JScrollPane();
/*  149 */     this.jTable10 = new JTable();
/*  150 */     this.jTextField2 = new JTextField();
/*  151 */     this.jTextField5 = new JTextField();
/*  152 */     this.jPanel5 = new JPanel();
/*  153 */     this.jScrollPane2 = new javax.swing.JScrollPane();
/*  154 */     this.jList1 = new javax.swing.JList();
/*  155 */     this.jComboBox2 = new javax.swing.JComboBox();
/*      */     
/*  157 */     setDefaultCloseOperation(2);
/*      */     
/*  159 */     this.jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
/*      */     
/*  161 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  162 */     this.jPanel2.setLayout(jPanel2Layout);
/*  163 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  164 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  165 */       .addGap(0, 417, 32767));
/*      */     
/*  167 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  168 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  169 */       .addGap(0, 788, 32767));
/*      */     
/*      */ 
/*  172 */     this.jPanel1.add(this.jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1362, 814, -1, -1));
/*      */     
/*  174 */     this.jButton7.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/chowmein.png")));
/*  175 */     this.jButton7.setBorderPainted(false);
/*  176 */     this.jButton7.setContentAreaFilled(false);
/*  177 */     this.jButton7.setCursor(new Cursor(12));
/*  178 */     this.jButton7.setFocusPainted(false);
/*  179 */     this.jButton7.addFocusListener(new java.awt.event.FocusAdapter() {
/*      */       public void focusGained(java.awt.event.FocusEvent evt) {
/*  181 */         MakeOrders.this.jButton7FocusGained(evt);
/*      */       }
/*  183 */     });
/*  184 */     this.jButton7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  186 */         MakeOrders.this.jButton7ActionPerformed(evt);
/*      */       }
/*      */       
/*  189 */     });
/*  190 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/sizzler.png")));
/*  191 */     this.jButton3.setBorderPainted(false);
/*  192 */     this.jButton3.setContentAreaFilled(false);
/*  193 */     this.jButton3.setCursor(new Cursor(12));
/*  194 */     this.jButton3.setFocusPainted(false);
/*  195 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  197 */         MakeOrders.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  200 */     });
/*  201 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/thukpa.png")));
/*  202 */     this.jButton4.setBorderPainted(false);
/*  203 */     this.jButton4.setContentAreaFilled(false);
/*  204 */     this.jButton4.setCursor(new Cursor(12));
/*  205 */     this.jButton4.setFocusPainted(false);
/*  206 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  208 */         MakeOrders.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  211 */     });
/*  212 */     this.jButton5.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/cutlet.png")));
/*  213 */     this.jButton5.setBorderPainted(false);
/*  214 */     this.jButton5.setContentAreaFilled(false);
/*  215 */     this.jButton5.setCursor(new Cursor(12));
/*  216 */     this.jButton5.setFocusPainted(false);
/*  217 */     this.jButton5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  219 */         MakeOrders.this.jButton5ActionPerformed(evt);
/*      */       }
/*      */       
/*  222 */     });
/*  223 */     this.jButton21.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/roti_paratha.png")));
/*  224 */     this.jButton21.setBorderPainted(false);
/*  225 */     this.jButton21.setContentAreaFilled(false);
/*  226 */     this.jButton21.setCursor(new Cursor(12));
/*  227 */     this.jButton21.setFocusPainted(false);
/*  228 */     this.jButton21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  230 */         MakeOrders.this.jButton21ActionPerformed(evt);
/*      */       }
/*      */       
/*  233 */     });
/*  234 */     this.jButton22.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/toast.png")));
/*  235 */     this.jButton22.setBorderPainted(false);
/*  236 */     this.jButton22.setContentAreaFilled(false);
/*  237 */     this.jButton22.setCursor(new Cursor(12));
/*  238 */     this.jButton22.setFocusPainted(false);
/*  239 */     this.jButton22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  241 */         MakeOrders.this.jButton22ActionPerformed(evt);
/*      */       }
/*      */       
/*  244 */     });
/*  245 */     this.jButton23.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/burger.png")));
/*  246 */     this.jButton23.setBorderPainted(false);
/*  247 */     this.jButton23.setContentAreaFilled(false);
/*  248 */     this.jButton23.setCursor(new Cursor(12));
/*  249 */     this.jButton23.setFocusPainted(false);
/*  250 */     this.jButton23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  252 */         MakeOrders.this.jButton23ActionPerformed(evt);
/*      */       }
/*      */       
/*  255 */     });
/*  256 */     this.jButton24.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/fried_rice.png")));
/*  257 */     this.jButton24.setBorderPainted(false);
/*  258 */     this.jButton24.setContentAreaFilled(false);
/*  259 */     this.jButton24.setCursor(new Cursor(12));
/*  260 */     this.jButton24.setFocusPainted(false);
/*  261 */     this.jButton24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  263 */         MakeOrders.this.jButton24ActionPerformed(evt);
/*      */       }
/*      */       
/*  266 */     });
/*  267 */     this.jButton25.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/spring_roll.png")));
/*  268 */     this.jButton25.setBorderPainted(false);
/*  269 */     this.jButton25.setContentAreaFilled(false);
/*  270 */     this.jButton25.setCursor(new Cursor(12));
/*  271 */     this.jButton25.setFocusPainted(false);
/*  272 */     this.jButton25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  274 */         MakeOrders.this.jButton25ActionPerformed(evt);
/*      */       }
/*      */       
/*  277 */     });
/*  278 */     this.jButton26.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/curry.png")));
/*  279 */     this.jButton26.setBorderPainted(false);
/*  280 */     this.jButton26.setContentAreaFilled(false);
/*  281 */     this.jButton26.setCursor(new Cursor(12));
/*  282 */     this.jButton26.setFocusPainted(false);
/*  283 */     this.jButton26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  285 */         MakeOrders.this.jButton26ActionPerformed(evt);
/*      */       }
/*      */       
/*  288 */     });
/*  289 */     this.jButton27.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/sandwich.png")));
/*  290 */     this.jButton27.setBorderPainted(false);
/*  291 */     this.jButton27.setContentAreaFilled(false);
/*  292 */     this.jButton27.setCursor(new Cursor(12));
/*  293 */     this.jButton27.setFocusPainted(false);
/*  294 */     this.jButton27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  296 */         MakeOrders.this.jButton27ActionPerformed(evt);
/*      */       }
/*      */       
/*  299 */     });
/*  300 */     this.jButton16.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/pakauda.png")));
/*  301 */     this.jButton16.setBorderPainted(false);
/*  302 */     this.jButton16.setContentAreaFilled(false);
/*  303 */     this.jButton16.setCursor(new Cursor(12));
/*  304 */     this.jButton16.setFocusPainted(false);
/*  305 */     this.jButton16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  307 */         MakeOrders.this.jButton16ActionPerformed(evt);
/*      */       }
/*      */       
/*  310 */     });
/*  311 */     this.jButton11.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/khaja_set.png")));
/*  312 */     this.jButton11.setBorderPainted(false);
/*  313 */     this.jButton11.setContentAreaFilled(false);
/*  314 */     this.jButton11.setCursor(new Cursor(12));
/*  315 */     this.jButton11.setFocusPainted(false);
/*  316 */     this.jButton11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  318 */         MakeOrders.this.jButton11ActionPerformed(evt);
/*      */       }
/*      */       
/*  321 */     });
/*  322 */     this.jButton15.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/sasauge.png")));
/*  323 */     this.jButton15.setBorderPainted(false);
/*  324 */     this.jButton15.setContentAreaFilled(false);
/*  325 */     this.jButton15.setCursor(new Cursor(12));
/*  326 */     this.jButton15.setFocusPainted(false);
/*  327 */     this.jButton15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  329 */         MakeOrders.this.jButton15ActionPerformed(evt);
/*      */       }
/*      */       
/*  332 */     });
/*  333 */     this.jButton9.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/momo.png")));
/*  334 */     this.jButton9.setBorderPainted(false);
/*  335 */     this.jButton9.setContentAreaFilled(false);
/*  336 */     this.jButton9.setCursor(new Cursor(12));
/*  337 */     this.jButton9.setFocusPainted(false);
/*  338 */     this.jButton9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  340 */         MakeOrders.this.jButton9ActionPerformed(evt);
/*      */       }
/*      */       
/*  343 */     });
/*  344 */     this.jButton10.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/veg_snacks.png")));
/*  345 */     this.jButton10.setBorderPainted(false);
/*  346 */     this.jButton10.setContentAreaFilled(false);
/*  347 */     this.jButton10.setCursor(new Cursor(12));
/*  348 */     this.jButton10.setFocusPainted(false);
/*  349 */     this.jButton10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  351 */         MakeOrders.this.jButton10ActionPerformed(evt);
/*      */       }
/*      */       
/*  354 */     });
/*  355 */     this.jButton13.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/biryani.png")));
/*  356 */     this.jButton13.setBorderPainted(false);
/*  357 */     this.jButton13.setContentAreaFilled(false);
/*  358 */     this.jButton13.setCursor(new Cursor(12));
/*  359 */     this.jButton13.setFocusPainted(false);
/*  360 */     this.jButton13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  362 */         MakeOrders.this.jButton13ActionPerformed(evt);
/*      */       }
/*      */       
/*  365 */     });
/*  366 */     this.jButton8.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/chopsuey.png")));
/*  367 */     this.jButton8.setBorderPainted(false);
/*  368 */     this.jButton8.setContentAreaFilled(false);
/*  369 */     this.jButton8.setCursor(new Cursor(12));
/*  370 */     this.jButton8.setFocusPainted(false);
/*  371 */     this.jButton8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  373 */         MakeOrders.this.jButton8ActionPerformed(evt);
/*      */       }
/*      */       
/*  376 */     });
/*  377 */     this.jButton17.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/katti_roll.png")));
/*  378 */     this.jButton17.setBorderPainted(false);
/*  379 */     this.jButton17.setContentAreaFilled(false);
/*  380 */     this.jButton17.setCursor(new Cursor(12));
/*  381 */     this.jButton17.setFocusPainted(false);
/*  382 */     this.jButton17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  384 */         MakeOrders.this.jButton17ActionPerformed(evt);
/*      */       }
/*      */       
/*  387 */     });
/*  388 */     this.jButton18.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/hot_beverage.png")));
/*  389 */     this.jButton18.setBorderPainted(false);
/*  390 */     this.jButton18.setContentAreaFilled(false);
/*  391 */     this.jButton18.setCursor(new Cursor(12));
/*  392 */     this.jButton18.setFocusPainted(false);
/*  393 */     this.jButton18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  395 */         MakeOrders.this.jButton18ActionPerformed(evt);
/*      */       }
/*      */       
/*  398 */     });
/*  399 */     this.jButton19.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/boiled.png")));
/*  400 */     this.jButton19.setBorderPainted(false);
/*  401 */     this.jButton19.setContentAreaFilled(false);
/*  402 */     this.jButton19.setCursor(new Cursor(12));
/*  403 */     this.jButton19.setFocusPainted(false);
/*  404 */     this.jButton19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  406 */         MakeOrders.this.jButton19ActionPerformed(evt);
/*      */       }
/*      */       
/*  409 */     });
/*  410 */     this.jButton20.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/salad.png")));
/*  411 */     this.jButton20.setBorderPainted(false);
/*  412 */     this.jButton20.setContentAreaFilled(false);
/*  413 */     this.jButton20.setCursor(new Cursor(12));
/*  414 */     this.jButton20.setFocusPainted(false);
/*  415 */     this.jButton20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  417 */         MakeOrders.this.jButton20ActionPerformed(evt);
/*      */       }
/*      */       
/*  420 */     });
/*  421 */     this.jButton28.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/coldbeverage.png")));
/*  422 */     this.jButton28.setBorderPainted(false);
/*  423 */     this.jButton28.setContentAreaFilled(false);
/*  424 */     this.jButton28.setCursor(new Cursor(12));
/*  425 */     this.jButton28.setFocusPainted(false);
/*  426 */     this.jButton28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  428 */         MakeOrders.this.jButton28ActionPerformed(evt);
/*      */       }
/*      */       
/*  431 */     });
/*  432 */     this.jButton29.setBorderPainted(false);
/*  433 */     this.jButton29.setContentAreaFilled(false);
/*  434 */     this.jButton29.setCursor(new Cursor(12));
/*  435 */     this.jButton29.setFocusPainted(false);
/*  436 */     this.jButton29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  438 */         MakeOrders.this.jButton29ActionPerformed(evt);
/*      */       }
/*      */       
/*  441 */     });
/*  442 */     this.jButton30.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/soup.png")));
/*  443 */     this.jButton30.setBorderPainted(false);
/*  444 */     this.jButton30.setContentAreaFilled(false);
/*  445 */     this.jButton30.setCursor(new Cursor(12));
/*  446 */     this.jButton30.setFocusPainted(false);
/*  447 */     this.jButton30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  449 */         MakeOrders.this.jButton30ActionPerformed(evt);
/*      */       }
/*      */       
/*  452 */     });
/*  453 */     this.jButton31.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/khana_set.png")));
/*  454 */     this.jButton31.setBorderPainted(false);
/*  455 */     this.jButton31.setContentAreaFilled(false);
/*  456 */     this.jButton31.setCursor(new Cursor(12));
/*  457 */     this.jButton31.setFocusPainted(false);
/*  458 */     this.jButton31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  460 */         MakeOrders.this.jButton31ActionPerformed(evt);
/*      */       }
/*      */       
/*  463 */     });
/*  464 */     this.jButton32.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/lassi.png")));
/*  465 */     this.jButton32.setBorderPainted(false);
/*  466 */     this.jButton32.setContentAreaFilled(false);
/*  467 */     this.jButton32.setCursor(new Cursor(12));
/*  468 */     this.jButton32.setFocusPainted(false);
/*  469 */     this.jButton32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  471 */         MakeOrders.this.jButton32ActionPerformed(evt);
/*      */       }
/*      */       
/*  474 */     });
/*  475 */     this.jButton33.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/pizza.png")));
/*  476 */     this.jButton33.setBorderPainted(false);
/*  477 */     this.jButton33.setContentAreaFilled(false);
/*  478 */     this.jButton33.setCursor(new Cursor(12));
/*  479 */     this.jButton33.setFocusPainted(false);
/*  480 */     this.jButton33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  482 */         MakeOrders.this.jButton33ActionPerformed(evt);
/*      */       }
/*      */       
/*  485 */     });
/*  486 */     this.jButton34.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/cigratte.jpg")));
/*  487 */     this.jButton34.setBorderPainted(false);
/*  488 */     this.jButton34.setContentAreaFilled(false);
/*  489 */     this.jButton34.setCursor(new Cursor(12));
/*  490 */     this.jButton34.setFocusPainted(false);
/*  491 */     this.jButton34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  493 */         MakeOrders.this.jButton34ActionPerformed(evt);
/*      */       }
/*      */       
/*  496 */     });
/*  497 */     this.jLabel1.setFont(new Font("Montserrat", 0, 14));
/*  498 */     this.jLabel1.setText("THUKPA");
/*      */     
/*  500 */     this.jLabel4.setFont(new Font("Montserrat", 0, 14));
/*  501 */     this.jLabel4.setText("SOUP");
/*      */     
/*  503 */     this.jLabel5.setFont(new Font("Montserrat", 0, 14));
/*  504 */     this.jLabel5.setText("CHOWMIN");
/*      */     
/*  506 */     this.jLabel6.setFont(new Font("Montserrat", 0, 14));
/*  507 */     this.jLabel6.setText("BIRYANI");
/*      */     
/*  509 */     this.jLabel10.setFont(new Font("Montserrat", 0, 14));
/*  510 */     this.jLabel10.setText("FRIED RICE");
/*      */     
/*  512 */     this.jLabel11.setFont(new Font("Montserrat", 0, 14));
/*  513 */     this.jLabel11.setText("FRIED RICE");
/*      */     
/*  515 */     this.jLabel12.setFont(new Font("Montserrat", 0, 14));
/*  516 */     this.jLabel12.setText("KHANA SET");
/*      */     
/*  518 */     this.jLabel13.setFont(new Font("Montserrat", 0, 14));
/*  519 */     this.jLabel13.setText("BOILED ITEMS");
/*      */     
/*  521 */     this.jLabel14.setFont(new Font("Montserrat", 0, 14));
/*  522 */     this.jLabel14.setText("PAKAUDA");
/*      */     
/*  524 */     this.jLabel15.setFont(new Font("Montserrat", 0, 14));
/*  525 */     this.jLabel15.setText("CHOPSUEY");
/*      */     
/*  527 */     this.jLabel16.setFont(new Font("Montserrat", 0, 14));
/*  528 */     this.jLabel16.setText("KHAJA SET");
/*      */     
/*  530 */     this.jLabel17.setFont(new Font("Montserrat", 0, 14));
/*  531 */     this.jLabel17.setText("KATTI ROLL");
/*      */     
/*  533 */     this.jLabel18.setFont(new Font("Montserrat", 0, 14));
/*  534 */     this.jLabel18.setText("SALAD");
/*      */     
/*  536 */     this.jLabel19.setFont(new Font("Montserrat", 0, 14));
/*  537 */     this.jLabel19.setText("SANDWITCH");
/*      */     
/*  539 */     this.jLabel20.setFont(new Font("Montserrat", 0, 14));
/*  540 */     this.jLabel20.setText("LASSI");
/*      */     
/*  542 */     this.jLabel21.setFont(new Font("Montserrat", 0, 14));
/*  543 */     this.jLabel21.setText("SIZZLER");
/*      */     
/*  545 */     this.jLabel22.setFont(new Font("Montserrat", 0, 14));
/*  546 */     this.jLabel22.setText("CUTLET");
/*      */     
/*  548 */     this.jLabel23.setFont(new Font("Montserrat", 0, 14));
/*  549 */     this.jLabel23.setText("CURRY");
/*      */     
/*  551 */     this.jLabel24.setFont(new Font("Montserrat", 0, 14));
/*  552 */     this.jLabel24.setText("HOT BEVERAGE");
/*      */     
/*  554 */     this.jLabel25.setFont(new Font("Montserrat", 0, 14));
/*  555 */     this.jLabel25.setText("SAUSAGE");
/*      */     
/*  557 */     this.jLabel26.setFont(new Font("Montserrat", 0, 14));
/*  558 */     this.jLabel26.setText("BURGER");
/*      */     
/*  560 */     this.jLabel27.setFont(new Font("Montserrat", 0, 14));
/*  561 */     this.jLabel27.setText("SPRING ROLL");
/*      */     
/*  563 */     this.jLabel28.setFont(new Font("Montserrat", 0, 14));
/*  564 */     this.jLabel28.setText("CIGRATTE/LIQUOR");
/*      */     
/*  566 */     this.jLabel29.setFont(new Font("Montserrat", 0, 14));
/*  567 */     this.jLabel29.setText("MOMO");
/*      */     
/*  569 */     this.jLabel31.setFont(new Font("Montserrat", 0, 14));
/*  570 */     this.jLabel31.setText("TOAST/OMLETTE");
/*      */     
/*  572 */     this.jLabel32.setFont(new Font("Montserrat", 0, 14));
/*  573 */     this.jLabel32.setText("SNACKS VEG");
/*      */     
/*  575 */     this.jLabel33.setFont(new Font("Montserrat", 0, 14));
/*  576 */     this.jLabel33.setText("ROTI/PARAUTHA");
/*      */     
/*  578 */     this.jLabel35.setFont(new Font("Montserrat", 0, 14));
/*  579 */     this.jLabel35.setText("PIZZA");
/*      */     
/*  581 */     this.jLabel36.setFont(new Font("Montserrat", 0, 14));
/*  582 */     this.jLabel36.setText("COLD BEVERAGE");
/*      */     
/*  584 */     this.jButton35.setIcon(new ImageIcon(getClass().getResource("/resturentapp/foods/non_veg.png")));
/*  585 */     this.jButton35.setBorderPainted(false);
/*  586 */     this.jButton35.setContentAreaFilled(false);
/*  587 */     this.jButton35.setCursor(new Cursor(12));
/*  588 */     this.jButton35.setFocusPainted(false);
/*  589 */     this.jButton35.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  591 */         MakeOrders.this.jButton35ActionPerformed(evt);
/*      */       }
/*      */       
/*  594 */     });
/*  595 */     this.jLabel30.setFont(new Font("Montserrat", 0, 14));
/*  596 */     this.jLabel30.setText("SNACKS NON");
/*      */     
/*  598 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*  599 */     this.jPanel3.setLayout(jPanel3Layout);
/*  600 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/*  601 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  602 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  603 */       .addContainerGap()
/*  604 */       .addComponent(this.jLabel5, -2, 79, -2)
/*  605 */       .addGap(71, 71, 71)
/*  606 */       .addComponent(this.jLabel21, -2, 79, -2)
/*  607 */       .addGap(63, 63, 63)
/*  608 */       .addComponent(this.jLabel33, -2, 120, -2)
/*  609 */       .addGap(18, 18, 18)
/*  610 */       .addComponent(this.jLabel31, -2, 120, -2)
/*  611 */       .addGap(18, 18, 18)
/*  612 */       .addComponent(this.jLabel29, -2, 79, -2)
/*  613 */       .addContainerGap(-1, 32767))
/*  614 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  615 */       .addGap(10, 10, 10)
/*  616 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  617 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  618 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  619 */       .addComponent(this.jButton7, -2, 92, -2)
/*  620 */       .addComponent(this.jLabel1, -2, 79, -2))
/*  621 */       .addGap(51, 51, 51)
/*  622 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  623 */       .addComponent(this.jButton3, -2, 92, -2)
/*  624 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  625 */       .addGap(10, 10, 10)
/*  626 */       .addComponent(this.jLabel22, -2, 79, -2)))
/*  627 */       .addGap(50, 50, 50)
/*  628 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  629 */       .addComponent(this.jButton21, -2, 90, -2)
/*  630 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  631 */       .addGap(10, 10, 10)
/*  632 */       .addComponent(this.jLabel23, -2, 79, -2)))
/*  633 */       .addGap(50, 50, 50)
/*  634 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  635 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  636 */       .addGap(10, 10, 10)
/*  637 */       .addComponent(this.jLabel26, -2, 79, -2))
/*  638 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  639 */       .addComponent(this.jButton22, -2, 92, -2)
/*  640 */       .addGap(50, 50, 50)
/*  641 */       .addComponent(this.jButton9, -2, 92, -2))))
/*  642 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  643 */       .addComponent(this.jButton8, -2, 92, -2)
/*  644 */       .addGap(50, 50, 50)
/*  645 */       .addComponent(this.jButton31, -2, 92, -2)
/*  646 */       .addGap(51, 51, 51)
/*  647 */       .addComponent(this.jButton32, -2, 92, -2)
/*  648 */       .addGap(50, 50, 50)
/*  649 */       .addComponent(this.jButton33, -2, 92, -2)
/*  650 */       .addGap(48, 48, 48)
/*  651 */       .addComponent(this.jButton29, -2, 92, -2))
/*  652 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  653 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  654 */       .addComponent(this.jButton24, -2, 92, -2)
/*  655 */       .addComponent(this.jLabel4, -2, 70, -2))
/*  656 */       .addGap(53, 53, 53)
/*  657 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  658 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  659 */       .addComponent(this.jButton25, -2, 92, -2)
/*  660 */       .addGap(50, 50, 50)
/*  661 */       .addComponent(this.jButton11, -2, 92, -2)
/*  662 */       .addGap(45, 45, 45)
/*  663 */       .addComponent(this.jButton27, -2, 92, -2))
/*  664 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  665 */       .addGap(147, 147, 147)
/*  666 */       .addComponent(this.jLabel17, -2, 100, -2)
/*  667 */       .addGap(45, 45, 45)
/*  668 */       .addComponent(this.jLabel24)))
/*  669 */       .addGap(19, 19, 19)
/*  670 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  671 */       .addComponent(this.jLabel32)
/*  672 */       .addComponent(this.jButton10, -2, 91, -2)))
/*  673 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  674 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  675 */       .addComponent(this.jButton30, -2, 92, -2)
/*  676 */       .addComponent(this.jLabel6, -2, 79, -2))
/*  677 */       .addGap(50, 50, 50)
/*  678 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  679 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  680 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  681 */       .addComponent(this.jLabel14, -2, 79, -2)
/*  682 */       .addComponent(this.jButton16, -2, 92, -2))
/*  683 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  684 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  685 */       .addGap(53, 53, 53)
/*  686 */       .addComponent(this.jButton17, -2, 92, -2)
/*  687 */       .addGap(49, 49, 49)
/*  688 */       .addComponent(this.jButton18, -2, 92, -2)
/*  689 */       .addGap(47, 47, 47)
/*  690 */       .addComponent(this.jButton35, -2, 92, -2))
/*  691 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  692 */       .addGap(333, 333, 333)
/*  693 */       .addComponent(this.jLabel30))))
/*  694 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  695 */       .addGap(10, 10, 10)
/*  696 */       .addComponent(this.jLabel13)
/*  697 */       .addGap(38, 38, 38)
/*  698 */       .addComponent(this.jLabel18, -2, 79, -2)
/*  699 */       .addGap(61, 61, 61)
/*  700 */       .addComponent(this.jLabel36, -2, 130, -2)
/*  701 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  702 */       .addComponent(this.jLabel28))))
/*  703 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  704 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  705 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  706 */       .addComponent(this.jButton13, -2, 92, -2)
/*  707 */       .addGap(50, 50, 50)
/*  708 */       .addComponent(this.jButton19, -2, 92, -2))
/*  709 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  710 */       .addComponent(this.jLabel15)
/*  711 */       .addGap(71, 71, 71)
/*  712 */       .addComponent(this.jLabel12, -2, 92, -2)))
/*  713 */       .addGap(45, 45, 45)
/*  714 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  715 */       .addComponent(this.jButton20, -2, 92, -2)
/*  716 */       .addComponent(this.jLabel20, -2, 79, -2))
/*  717 */       .addGap(48, 48, 48)
/*  718 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  719 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  720 */       .addComponent(this.jButton28, -2, 92, -2)
/*  721 */       .addGap(48, 48, 48)
/*  722 */       .addComponent(this.jButton34, -2, 92, -2))
/*  723 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  724 */       .addGap(10, 10, 10)
/*  725 */       .addComponent(this.jLabel35, -2, 79, -2))))
/*  726 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  727 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  728 */       .addComponent(this.jButton4, -2, 92, -2)
/*  729 */       .addComponent(this.jLabel10))
/*  730 */       .addGap(53, 53, 53)
/*  731 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  732 */       .addComponent(this.jButton5, -2, 90, -2)
/*  733 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  734 */       .addGap(10, 10, 10)
/*  735 */       .addComponent(this.jLabel27)))
/*  736 */       .addGap(35, 35, 35)
/*  737 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  738 */       .addComponent(this.jButton26, -2, 92, -2)
/*  739 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  740 */       .addGap(10, 10, 10)
/*  741 */       .addComponent(this.jLabel16, -2, 79, -2)))
/*  742 */       .addGap(49, 49, 49)
/*  743 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  744 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  745 */       .addGap(10, 10, 10)
/*  746 */       .addComponent(this.jLabel19))
/*  747 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  748 */       .addComponent(this.jButton23, -2, 92, -2)
/*  749 */       .addGap(49, 49, 49)
/*  750 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  751 */       .addComponent(this.jLabel25, -2, 79, -2)
/*  752 */       .addComponent(this.jButton15, -2, 90, -2))))))
/*  753 */       .addGap(0, 0, 32767)));
/*      */     
/*  755 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/*  756 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  757 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  758 */       .addGap(10, 10, 10)
/*  759 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  760 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  761 */       .addComponent(this.jLabel21, -2, 20, -2)
/*  762 */       .addComponent(this.jLabel5, -2, 20, -2))
/*  763 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  764 */       .addComponent(this.jLabel31, -2, 20, -2)
/*  765 */       .addComponent(this.jLabel33, -2, 20, -2)
/*  766 */       .addComponent(this.jLabel29, -2, 20, -2)))
/*  767 */       .addGap(7, 7, 7)
/*  768 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  769 */       .addComponent(this.jButton7, -2, 70, -2)
/*  770 */       .addComponent(this.jButton3, -2, 70, -2)
/*  771 */       .addComponent(this.jButton21, -2, 72, -2)
/*  772 */       .addComponent(this.jButton22, -2, 72, -2)
/*  773 */       .addComponent(this.jButton9, -2, 72, -2))
/*  774 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  775 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  776 */       .addGap(9, 9, 9)
/*  777 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  778 */       .addComponent(this.jLabel1, -2, 20, -2)
/*  779 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  780 */       .addGap(2, 2, 2)
/*  781 */       .addComponent(this.jLabel23, -2, 20, -2))))
/*  782 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  783 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  784 */       .addComponent(this.jLabel22, -2, 20, -2))
/*  785 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  786 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  787 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  788 */       .addComponent(this.jLabel25, -2, 20, -2)
/*  789 */       .addComponent(this.jLabel26, -2, 20, -2))))
/*  790 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  791 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  792 */       .addComponent(this.jButton4, -2, 72, -2)
/*  793 */       .addComponent(this.jButton5, -2, 72, -2)
/*  794 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  795 */       .addGap(2, 2, 2)
/*  796 */       .addComponent(this.jButton26, -2, 72, -2))
/*  797 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  798 */       .addGap(4, 4, 4)
/*  799 */       .addComponent(this.jButton23, -2, 70, -2))
/*  800 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  801 */       .addGap(2, 2, 2)
/*  802 */       .addComponent(this.jButton15, -2, 70, -2)))
/*  803 */       .addGap(11, 11, 11)
/*  804 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  805 */       .addComponent(this.jLabel10, -2, 20, -2)
/*  806 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  807 */       .addComponent(this.jLabel16, -2, 20, -2)
/*  808 */       .addComponent(this.jLabel27, -2, 20, -2))
/*  809 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  810 */       .addComponent(this.jLabel19, -2, 20, -2)
/*  811 */       .addComponent(this.jLabel32, -2, 20, -2)))
/*  812 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  813 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  814 */       .addComponent(this.jButton24, -2, 73, -2)
/*  815 */       .addComponent(this.jButton25, -2, 73, -2)
/*  816 */       .addComponent(this.jButton11, -2, 70, -2)
/*  817 */       .addComponent(this.jButton27, -2, 70, -2)
/*  818 */       .addComponent(this.jButton10, -2, 70, -2))
/*  819 */       .addGap(11, 11, 11)
/*  820 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  821 */       .addComponent(this.jLabel4)
/*  822 */       .addComponent(this.jLabel14, -2, 20, -2)
/*  823 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  824 */       .addGap(1, 1, 1)
/*  825 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  826 */       .addComponent(this.jLabel24, -2, 20, -2)
/*  827 */       .addComponent(this.jLabel17, -2, 20, -2)
/*  828 */       .addComponent(this.jLabel30, -2, 20, -2))))
/*  829 */       .addGap(5, 5, 5)
/*  830 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  831 */       .addComponent(this.jButton30, -2, 70, -2)
/*  832 */       .addComponent(this.jButton16, -2, 70, -2)
/*  833 */       .addComponent(this.jButton17, -2, 70, -2)
/*  834 */       .addComponent(this.jButton18, -2, 70, -2)
/*  835 */       .addComponent(this.jButton35, -2, 70, -2))
/*  836 */       .addGap(15, 15, 15)
/*  837 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  838 */       .addComponent(this.jLabel6, -2, 20, -2)
/*  839 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  840 */       .addComponent(this.jLabel18, -2, 20, -2)
/*  841 */       .addComponent(this.jLabel13, -2, 20, -2))
/*  842 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  843 */       .addComponent(this.jLabel36, -2, 20, -2)
/*  844 */       .addComponent(this.jLabel28, -2, 20, -2)))
/*  845 */       .addGap(2, 2, 2)
/*  846 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  847 */       .addComponent(this.jButton13, -2, 70, -2)
/*  848 */       .addComponent(this.jButton19, -2, 70, -2)
/*  849 */       .addComponent(this.jButton20, -2, 70, -2)
/*  850 */       .addComponent(this.jButton28, -2, 70, -2)
/*  851 */       .addComponent(this.jButton34, -2, 70, -2))
/*  852 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  853 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  854 */       .addGap(11, 11, 11)
/*  855 */       .addComponent(this.jLabel15, -2, 20, -2))
/*  856 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  857 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  858 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  859 */       .addComponent(this.jLabel12, GroupLayout.Alignment.TRAILING, -2, 20, -2)
/*  860 */       .addComponent(this.jLabel20, -2, 20, -2)))
/*  861 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  862 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  863 */       .addComponent(this.jLabel35, -2, 20, -2)))
/*  864 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  865 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  866 */       .addComponent(this.jButton8, -2, 70, -2)
/*  867 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  868 */       .addGap(1, 1, 1)
/*  869 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  870 */       .addComponent(this.jButton31, -2, 70, -2)
/*  871 */       .addComponent(this.jButton32, -2, 70, -2)
/*  872 */       .addComponent(this.jButton33, -2, 69, -2)
/*  873 */       .addComponent(this.jButton29, -2, 70, -2))))));
/*      */     
/*      */ 
/*  876 */     this.jPanel1.add(this.jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 69, -1, -1));
/*      */     
/*  878 */     this.jPanel4.setBackground(new java.awt.Color(245, 245, 245));
/*      */     
/*  880 */     this.jToggleButton2.setFont(new Font("Montserrat Hairline", 0, 12));
/*  881 */     this.jToggleButton2.setIcon(new ImageIcon(getClass().getResource("/resturentapp/right-arrow.png")));
/*  882 */     this.jToggleButton2.setBorderPainted(false);
/*  883 */     this.jToggleButton2.setContentAreaFilled(false);
/*  884 */     this.jToggleButton2.setFocusPainted(false);
/*  885 */     this.jToggleButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  887 */         MakeOrders.this.jToggleButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  890 */     });
/*  891 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 24));
/*  892 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/resturentapp/search-256.png")));
/*  893 */     this.jButton2.setText("  Search");
/*  894 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  896 */         MakeOrders.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  899 */     });
/*  900 */     this.jTextField6.setFont(new Font("Poppins Light", 0, 18));
/*  901 */     this.jTextField6.setForeground(new java.awt.Color(153, 153, 153));
/*  902 */     this.jTextField6.setText("Item Code");
/*  903 */     this.jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  905 */         MakeOrders.this.jTextField6MouseClicked(evt);
/*      */       }
/*      */       
/*  908 */     });
/*  909 */     this.jTextField4.setEditable(false);
/*  910 */     this.jTextField4.setFont(new Font("Poppins Light", 0, 18));
/*      */     
/*  912 */     this.jLabel7.setFont(new Font("Montserrat Hairline", 0, 24));
/*  913 */     this.jLabel7.setText("Type");
/*      */     
/*  915 */     this.jTextField3.setEditable(false);
/*  916 */     this.jTextField3.setFont(new Font("Poppins Light", 0, 18));
/*      */     
/*  918 */     this.jLabel8.setFont(new Font("Montserrat Hairline", 0, 24));
/*  919 */     this.jLabel8.setText("Name");
/*      */     
/*  921 */     this.jLabel2.setFont(new Font("Montserrat Hairline", 0, 24));
/*  922 */     this.jLabel2.setText("Table No.");
/*      */     
/*  924 */     this.jTextField1.setEditable(false);
/*  925 */     this.jTextField1.setFont(new Font("Poppins Light", 0, 18));
/*  926 */     this.jTextField1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  928 */         MakeOrders.this.jTextField1ActionPerformed(evt);
/*      */       }
/*      */       
/*  931 */     });
/*  932 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 14));
/*  933 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/resturentapp/left-arrow.png")));
/*  934 */     this.jButton1.setBorderPainted(false);
/*  935 */     this.jButton1.setContentAreaFilled(false);
/*  936 */     this.jButton1.setFocusPainted(false);
/*  937 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  939 */         MakeOrders.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  942 */     });
/*  943 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/*  944 */     this.jPanel4.setLayout(jPanel4Layout);
/*  945 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout
/*  946 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  947 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  948 */       .addContainerGap()
/*  949 */       .addComponent(this.jButton1)
/*  950 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  951 */       .addComponent(this.jLabel2)
/*  952 */       .addGap(18, 18, 18)
/*  953 */       .addComponent(this.jTextField1, -2, 103, -2)
/*  954 */       .addGap(40, 40, 40)
/*  955 */       .addComponent(this.jLabel8)
/*  956 */       .addGap(18, 18, 18)
/*  957 */       .addComponent(this.jTextField3, -2, 170, -2)
/*  958 */       .addGap(42, 42, 42)
/*  959 */       .addComponent(this.jLabel7)
/*  960 */       .addGap(18, 18, 18)
/*  961 */       .addComponent(this.jTextField4, -2, 103, -2)
/*  962 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, 32767)
/*  963 */       .addComponent(this.jTextField6, -2, 103, -2)
/*  964 */       .addGap(27, 27, 27)
/*  965 */       .addComponent(this.jButton2)
/*  966 */       .addGap(42, 42, 42)
/*  967 */       .addComponent(this.jToggleButton2)
/*  968 */       .addGap(67, 67, 67)));
/*      */     
/*  970 */     jPanel4Layout.setVerticalGroup(jPanel4Layout
/*  971 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  972 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  973 */       .addContainerGap()
/*  974 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  975 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  976 */       .addComponent(this.jToggleButton2, -2, 39, -2)
/*  977 */       .addGap(0, 0, 32767))
/*  978 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  979 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  980 */       .addComponent(this.jButton2, -1, -1, 32767)
/*  981 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  982 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  983 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  984 */       .addComponent(this.jLabel8)
/*  985 */       .addComponent(this.jTextField3, -2, 40, -2)
/*  986 */       .addComponent(this.jLabel7)
/*  987 */       .addComponent(this.jTextField4, -2, 40, -2)
/*  988 */       .addComponent(this.jTextField6, -2, 40, -2))
/*  989 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  990 */       .addComponent(this.jTextField1, -2, 41, -2)
/*  991 */       .addComponent(this.jLabel2, -2, 23, -2))
/*  992 */       .addComponent(this.jButton1))
/*  993 */       .addGap(0, 0, 32767)))
/*  994 */       .addContainerGap()))));
/*      */     
/*      */ 
/*  997 */     this.jPanel1.add(this.jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
/*      */     
/*  999 */     this.jLabel3.setFont(new Font("Montserrat", 0, 24));
/* 1000 */     this.jPanel1.add(this.jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 69, 229, 37));
/*      */     
/* 1002 */     this.jTable10.setFont(new Font("Poppins Light", 0, 14));
/* 1003 */     this.jTable10.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" })
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
/* 1050 */       boolean[] canEdit = { false, false, false, false };
/*      */       
/*      */ 
/*      */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*      */       {
/* 1055 */         return this.canEdit[columnIndex];
/*      */       }
/* 1057 */     });
/* 1058 */     this.jTable10.setCursor(new Cursor(12));
/* 1059 */     this.jTable10.setRowHeight(30);
/* 1060 */     this.jTable10.setShowHorizontalLines(false);
/* 1061 */     this.jTable10.setShowVerticalLines(false);
/* 1062 */     this.jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/* 1064 */         MakeOrders.this.jTable10MouseClicked(evt);
/*      */       }
/*      */       
/* 1067 */       public void mouseEntered(MouseEvent evt) { MakeOrders.this.jTable10MouseEntered(evt);
/*      */       }
/* 1069 */     });
/* 1070 */     this.jScrollPane10.setViewportView(this.jTable10);
/* 1071 */     if (this.jTable10.getColumnModel().getColumnCount() > 0) {
/* 1072 */       this.jTable10.getColumnModel().getColumn(0).setResizable(false);
/* 1073 */       this.jTable10.getColumnModel().getColumn(0).setPreferredWidth(20);
/* 1074 */       this.jTable10.getColumnModel().getColumn(1).setResizable(false);
/* 1075 */       this.jTable10.getColumnModel().getColumn(1).setPreferredWidth(70);
/* 1076 */       this.jTable10.getColumnModel().getColumn(2).setPreferredWidth(40);
/* 1077 */       this.jTable10.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/* 1080 */     this.jPanel1.add(this.jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 112, 397, 606));
/*      */     
/* 1082 */     this.jTextField2.setEditable(false);
/* 1083 */     this.jTextField2.setFont(new Font("Poppins", 0, 14));
/* 1084 */     this.jPanel1.add(this.jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 189, 32, -1));
/*      */     
/* 1086 */     this.jTextField5.setEditable(false);
/* 1087 */     this.jTextField5.setFont(new Font("Poppins", 0, 14));
/* 1088 */     this.jPanel1.add(this.jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 31, -1));
/*      */     
/* 1090 */     this.jList1.setFont(new Font("Montserrat Hairline", 0, 24));
/* 1091 */     this.jList1.setModel(new javax.swing.AbstractListModel() {
/* 1092 */       String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "21", "23", "24", "25" };
/* 1093 */       public int getSize() { return this.strings.length; }
/* 1094 */       public String getElementAt(int i) { return this.strings[i]; }
/* 1095 */     });
/* 1096 */     this.jList1.setCursor(new Cursor(12));
/* 1097 */     this.jList1.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/* 1099 */         MakeOrders.this.jList1MouseClicked(evt);
/*      */       }
/* 1101 */     });
/* 1102 */     this.jScrollPane2.setViewportView(this.jList1);
/*      */     
/* 1104 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/* 1105 */     this.jPanel5.setLayout(jPanel5Layout);
/* 1106 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout
/* 1107 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1108 */       .addGroup(jPanel5Layout.createSequentialGroup()
/* 1109 */       .addContainerGap()
/* 1110 */       .addComponent(this.jScrollPane2, -2, -1, -2)
/* 1111 */       .addContainerGap(17, 32767)));
/*      */     
/* 1113 */     jPanel5Layout.setVerticalGroup(jPanel5Layout
/* 1114 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1115 */       .addGroup(jPanel5Layout.createSequentialGroup()
/* 1116 */       .addGap(22, 22, 22)
/* 1117 */       .addComponent(this.jScrollPane2, -2, 610, -2)
/* 1118 */       .addContainerGap(90, 32767)));
/*      */     
/*      */ 
/* 1121 */     this.jPanel1.add(this.jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1261, 89, -1, -1));
/*      */     
/* 1123 */     this.jComboBox2.setFont(new Font("Poppins Light", 0, 18));
/* 1124 */     this.jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
/* 1125 */     this.jComboBox2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1127 */         MakeOrders.this.jComboBox2ActionPerformed(evt);
/*      */       }
/* 1129 */     });
/* 1130 */     this.jPanel1.add(this.jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1696, 205, -1, -1));
/*      */     
/* 1132 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1133 */     getContentPane().setLayout(layout);
/* 1134 */     layout.setHorizontalGroup(layout
/* 1135 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1136 */       .addGroup(layout.createSequentialGroup()
/* 1137 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 1138 */       .addGap(0, 0, 32767)));
/*      */     
/* 1140 */     layout.setVerticalGroup(layout
/* 1141 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1142 */       .addComponent(this.jPanel1, -1, -1, 32767));
/*      */     
/*      */ 
/* 1145 */     pack();
/*      */   }
/*      */   
/*      */   private void jToggleButton2ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1150 */       int id = Integer.parseInt(this.jTextField1.getText());
/* 1151 */       close();
/* 1152 */       Confirm c = new Confirm(id);
/* 1153 */       c.setVisible(true);
/*      */     }
/*      */     catch (Exception e) {
/* 1156 */       JOptionPane.showMessageDialog(null, "please select some items before proceeding \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void jTable10MouseClicked(MouseEvent evt)
/*      */   {
/* 1163 */     if (evt.getClickCount() == 1) {
/* 1164 */       this.jPanel5.setVisible(true);
/*      */       try {
/* 1166 */         javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)this.jTable10.getModel();
/* 1167 */         int selectedRowIndex = this.jTable10.getSelectedRow();
/* 1168 */         this.jTextField2.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1169 */         this.jTextField3.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1170 */         this.jTextField4.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1171 */         this.jTextField5.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */       }
/*      */       catch (NullPointerException e) {
/* 1174 */         JOptionPane.showMessageDialog(null, "please select some field \n click ok and try again", "", 0);
/*      */       }
/*      */     }
/* 1177 */     if (evt.getClickCount() == 2) {
/*      */       try {
/* 1179 */         this.jPanel5.setVisible(false);
/* 1180 */         String orderId = this.jTextField1.getText();
/* 1181 */         String code = this.jTextField2.getText();
/* 1182 */         String itemName = this.jTextField3.getText();
/* 1183 */         String type = this.jTextField4.getText();
/* 1184 */         int quantity = 1;
/* 1185 */         String itemPrice = this.jTextField5.getText();
/* 1186 */         int price = Integer.parseInt(itemPrice);
/* 1187 */         int subTotal = price * quantity;
/* 1188 */         String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(new Date());
/* 1189 */         Boolean status = Boolean.valueOf(true);
/* 1190 */         String sql = "insert into res_table(order_id,item,quantity,status,sub_total,date,type,code,payment)values(?,?,?,?,?,?,?,?,?)";
/* 1191 */         this.ps = this.conn.prepareStatement(sql);
/* 1192 */         this.ps.setString(1, orderId);
/* 1193 */         this.ps.setString(2, itemName);
/* 1194 */         this.ps.setInt(3, quantity);
/* 1195 */         this.ps.setBoolean(4, status.booleanValue());
/* 1196 */         this.ps.setInt(5, subTotal);
/* 1197 */         this.ps.setString(6, date);
/* 1198 */         this.ps.setString(7, type);
/* 1199 */         this.ps.setString(8, code);
/* 1200 */         this.ps.setInt(9, this.pay);
/* 1201 */         this.ps.execute();
/* 1202 */         String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1203 */         String day = new SimpleDateFormat("dd").format(new Date());
/* 1204 */         String month = new SimpleDateFormat("MM").format(new Date());
/* 1205 */         String year = new SimpleDateFormat("YYYY").format(new Date());
/* 1206 */         String t = new SimpleDateFormat("HH:mm:ss").format(new Date());
/* 1207 */         String sql1 = "insert into history_table(order_id,date,item,quantity,type,time,day,month,year)values(?,?,?,?,?,?,?,?,?)";
/* 1208 */         this.ps = this.conn.prepareStatement(sql1);
/* 1209 */         this.ps.setString(1, orderId);
/* 1210 */         this.ps.setString(2, d);
/* 1211 */         this.ps.setString(3, itemName);
/* 1212 */         this.ps.setInt(4, quantity);
/* 1213 */         this.ps.setString(5, type);
/* 1214 */         this.ps.setString(6, t);
/* 1215 */         this.ps.setString(7, day);
/* 1216 */         this.ps.setString(8, month);
/* 1217 */         this.ps.setString(9, year);
/* 1218 */         this.ps.execute();
/*      */       }
/*      */       catch (Exception e)
/*      */       {
/* 1222 */         JOptionPane.showMessageDialog(null, "please select some items \n click ok and try again", "", 0);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 1228 */     int x = 2;
/* 1229 */     Welcome w = new Welcome();
/* 1230 */     w.setVisible(true);
/* 1231 */     close();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1236 */       String code = this.jTextField6.getText();
/* 1237 */       int c = Integer.valueOf(code).intValue();
/* 1238 */       String sql = "select * from menu_table1 where item_code='" + c + "' union select * from menu_table2 where item_code='" + c + "' union select * from menu_table3 where item_code='" + c + "' union select * from menu_table4 where item_code='" + c + "' union select * from menu_table5 where item_code='" + c + "' union select * from menu_table6 where item_code='" + c + "' union select * from menu_table7 where item_code='" + c + "' union select * from menu_table8 where item_code='" + c + "' union select * from menu_table9 where item_code='" + c + "' union select * from menu_table10 where item_code='" + c + "'union select * from menu_table11 where item_code='" + c + "'union select * from menu_table12 where item_code='" + c + "'union select * from menu_table13 where item_code='" + c + "'union select * from menu_table14 where item_code='" + c + "'union select * from menu_table15 where item_code='" + c + "'union select * from menu_table16 where item_code='" + c + "'union select * from menu_table17 where item_code='" + c + "'union select * from menu_table18 where item_code='" + c + "'union select * from menu_table19 where item_code='" + c + "'union select * from menu_table20 where item_code='" + c + "'union select * from menu_table21 where item_code='" + c + "'union select * from menu_table22 where item_code='" + c + "'union select * from menu_table23 where item_code='" + c + "'union select * from menu_table24 where item_code='" + c + "'union select * from menu_table25 where item_code='" + c + "'union select * from menu_table26 where item_code='" + c + "'union select * from menu_table27 where item_code='" + c + "'union select * from menu_table28 where item_code='" + c + "'union select * from menu_table29 where item_code='" + c + "'union select * from menu_table30 where item_code='" + c + "'";
/* 1239 */       this.ps = this.conn.prepareStatement(sql);
/* 1240 */       this.rs = this.ps.executeQuery();
/* 1241 */       while (this.rs.next()) {
/* 1242 */         Object item = this.rs.getString("item_name");
/* 1243 */         Object type = this.rs.getString("item_type");
/* 1244 */         Object price = this.rs.getString("item_price");
/* 1245 */         this.jTextField3.setText((String)item);
/* 1246 */         this.jTextField4.setText((String)type);
/* 1247 */         this.jTextField5.setText((String)price);
/*      */       }
/* 1249 */       this.jTextField2.setText(String.valueOf(c));
/* 1250 */       this.jPanel2.setVisible(true);
/* 1251 */       this.jPanel5.setVisible(true);
/*      */     }
/*      */     catch (Exception e) {
/* 1254 */       JOptionPane.showMessageDialog(null, "please enter valid Item Code \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jComboBox2ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1260 */       String orderId = this.jTextField1.getText();
/* 1261 */       String code = this.jTextField2.getText();
/* 1262 */       String itemName = this.jTextField3.getText();
/* 1263 */       String type = this.jTextField4.getText();
/* 1264 */       String itemQuantity = (String)this.jComboBox2.getSelectedItem();
/* 1265 */       int quantity = Integer.parseInt(itemQuantity);
/* 1266 */       String itemPrice = this.jTextField5.getText();
/* 1267 */       int price = Integer.parseInt(itemPrice);
/* 1268 */       int subTotal = price * quantity;
/* 1269 */       String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(new Date());
/* 1270 */       Boolean status = Boolean.valueOf(true);
/* 1271 */       String sql = "insert into res_table(order_id,item,quantity,status,sub_total,date,type,code,payment)values(?,?,?,?,?,?,?,?,?)";
/* 1272 */       this.ps = this.conn.prepareStatement(sql);
/* 1273 */       this.ps.setString(1, orderId);
/* 1274 */       this.ps.setString(2, itemName);
/* 1275 */       this.ps.setString(3, itemQuantity);
/* 1276 */       this.ps.setBoolean(4, status.booleanValue());
/* 1277 */       this.ps.setInt(5, subTotal);
/* 1278 */       this.ps.setString(6, date);
/* 1279 */       this.ps.setString(7, type);
/* 1280 */       this.ps.setString(8, code);
/* 1281 */       this.ps.setInt(9, this.pay);
/* 1282 */       this.ps.execute();
/* 1283 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1284 */       String t = new SimpleDateFormat("HH:mm:ss").format(new Date());
/* 1285 */       String sql1 = "insert into history_table(order_id,date,item,quantity,type,time)values(?,?,?,?,?,?)";
/* 1286 */       this.ps = this.conn.prepareStatement(sql1);
/* 1287 */       this.ps.setString(1, orderId);
/* 1288 */       this.ps.setString(2, d);
/* 1289 */       this.ps.setString(3, itemName);
/* 1290 */       this.ps.setString(4, itemQuantity);
/* 1291 */       this.ps.setString(5, type);
/* 1292 */       this.ps.setString(6, t);
/* 1293 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1297 */       JOptionPane.showMessageDialog(null, "please select some items \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*      */   
/*      */ 
/*      */   private void jButton7ActionPerformed(ActionEvent evt)
/*      */   {
/* 1307 */     this.jLabel3.setText("CHOWMIN");
/* 1308 */     clear();
/* 1309 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1311 */       String sql = "select * from menu_table1";
/* 1312 */       this.ps = this.conn.prepareStatement(sql);
/* 1313 */       this.rs = this.ps.executeQuery();
/* 1314 */       int i = 0;
/* 1315 */       while (this.rs.next()) {
/* 1316 */         Object code = this.rs.getString("item_code");
/* 1317 */         Object name = this.rs.getString("item_name");
/* 1318 */         Object type = this.rs.getString("item_type");
/* 1319 */         Object price = this.rs.getString("item_price");
/* 1320 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1321 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1322 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1323 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1324 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1328 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 1333 */     this.jLabel3.setText("SIZZLER");
/* 1334 */     clear();
/* 1335 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1337 */       String sql = "select * from menu_table7";
/* 1338 */       this.ps = this.conn.prepareStatement(sql);
/* 1339 */       this.rs = this.ps.executeQuery();
/* 1340 */       int i = 0;
/* 1341 */       while (this.rs.next()) {
/* 1342 */         Object code = this.rs.getString("item_code");
/* 1343 */         Object name = this.rs.getString("item_name");
/* 1344 */         Object type = this.rs.getString("item_type");
/* 1345 */         Object price = this.rs.getString("item_price");
/* 1346 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1347 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1348 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1349 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1350 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1354 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1356 */     this.jPanel3.setSize(400, 700);
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1360 */     clear();
/* 1361 */     this.jPanel2.setVisible(true);
/* 1362 */     this.jLabel3.setText("THUKPA");
/*      */     try {
/* 1364 */       String sql = "select * from menu_table2";
/* 1365 */       this.ps = this.conn.prepareStatement(sql);
/* 1366 */       this.rs = this.ps.executeQuery();
/* 1367 */       int i = 0;
/* 1368 */       while (this.rs.next()) {
/* 1369 */         Object code = this.rs.getString("item_code");
/* 1370 */         Object name = this.rs.getString("item_name");
/* 1371 */         Object type = this.rs.getString("item_type");
/* 1372 */         Object price = this.rs.getString("item_price");
/* 1373 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1374 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1375 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1376 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1377 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1381 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jList1MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1387 */       String orderId = this.jTextField1.getText();
/* 1388 */       String code = this.jTextField2.getText();
/* 1389 */       String itemName = this.jTextField3.getText();
/* 1390 */       String type = this.jTextField4.getText();
/* 1391 */       String itemQuantity = (String)this.jList1.getSelectedValue();
/* 1392 */       int quantity = Integer.parseInt(itemQuantity);
/* 1393 */       String itemPrice = this.jTextField5.getText();
/* 1394 */       int price = Integer.parseInt(itemPrice);
/* 1395 */       int subTotal = price * quantity;
/* 1396 */       String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(new Date());
/* 1397 */       Boolean status = Boolean.valueOf(true);
/* 1398 */       String sql = "insert into res_table(order_id,item,quantity,status,sub_total,date,type,code,payment)values(?,?,?,?,?,?,?,?,?)";
/* 1399 */       this.ps = this.conn.prepareStatement(sql);
/* 1400 */       this.ps.setString(1, orderId);
/* 1401 */       this.ps.setString(2, itemName);
/* 1402 */       this.ps.setString(3, itemQuantity);
/* 1403 */       this.ps.setBoolean(4, status.booleanValue());
/* 1404 */       this.ps.setInt(5, subTotal);
/* 1405 */       this.ps.setString(6, date);
/* 1406 */       this.ps.setString(7, type);
/* 1407 */       this.ps.setString(8, code);
/* 1408 */       this.ps.setInt(9, this.pay);
/* 1409 */       this.ps.execute();
/* 1410 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1411 */       String day = new SimpleDateFormat("dd").format(new Date());
/* 1412 */       String month = new SimpleDateFormat("MM").format(new Date());
/* 1413 */       String year = new SimpleDateFormat("YYYY").format(new Date());
/* 1414 */       String t = new SimpleDateFormat("HH:mm:ss").format(new Date());
/* 1415 */       String sql1 = "insert into history_table(order_id,date,item,quantity,type,time,day,month,year)values(?,?,?,?,?,?,?,?,?)";
/* 1416 */       this.ps = this.conn.prepareStatement(sql1);
/* 1417 */       this.ps.setString(1, orderId);
/* 1418 */       this.ps.setString(2, d);
/* 1419 */       this.ps.setString(3, itemName);
/* 1420 */       this.ps.setString(4, itemQuantity);
/* 1421 */       this.ps.setString(5, type);
/* 1422 */       this.ps.setString(6, t);
/* 1423 */       this.ps.setString(7, day);
/* 1424 */       this.ps.setString(8, month);
/* 1425 */       this.ps.setString(9, year);
/* 1426 */       this.ps.execute();
/* 1427 */       this.jPanel5.setVisible(false);
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1431 */       JOptionPane.showMessageDialog(null, "please select some items \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private void jTable10MouseEntered(MouseEvent evt) {}
/*      */   
/*      */   private void jButton24ActionPerformed(ActionEvent evt)
/*      */   {
/* 1440 */     this.jLabel3.setText("FRIED RICE");
/* 1441 */     clear();
/* 1442 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1444 */       String sql = "select * from menu_table3";
/* 1445 */       this.ps = this.conn.prepareStatement(sql);
/* 1446 */       this.rs = this.ps.executeQuery();
/* 1447 */       int i = 0;
/* 1448 */       while (this.rs.next()) {
/* 1449 */         Object code = this.rs.getString("item_code");
/* 1450 */         Object name = this.rs.getString("item_name");
/* 1451 */         Object type = this.rs.getString("item_type");
/* 1452 */         Object price = this.rs.getString("item_price");
/* 1453 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1454 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1455 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1456 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1457 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1461 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton30ActionPerformed(ActionEvent evt) {
/* 1466 */     this.jLabel3.setText("SOUP");
/* 1467 */     clear();
/* 1468 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1470 */       String sql = "select * from menu_table4";
/* 1471 */       this.ps = this.conn.prepareStatement(sql);
/* 1472 */       this.rs = this.ps.executeQuery();
/* 1473 */       int i = 0;
/* 1474 */       while (this.rs.next()) {
/* 1475 */         Object code = this.rs.getString("item_code");
/* 1476 */         Object name = this.rs.getString("item_name");
/* 1477 */         Object type = this.rs.getString("item_type");
/* 1478 */         Object price = this.rs.getString("item_price");
/* 1479 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1480 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1481 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1482 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1483 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1487 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton13ActionPerformed(ActionEvent evt) {
/* 1492 */     this.jLabel3.setText("BIRYANI");
/* 1493 */     clear();
/* 1494 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1496 */       String sql = "select * from menu_table5";
/* 1497 */       this.ps = this.conn.prepareStatement(sql);
/* 1498 */       this.rs = this.ps.executeQuery();
/* 1499 */       int i = 0;
/* 1500 */       while (this.rs.next()) {
/* 1501 */         Object code = this.rs.getString("item_code");
/* 1502 */         Object name = this.rs.getString("item_name");
/* 1503 */         Object type = this.rs.getString("item_type");
/* 1504 */         Object price = this.rs.getString("item_price");
/* 1505 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1506 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1507 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1508 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1509 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1513 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton8ActionPerformed(ActionEvent evt) {
/* 1518 */     this.jLabel3.setText("CHOPSUEY");
/* 1519 */     clear();
/* 1520 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1522 */       String sql = "select * from menu_table6";
/* 1523 */       this.ps = this.conn.prepareStatement(sql);
/* 1524 */       this.rs = this.ps.executeQuery();
/* 1525 */       int i = 0;
/* 1526 */       while (this.rs.next()) {
/* 1527 */         Object code = this.rs.getString("item_code");
/* 1528 */         Object name = this.rs.getString("item_name");
/* 1529 */         Object type = this.rs.getString("item_type");
/* 1530 */         Object price = this.rs.getString("item_price");
/* 1531 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1532 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1533 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1534 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1535 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1539 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 1544 */     this.jLabel3.setText("CUTLET");
/* 1545 */     clear();
/* 1546 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1548 */       String sql = "select * from menu_table8";
/* 1549 */       this.ps = this.conn.prepareStatement(sql);
/* 1550 */       this.rs = this.ps.executeQuery();
/* 1551 */       int i = 0;
/* 1552 */       while (this.rs.next()) {
/* 1553 */         Object code = this.rs.getString("item_code");
/* 1554 */         Object name = this.rs.getString("item_name");
/* 1555 */         Object type = this.rs.getString("item_type");
/* 1556 */         Object price = this.rs.getString("item_price");
/* 1557 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1558 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1559 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1560 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1561 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1565 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton25ActionPerformed(ActionEvent evt) {
/* 1570 */     this.jLabel3.setText("SPRING ROLL");
/* 1571 */     clear();
/* 1572 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1574 */       String sql = "select * from menu_table9";
/* 1575 */       this.ps = this.conn.prepareStatement(sql);
/* 1576 */       this.rs = this.ps.executeQuery();
/* 1577 */       int i = 0;
/* 1578 */       while (this.rs.next()) {
/* 1579 */         Object code = this.rs.getString("item_code");
/* 1580 */         Object name = this.rs.getString("item_name");
/* 1581 */         Object type = this.rs.getString("item_type");
/* 1582 */         Object price = this.rs.getString("item_price");
/* 1583 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1584 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1585 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1586 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1587 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1591 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton16ActionPerformed(ActionEvent evt) {
/* 1596 */     this.jLabel3.setText("PAKAUDA");
/* 1597 */     clear();
/* 1598 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1600 */       String sql = "select * from menu_table10";
/* 1601 */       this.ps = this.conn.prepareStatement(sql);
/* 1602 */       this.rs = this.ps.executeQuery();
/* 1603 */       int i = 0;
/* 1604 */       while (this.rs.next()) {
/* 1605 */         Object code = this.rs.getString("item_code");
/* 1606 */         Object name = this.rs.getString("item_name");
/* 1607 */         Object type = this.rs.getString("item_type");
/* 1608 */         Object price = this.rs.getString("item_price");
/* 1609 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1610 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1611 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1612 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1613 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1617 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton19ActionPerformed(ActionEvent evt) {
/* 1622 */     this.jLabel3.setText("BOILED ITEMS");
/* 1623 */     clear();
/* 1624 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1626 */       String sql = "select * from menu_table11";
/* 1627 */       this.ps = this.conn.prepareStatement(sql);
/* 1628 */       this.rs = this.ps.executeQuery();
/* 1629 */       int i = 0;
/* 1630 */       while (this.rs.next()) {
/* 1631 */         Object code = this.rs.getString("item_code");
/* 1632 */         Object name = this.rs.getString("item_name");
/* 1633 */         Object type = this.rs.getString("item_type");
/* 1634 */         Object price = this.rs.getString("item_price");
/* 1635 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1636 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1637 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1638 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1639 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1643 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton31ActionPerformed(ActionEvent evt) {
/* 1648 */     this.jLabel3.setText("KHANA SET");
/* 1649 */     clear();
/* 1650 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1652 */       String sql = "select * from menu_table12";
/* 1653 */       this.ps = this.conn.prepareStatement(sql);
/* 1654 */       this.rs = this.ps.executeQuery();
/* 1655 */       int i = 0;
/* 1656 */       while (this.rs.next()) {
/* 1657 */         Object code = this.rs.getString("item_code");
/* 1658 */         Object name = this.rs.getString("item_name");
/* 1659 */         Object type = this.rs.getString("item_type");
/* 1660 */         Object price = this.rs.getString("item_price");
/* 1661 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1662 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1663 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1664 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1665 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1669 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton21ActionPerformed(ActionEvent evt) {
/* 1674 */     this.jLabel3.setText("ROTI PARAUTHA");
/* 1675 */     clear();
/* 1676 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1678 */       String sql = "select * from menu_table13";
/* 1679 */       this.ps = this.conn.prepareStatement(sql);
/* 1680 */       this.rs = this.ps.executeQuery();
/* 1681 */       int i = 0;
/* 1682 */       while (this.rs.next()) {
/* 1683 */         Object code = this.rs.getString("item_code");
/* 1684 */         Object name = this.rs.getString("item_name");
/* 1685 */         Object type = this.rs.getString("item_type");
/* 1686 */         Object price = this.rs.getString("item_price");
/* 1687 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1688 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1689 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1690 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1691 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1695 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton26ActionPerformed(ActionEvent evt) {
/* 1700 */     this.jLabel3.setText("CURRY");
/* 1701 */     clear();
/* 1702 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1704 */       String sql = "select * from menu_table14";
/* 1705 */       this.ps = this.conn.prepareStatement(sql);
/* 1706 */       this.rs = this.ps.executeQuery();
/* 1707 */       int i = 0;
/* 1708 */       while (this.rs.next()) {
/* 1709 */         Object code = this.rs.getString("item_code");
/* 1710 */         Object name = this.rs.getString("item_name");
/* 1711 */         Object type = this.rs.getString("item_type");
/* 1712 */         Object price = this.rs.getString("item_price");
/* 1713 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1714 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1715 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1716 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1717 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1721 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt) {
/* 1726 */     this.jLabel3.setText("KHAJA SET");
/* 1727 */     clear();
/* 1728 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1730 */       String sql = "select * from menu_table15";
/* 1731 */       this.ps = this.conn.prepareStatement(sql);
/* 1732 */       this.rs = this.ps.executeQuery();
/* 1733 */       int i = 0;
/* 1734 */       while (this.rs.next()) {
/* 1735 */         Object code = this.rs.getString("item_code");
/* 1736 */         Object name = this.rs.getString("item_name");
/* 1737 */         Object type = this.rs.getString("item_type");
/* 1738 */         Object price = this.rs.getString("item_price");
/* 1739 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1740 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1741 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1742 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1743 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1747 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton17ActionPerformed(ActionEvent evt) {
/* 1752 */     this.jLabel3.setText("KATTI ROLL");
/* 1753 */     clear();
/* 1754 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1756 */       String sql = "select * from menu_table16";
/* 1757 */       this.ps = this.conn.prepareStatement(sql);
/* 1758 */       this.rs = this.ps.executeQuery();
/* 1759 */       int i = 0;
/* 1760 */       while (this.rs.next()) {
/* 1761 */         Object code = this.rs.getString("item_code");
/* 1762 */         Object name = this.rs.getString("item_name");
/* 1763 */         Object type = this.rs.getString("item_type");
/* 1764 */         Object price = this.rs.getString("item_price");
/* 1765 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1766 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1767 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1768 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1769 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1773 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton20ActionPerformed(ActionEvent evt) {
/* 1778 */     this.jLabel3.setText("SALAD");
/* 1779 */     clear();
/* 1780 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1782 */       String sql = "select * from menu_table17";
/* 1783 */       this.ps = this.conn.prepareStatement(sql);
/* 1784 */       this.rs = this.ps.executeQuery();
/* 1785 */       int i = 0;
/* 1786 */       while (this.rs.next()) {
/* 1787 */         Object code = this.rs.getString("item_code");
/* 1788 */         Object name = this.rs.getString("item_name");
/* 1789 */         Object type = this.rs.getString("item_type");
/* 1790 */         Object price = this.rs.getString("item_price");
/* 1791 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1792 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1793 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1794 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1795 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1799 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton32ActionPerformed(ActionEvent evt) {
/* 1804 */     this.jLabel3.setText("LASSI");
/* 1805 */     clear();
/* 1806 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1808 */       String sql = "select * from menu_table18";
/* 1809 */       this.ps = this.conn.prepareStatement(sql);
/* 1810 */       this.rs = this.ps.executeQuery();
/* 1811 */       int i = 0;
/* 1812 */       while (this.rs.next()) {
/* 1813 */         Object code = this.rs.getString("item_code");
/* 1814 */         Object name = this.rs.getString("item_name");
/* 1815 */         Object type = this.rs.getString("item_type");
/* 1816 */         Object price = this.rs.getString("item_price");
/* 1817 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1818 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1819 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1820 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1821 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1825 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton22ActionPerformed(ActionEvent evt) {
/* 1830 */     this.jLabel3.setText("TOAST OMLETTE");
/* 1831 */     clear();
/* 1832 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1834 */       String sql = "select * from menu_table19";
/* 1835 */       this.ps = this.conn.prepareStatement(sql);
/* 1836 */       this.rs = this.ps.executeQuery();
/* 1837 */       int i = 0;
/* 1838 */       while (this.rs.next()) {
/* 1839 */         Object code = this.rs.getString("item_code");
/* 1840 */         Object name = this.rs.getString("item_name");
/* 1841 */         Object type = this.rs.getString("item_type");
/* 1842 */         Object price = this.rs.getString("item_price");
/* 1843 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1844 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1845 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1846 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1847 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1851 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton23ActionPerformed(ActionEvent evt) {
/* 1856 */     this.jLabel3.setText("BURGER");
/* 1857 */     clear();
/* 1858 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1860 */       String sql = "select * from menu_table20";
/* 1861 */       this.ps = this.conn.prepareStatement(sql);
/* 1862 */       this.rs = this.ps.executeQuery();
/* 1863 */       int i = 0;
/* 1864 */       while (this.rs.next()) {
/* 1865 */         Object code = this.rs.getString("item_code");
/* 1866 */         Object name = this.rs.getString("item_name");
/* 1867 */         Object type = this.rs.getString("item_type");
/* 1868 */         Object price = this.rs.getString("item_price");
/* 1869 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1870 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1871 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1872 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1873 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1877 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton27ActionPerformed(ActionEvent evt) {
/* 1882 */     this.jLabel3.setText("SANDWITCH");
/* 1883 */     clear();
/* 1884 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1886 */       String sql = "select * from menu_table21";
/* 1887 */       this.ps = this.conn.prepareStatement(sql);
/* 1888 */       this.rs = this.ps.executeQuery();
/* 1889 */       int i = 0;
/* 1890 */       while (this.rs.next()) {
/* 1891 */         Object code = this.rs.getString("item_code");
/* 1892 */         Object name = this.rs.getString("item_name");
/* 1893 */         Object type = this.rs.getString("item_type");
/* 1894 */         Object price = this.rs.getString("item_price");
/* 1895 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1896 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1897 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1898 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1899 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1903 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton18ActionPerformed(ActionEvent evt) {
/* 1908 */     this.jLabel3.setText("HOT BEVERAGE");
/* 1909 */     clear();
/* 1910 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1912 */       String sql = "select * from menu_table22";
/* 1913 */       this.ps = this.conn.prepareStatement(sql);
/* 1914 */       this.rs = this.ps.executeQuery();
/* 1915 */       int i = 0;
/* 1916 */       while (this.rs.next()) {
/* 1917 */         Object code = this.rs.getString("item_code");
/* 1918 */         Object name = this.rs.getString("item_name");
/* 1919 */         Object type = this.rs.getString("item_type");
/* 1920 */         Object price = this.rs.getString("item_price");
/* 1921 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1922 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1923 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1924 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1925 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1929 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton28ActionPerformed(ActionEvent evt) {
/* 1934 */     this.jLabel3.setText("COLD BEVERAGE");
/* 1935 */     clear();
/* 1936 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1938 */       String sql = "select * from menu_table23";
/* 1939 */       this.ps = this.conn.prepareStatement(sql);
/* 1940 */       this.rs = this.ps.executeQuery();
/* 1941 */       int i = 0;
/* 1942 */       while (this.rs.next()) {
/* 1943 */         Object code = this.rs.getString("item_code");
/* 1944 */         Object name = this.rs.getString("item_name");
/* 1945 */         Object type = this.rs.getString("item_type");
/* 1946 */         Object price = this.rs.getString("item_price");
/* 1947 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1948 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1949 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1950 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1951 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1955 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton33ActionPerformed(ActionEvent evt) {
/* 1960 */     this.jLabel3.setText("PIZZA");
/* 1961 */     clear();
/* 1962 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1964 */       String sql = "select * from menu_table24";
/* 1965 */       this.ps = this.conn.prepareStatement(sql);
/* 1966 */       this.rs = this.ps.executeQuery();
/* 1967 */       int i = 0;
/* 1968 */       while (this.rs.next()) {
/* 1969 */         Object code = this.rs.getString("item_code");
/* 1970 */         Object name = this.rs.getString("item_name");
/* 1971 */         Object type = this.rs.getString("item_type");
/* 1972 */         Object price = this.rs.getString("item_price");
/* 1973 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 1974 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 1975 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 1976 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 1977 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1981 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton9ActionPerformed(ActionEvent evt) {
/* 1986 */     this.jLabel3.setText("MOMO");
/* 1987 */     clear();
/* 1988 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 1990 */       String sql = "select * from menu_table25";
/* 1991 */       this.ps = this.conn.prepareStatement(sql);
/* 1992 */       this.rs = this.ps.executeQuery();
/* 1993 */       int i = 0;
/* 1994 */       while (this.rs.next()) {
/* 1995 */         Object code = this.rs.getString("item_code");
/* 1996 */         Object name = this.rs.getString("item_name");
/* 1997 */         Object type = this.rs.getString("item_type");
/* 1998 */         Object price = this.rs.getString("item_price");
/* 1999 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2000 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2001 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2002 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2003 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2007 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton15ActionPerformed(ActionEvent evt) {
/* 2012 */     this.jLabel3.setText("SAUSAGE");
/* 2013 */     clear();
/* 2014 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 2016 */       String sql = "select * from menu_table26";
/* 2017 */       this.ps = this.conn.prepareStatement(sql);
/* 2018 */       this.rs = this.ps.executeQuery();
/* 2019 */       int i = 0;
/* 2020 */       while (this.rs.next()) {
/* 2021 */         Object code = this.rs.getString("item_code");
/* 2022 */         Object name = this.rs.getString("item_name");
/* 2023 */         Object type = this.rs.getString("item_type");
/* 2024 */         Object price = this.rs.getString("item_price");
/* 2025 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2026 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2027 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2028 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2029 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2033 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton10ActionPerformed(ActionEvent evt) {
/* 2038 */     this.jLabel3.setText("SNACKS VEG");
/* 2039 */     clear();
/* 2040 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 2042 */       String sql = "select * from menu_table27";
/* 2043 */       this.ps = this.conn.prepareStatement(sql);
/* 2044 */       this.rs = this.ps.executeQuery();
/* 2045 */       int i = 0;
/* 2046 */       while (this.rs.next()) {
/* 2047 */         Object code = this.rs.getString("item_code");
/* 2048 */         Object name = this.rs.getString("item_name");
/* 2049 */         Object type = this.rs.getString("item_type");
/* 2050 */         Object price = this.rs.getString("item_price");
/* 2051 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2052 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2053 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2054 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2055 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2059 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton35ActionPerformed(ActionEvent evt) {
/* 2064 */     this.jLabel3.setText("SNACKS NON VEG");
/* 2065 */     clear();
/* 2066 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 2068 */       String sql = "select * from menu_table28";
/* 2069 */       this.ps = this.conn.prepareStatement(sql);
/* 2070 */       this.rs = this.ps.executeQuery();
/* 2071 */       int i = 0;
/* 2072 */       while (this.rs.next()) {
/* 2073 */         Object code = this.rs.getString("item_code");
/* 2074 */         Object name = this.rs.getString("item_name");
/* 2075 */         Object type = this.rs.getString("item_type");
/* 2076 */         Object price = this.rs.getString("item_price");
/* 2077 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2078 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2079 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2080 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2081 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2085 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton29ActionPerformed(ActionEvent evt) {
/* 2090 */     clear();
/* 2091 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 2093 */       String sql = "select * from menu_table30";
/* 2094 */       this.ps = this.conn.prepareStatement(sql);
/* 2095 */       this.rs = this.ps.executeQuery();
/* 2096 */       int i = 0;
/* 2097 */       while (this.rs.next()) {
/* 2098 */         Object code = this.rs.getString("item_code");
/* 2099 */         Object name = this.rs.getString("item_name");
/* 2100 */         Object type = this.rs.getString("item_type");
/* 2101 */         Object price = this.rs.getString("item_price");
/* 2102 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2103 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2104 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2105 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2106 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2110 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton34ActionPerformed(ActionEvent evt) {
/* 2115 */     clear();
/* 2116 */     this.jPanel2.setVisible(true);
/*      */     try {
/* 2118 */       String sql = "select * from menu_table29";
/* 2119 */       this.ps = this.conn.prepareStatement(sql);
/* 2120 */       this.rs = this.ps.executeQuery();
/* 2121 */       int i = 0;
/* 2122 */       while (this.rs.next()) {
/* 2123 */         Object code = this.rs.getString("item_code");
/* 2124 */         Object name = this.rs.getString("item_name");
/* 2125 */         Object type = this.rs.getString("item_type");
/* 2126 */         Object price = this.rs.getString("item_price");
/* 2127 */         this.jTable10.getModel().setValueAt(code, i, 0);
/* 2128 */         this.jTable10.getModel().setValueAt(name, i, 1);
/* 2129 */         this.jTable10.getModel().setValueAt(type, i, 2);
/* 2130 */         this.jTable10.getModel().setValueAt(price, i, 3);
/* 2131 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 2135 */       JOptionPane.showMessageDialog(null, e);
/*      */     } }
/*      */   
/*      */   private JButton jButton25;
/*      */   private JButton jButton26;
/*      */   private JButton jButton27;
/*      */   private JButton jButton28;
/*      */   private JButton jButton29;
/*      */   private void jButton7FocusGained(java.awt.event.FocusEvent evt) {}
/*      */   
/* 2145 */   private void jTextField6MouseClicked(MouseEvent evt) { this.jTextField6.setText(""); }
/*      */   
/*      */   private JButton jButton3;
/*      */   private JButton jButton30;
/*      */   private JButton jButton31;
/*      */   private JButton jButton32;
/*      */   private JButton jButton33;
/*      */   private JButton jButton34;
/*      */   private JButton jButton35;
/*      */   private JButton jButton4;
/*      */   private JButton jButton5;
/*      */   private JButton jButton7;
/*      */   
/*      */   public static void main(String[] args) {
/* 2159 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : )
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 2164 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*      */       }
/*      */     }
/*      */     catch (ClassNotFoundException ex) {
/* 2168 */       java.util.logging.Logger.getLogger(MakeOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 2170 */       java.util.logging.Logger.getLogger(MakeOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 2172 */       java.util.logging.Logger.getLogger(MakeOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 2174 */       java.util.logging.Logger.getLogger(MakeOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 2179 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 2181 */         new MakeOrders().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */ 
/*      */   private JButton jButton8;
/*      */   
/*      */   private JButton jButton9;
/*      */   
/*      */   private javax.swing.JComboBox<String> jComboBox2;
/*      */   
/*      */   private JLabel jLabel1;
/*      */   
/*      */   private JLabel jLabel10;
/*      */   
/*      */   private JLabel jLabel11;
/*      */   
/*      */   private JLabel jLabel12;
/*      */   
/*      */   private JLabel jLabel13;
/*      */   
/*      */   private JLabel jLabel14;
/*      */   
/*      */   private JLabel jLabel15;
/*      */   
/*      */   private JLabel jLabel16;
/*      */   
/*      */   private JLabel jLabel17;
/*      */   
/*      */   private JLabel jLabel18;
/*      */   
/*      */   private JLabel jLabel19;
/*      */   
/*      */   private JLabel jLabel2;
/*      */   
/*      */   private JLabel jLabel20;
/*      */   
/*      */   private JLabel jLabel21;
/*      */   
/*      */   private JLabel jLabel22;
/*      */   
/*      */   private JLabel jLabel23;
/*      */   
/*      */   private JLabel jLabel24;
/*      */   
/*      */   private JLabel jLabel25;
/*      */   
/*      */   private JLabel jLabel26;
/*      */   
/*      */   private JLabel jLabel27;
/*      */   
/*      */   private JLabel jLabel28;
/*      */   
/*      */   private JLabel jLabel29;
/*      */   
/*      */   private JLabel jLabel3;
/*      */   
/*      */   private JLabel jLabel30;
/*      */   
/*      */   private JLabel jLabel31;
/*      */   
/*      */   private JLabel jLabel32;
/*      */   
/*      */   private JLabel jLabel33;
/*      */   
/*      */   private JLabel jLabel35;
/*      */   
/*      */   private JLabel jLabel36;
/*      */   
/*      */   private JLabel jLabel4;
/*      */   private JLabel jLabel5;
/*      */   private JLabel jLabel6;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel8;
/*      */   private javax.swing.JList<String> jList1;
/*      */   private JPanel jPanel1;
/*      */   private JPanel jPanel2;
/*      */   private JPanel jPanel3;
/*      */   private JPanel jPanel4;
/*      */   private JPanel jPanel5;
/*      */   private javax.swing.JScrollPane jScrollPane10;
/*      */   private javax.swing.JScrollPane jScrollPane2;
/*      */   private JTable jTable10;
/*      */   private JTextField jTextField1;
/*      */   private JTextField jTextField2;
/*      */   private JTextField jTextField3;
/*      */   private JTextField jTextField4;
/*      */   private JTextField jTextField5;
/*      */   private JTextField jTextField6;
/*      */   private javax.swing.JToggleButton jToggleButton2;
/*      */   private void close()
/*      */   {
/* 2274 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 2275 */     java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*      */   }
/*      */   
/* 2278 */   private void clear() { for (int i = 0; i < this.jTable10.getRowCount(); i++) {
/* 2279 */       for (int j = 0; j < this.jTable10.getColumnCount(); j++) {
/* 2280 */         this.jTable10.setValueAt("", i, j);
/*      */       }
/*      */     }
/*      */   }
/*      */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\MakeOrders.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
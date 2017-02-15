/*      */ package resturentapp;
/*      */ 
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.sql.PreparedStatement;
/*      */ import java.sql.ResultSet;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle.ComponentPlacement;
/*      */ import javax.swing.table.DefaultTableModel;
/*      */ import javax.swing.table.TableColumn;
/*      */ import javax.swing.table.TableColumnModel;
/*      */ 
/*      */ public class EditMenu extends javax.swing.JFrame
/*      */ {
/*   21 */   java.sql.Connection conn = JavaConnect.connectDb();
/*   22 */   ResultSet rs = null;
/*   23 */   PreparedStatement ps = null;
/*      */   private JButton jButton1;
/*      */   private JButton jButton10;
/*      */   private JButton jButton11;
/*      */   
/*   28 */   public EditMenu() { initComponents();
/*   29 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*   30 */     int xsize = (int)tk.getScreenSize().getWidth();
/*   31 */     int ysize = (int)tk.getScreenSize().getHeight();
/*   32 */     setSize(xsize, ysize);
/*      */     try {
/*   34 */       String sql = "select * from menu_table1";
/*   35 */       this.ps = this.conn.prepareStatement(sql);
/*   36 */       this.rs = this.ps.executeQuery();
/*   37 */       int i = 0;
/*   38 */       while (this.rs.next()) {
/*   39 */         Object code = this.rs.getString("item_code");
/*   40 */         Object name = this.rs.getString("item_name");
/*   41 */         Object type = this.rs.getString("item_type");
/*   42 */         Object price = this.rs.getString("item_price");
/*   43 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*   44 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*   45 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*   46 */         this.jTable1.getModel().setValueAt(price, i, 3);
/*   47 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*   51 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*   54 */       String sql = "select * from menu_table2";
/*   55 */       this.ps = this.conn.prepareStatement(sql);
/*   56 */       this.rs = this.ps.executeQuery();
/*   57 */       int i = 0;
/*   58 */       while (this.rs.next()) {
/*   59 */         Object code = this.rs.getString("item_code");
/*   60 */         Object name = this.rs.getString("item_name");
/*   61 */         Object type = this.rs.getString("item_type");
/*   62 */         Object price = this.rs.getString("item_price");
/*   63 */         this.jTable2.getModel().setValueAt(code, i, 0);
/*   64 */         this.jTable2.getModel().setValueAt(name, i, 1);
/*   65 */         this.jTable2.getModel().setValueAt(type, i, 2);
/*   66 */         this.jTable2.getModel().setValueAt(price, i, 3);
/*   67 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*   71 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*   74 */       String sql = "select * from menu_table3";
/*   75 */       this.ps = this.conn.prepareStatement(sql);
/*   76 */       this.rs = this.ps.executeQuery();
/*   77 */       int i = 0;
/*   78 */       while (this.rs.next()) {
/*   79 */         Object code = this.rs.getString("item_code");
/*   80 */         Object name = this.rs.getString("item_name");
/*   81 */         Object type = this.rs.getString("item_type");
/*   82 */         Object price = this.rs.getString("item_price");
/*   83 */         this.jTable3.getModel().setValueAt(code, i, 0);
/*   84 */         this.jTable3.getModel().setValueAt(name, i, 1);
/*   85 */         this.jTable3.getModel().setValueAt(type, i, 2);
/*   86 */         this.jTable3.getModel().setValueAt(price, i, 3);
/*   87 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*   91 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*   94 */       String sql = "select * from menu_table4";
/*   95 */       this.ps = this.conn.prepareStatement(sql);
/*   96 */       this.rs = this.ps.executeQuery();
/*   97 */       int i = 0;
/*   98 */       while (this.rs.next()) {
/*   99 */         Object code = this.rs.getString("item_code");
/*  100 */         Object name = this.rs.getString("item_name");
/*  101 */         Object type = this.rs.getString("item_type");
/*  102 */         Object price = this.rs.getString("item_price");
/*  103 */         this.jTable9.getModel().setValueAt(code, i, 0);
/*  104 */         this.jTable9.getModel().setValueAt(name, i, 1);
/*  105 */         this.jTable9.getModel().setValueAt(type, i, 2);
/*  106 */         this.jTable9.getModel().setValueAt(price, i, 3);
/*  107 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  111 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  114 */       String sql = "select * from menu_table5";
/*  115 */       this.ps = this.conn.prepareStatement(sql);
/*  116 */       this.rs = this.ps.executeQuery();
/*  117 */       int i = 0;
/*  118 */       while (this.rs.next()) {
/*  119 */         Object code = this.rs.getString("item_code");
/*  120 */         Object name = this.rs.getString("item_name");
/*  121 */         Object type = this.rs.getString("item_type");
/*  122 */         Object price = this.rs.getString("item_price");
/*  123 */         this.jTable10.getModel().setValueAt(code, i, 0);
/*  124 */         this.jTable10.getModel().setValueAt(name, i, 1);
/*  125 */         this.jTable10.getModel().setValueAt(type, i, 2);
/*  126 */         this.jTable10.getModel().setValueAt(price, i, 3);
/*  127 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  131 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  134 */       String sql = "select * from menu_table6";
/*  135 */       this.ps = this.conn.prepareStatement(sql);
/*  136 */       this.rs = this.ps.executeQuery();
/*  137 */       int i = 0;
/*  138 */       while (this.rs.next()) {
/*  139 */         Object code = this.rs.getString("item_code");
/*  140 */         Object name = this.rs.getString("item_name");
/*  141 */         Object type = this.rs.getString("item_type");
/*  142 */         Object price = this.rs.getString("item_price");
/*  143 */         this.jTable7.getModel().setValueAt(code, i, 0);
/*  144 */         this.jTable7.getModel().setValueAt(name, i, 1);
/*  145 */         this.jTable7.getModel().setValueAt(type, i, 2);
/*  146 */         this.jTable7.getModel().setValueAt(price, i, 3);
/*  147 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  151 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  154 */       String sql = "select * from menu_table7";
/*  155 */       this.ps = this.conn.prepareStatement(sql);
/*  156 */       this.rs = this.ps.executeQuery();
/*  157 */       int i = 0;
/*  158 */       while (this.rs.next()) {
/*  159 */         Object code = this.rs.getString("item_code");
/*  160 */         Object name = this.rs.getString("item_name");
/*  161 */         Object type = this.rs.getString("item_type");
/*  162 */         Object price = this.rs.getString("item_price");
/*  163 */         this.jTable8.getModel().setValueAt(code, i, 0);
/*  164 */         this.jTable8.getModel().setValueAt(name, i, 1);
/*  165 */         this.jTable8.getModel().setValueAt(type, i, 2);
/*  166 */         this.jTable8.getModel().setValueAt(price, i, 3);
/*  167 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  171 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  174 */       String sql = "select * from menu_table8";
/*  175 */       this.ps = this.conn.prepareStatement(sql);
/*  176 */       this.rs = this.ps.executeQuery();
/*  177 */       int i = 0;
/*  178 */       while (this.rs.next()) {
/*  179 */         Object code = this.rs.getString("item_code");
/*  180 */         Object name = this.rs.getString("item_name");
/*  181 */         Object type = this.rs.getString("item_type");
/*  182 */         Object price = this.rs.getString("item_price");
/*  183 */         this.jTable5.getModel().setValueAt(code, i, 0);
/*  184 */         this.jTable5.getModel().setValueAt(name, i, 1);
/*  185 */         this.jTable5.getModel().setValueAt(type, i, 2);
/*  186 */         this.jTable5.getModel().setValueAt(price, i, 3);
/*  187 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  191 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  194 */       String sql = "select * from menu_table9";
/*  195 */       this.ps = this.conn.prepareStatement(sql);
/*  196 */       this.rs = this.ps.executeQuery();
/*  197 */       int i = 0;
/*  198 */       while (this.rs.next()) {
/*  199 */         Object code = this.rs.getString("item_code");
/*  200 */         Object name = this.rs.getString("item_name");
/*  201 */         Object type = this.rs.getString("item_type");
/*  202 */         Object price = this.rs.getString("item_price");
/*  203 */         this.jTable6.getModel().setValueAt(code, i, 0);
/*  204 */         this.jTable6.getModel().setValueAt(name, i, 1);
/*  205 */         this.jTable6.getModel().setValueAt(type, i, 2);
/*  206 */         this.jTable6.getModel().setValueAt(price, i, 3);
/*  207 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  211 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*  214 */       String sql = "select * from menu_table10";
/*  215 */       this.ps = this.conn.prepareStatement(sql);
/*  216 */       this.rs = this.ps.executeQuery();
/*  217 */       int i = 0;
/*  218 */       while (this.rs.next()) {
/*  219 */         Object code = this.rs.getString("item_code");
/*  220 */         Object name = this.rs.getString("item_name");
/*  221 */         Object type = this.rs.getString("item_type");
/*  222 */         Object price = this.rs.getString("item_price");
/*  223 */         this.jTable4.getModel().setValueAt(code, i, 0);
/*  224 */         this.jTable4.getModel().setValueAt(name, i, 1);
/*  225 */         this.jTable4.getModel().setValueAt(type, i, 2);
/*  226 */         this.jTable4.getModel().setValueAt(price, i, 3);
/*  227 */         i++;
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  231 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   private JButton jButton12;
/*      */   private JButton jButton13;
/*      */   private JButton jButton14;
/*      */   private JButton jButton15;
/*      */   private JButton jButton16;
/*      */   private JButton jButton17;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*  244 */     this.jPanel1 = new javax.swing.JPanel();
/*  245 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  246 */     this.jTable1 = new JTable();
/*  247 */     this.jTextField1 = new JTextField();
/*  248 */     this.jTextField2 = new JTextField();
/*  249 */     this.jTextField3 = new JTextField();
/*  250 */     this.jButton1 = new JButton();
/*  251 */     this.jLabel4 = new javax.swing.JLabel();
/*  252 */     this.jScrollPane2 = new javax.swing.JScrollPane();
/*  253 */     this.jTable2 = new JTable();
/*  254 */     this.jScrollPane3 = new javax.swing.JScrollPane();
/*  255 */     this.jTable3 = new JTable();
/*  256 */     this.jScrollPane4 = new javax.swing.JScrollPane();
/*  257 */     this.jTable4 = new JTable();
/*  258 */     this.jLabel5 = new javax.swing.JLabel();
/*  259 */     this.jScrollPane5 = new javax.swing.JScrollPane();
/*  260 */     this.jTable5 = new JTable();
/*  261 */     this.jScrollPane6 = new javax.swing.JScrollPane();
/*  262 */     this.jTable6 = new JTable();
/*  263 */     this.jScrollPane7 = new javax.swing.JScrollPane();
/*  264 */     this.jTable7 = new JTable();
/*  265 */     this.jScrollPane8 = new javax.swing.JScrollPane();
/*  266 */     this.jTable8 = new JTable();
/*  267 */     this.jScrollPane9 = new javax.swing.JScrollPane();
/*  268 */     this.jTable9 = new JTable();
/*  269 */     this.jScrollPane10 = new javax.swing.JScrollPane();
/*  270 */     this.jTable10 = new JTable();
/*  271 */     this.jButton2 = new JButton();
/*  272 */     this.jTextField4 = new JTextField();
/*  273 */     this.jButton3 = new JButton();
/*  274 */     this.jTextField5 = new JTextField();
/*  275 */     this.jTextField6 = new JTextField();
/*  276 */     this.jTextField7 = new JTextField();
/*  277 */     this.jTextField8 = new JTextField();
/*  278 */     this.jTextField9 = new JTextField();
/*  279 */     this.jTextField10 = new JTextField();
/*  280 */     this.jTextField11 = new JTextField();
/*  281 */     this.jTextField12 = new JTextField();
/*  282 */     this.jButton4 = new JButton();
/*  283 */     this.jButton5 = new JButton();
/*  284 */     this.jTextField13 = new JTextField();
/*  285 */     this.jTextField14 = new JTextField();
/*  286 */     this.jTextField15 = new JTextField();
/*  287 */     this.jTextField16 = new JTextField();
/*  288 */     this.jButton6 = new JButton();
/*  289 */     this.jTextField17 = new JTextField();
/*  290 */     this.jTextField18 = new JTextField();
/*  291 */     this.jTextField19 = new JTextField();
/*  292 */     this.jTextField20 = new JTextField();
/*  293 */     this.jButton7 = new JButton();
/*  294 */     this.jTextField21 = new JTextField();
/*  295 */     this.jTextField22 = new JTextField();
/*  296 */     this.jTextField23 = new JTextField();
/*  297 */     this.jTextField24 = new JTextField();
/*  298 */     this.jButton8 = new JButton();
/*  299 */     this.jTextField25 = new JTextField();
/*  300 */     this.jTextField26 = new JTextField();
/*  301 */     this.jTextField27 = new JTextField();
/*  302 */     this.jTextField28 = new JTextField();
/*  303 */     this.jButton9 = new JButton();
/*  304 */     this.jTextField29 = new JTextField();
/*  305 */     this.jTextField30 = new JTextField();
/*  306 */     this.jTextField31 = new JTextField();
/*  307 */     this.jTextField32 = new JTextField();
/*  308 */     this.jButton10 = new JButton();
/*  309 */     this.jTextField33 = new JTextField();
/*  310 */     this.jTextField34 = new JTextField();
/*  311 */     this.jTextField35 = new JTextField();
/*  312 */     this.jTextField36 = new JTextField();
/*  313 */     this.jButton11 = new JButton();
/*  314 */     this.jTextField37 = new JTextField();
/*  315 */     this.jTextField38 = new JTextField();
/*  316 */     this.jTextField39 = new JTextField();
/*  317 */     this.jTextField40 = new JTextField();
/*  318 */     this.jButton12 = new JButton();
/*  319 */     this.jButton13 = new JButton();
/*  320 */     this.jButton14 = new JButton();
/*  321 */     this.jButton15 = new JButton();
/*  322 */     this.jButton16 = new JButton();
/*  323 */     this.jButton17 = new JButton();
/*  324 */     this.jButton18 = new JButton();
/*  325 */     this.jButton19 = new JButton();
/*  326 */     this.jButton20 = new JButton();
/*  327 */     this.jButton21 = new JButton();
/*  328 */     this.jButton22 = new JButton();
/*  329 */     this.jButton23 = new JButton();
/*  330 */     this.jButton24 = new JButton();
/*  331 */     this.jButton25 = new JButton();
/*  332 */     this.jButton26 = new JButton();
/*  333 */     this.jButton27 = new JButton();
/*  334 */     this.jButton28 = new JButton();
/*  335 */     this.jButton29 = new JButton();
/*  336 */     this.jButton30 = new JButton();
/*  337 */     this.jLabel1 = new javax.swing.JLabel();
/*  338 */     this.jLabel2 = new javax.swing.JLabel();
/*  339 */     this.jLabel3 = new javax.swing.JLabel();
/*  340 */     this.jLabel6 = new javax.swing.JLabel();
/*  341 */     this.jLabel7 = new javax.swing.JLabel();
/*  342 */     this.jLabel8 = new javax.swing.JLabel();
/*  343 */     this.jLabel9 = new javax.swing.JLabel();
/*  344 */     this.jLabel10 = new javax.swing.JLabel();
/*  345 */     this.jButton31 = new JButton();
/*      */     
/*  347 */     setDefaultCloseOperation(2);
/*      */     
/*  349 */     this.jPanel1.setBackground(new java.awt.Color(0, 102, 102));
/*  350 */     this.jPanel1.setForeground(new java.awt.Color(102, 102, 255));
/*      */     
/*  352 */     this.jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153)));
/*  353 */     this.jTable1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  354 */     this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  392 */     this.jTable1.setToolTipText("");
/*  393 */     this.jTable1.setCursor(new java.awt.Cursor(12));
/*  394 */     this.jTable1.setGridColor(new java.awt.Color(102, 102, 255));
/*  395 */     this.jTable1.setRowHeight(20);
/*  396 */     this.jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  398 */         EditMenu.this.jTable1MouseClicked(evt);
/*      */       }
/*  400 */     });
/*  401 */     this.jScrollPane1.setViewportView(this.jTable1);
/*  402 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/*  403 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  404 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  405 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  406 */       this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  409 */     this.jTextField1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  411 */         EditMenu.this.jTextField1ActionPerformed(evt);
/*      */       }
/*      */       
/*  414 */     });
/*  415 */     this.jTextField2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  417 */         EditMenu.this.jTextField2ActionPerformed(evt);
/*      */       }
/*      */       
/*  420 */     });
/*  421 */     this.jButton1.setText("INSERT");
/*  422 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  424 */         EditMenu.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  427 */     });
/*  428 */     this.jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  429 */     this.jLabel4.setText("MOMO");
/*      */     
/*  431 */     this.jTable2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  432 */     this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  470 */     this.jTable2.setRowHeight(20);
/*  471 */     this.jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  473 */         EditMenu.this.jTable2MouseClicked(evt);
/*      */       }
/*  475 */     });
/*  476 */     this.jScrollPane2.setViewportView(this.jTable2);
/*  477 */     if (this.jTable2.getColumnModel().getColumnCount() > 0) {
/*  478 */       this.jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  479 */       this.jTable2.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  480 */       this.jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  481 */       this.jTable2.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  484 */     this.jTable3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  485 */     this.jTable3.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  523 */     this.jTable3.setRowHeight(20);
/*  524 */     this.jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  526 */         EditMenu.this.jTable3MouseClicked(evt);
/*      */       }
/*  528 */     });
/*  529 */     this.jScrollPane3.setViewportView(this.jTable3);
/*  530 */     if (this.jTable3.getColumnModel().getColumnCount() > 0) {
/*  531 */       this.jTable3.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  532 */       this.jTable3.getColumnModel().getColumn(1).setResizable(false);
/*  533 */       this.jTable3.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  534 */       this.jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  535 */       this.jTable3.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  538 */     this.jTable4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  539 */     this.jTable4.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "NAME", "TYPE", "PRICE" }));
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
/*  595 */     this.jTable4.setRowHeight(20);
/*  596 */     this.jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  598 */         EditMenu.this.jTable4MouseClicked(evt);
/*      */       }
/*  600 */     });
/*  601 */     this.jScrollPane4.setViewportView(this.jTable4);
/*  602 */     if (this.jTable4.getColumnModel().getColumnCount() > 0) {
/*  603 */       this.jTable4.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  604 */       this.jTable4.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  605 */       this.jTable4.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  606 */       this.jTable4.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  609 */     this.jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  610 */     this.jLabel5.setText("BEVERAGE/LASSI/CIGRATTE");
/*      */     
/*  612 */     this.jTable5.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  613 */     this.jTable5.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  651 */     this.jTable5.setRowHeight(20);
/*  652 */     this.jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  654 */         EditMenu.this.jTable5MouseClicked(evt);
/*      */       }
/*  656 */     });
/*  657 */     this.jScrollPane5.setViewportView(this.jTable5);
/*  658 */     if (this.jTable5.getColumnModel().getColumnCount() > 0) {
/*  659 */       this.jTable5.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  660 */       this.jTable5.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  661 */       this.jTable5.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  662 */       this.jTable5.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  665 */     this.jTable6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  666 */     this.jTable6.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*      */ 
/*      */ 
/*  714 */     this.jTable6.setRowHeight(20);
/*  715 */     this.jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  717 */         EditMenu.this.jTable6MouseClicked(evt);
/*      */       }
/*  719 */     });
/*  720 */     this.jScrollPane6.setViewportView(this.jTable6);
/*  721 */     if (this.jTable6.getColumnModel().getColumnCount() > 0) {
/*  722 */       this.jTable6.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  723 */       this.jTable6.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  724 */       this.jTable6.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  725 */       this.jTable6.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  728 */     this.jTable7.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  729 */     this.jTable7.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  767 */     this.jTable7.setRowHeight(20);
/*  768 */     this.jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  770 */         EditMenu.this.jTable7MouseClicked(evt);
/*      */       }
/*  772 */     });
/*  773 */     this.jScrollPane7.setViewportView(this.jTable7);
/*  774 */     if (this.jTable7.getColumnModel().getColumnCount() > 0) {
/*  775 */       this.jTable7.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  776 */       this.jTable7.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  777 */       this.jTable7.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  778 */       this.jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  781 */     this.jTable8.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  782 */     this.jTable8.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  820 */     this.jTable8.setRowHeight(20);
/*  821 */     this.jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  823 */         EditMenu.this.jTable8MouseClicked(evt);
/*      */       }
/*  825 */     });
/*  826 */     this.jScrollPane8.setViewportView(this.jTable8);
/*  827 */     if (this.jTable8.getColumnModel().getColumnCount() > 0) {
/*  828 */       this.jTable8.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  829 */       this.jTable8.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  830 */       this.jTable8.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  831 */       this.jTable8.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  834 */     this.jTable9.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  835 */     this.jTable9.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  873 */     this.jTable9.setRowHeight(20);
/*  874 */     this.jTable9.setRowSelectionAllowed(false);
/*  875 */     this.jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  877 */         EditMenu.this.jTable9MouseClicked(evt);
/*      */       }
/*  879 */     });
/*  880 */     this.jScrollPane9.setViewportView(this.jTable9);
/*  881 */     if (this.jTable9.getColumnModel().getColumnCount() > 0) {
/*  882 */       this.jTable9.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  883 */       this.jTable9.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  884 */       this.jTable9.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  885 */       this.jTable9.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  888 */     this.jTable10.setFont(new java.awt.Font("Arial Unicode MS", 0, 12));
/*  889 */     this.jTable10.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "PRICE" }));
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
/*  927 */     this.jTable10.setRowHeight(20);
/*  928 */     this.jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  930 */         EditMenu.this.jTable10MouseClicked(evt);
/*      */       }
/*  932 */     });
/*  933 */     this.jScrollPane10.setViewportView(this.jTable10);
/*  934 */     if (this.jTable10.getColumnModel().getColumnCount() > 0) {
/*  935 */       this.jTable10.getColumnModel().getColumn(0).setPreferredWidth(20);
/*  936 */       this.jTable10.getColumnModel().getColumn(1).setResizable(false);
/*  937 */       this.jTable10.getColumnModel().getColumn(1).setPreferredWidth(80);
/*  938 */       this.jTable10.getColumnModel().getColumn(2).setPreferredWidth(50);
/*  939 */       this.jTable10.getColumnModel().getColumn(3).setPreferredWidth(20);
/*      */     }
/*      */     
/*  942 */     this.jButton2.setText("UPDATE");
/*  943 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  945 */         EditMenu.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  948 */     });
/*  949 */     this.jButton3.setText("DELETE");
/*  950 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  952 */         EditMenu.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  955 */     });
/*  956 */     this.jButton4.setText("INSERT");
/*  957 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  959 */         EditMenu.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  962 */     });
/*  963 */     this.jButton5.setText("INSERT");
/*  964 */     this.jButton5.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  966 */         EditMenu.this.jButton5ActionPerformed(evt);
/*      */       }
/*      */       
/*  969 */     });
/*  970 */     this.jButton6.setText("INSERT");
/*  971 */     this.jButton6.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  973 */         EditMenu.this.jButton6ActionPerformed(evt);
/*      */       }
/*      */       
/*  976 */     });
/*  977 */     this.jButton7.setText("INSERT");
/*  978 */     this.jButton7.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  980 */         EditMenu.this.jButton7ActionPerformed(evt);
/*      */       }
/*      */       
/*  983 */     });
/*  984 */     this.jButton8.setText("INSERT");
/*  985 */     this.jButton8.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  987 */         EditMenu.this.jButton8ActionPerformed(evt);
/*      */       }
/*      */       
/*  990 */     });
/*  991 */     this.jButton9.setText("INSERT");
/*  992 */     this.jButton9.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  994 */         EditMenu.this.jButton9ActionPerformed(evt);
/*      */       }
/*      */       
/*  997 */     });
/*  998 */     this.jButton10.setText("INSERT");
/*  999 */     this.jButton10.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1001 */         EditMenu.this.jButton10ActionPerformed(evt);
/*      */       }
/*      */       
/* 1004 */     });
/* 1005 */     this.jButton11.setText("INSERT");
/* 1006 */     this.jButton11.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1008 */         EditMenu.this.jButton11ActionPerformed(evt);
/*      */       }
/*      */       
/* 1011 */     });
/* 1012 */     this.jTextField38.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1014 */         EditMenu.this.jTextField38ActionPerformed(evt);
/*      */       }
/*      */       
/* 1017 */     });
/* 1018 */     this.jButton12.setText("INSERT");
/* 1019 */     this.jButton12.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1021 */         EditMenu.this.jButton12ActionPerformed(evt);
/*      */       }
/*      */       
/* 1024 */     });
/* 1025 */     this.jButton13.setText("UPDATE");
/* 1026 */     this.jButton13.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1028 */         EditMenu.this.jButton13ActionPerformed(evt);
/*      */       }
/*      */       
/* 1031 */     });
/* 1032 */     this.jButton14.setText("UPDATE");
/* 1033 */     this.jButton14.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1035 */         EditMenu.this.jButton14ActionPerformed(evt);
/*      */       }
/*      */       
/* 1038 */     });
/* 1039 */     this.jButton15.setText("UPDATE");
/* 1040 */     this.jButton15.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1042 */         EditMenu.this.jButton15ActionPerformed(evt);
/*      */       }
/*      */       
/* 1045 */     });
/* 1046 */     this.jButton16.setText("UPDATE");
/* 1047 */     this.jButton16.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1049 */         EditMenu.this.jButton16ActionPerformed(evt);
/*      */       }
/*      */       
/* 1052 */     });
/* 1053 */     this.jButton17.setText("UPDATE");
/* 1054 */     this.jButton17.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1056 */         EditMenu.this.jButton17ActionPerformed(evt);
/*      */       }
/*      */       
/* 1059 */     });
/* 1060 */     this.jButton18.setText("UPDATE");
/* 1061 */     this.jButton18.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1063 */         EditMenu.this.jButton18ActionPerformed(evt);
/*      */       }
/*      */       
/* 1066 */     });
/* 1067 */     this.jButton19.setText("UPDATE");
/* 1068 */     this.jButton19.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1070 */         EditMenu.this.jButton19ActionPerformed(evt);
/*      */       }
/*      */       
/* 1073 */     });
/* 1074 */     this.jButton20.setText("UPDATE");
/* 1075 */     this.jButton20.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1077 */         EditMenu.this.jButton20ActionPerformed(evt);
/*      */       }
/*      */       
/* 1080 */     });
/* 1081 */     this.jButton21.setText("UPDATE");
/* 1082 */     this.jButton21.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1084 */         EditMenu.this.jButton21ActionPerformed(evt);
/*      */       }
/*      */       
/* 1087 */     });
/* 1088 */     this.jButton22.setText("DELETE");
/* 1089 */     this.jButton22.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1091 */         EditMenu.this.jButton22ActionPerformed(evt);
/*      */       }
/*      */       
/* 1094 */     });
/* 1095 */     this.jButton23.setText("DELETE");
/* 1096 */     this.jButton23.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1098 */         EditMenu.this.jButton23ActionPerformed(evt);
/*      */       }
/*      */       
/* 1101 */     });
/* 1102 */     this.jButton24.setText("DELETE");
/* 1103 */     this.jButton24.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1105 */         EditMenu.this.jButton24ActionPerformed(evt);
/*      */       }
/*      */       
/* 1108 */     });
/* 1109 */     this.jButton25.setText("DELETE");
/* 1110 */     this.jButton25.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1112 */         EditMenu.this.jButton25ActionPerformed(evt);
/*      */       }
/*      */       
/* 1115 */     });
/* 1116 */     this.jButton26.setText("DELETE");
/* 1117 */     this.jButton26.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1119 */         EditMenu.this.jButton26ActionPerformed(evt);
/*      */       }
/*      */       
/* 1122 */     });
/* 1123 */     this.jButton27.setText("DELETE");
/* 1124 */     this.jButton27.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1126 */         EditMenu.this.jButton27ActionPerformed(evt);
/*      */       }
/*      */       
/* 1129 */     });
/* 1130 */     this.jButton28.setText("DELETE");
/* 1131 */     this.jButton28.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1133 */         EditMenu.this.jButton28ActionPerformed(evt);
/*      */       }
/*      */       
/* 1136 */     });
/* 1137 */     this.jButton29.setText("DELETE");
/* 1138 */     this.jButton29.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1140 */         EditMenu.this.jButton29ActionPerformed(evt);
/*      */       }
/*      */       
/* 1143 */     });
/* 1144 */     this.jButton30.setText("DELETE");
/* 1145 */     this.jButton30.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1147 */         EditMenu.this.jButton30ActionPerformed(evt);
/*      */       }
/*      */       
/* 1150 */     });
/* 1151 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1152 */     this.jLabel1.setText("CHOWMIN/THUKPA/CHOPSEY");
/*      */     
/* 1154 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1155 */     this.jLabel2.setText("FRIED RICE/BIRYANI/SOUP");
/*      */     
/* 1157 */     this.jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14));
/* 1158 */     this.jLabel3.setText("SPRING ROLL/CUTLET/KATTI SOUP");
/*      */     
/* 1160 */     this.jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1161 */     this.jLabel6.setText("PIZZA/BURGER/SANDWITCH/SIZZLER");
/*      */     
/* 1163 */     this.jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1164 */     this.jLabel7.setText("BOILED ITEMS/CURRY");
/*      */     
/* 1166 */     this.jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1167 */     this.jLabel8.setText("KHANA SET/KHAJA SET/ROTI PARAUTHA");
/*      */     
/* 1169 */     this.jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1170 */     this.jLabel9.setText("TOAST/OMLETTE/SALAD/SAUSAGE");
/*      */     
/* 1172 */     this.jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1173 */     this.jLabel10.setText("SNACKS");
/*      */     
/* 1175 */     this.jButton31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
/* 1176 */     this.jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/left-arrow.png")));
/* 1177 */     this.jButton31.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1179 */         EditMenu.this.jButton31ActionPerformed(evt);
/*      */       }
/*      */       
/* 1182 */     });
/* 1183 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 1184 */     this.jPanel1.setLayout(jPanel1Layout);
/* 1185 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 1186 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1187 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1188 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1189 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1190 */       .addGap(10, 10, 10)
/* 1191 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1192 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1193 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1194 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1195 */       .addComponent(this.jButton5)
/* 1196 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1197 */       .addComponent(this.jButton14)
/* 1198 */       .addGap(47, 47, 47)
/* 1199 */       .addComponent(this.jButton23))
/* 1200 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1201 */       .addComponent(this.jScrollPane3, -2, 316, -2)
/* 1202 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 1203 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1204 */       .addComponent(this.jTextField4, -2, 50, -2)
/* 1205 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1206 */       .addComponent(this.jTextField1, -2, 106, -2)
/* 1207 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1208 */       .addComponent(this.jTextField2, -2, 71, -2)
/* 1209 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1210 */       .addComponent(this.jTextField3))
/* 1211 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1212 */       .addComponent(this.jButton1)
/* 1213 */       .addGap(52, 52, 52)
/* 1214 */       .addComponent(this.jButton2)
/* 1215 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1216 */       .addComponent(this.jButton3))
/* 1217 */       .addComponent(this.jScrollPane1, -2, 312, -2))
/* 1218 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 1219 */       .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 1220 */       .addComponent(this.jTextField5, -2, 52, -2)
/* 1221 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1222 */       .addComponent(this.jTextField6, -2, 100, -2)
/* 1223 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1224 */       .addComponent(this.jTextField7, -2, 82, -2)
/* 1225 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1226 */       .addComponent(this.jTextField8))
/* 1227 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1228 */       .addComponent(this.jButton4)
/* 1229 */       .addGap(51, 51, 51)
/* 1230 */       .addComponent(this.jButton13)
/* 1231 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1232 */       .addComponent(this.jButton22))
/* 1233 */       .addComponent(this.jScrollPane2, -2, 315, -2)))
/* 1234 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1235 */       .addGap(52, 52, 52)
/* 1236 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1237 */       .addComponent(this.jLabel1)
/* 1238 */       .addComponent(this.jLabel2, -2, 205, -2)))
/* 1239 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1240 */       .addComponent(this.jTextField9, -2, 48, -2)
/* 1241 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1242 */       .addComponent(this.jTextField10, -2, 109, -2)
/* 1243 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1244 */       .addComponent(this.jTextField11, -2, 77, -2)
/* 1245 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1246 */       .addComponent(this.jTextField12, -2, 64, -2)))
/* 1247 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1248 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1249 */       .addGap(106, 106, 106)
/* 1250 */       .addComponent(this.jLabel7))
/* 1251 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1252 */       .addGap(34, 34, 34)
/* 1253 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1254 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1255 */       .addComponent(this.jTextField13, -2, 53, -2)
/* 1256 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1257 */       .addComponent(this.jTextField14, -2, 102, -2)
/* 1258 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1259 */       .addComponent(this.jTextField15, -2, 75, -2)
/* 1260 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1261 */       .addComponent(this.jTextField16))
/* 1262 */       .addComponent(this.jScrollPane9, -2, 311, -2)
/* 1263 */       .addComponent(this.jScrollPane10, -2, 310, -2)
/* 1264 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1265 */       .addComponent(this.jButton6)
/* 1266 */       .addGap(50, 50, 50)
/* 1267 */       .addComponent(this.jButton15)
/* 1268 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1269 */       .addComponent(this.jButton24, -2, 69, -2))
/* 1270 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1271 */       .addComponent(this.jTextField17, -2, 54, -2)
/* 1272 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1273 */       .addComponent(this.jTextField18, -2, 101, -2)
/* 1274 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1275 */       .addComponent(this.jTextField19, -2, 73, -2)
/* 1276 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1277 */       .addComponent(this.jTextField20))
/* 1278 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1279 */       .addComponent(this.jButton7)
/* 1280 */       .addGap(54, 54, 54)
/* 1281 */       .addComponent(this.jButton16)
/* 1282 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1283 */       .addComponent(this.jButton25))
/* 1284 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 1285 */       .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 1286 */       .addComponent(this.jButton8)
/* 1287 */       .addGap(112, 112, 112))
/* 1288 */       .addComponent(this.jScrollPane7, -2, 310, -2))))
/* 1289 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1290 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1291 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1292 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1293 */       .addComponent(this.jLabel6)
/* 1294 */       .addGap(14, 14, 14))
/* 1295 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1296 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 1297 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1298 */       .addComponent(this.jButton17)
/* 1299 */       .addGap(43, 43, 43)
/* 1300 */       .addComponent(this.jButton26))
/* 1301 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1302 */       .addComponent(this.jTextField21, -2, 53, -2)
/* 1303 */       .addGap(10, 10, 10)
/* 1304 */       .addComponent(this.jTextField22, -2, 98, -2)
/* 1305 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1306 */       .addComponent(this.jTextField23, -2, 73, -2)
/* 1307 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1308 */       .addComponent(this.jTextField24, -2, 64, -2)))
/* 1309 */       .addGap(1, 1, 1))))))
/* 1310 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1311 */       .addComponent(this.jButton31)
/* 1312 */       .addGap(6, 6, 6)
/* 1313 */       .addComponent(this.jLabel4)
/* 1314 */       .addGap(218, 218, 218)
/* 1315 */       .addComponent(this.jLabel3)))
/* 1316 */       .addGap(29, 29, 29)
/* 1317 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1318 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1319 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1320 */       .addComponent(this.jScrollPane8, -2, 312, -2)
/* 1321 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1322 */       .addComponent(this.jTextField25, -2, 51, -2)
/* 1323 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1324 */       .addComponent(this.jTextField26, -2, 103, -2)
/* 1325 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1326 */       .addComponent(this.jTextField27, -2, 78, -2)
/* 1327 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1328 */       .addComponent(this.jTextField28))
/* 1329 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1330 */       .addComponent(this.jButton9)
/* 1331 */       .addGap(48, 48, 48)
/* 1332 */       .addComponent(this.jButton18)
/* 1333 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1334 */       .addComponent(this.jButton27))
/* 1335 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1336 */       .addComponent(this.jTextField29, -2, 48, -2)
/* 1337 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1338 */       .addComponent(this.jTextField30, -2, 102, -2)
/* 1339 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1340 */       .addComponent(this.jTextField31, -2, 75, -2)
/* 1341 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1342 */       .addComponent(this.jTextField32))
/* 1343 */       .addComponent(this.jScrollPane6, GroupLayout.Alignment.TRAILING, -2, 310, -2)
/* 1344 */       .addComponent(this.jScrollPane5, GroupLayout.Alignment.TRAILING, -2, 311, -2)
/* 1345 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1346 */       .addComponent(this.jLabel9, -2, 268, -2)
/* 1347 */       .addGap(18, 18, 18))
/* 1348 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1349 */       .addComponent(this.jButton10)
/* 1350 */       .addGap(52, 52, 52)
/* 1351 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1352 */       .addComponent(this.jLabel10)
/* 1353 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1354 */       .addComponent(this.jButton19)
/* 1355 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1356 */       .addComponent(this.jButton28)))))
/* 1357 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, 32767)
/* 1358 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1359 */       .addComponent(this.jScrollPane4, -2, 291, -2)
/* 1360 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 1361 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1362 */       .addComponent(this.jButton12)
/* 1363 */       .addGap(33, 33, 33)
/* 1364 */       .addComponent(this.jButton21)
/* 1365 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1366 */       .addComponent(this.jButton30))
/* 1367 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1368 */       .addGap(10, 10, 10)
/* 1369 */       .addComponent(this.jTextField37, -2, 40, -2)
/* 1370 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1371 */       .addComponent(this.jTextField38, -2, 91, -2)
/* 1372 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1373 */       .addComponent(this.jTextField39, -2, 76, -2)
/* 1374 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1375 */       .addComponent(this.jTextField40, -2, 57, -2)))))
/* 1376 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1377 */       .addComponent(this.jLabel8, -2, 312, -2)
/* 1378 */       .addGap(46, 46, 46)
/* 1379 */       .addComponent(this.jLabel5)
/* 1380 */       .addGap(0, 0, 32767))))
/* 1381 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1382 */       .addGap(700, 700, 700)
/* 1383 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1384 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1385 */       .addComponent(this.jButton11)
/* 1386 */       .addGap(44, 44, 44)
/* 1387 */       .addComponent(this.jButton20)
/* 1388 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1389 */       .addComponent(this.jButton29))
/* 1390 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1391 */       .addComponent(this.jTextField33, -2, 52, -2)
/* 1392 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1393 */       .addComponent(this.jTextField34, -2, 99, -2)
/* 1394 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1395 */       .addComponent(this.jTextField35, -2, 79, -2)
/* 1396 */       .addGap(18, 18, 18)
/* 1397 */       .addComponent(this.jTextField36, -2, 50, -2)))))
/* 1398 */       .addContainerGap(61, 32767)));
/*      */     
/* 1400 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 1401 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1402 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1403 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1404 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1405 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1406 */       .addComponent(this.jButton31, -2, 27, -2)
/* 1407 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1408 */       .addGap(14, 14, 14)
/* 1409 */       .addComponent(this.jLabel4)))
/* 1410 */       .addGap(14, 14, 14))
/* 1411 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 1412 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 1413 */       .addComponent(this.jLabel3, -1, -1, 32767)
/* 1414 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1415 */       .addComponent(this.jLabel8, -1, -1, 32767)
/* 1416 */       .addComponent(this.jLabel5)))
/* 1417 */       .addGap(18, 18, 18)))
/* 1418 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1419 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1420 */       .addComponent(this.jScrollPane1, -2, 122, -2)
/* 1421 */       .addGap(11, 11, 11)
/* 1422 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1423 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1424 */       .addComponent(this.jTextField1, -2, -1, -2)
/* 1425 */       .addComponent(this.jTextField4, -2, -1, -2))
/* 1426 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1427 */       .addComponent(this.jTextField2, -2, -1, -2)
/* 1428 */       .addComponent(this.jTextField3, -2, -1, -2)))
/* 1429 */       .addGap(6, 6, 6)
/* 1430 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1431 */       .addComponent(this.jButton1)
/* 1432 */       .addComponent(this.jButton2)
/* 1433 */       .addComponent(this.jButton3))
/* 1434 */       .addGap(11, 11, 11)
/* 1435 */       .addComponent(this.jLabel1)
/* 1436 */       .addGap(6, 6, 6)
/* 1437 */       .addComponent(this.jScrollPane2, -2, 122, -2)
/* 1438 */       .addGap(8, 8, 8)
/* 1439 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1440 */       .addComponent(this.jTextField5, -2, -1, -2)
/* 1441 */       .addComponent(this.jTextField6, -2, -1, -2)
/* 1442 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1443 */       .addComponent(this.jTextField7, -2, -1, -2)
/* 1444 */       .addComponent(this.jTextField8, -2, -1, -2)))
/* 1445 */       .addGap(9, 9, 9)
/* 1446 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1447 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1448 */       .addComponent(this.jButton4)
/* 1449 */       .addComponent(this.jButton13))
/* 1450 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1451 */       .addComponent(this.jButton22)
/* 1452 */       .addComponent(this.jButton7)))
/* 1453 */       .addGap(11, 11, 11)
/* 1454 */       .addComponent(this.jLabel2)
/* 1455 */       .addGap(6, 6, 6)
/* 1456 */       .addComponent(this.jScrollPane3, -2, 122, -2)
/* 1457 */       .addGap(18, 18, 18)
/* 1458 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1459 */       .addComponent(this.jTextField9, -2, -1, -2)
/* 1460 */       .addComponent(this.jTextField10, -2, -1, -2)
/* 1461 */       .addComponent(this.jTextField11, -2, -1, -2)
/* 1462 */       .addComponent(this.jTextField12, -2, -1, -2)))
/* 1463 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1464 */       .addGap(3, 3, 3)
/* 1465 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1466 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1467 */       .addComponent(this.jScrollPane9, -2, 122, -2)
/* 1468 */       .addGap(8, 8, 8)
/* 1469 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1470 */       .addComponent(this.jTextField14, -2, -1, -2)
/* 1471 */       .addComponent(this.jTextField13, -2, -1, -2)
/* 1472 */       .addComponent(this.jTextField15, -2, -1, -2))
/* 1473 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1474 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1475 */       .addGap(6, 6, 6)
/* 1476 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1477 */       .addComponent(this.jButton24)
/* 1478 */       .addComponent(this.jButton9)))
/* 1479 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1480 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1481 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1482 */       .addComponent(this.jButton6)
/* 1483 */       .addComponent(this.jButton15))))
/* 1484 */       .addGap(8, 8, 8)
/* 1485 */       .addComponent(this.jLabel6)
/* 1486 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1487 */       .addComponent(this.jScrollPane10, -2, 122, -2)
/* 1488 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1489 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1490 */       .addGap(11, 11, 11)
/* 1491 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1492 */       .addComponent(this.jTextField18, -2, -1, -2)
/* 1493 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1494 */       .addComponent(this.jTextField20, -2, -1, -2)
/* 1495 */       .addComponent(this.jTextField19, -2, -1, -2))))
/* 1496 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1497 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1498 */       .addComponent(this.jTextField17, -2, -1, -2)))
/* 1499 */       .addGap(9, 9, 9)
/* 1500 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1501 */       .addComponent(this.jButton25)
/* 1502 */       .addComponent(this.jButton16))
/* 1503 */       .addGap(11, 11, 11)
/* 1504 */       .addComponent(this.jLabel7)
/* 1505 */       .addGap(7, 7, 7)
/* 1506 */       .addComponent(this.jScrollPane7, -2, 122, -2))
/* 1507 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1508 */       .addComponent(this.jScrollPane8, -2, 122, -2)
/* 1509 */       .addGap(8, 8, 8)
/* 1510 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1511 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1512 */       .addComponent(this.jTextField26, -2, -1, -2)
/* 1513 */       .addComponent(this.jTextField25, -2, -1, -2)
/* 1514 */       .addComponent(this.jTextField16, -2, -1, -2))
/* 1515 */       .addComponent(this.jTextField27, -2, -1, -2)
/* 1516 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1517 */       .addComponent(this.jTextField28, -2, -1, -2)
/* 1518 */       .addComponent(this.jTextField37, -2, -1, -2)
/* 1519 */       .addComponent(this.jTextField38, -2, -1, -2)
/* 1520 */       .addComponent(this.jTextField39, -2, -1, -2)
/* 1521 */       .addComponent(this.jTextField40, -2, -1, -2)))
/* 1522 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1523 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1524 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1525 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1526 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1527 */       .addComponent(this.jButton27)
/* 1528 */       .addComponent(this.jButton12))
/* 1529 */       .addComponent(this.jButton18)
/* 1530 */       .addComponent(this.jButton21))
/* 1531 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1532 */       .addComponent(this.jLabel9, -2, 21, -2)
/* 1533 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 1534 */       .addComponent(this.jScrollPane5, -2, 122, -2)
/* 1535 */       .addGap(8, 8, 8)
/* 1536 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1537 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1538 */       .addComponent(this.jTextField30, -2, -1, -2)
/* 1539 */       .addComponent(this.jTextField29, -2, -1, -2))
/* 1540 */       .addComponent(this.jTextField31, -2, -1, -2)
/* 1541 */       .addComponent(this.jTextField32, -2, -1, -2))
/* 1542 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1543 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1544 */       .addGap(10, 10, 10)
/* 1545 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1546 */       .addComponent(this.jButton28)
/* 1547 */       .addComponent(this.jButton19)))
/* 1548 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 1549 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1550 */       .addComponent(this.jButton10)))
/* 1551 */       .addGap(8, 8, 8)
/* 1552 */       .addComponent(this.jLabel10)
/* 1553 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1554 */       .addComponent(this.jScrollPane6, -2, 122, -2))
/* 1555 */       .addComponent(this.jButton30))))
/* 1556 */       .addGap(18, 18, 18)
/* 1557 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1558 */       .addComponent(this.jTextField21, -2, -1, -2)
/* 1559 */       .addComponent(this.jTextField22, -2, -1, -2)
/* 1560 */       .addComponent(this.jTextField23, -2, -1, -2)
/* 1561 */       .addComponent(this.jTextField24, -2, -1, -2)
/* 1562 */       .addComponent(this.jTextField33, -2, -1, -2)
/* 1563 */       .addComponent(this.jTextField34, -2, -1, -2)
/* 1564 */       .addComponent(this.jTextField35, -2, -1, -2)
/* 1565 */       .addComponent(this.jTextField36, -2, -1, -2)))
/* 1566 */       .addComponent(this.jScrollPane4, -2, 125, -2))
/* 1567 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 1568 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1569 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1570 */       .addComponent(this.jButton17)
/* 1571 */       .addComponent(this.jButton26)
/* 1572 */       .addComponent(this.jButton11))
/* 1573 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1574 */       .addComponent(this.jButton8)
/* 1575 */       .addComponent(this.jButton23)
/* 1576 */       .addComponent(this.jButton14))
/* 1577 */       .addComponent(this.jButton29)
/* 1578 */       .addComponent(this.jButton20)
/* 1579 */       .addComponent(this.jButton5))
/* 1580 */       .addContainerGap(238, 32767)));
/*      */     
/*      */ 
/* 1583 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1584 */     getContentPane().setLayout(layout);
/* 1585 */     layout.setHorizontalGroup(layout
/* 1586 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1587 */       .addGroup(layout.createSequentialGroup()
/* 1588 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 1589 */       .addGap(0, 2363, 32767)));
/*      */     
/* 1591 */     layout.setVerticalGroup(layout
/* 1592 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1593 */       .addComponent(this.jPanel1, -1, -1, 32767));
/*      */     
/*      */ 
/* 1596 */     pack();
/*      */   }
/*      */   
/*      */   private JButton jButton18;
/*      */   private JButton jButton19;
/*      */   private JButton jButton2;
/*      */   
/*      */   private void jTextField2ActionPerformed(ActionEvent evt) {}
/*      */   
/* 1605 */   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) { try { DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
/* 1606 */       int selectedRowIndex = this.jTable1.getSelectedRow();
/* 1607 */       this.jTextField4.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1608 */       this.jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1609 */       this.jTextField2.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1610 */       this.jTextField3.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1613 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     } }
/*      */   
/*      */   private JButton jButton20;
/*      */   private JButton jButton21;
/*      */   private JButton jButton22;
/* 1619 */   private void jButton1ActionPerformed(ActionEvent evt) { try { String name = this.jTextField1.getText();
/* 1620 */       String type = this.jTextField2.getText();
/* 1621 */       String price = this.jTextField3.getText();
/* 1622 */       String code = this.jTextField4.getText();
/* 1623 */       String sql = "insert into menu_table1(item_name,item_type,item_price,item_code)values(?,?,?,?)";
/* 1624 */       this.ps = this.conn.prepareStatement(sql);
/* 1625 */       this.ps.setString(1, name);
/* 1626 */       this.ps.setString(2, type);
/* 1627 */       this.ps.setString(3, price);
/* 1628 */       this.ps.setString(4, code);
/* 1629 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1632 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1634 */     setVisible(false);
/* 1635 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1640 */       this.conn = JavaConnect.connectDb();
/* 1641 */       String name = this.jTextField1.getText();
/* 1642 */       String type = this.jTextField2.getText();
/* 1643 */       String price = this.jTextField3.getText();
/* 1644 */       String code = this.jTextField4.getText();
/* 1645 */       int codeInt = Integer.parseInt(code);
/* 1646 */       String sql = "update menu_table1 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 1647 */       this.ps = this.conn.prepareStatement(sql);
/* 1648 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1651 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 1653 */     setVisible(false);
/* 1654 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1659 */       this.conn = JavaConnect.connectDb();
/* 1660 */       String code = this.jTextField4.getText();
/* 1661 */       int codeInt = Integer.parseInt(code);
/* 1662 */       String sql = "delete from menu_table1 where item_code=" + codeInt;
/* 1663 */       this.ps = this.conn.prepareStatement(sql);
/* 1664 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1667 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 1669 */     setVisible(false);
/* 1670 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1675 */       DefaultTableModel model = (DefaultTableModel)this.jTable2.getModel();
/* 1676 */       int selectedRowIndex = this.jTable2.getSelectedRow();
/* 1677 */       this.jTextField5.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1678 */       this.jTextField6.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1679 */       this.jTextField7.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1680 */       this.jTextField8.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1683 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1689 */       String code = this.jTextField5.getText();
/* 1690 */       String name = this.jTextField6.getText();
/* 1691 */       String type = this.jTextField7.getText();
/* 1692 */       String price = this.jTextField8.getText();
/* 1693 */       String sql = "insert into menu_table2(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1694 */       this.ps = this.conn.prepareStatement(sql);
/* 1695 */       this.ps.setString(1, code);
/* 1696 */       this.ps.setString(2, name);
/* 1697 */       this.ps.setString(3, type);
/* 1698 */       this.ps.setString(4, price);
/* 1699 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1702 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1704 */     setVisible(false);
/* 1705 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1710 */       DefaultTableModel model = (DefaultTableModel)this.jTable3.getModel();
/* 1711 */       int selectedRowIndex = this.jTable3.getSelectedRow();
/* 1712 */       this.jTextField9.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1713 */       this.jTextField10.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1714 */       this.jTextField11.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1715 */       this.jTextField12.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1718 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt)
/*      */   {
/*      */     try
/*      */     {
/* 1728 */       String code = this.jTextField9.getText();
/* 1729 */       String name = this.jTextField10.getText();
/* 1730 */       String type = this.jTextField11.getText();
/* 1731 */       String price = this.jTextField12.getText();
/* 1732 */       String sql = "insert into menu_table3(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1733 */       this.ps = this.conn.prepareStatement(sql);
/* 1734 */       this.ps.setString(1, code);
/* 1735 */       this.ps.setString(2, name);
/* 1736 */       this.ps.setString(3, type);
/* 1737 */       this.ps.setString(4, price);
/* 1738 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1741 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1743 */     setVisible(false);
/* 1744 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1749 */       DefaultTableModel model = (DefaultTableModel)this.jTable9.getModel();
/* 1750 */       int selectedRowIndex = this.jTable9.getSelectedRow();
/* 1751 */       this.jTextField13.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1752 */       this.jTextField14.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1753 */       this.jTextField15.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1754 */       this.jTextField16.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1757 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton6ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1763 */       String code = this.jTextField13.getText();
/* 1764 */       String name = this.jTextField14.getText();
/* 1765 */       String type = this.jTextField15.getText();
/* 1766 */       String price = this.jTextField16.getText();
/* 1767 */       String sql = "insert into menu_table4(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1768 */       this.ps = this.conn.prepareStatement(sql);
/* 1769 */       this.ps.setString(1, code);
/* 1770 */       this.ps.setString(2, name);
/* 1771 */       this.ps.setString(3, type);
/* 1772 */       this.ps.setString(4, price);
/* 1773 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1776 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1778 */     setVisible(false);
/* 1779 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1784 */       DefaultTableModel model = (DefaultTableModel)this.jTable10.getModel();
/* 1785 */       int selectedRowIndex = this.jTable10.getSelectedRow();
/* 1786 */       this.jTextField17.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1787 */       this.jTextField18.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1788 */       this.jTextField19.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1789 */       this.jTextField20.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1792 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton7ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1798 */       String code = this.jTextField17.getText();
/* 1799 */       String name = this.jTextField18.getText();
/* 1800 */       String type = this.jTextField19.getText();
/* 1801 */       String price = this.jTextField20.getText();
/* 1802 */       String sql = "insert into menu_table5(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1803 */       this.ps = this.conn.prepareStatement(sql);
/* 1804 */       this.ps.setString(1, code);
/* 1805 */       this.ps.setString(2, name);
/* 1806 */       this.ps.setString(3, type);
/* 1807 */       this.ps.setString(4, price);
/* 1808 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1811 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1813 */     setVisible(false);
/* 1814 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1819 */       DefaultTableModel model = (DefaultTableModel)this.jTable7.getModel();
/* 1820 */       int selectedRowIndex = this.jTable7.getSelectedRow();
/* 1821 */       this.jTextField21.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1822 */       this.jTextField22.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1823 */       this.jTextField23.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1824 */       this.jTextField24.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1827 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton8ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1833 */       String code = this.jTextField21.getText();
/* 1834 */       String name = this.jTextField22.getText();
/* 1835 */       String type = this.jTextField23.getText();
/* 1836 */       String price = this.jTextField24.getText();
/* 1837 */       String sql = "insert into menu_table6(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1838 */       this.ps = this.conn.prepareStatement(sql);
/* 1839 */       this.ps.setString(1, code);
/* 1840 */       this.ps.setString(2, name);
/* 1841 */       this.ps.setString(3, type);
/* 1842 */       this.ps.setString(4, price);
/* 1843 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1846 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1848 */     setVisible(false);
/* 1849 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1854 */       DefaultTableModel model = (DefaultTableModel)this.jTable8.getModel();
/* 1855 */       int selectedRowIndex = this.jTable8.getSelectedRow();
/* 1856 */       this.jTextField25.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1857 */       this.jTextField26.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1858 */       this.jTextField27.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1859 */       this.jTextField28.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1862 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton9ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1868 */       String code = this.jTextField25.getText();
/* 1869 */       String name = this.jTextField26.getText();
/* 1870 */       String type = this.jTextField27.getText();
/* 1871 */       String price = this.jTextField28.getText();
/* 1872 */       String sql = "insert into menu_table7(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1873 */       this.ps = this.conn.prepareStatement(sql);
/* 1874 */       this.ps.setString(1, code);
/* 1875 */       this.ps.setString(2, name);
/* 1876 */       this.ps.setString(3, type);
/* 1877 */       this.ps.setString(4, price);
/* 1878 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1881 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1883 */     setVisible(false);
/* 1884 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1889 */       DefaultTableModel model = (DefaultTableModel)this.jTable5.getModel();
/* 1890 */       int selectedRowIndex = this.jTable5.getSelectedRow();
/* 1891 */       this.jTextField29.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1892 */       this.jTextField30.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1893 */       this.jTextField31.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1894 */       this.jTextField32.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1897 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton10ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1903 */       String code = this.jTextField29.getText();
/* 1904 */       String name = this.jTextField30.getText();
/* 1905 */       String type = this.jTextField31.getText();
/* 1906 */       String price = this.jTextField32.getText();
/* 1907 */       String sql = "insert into menu_table8(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1908 */       this.ps = this.conn.prepareStatement(sql);
/* 1909 */       this.ps.setString(1, code);
/* 1910 */       this.ps.setString(2, name);
/* 1911 */       this.ps.setString(3, type);
/* 1912 */       this.ps.setString(4, price);
/* 1913 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1916 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1918 */     setVisible(false);
/* 1919 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1924 */       DefaultTableModel model = (DefaultTableModel)this.jTable6.getModel();
/* 1925 */       int selectedRowIndex = this.jTable6.getSelectedRow();
/* 1926 */       this.jTextField33.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1927 */       this.jTextField34.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1928 */       this.jTextField35.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1929 */       this.jTextField36.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1932 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1938 */       String code = this.jTextField33.getText();
/* 1939 */       String name = this.jTextField34.getText();
/* 1940 */       String type = this.jTextField35.getText();
/* 1941 */       String price = this.jTextField36.getText();
/* 1942 */       String sql = "insert into menu_table9(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1943 */       this.ps = this.conn.prepareStatement(sql);
/* 1944 */       this.ps.setString(1, code);
/* 1945 */       this.ps.setString(2, name);
/* 1946 */       this.ps.setString(3, type);
/* 1947 */       this.ps.setString(4, price);
/* 1948 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1951 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1953 */     setVisible(false);
/* 1954 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {
/*      */     try {
/* 1959 */       DefaultTableModel model = (DefaultTableModel)this.jTable4.getModel();
/* 1960 */       int selectedRowIndex = this.jTable4.getSelectedRow();
/* 1961 */       this.jTextField37.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 1962 */       this.jTextField38.setText(model.getValueAt(selectedRowIndex, 1).toString());
/* 1963 */       this.jTextField39.setText(model.getValueAt(selectedRowIndex, 2).toString());
/* 1964 */       this.jTextField40.setText(model.getValueAt(selectedRowIndex, 3).toString());
/*      */     }
/*      */     catch (Exception e) {
/* 1967 */       JOptionPane.showMessageDialog(null, "please select some items  \n click ok and try again", "", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton12ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1973 */       String code = this.jTextField37.getText();
/* 1974 */       String name = this.jTextField38.getText();
/* 1975 */       String type = this.jTextField39.getText();
/* 1976 */       String price = this.jTextField40.getText();
/* 1977 */       String sql = "insert into menu_table10(item_code,item_name,item_type,item_price)values(?,?,?,?)";
/* 1978 */       this.ps = this.conn.prepareStatement(sql);
/* 1979 */       this.ps.setString(1, code);
/* 1980 */       this.ps.setString(2, name);
/* 1981 */       this.ps.setString(3, type);
/* 1982 */       this.ps.setString(4, price);
/* 1983 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 1986 */       JOptionPane.showMessageDialog(null, "please specify items to insert  \n click ok and try again", "", 0);
/*      */     }
/* 1988 */     setVisible(false);
/* 1989 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTextField38ActionPerformed(ActionEvent evt) {}
/*      */   
/*      */   private void jButton19ActionPerformed(ActionEvent evt)
/*      */   {
/*      */     try
/*      */     {
/* 1998 */       this.conn = JavaConnect.connectDb();
/* 1999 */       String code = this.jTextField29.getText();
/* 2000 */       String name = this.jTextField30.getText();
/* 2001 */       String type = this.jTextField31.getText();
/* 2002 */       String price = this.jTextField32.getText();
/* 2003 */       int codeInt = Integer.parseInt(code);
/* 2004 */       String sql = "update menu_table8 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2005 */       this.ps = this.conn.prepareStatement(sql);
/* 2006 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2009 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2011 */     setVisible(false);
/* 2012 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton13ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2017 */       this.conn = JavaConnect.connectDb();
/* 2018 */       String code = this.jTextField5.getText();
/* 2019 */       String name = this.jTextField6.getText();
/* 2020 */       String type = this.jTextField7.getText();
/* 2021 */       String price = this.jTextField8.getText();
/* 2022 */       int codeInt = Integer.parseInt(code);
/* 2023 */       String sql = "update menu_table2 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2024 */       this.ps = this.conn.prepareStatement(sql);
/* 2025 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2028 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2030 */     setVisible(false);
/* 2031 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton14ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2036 */       this.conn = JavaConnect.connectDb();
/* 2037 */       String code = this.jTextField9.getText();
/* 2038 */       String name = this.jTextField10.getText();
/* 2039 */       String type = this.jTextField11.getText();
/* 2040 */       String price = this.jTextField12.getText();
/* 2041 */       int codeInt = Integer.parseInt(code);
/* 2042 */       String sql = "update menu_table3 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2043 */       this.ps = this.conn.prepareStatement(sql);
/* 2044 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2047 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2049 */     setVisible(false);
/* 2050 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton15ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2055 */       this.conn = JavaConnect.connectDb();
/* 2056 */       String code = this.jTextField13.getText();
/* 2057 */       String name = this.jTextField14.getText();
/* 2058 */       String type = this.jTextField15.getText();
/* 2059 */       String price = this.jTextField16.getText();
/* 2060 */       int codeInt = Integer.parseInt(code);
/* 2061 */       String sql = "update menu_table4 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2062 */       this.ps = this.conn.prepareStatement(sql);
/* 2063 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2066 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2068 */     setVisible(false);
/* 2069 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton16ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2074 */       this.conn = JavaConnect.connectDb();
/* 2075 */       String code = this.jTextField17.getText();
/* 2076 */       String name = this.jTextField18.getText();
/* 2077 */       String type = this.jTextField19.getText();
/* 2078 */       String price = this.jTextField20.getText();
/* 2079 */       int codeInt = Integer.parseInt(code);
/* 2080 */       String sql = "update menu_table5 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2081 */       this.ps = this.conn.prepareStatement(sql);
/* 2082 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2085 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2087 */     setVisible(false);
/* 2088 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton17ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2093 */       this.conn = JavaConnect.connectDb();
/* 2094 */       String code = this.jTextField21.getText();
/* 2095 */       String name = this.jTextField22.getText();
/* 2096 */       String type = this.jTextField23.getText();
/* 2097 */       String price = this.jTextField24.getText();
/* 2098 */       int codeInt = Integer.parseInt(code);
/* 2099 */       String sql = "update menu_table6 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2100 */       this.ps = this.conn.prepareStatement(sql);
/* 2101 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2104 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2106 */     setVisible(false);
/* 2107 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton18ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2112 */       this.conn = JavaConnect.connectDb();
/* 2113 */       String code = this.jTextField25.getText();
/* 2114 */       String name = this.jTextField26.getText();
/* 2115 */       String type = this.jTextField27.getText();
/* 2116 */       String price = this.jTextField28.getText();
/* 2117 */       int codeInt = Integer.parseInt(code);
/* 2118 */       String sql = "update menu_table7 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2119 */       this.ps = this.conn.prepareStatement(sql);
/* 2120 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2123 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2125 */     setVisible(false);
/* 2126 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton20ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2131 */       this.conn = JavaConnect.connectDb();
/* 2132 */       String code = this.jTextField33.getText();
/* 2133 */       String name = this.jTextField34.getText();
/* 2134 */       String type = this.jTextField35.getText();
/* 2135 */       String price = this.jTextField36.getText();
/* 2136 */       int codeInt = Integer.parseInt(code);
/* 2137 */       String sql = "update menu_table9 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2138 */       this.ps = this.conn.prepareStatement(sql);
/* 2139 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2142 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2144 */     setVisible(false);
/* 2145 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton21ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2150 */       this.conn = JavaConnect.connectDb();
/* 2151 */       String code = this.jTextField37.getText();
/* 2152 */       String name = this.jTextField38.getText();
/* 2153 */       String type = this.jTextField39.getText();
/* 2154 */       String price = this.jTextField40.getText();
/* 2155 */       int codeInt = Integer.parseInt(code);
/* 2156 */       String sql = "update menu_table10 set item_price='" + price + "',item_name='" + name + "',item_type='" + type + "',item_code='" + code + "' where item_code=" + codeInt;
/* 2157 */       this.ps = this.conn.prepareStatement(sql);
/* 2158 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2161 */       JOptionPane.showMessageDialog(null, "please select item to update  \n click ok and try again", "", 0);
/*      */     }
/* 2163 */     setVisible(false);
/* 2164 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton22ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2169 */       this.conn = JavaConnect.connectDb();
/* 2170 */       String code = this.jTextField5.getText();
/* 2171 */       int codeInt = Integer.parseInt(code);
/* 2172 */       String sql = "delete from menu_table2 where item_code=" + codeInt;
/* 2173 */       this.ps = this.conn.prepareStatement(sql);
/* 2174 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2177 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2179 */     setVisible(false);
/* 2180 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton23ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2185 */       this.conn = JavaConnect.connectDb();
/* 2186 */       String code = this.jTextField9.getText();
/* 2187 */       int codeInt = Integer.parseInt(code);
/* 2188 */       String sql = "delete from menu_table3 where item_code=" + codeInt;
/* 2189 */       this.ps = this.conn.prepareStatement(sql);
/* 2190 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2193 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2195 */     setVisible(false);
/* 2196 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton24ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2201 */       this.conn = JavaConnect.connectDb();
/* 2202 */       String code = this.jTextField13.getText();
/* 2203 */       int codeInt = Integer.parseInt(code);
/* 2204 */       String sql = "delete from menu_table4 where item_code=" + codeInt;
/* 2205 */       this.ps = this.conn.prepareStatement(sql);
/* 2206 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2209 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2211 */     setVisible(false);
/* 2212 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton25ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2217 */       this.conn = JavaConnect.connectDb();
/* 2218 */       String code = this.jTextField17.getText();
/* 2219 */       int codeInt = Integer.parseInt(code);
/* 2220 */       String sql = "delete from menu_table5 where item_code=" + codeInt;
/* 2221 */       this.ps = this.conn.prepareStatement(sql);
/* 2222 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2225 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2227 */     setVisible(false);
/* 2228 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton26ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2233 */       this.conn = JavaConnect.connectDb();
/* 2234 */       String code = this.jTextField21.getText();
/* 2235 */       int codeInt = Integer.parseInt(code);
/* 2236 */       String sql = "delete from menu_table6 where item_code=" + codeInt;
/* 2237 */       this.ps = this.conn.prepareStatement(sql);
/* 2238 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2241 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2243 */     setVisible(false);
/* 2244 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton27ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2249 */       this.conn = JavaConnect.connectDb();
/* 2250 */       String code = this.jTextField25.getText();
/* 2251 */       int codeInt = Integer.parseInt(code);
/* 2252 */       String sql = "delete from menu_table7 where item_code=" + codeInt;
/* 2253 */       this.ps = this.conn.prepareStatement(sql);
/* 2254 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2257 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2259 */     setVisible(false);
/* 2260 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton28ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2265 */       this.conn = JavaConnect.connectDb();
/* 2266 */       String code = this.jTextField29.getText();
/* 2267 */       int codeInt = Integer.parseInt(code);
/* 2268 */       String sql = "delete from menu_table8 where item_code=" + codeInt;
/* 2269 */       this.ps = this.conn.prepareStatement(sql);
/* 2270 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2273 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2275 */     setVisible(false);
/* 2276 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton29ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2281 */       this.conn = JavaConnect.connectDb();
/* 2282 */       String code = this.jTextField33.getText();
/* 2283 */       int codeInt = Integer.parseInt(code);
/* 2284 */       String sql = "delete from menu_table9 where item_code=" + codeInt;
/* 2285 */       this.ps = this.conn.prepareStatement(sql);
/* 2286 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2289 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2291 */     setVisible(false);
/* 2292 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton30ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 2297 */       this.conn = JavaConnect.connectDb();
/* 2298 */       String code = this.jTextField37.getText();
/* 2299 */       int codeInt = Integer.parseInt(code);
/* 2300 */       String sql = "delete from menu_table10 where item_code=" + codeInt;
/* 2301 */       this.ps = this.conn.prepareStatement(sql);
/* 2302 */       this.ps.execute();
/*      */     }
/*      */     catch (Exception e) {
/* 2305 */       JOptionPane.showMessageDialog(null, "please select item to delete  \n click ok and try again", "", 0);
/*      */     }
/* 2307 */     setVisible(false);
/* 2308 */     new EditMenu().setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton31ActionPerformed(ActionEvent evt) {
/* 2312 */     close();
/* 2313 */     Admin a = new Admin();
/* 2314 */     a.setVisible(true);
/*      */   }
/*      */   
/*      */   private JButton jButton23;
/*      */   private JButton jButton24;
/*      */   private JButton jButton25;
/*      */   private JButton jButton26;
/*      */   private JButton jButton27;
/*      */   private JButton jButton28;
/*      */   private JButton jButton29;
/*      */   private JButton jButton3;
/*      */   private JButton jButton30;
/*      */   private JButton jButton31;
/*      */   public static void main(String[] args) {
/* 2328 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 2329 */         if ("Nimbus".equals(info.getName())) {
/* 2330 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 2331 */           break;
/*      */         }
/*      */       }
/*      */     } catch (ClassNotFoundException ex) {
/* 2335 */       java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 2337 */       java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 2339 */       java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 2341 */       java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 2346 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 2348 */         new EditMenu().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
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
/*      */   private javax.swing.JLabel jLabel10;
/*      */   
/*      */   private javax.swing.JLabel jLabel2;
/*      */   
/*      */   private javax.swing.JLabel jLabel3;
/*      */   
/*      */   private javax.swing.JLabel jLabel4;
/*      */   
/*      */   private javax.swing.JLabel jLabel5;
/*      */   
/*      */   private javax.swing.JLabel jLabel6;
/*      */   
/*      */   private javax.swing.JLabel jLabel7;
/*      */   
/*      */   private javax.swing.JLabel jLabel8;
/*      */   
/*      */   private javax.swing.JLabel jLabel9;
/*      */   
/*      */   private javax.swing.JPanel jPanel1;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane10;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane2;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane3;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane4;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane5;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane6;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane7;
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane8;
/*      */   private javax.swing.JScrollPane jScrollPane9;
/*      */   private JTable jTable1;
/*      */   private JTable jTable10;
/*      */   private JTable jTable2;
/*      */   private JTable jTable3;
/*      */   private JTable jTable4;
/*      */   private JTable jTable5;
/*      */   private JTable jTable6;
/*      */   private JTable jTable7;
/*      */   private JTable jTable8;
/*      */   private JTable jTable9;
/*      */   private JTextField jTextField1;
/*      */   private JTextField jTextField10;
/*      */   private JTextField jTextField11;
/*      */   private JTextField jTextField12;
/*      */   private JTextField jTextField13;
/*      */   private JTextField jTextField14;
/*      */   private JTextField jTextField15;
/*      */   private JTextField jTextField16;
/*      */   private JTextField jTextField17;
/*      */   private JTextField jTextField18;
/*      */   private JTextField jTextField19;
/*      */   private JTextField jTextField2;
/*      */   private JTextField jTextField20;
/*      */   private JTextField jTextField21;
/*      */   private JTextField jTextField22;
/*      */   private JTextField jTextField23;
/*      */   private JTextField jTextField24;
/*      */   private JTextField jTextField25;
/*      */   private JTextField jTextField26;
/*      */   private JTextField jTextField27;
/*      */   private JTextField jTextField28;
/*      */   private JTextField jTextField29;
/*      */   private JTextField jTextField3;
/*      */   private JTextField jTextField30;
/*      */   private JTextField jTextField31;
/*      */   private JTextField jTextField32;
/*      */   private JTextField jTextField33;
/*      */   private JTextField jTextField34;
/*      */   private JTextField jTextField35;
/*      */   private JTextField jTextField36;
/*      */   private JTextField jTextField37;
/*      */   private JTextField jTextField38;
/*      */   private JTextField jTextField39;
/*      */   private JTextField jTextField4;
/*      */   private JTextField jTextField40;
/*      */   private JTextField jTextField5;
/*      */   private JTextField jTextField6;
/*      */   private JTextField jTextField7;
/*      */   private JTextField jTextField8;
/*      */   private JTextField jTextField9;
/*      */   private void close()
/*      */   {
/* 2458 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 2459 */     java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*      */   }
/*      */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\EditMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
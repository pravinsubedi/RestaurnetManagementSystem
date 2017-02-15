/*      */ package resturentapp;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.io.PrintStream;
/*      */ import java.sql.Connection;
/*      */ import java.sql.PreparedStatement;
/*      */ import java.sql.ResultSet;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle.ComponentPlacement;
/*      */ import javax.swing.table.DefaultTableModel;
/*      */ import javax.swing.table.TableColumn;
/*      */ import javax.swing.table.TableColumnModel;
/*      */ import javax.swing.table.TableModel;
/*      */ import org.jfree.chart.ChartFrame;
/*      */ import org.jfree.chart.JFreeChart;
/*      */ import org.jfree.chart.plot.CategoryPlot;
/*      */ import org.jfree.chart.renderer.category.BarRenderer;
/*      */ import org.jfree.data.category.DefaultCategoryDataset;
/*      */ 
/*      */ public class AdminPanel extends javax.swing.JFrame
/*      */ {
/*   34 */   Connection conn = null;
/*   35 */   ResultSet rs = null;
/*   36 */   PreparedStatement ps = null;
/*      */   int totalToday;
/*      */   int expenseToday;
/*      */   int totalMonth;
/*      */   int expenseMonth;
/*      */   int totalYear;
/*      */   int expenseYear;
/*      */   private datechooser.beans.DateChooserDialog dateChooserDialog1;
/*      */   private JButton jButton1;
/*      */   private JButton jButton10;
/*      */   private JButton jButton11;
/*      */   private JButton jButton12;
/*      */   
/*      */   public AdminPanel()
/*      */   {
/*   47 */     initComponents();
/*   48 */     String todayDate = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*   49 */     this.jLabel8.setText(todayDate);
/*   50 */     this.conn = JavaConnect.connectDb();
/*      */     try {
/*   52 */       String sql = "select * from income_table";
/*   53 */       this.ps = this.conn.prepareStatement(sql);
/*   54 */       this.rs = this.ps.executeQuery();
/*   55 */       int i = 0;
/*   56 */       this.totalToday = 0;
/*   57 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*   58 */       while (this.rs.next()) {
/*   59 */         Object date = this.rs.getString("date");
/*   60 */         Object subTotal = this.rs.getString("total");
/*   61 */         int st = Integer.parseInt((String)subTotal);
/*   62 */         if (date.equals(d)) {
/*   63 */           this.totalToday = (st + this.totalToday);
/*      */         }
/*   65 */         this.jTextField1.setText(String.valueOf(this.totalToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*   71 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*   74 */       String sql = "select * from expense_table";
/*   75 */       this.ps = this.conn.prepareStatement(sql);
/*   76 */       this.rs = this.ps.executeQuery();
/*   77 */       int i = 0;
/*   78 */       this.expenseToday = 0;
/*   79 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*   80 */       while (this.rs.next()) {
/*   81 */         Object date = this.rs.getString("date");
/*   82 */         Object subTotal = this.rs.getString("amount");
/*   83 */         int st = Integer.parseInt((String)subTotal);
/*   84 */         if (date.equals(d)) {
/*   85 */           this.expenseToday = (st + this.expenseToday);
/*      */         }
/*   87 */         this.jTextField2.setText(String.valueOf(this.expenseToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*   93 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*   95 */     if (this.totalToday >= this.expenseToday)
/*      */     {
/*   96 */       this.jLabel11.setText("PROFIT");
/*   97 */       this.jTextField3.setText(String.valueOf(this.totalToday - this.expenseToday));
/*      */     }
/*      */     else
/*      */     {
/*  100 */       this.jLabel11.setText("LOSS");
/*  101 */       this.jTextField3.setText(String.valueOf(this.expenseToday - this.totalToday));
/*      */     }
/*      */     try
/*      */     {
/*  105 */       int i = 0;int j = 0;
/*  106 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  107 */       this.conn = JavaConnect.connectDb();
/*  108 */       String sql = "select * from history_table";
/*  109 */       this.ps = this.conn.prepareStatement(sql);
/*  110 */       ResultSet a = this.ps.executeQuery();
/*  111 */       while (a.next()) {
/*  112 */         Object date = a.getString("date");
/*  113 */         if (date.equals(today)) {
/*  114 */           i++;
/*      */         }
/*      */       }
/*  117 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/*  118 */       dtm.setRowCount(i);
/*  119 */       String sql1 = "select * from history_table order by time desc";
/*  120 */       this.ps = this.conn.prepareStatement(sql1);
/*  121 */       ResultSet rs = this.ps.executeQuery();
/*  122 */       while (rs.next())
/*      */       {
/*  123 */         Object date = rs.getString("date");
/*  124 */         if (date.equals(today))
/*      */         {
/*  125 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/*  126 */           Object item = rs.getString("item");
/*  127 */           Object type = rs.getString("type");
/*  128 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/*  129 */           Object d = rs.getString("date");
/*  130 */           Object t = rs.getString("time");
/*  131 */           this.jTable1.getModel().setValueAt(o, j, 0);
/*  132 */           this.jTable1.getModel().setValueAt(d, j, 1);
/*  133 */           this.jTable1.getModel().setValueAt(t, j, 2);
/*  134 */           this.jTable1.getModel().setValueAt(item, j, 3);
/*  135 */           this.jTable1.getModel().setValueAt(type, j, 4);
/*  136 */           this.jTable1.getModel().setValueAt(q, j, 5);
/*  137 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  143 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/*  146 */       int i = 0;int j = 0;
/*  147 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  148 */       this.conn = JavaConnect.connectDb();
/*  149 */       String sql = "select * from expense_table";
/*  150 */       this.ps = this.conn.prepareStatement(sql);
/*  151 */       ResultSet a = this.ps.executeQuery();
/*  152 */       while (a.next()) {
/*  153 */         Object date = a.getString("date");
/*  154 */         if (date.equals(today)) {
/*  155 */           i++;
/*      */         }
/*      */       }
/*  158 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/*  159 */       dtm.setRowCount(i);
/*  160 */       String sql1 = "select * from expense_table order by time desc";
/*  161 */       this.ps = this.conn.prepareStatement(sql1);
/*  162 */       ResultSet rs = this.ps.executeQuery();
/*  163 */       while (rs.next())
/*      */       {
/*  164 */         Object date = rs.getString("date");
/*  165 */         if (date.equals(today))
/*      */         {
/*  166 */           Object time = rs.getString("time");
/*  167 */           Object name = rs.getString("name");
/*  168 */           Object amount = rs.getString("amount");
/*  169 */           this.jTable4.getModel().setValueAt(date, j, 0);
/*  170 */           this.jTable4.getModel().setValueAt(time, j, 1);
/*  171 */           this.jTable4.getModel().setValueAt(name, j, 2);
/*  172 */           this.jTable4.getModel().setValueAt(amount, j, 3);
/*  173 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  178 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/*  181 */       int i = 0;int j = 0;
/*  182 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  183 */       this.conn = JavaConnect.connectDb();
/*  184 */       String sql = "select date,item from history_table where date='" + today + "' group by item";
/*  185 */       this.ps = this.conn.prepareStatement(sql);
/*  186 */       ResultSet a = this.ps.executeQuery();
/*  187 */       while (a.next())
/*      */       {
/*      */ 
/*  190 */         i++;
/*      */       }
/*      */       
/*  193 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/*  194 */       dtm.setRowCount(i);
/*  195 */       String sql1 = "select date,item,sum(quantity) from history_table where date='" + today + "' group by item order by sum(quantity) desc";
/*  196 */       this.ps = this.conn.prepareStatement(sql1);
/*  197 */       ResultSet rs = this.ps.executeQuery();
/*  198 */       while (rs.next())
/*      */       {
/*  201 */         Object type = rs.getString(2);
/*  202 */         int count = rs.getInt(3);
/*  203 */         this.jTable2.getModel().setValueAt(type, j, 0);
/*  204 */         this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/*  205 */         if (j == 0) {
/*  206 */           this.jLabel13.setText((String)type);
/*      */         }
/*  208 */         j++;
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  213 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/*  216 */       int i = 0;int j = 0;
/*  217 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  218 */       this.conn = JavaConnect.connectDb();
/*  219 */       String sql = "select date,name from expense_table where date='" + today + "'group by name";
/*  220 */       this.ps = this.conn.prepareStatement(sql);
/*  221 */       ResultSet a = this.ps.executeQuery();
/*  222 */       while (a.next())
/*      */       {
/*      */ 
/*  225 */         i++;
/*      */       }
/*      */       
/*  228 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/*  229 */       dtm.setRowCount(i);
/*  230 */       String sql1 = "select date,name,sum(amount) from expense_table where date='" + today + "' group by name order by sum(amount) desc";
/*  231 */       this.ps = this.conn.prepareStatement(sql1);
/*  232 */       ResultSet rs = this.ps.executeQuery();
/*  233 */       while (rs.next())
/*      */       {
/*  236 */         Object expense = rs.getString(2);
/*  237 */         int total = rs.getInt(3);
/*  238 */         this.jTable3.getModel().setValueAt(expense, j, 0);
/*  239 */         this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/*  240 */         j++;
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  245 */       System.out.println(e);
/*      */     }
/*      */   }
/*      */   
/*      */   private JButton jButton2;
/*      */   private JButton jButton3;
/*      */   private JButton jButton4;
/*      */   private JButton jButton5;
/*      */   private JButton jButton6;
/*      */   private JButton jButton7;
/*      */   private JButton jButton8;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*  258 */     this.dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
/*  259 */     this.jPanel1 = new javax.swing.JPanel();
/*  260 */     this.jButton1 = new JButton();
/*  261 */     this.jButton2 = new JButton();
/*  262 */     this.jButton3 = new JButton();
/*  263 */     this.jButton4 = new JButton();
/*  264 */     this.jButton5 = new JButton();
/*  265 */     this.jButton6 = new JButton();
/*  266 */     this.jButton7 = new JButton();
/*  267 */     this.jButton8 = new JButton();
/*  268 */     this.jButton10 = new JButton();
/*  269 */     this.jButton11 = new JButton();
/*  270 */     this.jButton12 = new JButton();
/*  271 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  272 */     this.jTable1 = new JTable();
/*  273 */     this.jScrollPane2 = new javax.swing.JScrollPane();
/*  274 */     this.jTable4 = new JTable();
/*  275 */     this.jPanel2 = new javax.swing.JPanel();
/*  276 */     this.jLabel8 = new JLabel();
/*  277 */     this.jLabel9 = new JLabel();
/*  278 */     this.jLabel10 = new JLabel();
/*  279 */     this.jTextField1 = new JTextField();
/*  280 */     this.jTextField2 = new JTextField();
/*  281 */     this.jLabel11 = new JLabel();
/*  282 */     this.jTextField3 = new JTextField();
/*  283 */     this.jButton9 = new JButton();
/*  284 */     this.jLabel12 = new JLabel();
/*  285 */     this.jLabel13 = new JLabel();
/*  286 */     this.jLabel1 = new JLabel();
/*  287 */     this.jLabel14 = new JLabel();
/*  288 */     this.jLabel15 = new JLabel();
/*  289 */     this.jScrollPane3 = new javax.swing.JScrollPane();
/*  290 */     this.jTable2 = new JTable();
/*  291 */     this.jScrollPane4 = new javax.swing.JScrollPane();
/*  292 */     this.jTable3 = new JTable();
/*  293 */     this.jLabel3 = new JLabel();
/*  294 */     this.jLabel4 = new JLabel();
/*  295 */     this.jLabel5 = new JLabel();
/*  296 */     this.jLabel6 = new JLabel();
/*  297 */     this.jLabel7 = new JLabel();
/*      */     
/*  299 */     setDefaultCloseOperation(3);
/*      */     
/*  301 */     this.jPanel1.setBackground(new Color(255, 204, 51));
/*      */     
/*  303 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 12));
/*  304 */     this.jButton1.setText("DAILY BASIS STATSTICS");
/*  305 */     this.jButton1.setFocusPainted(false);
/*  306 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  308 */         AdminPanel.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  311 */     });
/*  312 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 12));
/*  313 */     this.jButton2.setText("MONTHLY BASIS STATSTICS");
/*  314 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  316 */         AdminPanel.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  319 */     });
/*  320 */     this.jButton3.setFont(new Font("Montserrat Hairline", 0, 12));
/*  321 */     this.jButton3.setText("EDIT MENU");
/*  322 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  324 */         AdminPanel.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  327 */     });
/*  328 */     this.jButton4.setFont(new Font("Montserrat Hairline", 0, 12));
/*  329 */     this.jButton4.setText("THIS YEAR'S BUSSINESS");
/*  330 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  332 */         AdminPanel.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  335 */     });
/*  336 */     this.jButton5.setFont(new Font("Montserrat Hairline", 0, 12));
/*  337 */     this.jButton5.setText("TODAY'S BUSSINESS");
/*  338 */     this.jButton5.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  340 */         AdminPanel.this.jButton5ActionPerformed(evt);
/*      */       }
/*      */       
/*  343 */     });
/*  344 */     this.jButton6.setFont(new Font("Montserrat Hairline", 0, 12));
/*  345 */     this.jButton6.setText("THIS MONTH'S BUSSINESS");
/*  346 */     this.jButton6.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  348 */         AdminPanel.this.jButton6ActionPerformed(evt);
/*      */       }
/*      */       
/*  351 */     });
/*  352 */     this.jButton7.setFont(new Font("Montserrat Hairline", 0, 12));
/*  353 */     this.jButton7.setText("YEARLY BASIS STATISTICS");
/*  354 */     this.jButton7.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  356 */         AdminPanel.this.jButton7ActionPerformed(evt);
/*      */       }
/*      */       
/*  359 */     });
/*  360 */     this.jButton8.setFont(new Font("Montserrat Hairline", 0, 12));
/*  361 */     this.jButton8.setText("CALCULATOR");
/*  362 */     this.jButton8.setFocusPainted(false);
/*  363 */     this.jButton8.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  365 */         AdminPanel.this.jButton8ActionPerformed(evt);
/*      */       }
/*      */       
/*  368 */     });
/*  369 */     this.jButton10.setFont(new Font("Montserrat Hairline", 0, 12));
/*  370 */     this.jButton10.setText("ADD EXPENSE");
/*  371 */     this.jButton10.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  373 */         AdminPanel.this.jButton10ActionPerformed(evt);
/*      */       }
/*      */       
/*  376 */     });
/*  377 */     this.jButton11.setFont(new Font("Montserrat Hairline", 0, 12));
/*  378 */     this.jButton11.setText("LOG OUT");
/*  379 */     this.jButton11.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  381 */         AdminPanel.this.jButton11ActionPerformed(evt);
/*      */       }
/*      */       
/*  384 */     });
/*  385 */     this.jButton12.setFont(new Font("Montserrat Hairline", 0, 12));
/*  386 */     this.jButton12.setText("CHANGE PASSWORD");
/*  387 */     this.jButton12.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  389 */         AdminPanel.this.jButton12ActionPerformed(evt);
/*      */       }
/*      */       
/*  392 */     });
/*  393 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  394 */     this.jPanel1.setLayout(jPanel1Layout);
/*  395 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  396 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  397 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  398 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  399 */       .addComponent(this.jButton1, -1, -1, 32767)
/*  400 */       .addComponent(this.jButton2, -2, 215, -2)
/*  401 */       .addComponent(this.jButton3, -1, -1, 32767)
/*  402 */       .addComponent(this.jButton4, -1, -1, 32767)
/*  403 */       .addComponent(this.jButton5, -1, -1, 32767)
/*  404 */       .addComponent(this.jButton6, -1, 216, 32767)
/*  405 */       .addComponent(this.jButton8, -1, -1, 32767)
/*  406 */       .addComponent(this.jButton7, -1, -1, 32767)
/*  407 */       .addComponent(this.jButton10, -1, -1, 32767)
/*  408 */       .addComponent(this.jButton11, -1, -1, 32767)
/*  409 */       .addComponent(this.jButton12, -1, -1, 32767))
/*  410 */       .addContainerGap(-1, 32767)));
/*      */     
/*  412 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  413 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  414 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  415 */       .addGap(51, 51, 51)
/*  416 */       .addComponent(this.jButton3, -2, 35, -2)
/*  417 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  418 */       .addComponent(this.jButton5, -2, 35, -2)
/*  419 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  420 */       .addComponent(this.jButton6, -2, 35, -2)
/*  421 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  422 */       .addComponent(this.jButton4, -2, 35, -2)
/*  423 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  424 */       .addComponent(this.jButton1, -2, 35, -2)
/*  425 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  426 */       .addComponent(this.jButton2, -2, 35, -2)
/*  427 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  428 */       .addComponent(this.jButton7, -2, 35, -2)
/*  429 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  430 */       .addComponent(this.jButton8, -2, 35, -2)
/*  431 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  432 */       .addComponent(this.jButton10, -2, 35, -2)
/*  433 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  434 */       .addComponent(this.jButton11, -2, 35, -2)
/*  435 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  436 */       .addComponent(this.jButton12, -2, 35, -2)
/*  437 */       .addContainerGap(258, 32767)));
/*      */     
/*      */ 
/*  440 */     this.jTable1.setFont(new Font("Poppins Light", 0, 12));
/*  441 */     this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null } }, new String[] { "Table", "Date", "Time", "Food", "Type", "No." }));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  473 */     this.jTable1.setGridColor(new Color(0, 153, 204));
/*  474 */     this.jTable1.setRowHeight(22);
/*  475 */     this.jScrollPane1.setViewportView(this.jTable1);
/*  476 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/*  477 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
/*  478 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
/*  479 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
/*  480 */       this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
/*  481 */       this.jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
/*  482 */       this.jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
/*      */     }
/*      */     
/*  485 */     this.jTable4.setFont(new Font("Poppins Light", 0, 12));
/*  486 */     this.jTable4.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Date", "Time", "Expense", "Amount(Rs.)" }));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  522 */     this.jTable4.setGridColor(new Color(0, 153, 204));
/*  523 */     this.jTable4.setRowHeight(22);
/*  524 */     this.jScrollPane2.setViewportView(this.jTable4);
/*  525 */     if (this.jTable4.getColumnModel().getColumnCount() > 0) {
/*  526 */       this.jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
/*  527 */       this.jTable4.getColumnModel().getColumn(1).setPreferredWidth(100);
/*  528 */       this.jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
/*  529 */       this.jTable4.getColumnModel().getColumn(3).setPreferredWidth(40);
/*      */     }
/*      */     
/*  532 */     this.jLabel8.setFont(new Font("Montserrat Hairline", 0, 18));
/*      */     
/*  534 */     this.jLabel9.setFont(new Font("Montserrat Hairline", 0, 18));
/*  535 */     this.jLabel9.setText("INCOME:");
/*      */     
/*  537 */     this.jLabel10.setFont(new Font("Montserrat Hairline", 0, 18));
/*  538 */     this.jLabel10.setText("EXPENSE:");
/*      */     
/*  540 */     this.jTextField1.setFont(new Font("Poppins Light", 0, 18));
/*      */     
/*  542 */     this.jTextField2.setFont(new Font("Poppins Light", 0, 18));
/*  543 */     this.jTextField2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  545 */         AdminPanel.this.jTextField2ActionPerformed(evt);
/*      */       }
/*      */       
/*  548 */     });
/*  549 */     this.jLabel11.setFont(new Font("Montserrat Hairline", 0, 18));
/*      */     
/*  551 */     this.jTextField3.setFont(new Font("Poppins Light", 0, 18));
/*      */     
/*  553 */     this.jButton9.setFont(new Font("Montserrat Hairline", 0, 18));
/*  554 */     this.jButton9.setText("SHOW IN GRAPH");
/*  555 */     this.jButton9.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  557 */         AdminPanel.this.jButton9ActionPerformed(evt);
/*      */       }
/*      */       
/*  560 */     });
/*  561 */     this.jLabel12.setFont(new Font("Montserrat Hairline", 0, 18));
/*  562 */     this.jLabel12.setText("FOOD OF THE DAY:");
/*      */     
/*  564 */     this.jLabel13.setFont(new Font("Poppins Light", 0, 18));
/*  565 */     this.jLabel13.setForeground(new Color(204, 0, 0));
/*      */     
/*  567 */     this.jLabel1.setFont(new Font("Poppins Light", 0, 18));
/*  568 */     this.jLabel1.setText("Rs.");
/*      */     
/*  570 */     this.jLabel14.setFont(new Font("Poppins Light", 0, 18));
/*  571 */     this.jLabel14.setText("Rs.");
/*      */     
/*  573 */     this.jLabel15.setFont(new Font("Poppins Light", 0, 18));
/*  574 */     this.jLabel15.setText("Rs.");
/*      */     
/*  576 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  577 */     this.jPanel2.setLayout(jPanel2Layout);
/*  578 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  579 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  580 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  581 */       .addGap(200, 200, 200)
/*  582 */       .addComponent(this.jLabel8, -2, 146, -2))
/*  583 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  584 */       .addGap(80, 80, 80)
/*  585 */       .addComponent(this.jLabel9, -2, 120, -2)
/*  586 */       .addGap(70, 70, 70)
/*  587 */       .addComponent(this.jLabel14)
/*  588 */       .addGap(16, 16, 16)
/*  589 */       .addComponent(this.jTextField1, -2, 121, -2))
/*  590 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  591 */       .addGap(80, 80, 80)
/*  592 */       .addComponent(this.jLabel10)
/*  593 */       .addGap(99, 99, 99)
/*  594 */       .addComponent(this.jLabel1)
/*  595 */       .addGap(18, 18, 18)
/*  596 */       .addComponent(this.jTextField2, -2, 121, -2))
/*  597 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  598 */       .addGap(80, 80, 80)
/*  599 */       .addComponent(this.jLabel11, -2, 117, -2)
/*  600 */       .addGap(71, 71, 71)
/*  601 */       .addComponent(this.jLabel15)
/*  602 */       .addGap(18, 18, 18)
/*  603 */       .addComponent(this.jTextField3, -2, 121, -2))
/*  604 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  605 */       .addGap(80, 80, 80)
/*  606 */       .addComponent(this.jButton9, -2, 350, -2))
/*  607 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  608 */       .addGap(80, 80, 80)
/*  609 */       .addComponent(this.jLabel12)
/*  610 */       .addGap(58, 58, 58)
/*  611 */       .addComponent(this.jLabel13, -2, 220, -2)));
/*      */     
/*  613 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  614 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  615 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  616 */       .addGap(10, 10, 10)
/*  617 */       .addComponent(this.jLabel8, -2, 31, -2)
/*  618 */       .addGap(19, 19, 19)
/*  619 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  620 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  621 */       .addGap(10, 10, 10)
/*  622 */       .addComponent(this.jLabel9, -2, 27, -2))
/*  623 */       .addComponent(this.jLabel14, -2, 30, -2)
/*  624 */       .addComponent(this.jTextField1, -2, 30, -2))
/*  625 */       .addGap(13, 13, 13)
/*  626 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  627 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  628 */       .addGap(10, 10, 10)
/*  629 */       .addComponent(this.jLabel10))
/*  630 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  631 */       .addComponent(this.jTextField2, -2, 30, -2)
/*  632 */       .addComponent(this.jLabel1, -2, 30, -2)))
/*  633 */       .addGap(20, 20, 20)
/*  634 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  635 */       .addComponent(this.jLabel11, -2, 35, -2)
/*  636 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  637 */       .addComponent(this.jTextField3, -2, 30, -2)
/*  638 */       .addComponent(this.jLabel15, -2, 30, -2)))
/*  639 */       .addGap(25, 25, 25)
/*  640 */       .addComponent(this.jButton9, -2, 30, -2)
/*  641 */       .addGap(10, 10, 10)
/*  642 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  643 */       .addComponent(this.jLabel12, -2, 52, -2)
/*  644 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  645 */       .addGap(10, 10, 10)
/*  646 */       .addComponent(this.jLabel13, -2, 39, -2)))));
/*      */     
/*      */ 
/*  649 */     this.jTable2.setFont(new Font("Poppins Light", 0, 12));
/*  650 */     this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Food", "No. of sell" }));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  684 */     this.jTable2.setRowHeight(23);
/*  685 */     this.jTable2.setShowHorizontalLines(false);
/*  686 */     this.jTable2.setShowVerticalLines(false);
/*  687 */     this.jScrollPane3.setViewportView(this.jTable2);
/*  688 */     if (this.jTable2.getColumnModel().getColumnCount() > 0) {
/*  689 */       this.jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
/*  690 */       this.jTable2.getColumnModel().getColumn(1).setPreferredWidth(25);
/*      */     }
/*      */     
/*  693 */     this.jTable3.setFont(new Font("Poppins Light", 0, 12));
/*  694 */     this.jTable3.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Expense", "Amount (Rs.)" }));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  732 */     this.jTable3.setRowHeight(23);
/*  733 */     this.jTable3.setShowHorizontalLines(false);
/*  734 */     this.jTable3.setShowVerticalLines(false);
/*  735 */     this.jScrollPane4.setViewportView(this.jTable3);
/*  736 */     if (this.jTable3.getColumnModel().getColumnCount() > 0) {
/*  737 */       this.jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
/*  738 */       this.jTable3.getColumnModel().getColumn(1).setPreferredWidth(25);
/*      */     }
/*      */     
/*  741 */     this.jLabel3.setFont(new Font("Montserrat Hairline", 0, 18));
/*  742 */     this.jLabel3.setText("ORDER HISTORY");
/*      */     
/*  744 */     this.jLabel4.setFont(new Font("Montserrat Hairline", 0, 18));
/*  745 */     this.jLabel4.setText("EXPENSE HISTORY");
/*      */     
/*  747 */     this.jLabel5.setFont(new Font("Montserrat Hairline", 0, 24));
/*  748 */     this.jLabel5.setText("TODAY'S BUSSINESS");
/*      */     
/*  750 */     this.jLabel6.setFont(new Font("Montserrat Hairline", 0, 18));
/*  751 */     this.jLabel6.setText("MAXIMUN SELL");
/*      */     
/*  753 */     this.jLabel7.setFont(new Font("Montserrat Hairline", 0, 18));
/*  754 */     this.jLabel7.setText("MAXIMUM EXPENSE");
/*      */     
/*  756 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  757 */     getContentPane().setLayout(layout);
/*  758 */     layout.setHorizontalGroup(layout
/*  759 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  760 */       .addGroup(layout.createSequentialGroup()
/*  761 */       .addComponent(this.jPanel1, -2, 218, -2)
/*  762 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  763 */       .addGroup(layout.createSequentialGroup()
/*  764 */       .addGap(56, 56, 56)
/*  765 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  766 */       .addComponent(this.jScrollPane3, -2, 252, -2)
/*  767 */       .addGroup(layout.createSequentialGroup()
/*  768 */       .addGap(43, 43, 43)
/*  769 */       .addComponent(this.jLabel6)))
/*  770 */       .addGap(27, 27, 27)
/*  771 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  772 */       .addComponent(this.jScrollPane4, -2, 255, -2)
/*  773 */       .addGroup(layout.createSequentialGroup()
/*  774 */       .addGap(39, 39, 39)
/*  775 */       .addComponent(this.jLabel7)))
/*  776 */       .addGap(18, 18, 18))
/*  777 */       .addGroup(layout.createSequentialGroup()
/*  778 */       .addGap(37, 37, 37)
/*  779 */       .addComponent(this.jPanel2, -1, -1, 32767)
/*  780 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
/*  781 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  782 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  783 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  784 */       .addComponent(this.jScrollPane1)
/*  785 */       .addComponent(this.jScrollPane2, -1, 523, 32767))
/*  786 */       .addContainerGap())
/*  787 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  788 */       .addComponent(this.jLabel4)
/*  789 */       .addGap(176, 176, 176))))
/*  790 */       .addGroup(layout.createSequentialGroup()
/*  791 */       .addGap(381, 381, 381)
/*  792 */       .addComponent(this.jLabel5, -2, 355, -2)
/*  793 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  794 */       .addComponent(this.jLabel3, -2, 213, -2)
/*  795 */       .addGap(134, 134, 134)));
/*      */     
/*  797 */     layout.setVerticalGroup(layout
/*  798 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  799 */       .addGroup(layout.createSequentialGroup()
/*  800 */       .addComponent(this.jPanel1, -2, -1, -2)
/*  801 */       .addGap(0, 0, 32767))
/*  802 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  803 */       .addContainerGap()
/*  804 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  805 */       .addComponent(this.jLabel3, -2, 32, -2)
/*  806 */       .addComponent(this.jLabel5, -2, 33, -2))
/*  807 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  808 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  809 */       .addComponent(this.jScrollPane1, -2, 314, -2)
/*  810 */       .addComponent(this.jPanel2, -2, -1, -2))
/*  811 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  812 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  813 */       .addComponent(this.jLabel4, -2, 30, -2)
/*  814 */       .addComponent(this.jLabel6)
/*  815 */       .addComponent(this.jLabel7))
/*  816 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  817 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  818 */       .addComponent(this.jScrollPane4, -2, 0, 32767)
/*  819 */       .addComponent(this.jScrollPane3, -2, 0, 32767)
/*  820 */       .addComponent(this.jScrollPane2, -2, 0, 32767))
/*  821 */       .addGap(19, 19, 19)));
/*      */     
/*      */ 
/*  824 */     pack();
/*      */   }
/*      */   
/*      */   private JButton jButton9;
/*      */   
/*      */   private void jButton9ActionPerformed(ActionEvent evt)
/*      */   {
/*  829 */     String total = this.jTextField1.getText();
/*  830 */     String expense = this.jTextField2.getText();
/*  831 */     String pr = this.jTextField3.getText();
/*  832 */     double totalToday = Double.parseDouble(total);
/*  833 */     double expenseToday = Double.parseDouble(expense);
/*  834 */     double profit = Double.parseDouble(pr);
/*  835 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/*  836 */     dataset.setValue(totalToday, "Income", "");
/*  837 */     dataset.setValue(expenseToday, "Expense", "");
/*  838 */     dataset.setValue(profit, "Profit", "");
/*  839 */     String todayDate = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  840 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", todayDate, "Income-Expense-Profit/Loss", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*      */     
/*  842 */     chart.getTitle().setPaint(Color.RED);
/*  843 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/*  844 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/*      */     
/*  846 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/*  847 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/*  848 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/*  849 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/*  850 */     CategoryPlot p = chart.getCategoryPlot();
/*  851 */     p.setRangeGridlinePaint(Color.BLACK);
/*      */     
/*  853 */     ChartFrame frame = new ChartFrame("", chart);
/*  854 */     frame.setVisible(true);
/*  855 */     frame.setSize(550, 350);
/*  856 */     frame.setLocation(260, 80);
/*      */   }
/*      */   
/*      */   private JLabel jLabel1;
/*      */   
/*      */   private void jButton8ActionPerformed(ActionEvent evt)
/*      */   {
/*  860 */     Calculator c = new Calculator();
/*  861 */     c.setVisible(true);
/*      */   }
/*      */   
/*      */   private void jTextField2ActionPerformed(ActionEvent evt) {}
/*      */   private JLabel jLabel10;
/*      */   private JLabel jLabel11;
/*      */   private JLabel jLabel12;
/*      */   private JLabel jLabel13;
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt)
/*      */   {
/*  869 */     String day1 = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  870 */     Calendar c = Calendar.getInstance();
/*  871 */     c.add(5, -1);
/*  872 */     String day2 = new SimpleDateFormat("dd-MM-yyyy").format(c.getTime());
/*  873 */     Calendar c1 = Calendar.getInstance();
/*  874 */     c1.add(5, -2);
/*  875 */     String day3 = new SimpleDateFormat("dd-MM-yyyy").format(c1.getTime());
/*  876 */     Calendar c2 = Calendar.getInstance();
/*  877 */     c2.add(5, -3);
/*  878 */     String day4 = new SimpleDateFormat("dd-MM-yyyy").format(c2.getTime());
/*  879 */     Calendar c3 = Calendar.getInstance();
/*  880 */     c3.add(5, -4);
/*  881 */     String day5 = new SimpleDateFormat("dd-MM-yyyy").format(c3.getTime());
/*  882 */     Calendar c4 = Calendar.getInstance();
/*  883 */     c4.add(5, -5);
/*  884 */     String day6 = new SimpleDateFormat("dd-MM-yyyy").format(c4.getTime());
/*  885 */     Calendar c5 = Calendar.getInstance();
/*  886 */     c5.add(5, -6);
/*  887 */     String day7 = new SimpleDateFormat("dd-MM-yyyy").format(c5.getTime());
/*  888 */     Calendar c6 = Calendar.getInstance();
/*  889 */     c6.add(5, -7);
/*  890 */     String day8 = new SimpleDateFormat("dd-MM-yyyy").format(c6.getTime());
/*  891 */     Calendar c7 = Calendar.getInstance();
/*  892 */     c7.add(5, -8);
/*  893 */     String day9 = new SimpleDateFormat("dd-MM-yyyy").format(c7.getTime());
/*  894 */     Calendar c8 = Calendar.getInstance();
/*  895 */     c8.add(5, -9);
/*  896 */     String day10 = new SimpleDateFormat("dd-MM-yyyy").format(c8.getTime());
/*  897 */     this.conn = JavaConnect.connectDb();
/*  898 */     double totalday1 = 0.0D;double totalday2 = 0.0D;double totalday3 = 0.0D;double totalday4 = 0.0D;double totalday5 = 0.0D;double totalday6 = 0.0D;double totalday7 = 0.0D;double totalday8 = 0.0D;double totalday9 = 0.0D;double totalday10 = 0.0D;
/*  899 */     double expenseday1 = 0.0D;double expenseday2 = 0.0D;double expenseday3 = 0.0D;double expenseday4 = 0.0D;double expenseday5 = 0.0D;double expenseday6 = 0.0D;double expenseday7 = 0.0D;double expenseday8 = 0.0D;double expenseday9 = 0.0D;double expenseday10 = 0.0D;
/*      */     try {
/*  901 */       String sql = "select * from income_table";
/*  902 */       this.ps = this.conn.prepareStatement(sql);
/*  903 */       this.rs = this.ps.executeQuery();
/*  904 */       while (this.rs.next()) {
/*  905 */         Object date = this.rs.getString("date");
/*  906 */         Object subTotal = this.rs.getString("total");
/*  907 */         int st = Integer.parseInt((String)subTotal);
/*  908 */         if (date.equals(day1)) {
/*  909 */           totalday1 = st + totalday1;
/*      */         }
/*  911 */         if (date.equals(day2)) {
/*  912 */           totalday2 = st + totalday2;
/*      */         }
/*  914 */         if (date.equals(day3)) {
/*  915 */           totalday3 = st + totalday3;
/*      */         }
/*  917 */         if (date.equals(day4)) {
/*  918 */           totalday4 = st + totalday4;
/*      */         }
/*  920 */         if (date.equals(day5)) {
/*  921 */           totalday5 = st + totalday5;
/*      */         }
/*  923 */         if (date.equals(day6)) {
/*  924 */           totalday6 = st + totalday6;
/*      */         }
/*  926 */         if (date.equals(day7)) {
/*  927 */           totalday7 = st + totalday7;
/*      */         }
/*  929 */         if (date.equals(day8)) {
/*  930 */           totalday8 = st + totalday8;
/*      */         }
/*  932 */         if (date.equals(day9)) {
/*  933 */           totalday9 = st + totalday9;
/*      */         }
/*  935 */         if (date.equals(day10)) {
/*  936 */           totalday10 = st + totalday10;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  941 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/*  945 */       String sql = "select * from expense_table";
/*  946 */       this.ps = this.conn.prepareStatement(sql);
/*  947 */       this.rs = this.ps.executeQuery();
/*  948 */       while (this.rs.next()) {
/*  949 */         Object date = this.rs.getString("date");
/*  950 */         Object subTotal = this.rs.getString("amount");
/*  951 */         int st = Integer.parseInt((String)subTotal);
/*  952 */         if (date.equals(day1)) {
/*  953 */           expenseday1 = st + expenseday1;
/*      */         }
/*  955 */         if (date.equals(day2)) {
/*  956 */           expenseday2 = st + expenseday2;
/*      */         }
/*  958 */         if (date.equals(day3)) {
/*  959 */           expenseday3 = st + expenseday3;
/*      */         }
/*  961 */         if (date.equals(day4)) {
/*  962 */           expenseday3 = st + expenseday3;
/*      */         }
/*  964 */         if (date.equals(day5)) {
/*  965 */           expenseday4 = st + expenseday4;
/*      */         }
/*  967 */         if (date.equals(day6)) {
/*  968 */           expenseday5 = st + expenseday5;
/*      */         }
/*  970 */         if (date.equals(day7)) {
/*  971 */           expenseday6 = st + expenseday6;
/*      */         }
/*  973 */         if (date.equals(day8)) {
/*  974 */           expenseday7 = st + expenseday7;
/*      */         }
/*  976 */         if (date.equals(day9)) {
/*  977 */           expenseday9 = st + expenseday9;
/*      */         }
/*  979 */         if (date.equals(day10)) {
/*  980 */           expenseday10 = st + expenseday10;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  985 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  987 */     double profitday1 = totalday1 - expenseday1;
/*  988 */     double profitday2 = totalday2 - expenseday2;
/*  989 */     double profitday3 = totalday3 - expenseday3;
/*  990 */     double profitday4 = totalday4 - expenseday4;
/*  991 */     double profitday5 = totalday5 - expenseday5;
/*  992 */     double profitday6 = totalday6 - expenseday6;
/*  993 */     double profitday7 = totalday7 - expenseday7;
/*  994 */     double profitday8 = totalday8 - expenseday8;
/*  995 */     double profitday9 = totalday9 - expenseday9;
/*  996 */     double profitday10 = totalday10 - expenseday10;
/*      */     
/*  998 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/*  999 */     dataset.setValue(totalday1, "Income", day1);
/* 1000 */     dataset.setValue(totalday2, "Income", day2);
/* 1001 */     dataset.setValue(totalday3, "Income", day3);
/* 1002 */     dataset.setValue(totalday4, "Income", day4);
/* 1003 */     dataset.setValue(totalday5, "Income", day5);
/* 1004 */     dataset.setValue(totalday6, "Income", day6);
/* 1005 */     dataset.setValue(totalday7, "Income", day7);
/* 1006 */     dataset.setValue(totalday8, "Income", day8);
/* 1007 */     dataset.setValue(totalday9, "Income", day9);
/* 1008 */     dataset.setValue(totalday10, "Income", day10);
/*      */     
/* 1010 */     dataset.setValue(expenseday1, "expense", day1);
/* 1011 */     dataset.setValue(expenseday2, "expense", day2);
/* 1012 */     dataset.setValue(expenseday3, "expense", day3);
/* 1013 */     dataset.setValue(expenseday4, "expense", day4);
/* 1014 */     dataset.setValue(expenseday5, "expense", day5);
/* 1015 */     dataset.setValue(expenseday6, "expense", day6);
/* 1016 */     dataset.setValue(expenseday7, "expense", day7);
/* 1017 */     dataset.setValue(expenseday8, "expense", day8);
/* 1018 */     dataset.setValue(expenseday9, "expense", day9);
/* 1019 */     dataset.setValue(expenseday10, "expense", day10);
/*      */     
/* 1021 */     dataset.setValue(profitday1, "profit", day1);
/* 1022 */     dataset.setValue(profitday2, "profit", day2);
/* 1023 */     dataset.setValue(profitday3, "profit", day3);
/* 1024 */     dataset.setValue(profitday4, "profit", day4);
/* 1025 */     dataset.setValue(profitday5, "profit", day5);
/* 1026 */     dataset.setValue(profitday6, "profit", day6);
/* 1027 */     dataset.setValue(profitday7, "profit", day7);
/* 1028 */     dataset.setValue(profitday8, "profit", day8);
/* 1029 */     dataset.setValue(profitday9, "profit", day9);
/* 1030 */     dataset.setValue(profitday10, "profit", day10);
/*      */     
/*      */ 
/* 1033 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Date", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/* 1034 */     chart.setBackgroundPaint(Color.white);
/* 1035 */     chart.getTitle().setPaint(Color.RED);
/* 1036 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/* 1037 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/*      */     
/* 1039 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/* 1040 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/* 1041 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/* 1042 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/*      */     
/* 1044 */     CategoryPlot p = chart.getCategoryPlot();
/* 1045 */     p.setRangeGridlinePaint(Color.BLACK);
/* 1046 */     ChartFrame frame = new ChartFrame("bar chart for Daily Income", chart);
/* 1047 */     frame.setVisible(true);
/* 1048 */     frame.setSize(950, 550);
/* 1049 */     frame.setLocation(222, 25);
/*      */   }
/*      */   
/*      */   private JLabel jLabel14;
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt)
/*      */   {
/* 1053 */     Edit e = new Edit();
/* 1054 */     e.setVisible(true);
/*      */   }
/*      */   
/*      */   private JLabel jLabel15;
/*      */   
/*      */   private void jButton10ActionPerformed(ActionEvent evt)
/*      */   {
/* 1058 */     Expense e = new Expense();
/* 1059 */     e.setVisible(true);
/*      */   }
/*      */   
/*      */   private JLabel jLabel3;
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt)
/*      */   {
/* 1063 */     Login l = new Login();
/* 1064 */     l.setVisible(true);
/*      */   }
/*      */   
/*      */   private JLabel jLabel4;
/*      */   private void jButton12ActionPerformed(ActionEvent evt)
/*      */   {
/* 1068 */     ChangePassword c = new ChangePassword();
/* 1069 */     c.setVisible(true);
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt)
/*      */   {
/* 1073 */     String month1 = new SimpleDateFormat("MM").format(new Date());
/* 1074 */     int m1 = Integer.parseInt(month1);
/* 1075 */     Calendar c = Calendar.getInstance();
/* 1076 */     c.add(2, -1);
/* 1077 */     String month2 = new SimpleDateFormat("MM").format(c.getTime());
/* 1078 */     int m2 = Integer.parseInt(month2);
/* 1079 */     Calendar c1 = Calendar.getInstance();
/* 1080 */     c1.add(2, -2);
/* 1081 */     String month3 = new SimpleDateFormat("MM").format(c1.getTime());
/* 1082 */     int m3 = Integer.parseInt(month3);
/* 1083 */     Calendar c2 = Calendar.getInstance();
/* 1084 */     c2.add(2, -3);
/* 1085 */     String month4 = new SimpleDateFormat("MM").format(c2.getTime());
/* 1086 */     int m4 = Integer.parseInt(month4);
/* 1087 */     this.conn = JavaConnect.connectDb();
/* 1088 */     double totalMonth1 = 0.0D;double totalMonth2 = 0.0D;double totalMonth3 = 0.0D;double totalMonth4 = 0.0D;
/* 1089 */     double expenseMonth1 = 0.0D;double expenseMonth2 = 0.0D;double expenseMonth3 = 0.0D;double expenseMonth4 = 0.0D;
/*      */     try {
/* 1091 */       String sql = "select * from income_table";
/* 1092 */       this.ps = this.conn.prepareStatement(sql);
/* 1093 */       this.rs = this.ps.executeQuery();
/* 1094 */       while (this.rs.next()) {
/* 1095 */         Object month = this.rs.getString("month");
/* 1096 */         int mm = Integer.parseInt((String)month);
/* 1097 */         Object subTotal = this.rs.getString("total");
/* 1098 */         int st = Integer.parseInt((String)subTotal);
/* 1099 */         if (mm == m1) {
/* 1100 */           totalMonth1 = st + totalMonth1;
/*      */         }
/* 1102 */         if (mm == m2) {
/* 1103 */           totalMonth2 = st + totalMonth2;
/*      */         }
/* 1105 */         if (mm == m3) {
/* 1106 */           totalMonth3 = st + totalMonth3;
/*      */         }
/* 1108 */         if (mm == m4) {
/* 1109 */           totalMonth4 = st + totalMonth4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1114 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/* 1118 */       String sql = "select * from expense_table";
/* 1119 */       this.ps = this.conn.prepareStatement(sql);
/* 1120 */       this.rs = this.ps.executeQuery();
/* 1121 */       while (this.rs.next()) {
/* 1122 */         Object month = this.rs.getString("month");
/* 1123 */         int mm = Integer.parseInt((String)month);
/* 1124 */         Object subTotal = this.rs.getString("amount");
/* 1125 */         int st = Integer.parseInt((String)subTotal);
/* 1126 */         if (mm == m1) {
/* 1127 */           expenseMonth1 = st + expenseMonth1;
/*      */         }
/* 1129 */         if (mm == m2) {
/* 1130 */           expenseMonth2 = st + expenseMonth2;
/*      */         }
/* 1132 */         if (mm == m3) {
/* 1133 */           expenseMonth3 = st + expenseMonth3;
/*      */         }
/* 1135 */         if (mm == m4) {
/* 1136 */           expenseMonth4 = st + expenseMonth4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1141 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1143 */     double profitMonth1 = totalMonth1 - expenseMonth1;
/* 1144 */     double profitMonth2 = totalMonth2 - expenseMonth2;
/* 1145 */     double profitMonth3 = totalMonth3 - expenseMonth3;
/* 1146 */     double profitMonth4 = totalMonth4 - expenseMonth4;
/*      */     
/*      */ 
/* 1149 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/* 1150 */     dataset.setValue(totalMonth1, "Income", month1);
/* 1151 */     dataset.setValue(totalMonth2, "Income", month2);
/* 1152 */     dataset.setValue(totalMonth3, "Income", month3);
/* 1153 */     dataset.setValue(totalMonth4, "Income", month4);
/*      */     
/* 1155 */     dataset.setValue(expenseMonth1, "Expense", month1);
/* 1156 */     dataset.setValue(expenseMonth2, "Expense", month2);
/* 1157 */     dataset.setValue(expenseMonth3, "Expense", month3);
/* 1158 */     dataset.setValue(expenseMonth4, "Expense", month4);
/*      */     
/* 1160 */     dataset.setValue(profitMonth1, "Profit", month1);
/* 1161 */     dataset.setValue(profitMonth2, "Profit", month2);
/* 1162 */     dataset.setValue(profitMonth3, "Profit", month3);
/* 1163 */     dataset.setValue(profitMonth4, "Profit", month4);
/*      */     
/* 1165 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Month", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*      */     
/* 1167 */     chart.getTitle().setPaint(Color.RED);
/* 1168 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/* 1169 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/*      */     
/* 1171 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/* 1172 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/* 1173 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/* 1174 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/* 1175 */     CategoryPlot p = chart.getCategoryPlot();
/* 1176 */     p.setRangeGridlinePaint(Color.BLACK);
/* 1177 */     ChartFrame frame = new ChartFrame("bar chart for Monthly Income", chart);
/* 1178 */     frame.setVisible(true);
/* 1179 */     frame.setSize(950, 550);
/* 1180 */     frame.setLocation(222, 25);
/*      */   }
/*      */   
/*      */   private void jButton7ActionPerformed(ActionEvent evt)
/*      */   {
/* 1184 */     String year1 = new SimpleDateFormat("YYYY").format(new Date());
/* 1185 */     int y1 = Integer.parseInt(year1);
/* 1186 */     Calendar c = Calendar.getInstance();
/* 1187 */     c.add(1, -1);
/* 1188 */     String year2 = new SimpleDateFormat("YYYY").format(c.getTime());
/* 1189 */     int y2 = Integer.parseInt(year2);
/* 1190 */     Calendar c1 = Calendar.getInstance();
/* 1191 */     c1.add(1, -2);
/* 1192 */     String year3 = new SimpleDateFormat("YYYY").format(c1.getTime());
/* 1193 */     int y3 = Integer.parseInt(year3);
/* 1194 */     Calendar c2 = Calendar.getInstance();
/* 1195 */     c2.add(1, -3);
/* 1196 */     String year4 = new SimpleDateFormat("YYYY").format(c2.getTime());
/* 1197 */     int y4 = Integer.parseInt(year4);
/* 1198 */     this.conn = JavaConnect.connectDb();
/* 1199 */     double totalYear1 = 0.0D;double totalYear2 = 0.0D;double totalYear3 = 0.0D;double totalYear4 = 0.0D;
/* 1200 */     double expenseYear1 = 0.0D;double expenseYear2 = 0.0D;double expenseYear3 = 0.0D;double expenseYear4 = 0.0D;
/* 1201 */     double profitYear1 = 0.0D;double profitYear2 = 0.0D;double profitYear3 = 0.0D;double profitYear4 = 0.0D;
/*      */     try {
/* 1203 */       String sql = "select * from income_table";
/* 1204 */       this.ps = this.conn.prepareStatement(sql);
/* 1205 */       this.rs = this.ps.executeQuery();
/* 1206 */       while (this.rs.next()) {
/* 1207 */         Object year = this.rs.getString("year");
/* 1208 */         int yy = Integer.parseInt((String)year);
/* 1209 */         Object subTotal = this.rs.getString("total");
/* 1210 */         int st = Integer.parseInt((String)subTotal);
/* 1211 */         if (yy == y1) {
/* 1212 */           totalYear1 = st + totalYear1;
/*      */         }
/* 1214 */         if (yy == y2) {
/* 1215 */           totalYear2 = st + totalYear2;
/*      */         }
/* 1217 */         if (yy == y3) {
/* 1218 */           totalYear3 = st + totalYear3;
/*      */         }
/* 1220 */         if (yy == y4) {
/* 1221 */           totalYear4 = st + totalYear4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1226 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/* 1230 */       String sql = "select * from expense_table";
/* 1231 */       this.ps = this.conn.prepareStatement(sql);
/* 1232 */       this.rs = this.ps.executeQuery();
/* 1233 */       while (this.rs.next()) {
/* 1234 */         Object year = this.rs.getString("year");
/* 1235 */         int yy = Integer.parseInt((String)year);
/* 1236 */         Object subTotal = this.rs.getString("amount");
/* 1237 */         int st = Integer.parseInt((String)subTotal);
/* 1238 */         if (yy == y1) {
/* 1239 */           expenseYear1 = st + expenseYear1;
/*      */         }
/* 1241 */         if (yy == y2) {
/* 1242 */           expenseYear2 = st + expenseYear2;
/*      */         }
/* 1244 */         if (yy == y3) {
/* 1245 */           expenseYear3 = st + expenseYear3;
/*      */         }
/* 1247 */         if (yy == y4) {
/* 1248 */           expenseYear4 = st + expenseYear4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1253 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/* 1256 */     profitYear1 = totalYear1 - expenseYear1;
/* 1257 */     profitYear2 = totalYear2 - expenseYear2;
/* 1258 */     profitYear3 = totalYear3 - expenseYear3;
/* 1259 */     profitYear4 = totalYear4 - expenseYear4;
/*      */     
/* 1261 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/* 1262 */     dataset.setValue(totalYear1, "Income", year1);
/* 1263 */     dataset.setValue(totalYear2, "Income", year2);
/* 1264 */     dataset.setValue(totalYear3, "Income", year3);
/* 1265 */     dataset.setValue(totalYear4, "Income", year4);
/*      */     
/* 1267 */     dataset.setValue(expenseYear1, "Expense", year1);
/* 1268 */     dataset.setValue(expenseYear2, "Expense", year2);
/* 1269 */     dataset.setValue(expenseYear3, "Expense", year3);
/* 1270 */     dataset.setValue(expenseYear4, "Expense", year4);
/*      */     
/* 1272 */     dataset.setValue(profitYear1, "Profit", year1);
/* 1273 */     dataset.setValue(profitYear2, "Profit", year2);
/* 1274 */     dataset.setValue(profitYear3, "Profit", year3);
/* 1275 */     dataset.setValue(profitYear4, "Profit", year4);
/*      */     
/*      */ 
/* 1278 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Year", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*      */     
/* 1280 */     chart.getTitle().setPaint(Color.RED);
/* 1281 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/* 1282 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/* 1283 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/* 1284 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/* 1285 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/* 1286 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/* 1287 */     CategoryPlot p = chart.getCategoryPlot();
/* 1288 */     p.setRangeGridlinePaint(Color.BLACK);
/* 1289 */     ChartFrame frame = new ChartFrame("bar chart for Yearly Income", chart);
/* 1290 */     frame.setVisible(true);
/* 1291 */     frame.setSize(950, 550);
/* 1292 */     frame.setLocation(222, 25);
/*      */   }
/*      */   
/*      */   private void jButton6ActionPerformed(ActionEvent evt)
/*      */   {
/* 1296 */     this.jLabel5.setText("THIS MONTH'S BUSSINESS");
/* 1297 */     this.jLabel8.setText("");
/*      */     try {
/* 1299 */       String sql = "select * from income_table";
/* 1300 */       this.ps = this.conn.prepareStatement(sql);
/* 1301 */       this.rs = this.ps.executeQuery();
/* 1302 */       int i = 0;
/* 1303 */       this.totalMonth = 0;
/* 1304 */       String m = new SimpleDateFormat("MM").format(new Date());
/* 1305 */       int mm = Integer.parseInt(m);
/* 1306 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/* 1307 */       while (this.rs.next()) {
/* 1308 */         Object month = this.rs.getString("month");
/* 1309 */         int mmm = Integer.parseInt((String)month);
/* 1310 */         Object year = this.rs.getString("year");
/* 1311 */         Object subTotal = this.rs.getString("total");
/* 1312 */         int st = Integer.parseInt((String)subTotal);
/* 1313 */         if ((mm == mmm) && (year.equals(y))) {
/* 1314 */           this.totalMonth = (st + this.totalMonth);
/*      */         }
/* 1316 */         this.jTextField1.setText(String.valueOf(this.totalMonth));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1320 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/* 1324 */       String sql = "select * from expense_table";
/* 1325 */       this.ps = this.conn.prepareStatement(sql);
/* 1326 */       this.rs = this.ps.executeQuery();
/* 1327 */       int i = 0;
/* 1328 */       this.expenseMonth = 0;
/* 1329 */       String m = new SimpleDateFormat("MM").format(new Date());
/* 1330 */       int mm = Integer.parseInt(m);
/* 1331 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/* 1332 */       while (this.rs.next()) {
/* 1333 */         Object month = this.rs.getString("month");
/* 1334 */         int mmm = Integer.parseInt((String)month);
/* 1335 */         Object year = this.rs.getString("year");
/* 1336 */         Object subTotal = this.rs.getString("amount");
/* 1337 */         int st = Integer.parseInt((String)subTotal);
/* 1338 */         if ((mm == mmm) && (year.equals(y))) {
/* 1339 */           this.expenseMonth = (st + this.expenseMonth);
/*      */         }
/* 1341 */         this.jTextField2.setText(String.valueOf(this.expenseMonth));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1345 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/* 1348 */     if (this.totalMonth >= this.expenseMonth) {
/* 1349 */       this.jLabel11.setText("PROFIT");
/* 1350 */       this.jTextField3.setText(String.valueOf(this.totalMonth - this.expenseMonth));
/*      */     }
/*      */     else {
/* 1353 */       this.jLabel11.setText("LOSS");
/* 1354 */       this.jTextField3.setText(String.valueOf(this.expenseMonth - this.totalMonth));
/*      */     }
/*      */     try {
/* 1357 */       int i = 0;int j = 0;
/* 1358 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1359 */       int m = Integer.parseInt(thisMonth);
/* 1360 */       this.conn = JavaConnect.connectDb();
/* 1361 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 1362 */       dtm.setRowCount(100);
/* 1363 */       String sql1 = "select * from history_table order by time desc";
/* 1364 */       this.ps = this.conn.prepareStatement(sql1);
/* 1365 */       ResultSet rs = this.ps.executeQuery();
/* 1366 */       while (rs.next()) {
/* 1367 */         Object month = rs.getString("month");
/* 1368 */         int mm = Integer.parseInt((String)month);
/* 1369 */         if (m == mm) {
/* 1370 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/* 1371 */           Object item = rs.getString("item");
/* 1372 */           Object type = rs.getString("type");
/* 1373 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/* 1374 */           Object d = rs.getString("date");
/* 1375 */           Object t = rs.getString("time");
/* 1376 */           if (i < 100) {
/* 1377 */             this.jTable1.getModel().setValueAt(o, j, 0);
/* 1378 */             this.jTable1.getModel().setValueAt(d, j, 1);
/* 1379 */             this.jTable1.getModel().setValueAt(t, j, 2);
/* 1380 */             this.jTable1.getModel().setValueAt(item, j, 3);
/* 1381 */             this.jTable1.getModel().setValueAt(type, j, 4);
/* 1382 */             this.jTable1.getModel().setValueAt(q, j, 5);
/* 1383 */             j++;
/* 1384 */             i++;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1391 */       System.out.println(e);
/*      */     }
/*      */     try {
/* 1394 */       int i = 0;int j = 0;
/* 1395 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1396 */       int m = Integer.parseInt(thisMonth);
/* 1397 */       this.conn = JavaConnect.connectDb();
/* 1398 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/* 1399 */       dtm.setRowCount(100);
/* 1400 */       String sql1 = "select * from expense_table order by time desc";
/* 1401 */       this.ps = this.conn.prepareStatement(sql1);
/* 1402 */       ResultSet rs = this.ps.executeQuery();
/* 1403 */       while (rs.next()) {
/* 1404 */         Object month = rs.getString("month");
/* 1405 */         int mm = Integer.parseInt((String)month);
/* 1406 */         if (m == mm) {
/* 1407 */           Object date = rs.getString("date");
/* 1408 */           Object time = rs.getString("time");
/* 1409 */           Object name = rs.getString("name");
/* 1410 */           Object amount = rs.getString("amount");
/* 1411 */           if (i < 100) {
/* 1412 */             this.jTable4.getModel().setValueAt(date, j, 0);
/* 1413 */             this.jTable4.getModel().setValueAt(time, j, 1);
/* 1414 */             this.jTable4.getModel().setValueAt(name, j, 2);
/* 1415 */             this.jTable4.getModel().setValueAt(amount, j, 3);
/* 1416 */             j++;
/* 1417 */             i++;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1423 */       System.out.println(e);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1428 */     int i = 0;int j = 0;
/* 1429 */     String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1430 */     int m = Integer.parseInt(thisMonth);
/*      */     try {
/* 1432 */       this.conn = JavaConnect.connectDb();
/* 1433 */       String sql = "select month,item from history_table group by item";
/* 1434 */       this.ps = this.conn.prepareStatement(sql);
/* 1435 */       ResultSet a = this.ps.executeQuery();
/* 1436 */       while (a.next()) {
/* 1437 */         Object month = a.getString("month");
/* 1438 */         int mm = Integer.parseInt((String)month);
/* 1439 */         if (m == mm) {
/* 1440 */           i++;
/*      */         }
/*      */       }
/* 1443 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 1444 */       dtm.setRowCount(i);
/* 1445 */       String sql1 = "select month,item,sum(quantity) from history_table group by item order by sum(quantity) desc";
/* 1446 */       this.ps = this.conn.prepareStatement(sql1);
/* 1447 */       ResultSet rs = this.ps.executeQuery();
/* 1448 */       while (rs.next()) {
/* 1449 */         Object month = rs.getString("month");
/* 1450 */         int mm = Integer.parseInt((String)month);
/* 1451 */         if (m == mm) {
/* 1452 */           Object type = rs.getString(2);
/* 1453 */           System.out.println(type);
/* 1454 */           int count = rs.getInt(3);
/* 1455 */           this.jTable2.getModel().setValueAt(type, j, 0);
/* 1456 */           this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 1457 */           if (j == 0) {
/* 1458 */             this.jLabel12.setText("FOOD OF THE MONTH");
/* 1459 */             this.jLabel13.setText((String)type);
/*      */           }
/* 1461 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1466 */       System.out.println(e);
/*      */     }
/*      */     
/*      */ 
/* 1470 */     int i = 0;int j = 0;
/* 1471 */     String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1472 */     int m = Integer.parseInt(thisMonth);
/*      */     try
/*      */     {
/* 1474 */       this.conn = JavaConnect.connectDb();
/* 1475 */       String sql = "select month,name from expense_table group by name";
/* 1476 */       this.ps = this.conn.prepareStatement(sql);
/* 1477 */       ResultSet a = this.ps.executeQuery();
/* 1478 */       while (a.next()) {
/* 1479 */         Object month = a.getString("month");
/* 1480 */         int mm = Integer.parseInt((String)month);
/* 1481 */         if (m == mm) {
/* 1482 */           i++;
/*      */         }
/*      */       }
/* 1485 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 1486 */       dtm.setRowCount(i);
/* 1487 */       String sql1 = "select month,name,sum(amount) from expense_table group by name order by sum(amount) desc";
/* 1488 */       this.ps = this.conn.prepareStatement(sql1);
/* 1489 */       ResultSet rs = this.ps.executeQuery();
/* 1490 */       while (rs.next())
/*      */       {
/* 1491 */         Object month = rs.getString("month");
/* 1492 */         int mm = Integer.parseInt((String)month);
/* 1493 */         if (m == mm)
/*      */         {
/* 1494 */           Object expense = rs.getString(2);
/* 1495 */           int total = rs.getInt(3);
/* 1496 */           this.jTable3.getModel().setValueAt(expense, j, 0);
/* 1497 */           this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 1498 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1503 */       System.out.println(e);
/*      */     }
/*      */   }
/*      */   private JLabel jLabel5;
/*      */   private JLabel jLabel6;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel8;
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt)
/*      */   {
/* 1509 */     this.jLabel5.setText("THIS YEAR'S BUSSINESS");
/*      */     try {
/* 1511 */       String sql = "select * from income_table";
/* 1512 */       this.ps = this.conn.prepareStatement(sql);
/* 1513 */       this.rs = this.ps.executeQuery();
/* 1514 */       int i = 0;
/* 1515 */       this.totalYear = 0;
/* 1516 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/* 1517 */       while (this.rs.next()) {
/* 1518 */         Object year = this.rs.getString("year");
/* 1519 */         Object subTotal = this.rs.getString("total");
/* 1520 */         int st = Integer.parseInt((String)subTotal);
/* 1521 */         if (year.equals(y)) {
/* 1522 */           this.totalYear = (st + this.totalYear);
/*      */         }
/* 1524 */         this.jTextField1.setText(String.valueOf(this.totalYear));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1528 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/* 1532 */       String sql = "select * from expense_table";
/* 1533 */       this.ps = this.conn.prepareStatement(sql);
/* 1534 */       this.rs = this.ps.executeQuery();
/* 1535 */       int i = 0;
/* 1536 */       this.expenseYear = 0;
/* 1537 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/* 1538 */       while (this.rs.next()) {
/* 1539 */         Object year = this.rs.getString("year");
/* 1540 */         Object subTotal = this.rs.getString("amount");
/* 1541 */         int st = Integer.parseInt((String)subTotal);
/* 1542 */         if (year.equals(y)) {
/* 1543 */           this.expenseYear = (st + this.expenseYear);
/*      */         }
/* 1545 */         this.jTextField2.setText(String.valueOf(this.expenseYear));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1549 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/* 1552 */     if (this.totalYear >= this.expenseYear)
/*      */     {
/* 1553 */       this.jLabel11.setText("PROFIT");
/* 1554 */       this.jTextField3.setText(String.valueOf(this.totalYear - this.expenseYear));
/*      */     }
/*      */     else
/*      */     {
/* 1557 */       this.jLabel11.setText("LOSS");
/* 1558 */       this.jTextField3.setText(String.valueOf(this.expenseYear - this.totalYear));
/*      */     }
/*      */     try
/*      */     {
/* 1562 */       int i = 0;int j = 0;
/* 1563 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1564 */       int m = Integer.parseInt(thisMonth);
/* 1565 */       this.conn = JavaConnect.connectDb();
/* 1566 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 1567 */       dtm.setRowCount(100);
/* 1568 */       String sql1 = "select * from history_table order by time desc";
/* 1569 */       this.ps = this.conn.prepareStatement(sql1);
/* 1570 */       ResultSet rs = this.ps.executeQuery();
/* 1571 */       while (rs.next())
/*      */       {
/* 1572 */         Object month = rs.getString("month");
/* 1573 */         int mm = Integer.parseInt((String)month);
/* 1574 */         if (m == mm)
/*      */         {
/* 1575 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/* 1576 */           Object item = rs.getString("item");
/* 1577 */           Object type = rs.getString("type");
/* 1578 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/* 1579 */           Object d = rs.getString("date");
/* 1580 */           Object t = rs.getString("time");
/* 1581 */           if (i < 100)
/*      */           {
/* 1582 */             this.jTable1.getModel().setValueAt(o, j, 0);
/* 1583 */             this.jTable1.getModel().setValueAt(d, j, 1);
/* 1584 */             this.jTable1.getModel().setValueAt(t, j, 2);
/* 1585 */             this.jTable1.getModel().setValueAt(item, j, 3);
/* 1586 */             this.jTable1.getModel().setValueAt(type, j, 4);
/* 1587 */             this.jTable1.getModel().setValueAt(q, j, 5);
/* 1588 */             j++;
/* 1589 */             i++;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1596 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/* 1599 */       int i = 0;int j = 0;
/* 1600 */       String thisMonth = new SimpleDateFormat("MM").format(new Date());
/* 1601 */       int m = Integer.parseInt(thisMonth);
/* 1602 */       this.conn = JavaConnect.connectDb();
/* 1603 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/* 1604 */       dtm.setRowCount(100);
/* 1605 */       String sql1 = "select * from expense_table order by time desc";
/* 1606 */       this.ps = this.conn.prepareStatement(sql1);
/* 1607 */       ResultSet rs = this.ps.executeQuery();
/* 1608 */       while (rs.next())
/*      */       {
/* 1609 */         Object month = rs.getString("month");
/* 1610 */         int mm = Integer.parseInt((String)month);
/* 1611 */         if (m == mm)
/*      */         {
/* 1612 */           Object date = rs.getString("date");
/* 1613 */           Object time = rs.getString("time");
/* 1614 */           Object name = rs.getString("name");
/* 1615 */           Object amount = rs.getString("amount");
/* 1616 */           if (i < 100)
/*      */           {
/* 1617 */             this.jTable4.getModel().setValueAt(date, j, 0);
/* 1618 */             this.jTable4.getModel().setValueAt(time, j, 1);
/* 1619 */             this.jTable4.getModel().setValueAt(name, j, 2);
/* 1620 */             this.jTable4.getModel().setValueAt(amount, j, 3);
/* 1621 */             j++;
/* 1622 */             i++;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1628 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/* 1633 */       int i = 0;int j = 0;
/* 1634 */       String thisYear = new SimpleDateFormat("YYYY").format(new Date());
/* 1635 */       this.conn = JavaConnect.connectDb();
/* 1636 */       String sql = "select year,item from history_table group by item";
/* 1637 */       this.ps = this.conn.prepareStatement(sql);
/* 1638 */       ResultSet a = this.ps.executeQuery();
/* 1639 */       while (a.next()) {
/* 1640 */         Object year = a.getString("year");
/* 1641 */         if (year.equals(thisYear)) {
/* 1642 */           i++;
/*      */         }
/*      */       }
/* 1645 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 1646 */       dtm.setRowCount(i);
/* 1647 */       String sql1 = "select year,item,sum(quantity) from history_table group by item order by sum(quantity) desc";
/* 1648 */       this.ps = this.conn.prepareStatement(sql1);
/* 1649 */       ResultSet rs = this.ps.executeQuery();
/* 1650 */       while (rs.next())
/*      */       {
/* 1651 */         Object year = rs.getString("year");
/* 1652 */         if (year.equals(thisYear))
/*      */         {
/* 1653 */           Object type = rs.getString(2);
/* 1654 */           int count = rs.getInt(3);
/* 1655 */           this.jTable2.getModel().setValueAt(type, j, 0);
/* 1656 */           this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 1657 */           if (j == 0) {
/* 1658 */             this.jLabel12.setText("FOOD OF THE YEAR");
/* 1659 */             this.jLabel13.setText((String)type);
/*      */           }
/* 1661 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1666 */       System.out.println(e);
/*      */     }
/*      */     try
/*      */     {
/* 1670 */       int i = 0;int j = 0;
/* 1671 */       String thisYear = new SimpleDateFormat("YYYY").format(new Date());
/* 1672 */       this.conn = JavaConnect.connectDb();
/* 1673 */       String sql = "select year,name from expense_table group by name";
/* 1674 */       this.ps = this.conn.prepareStatement(sql);
/* 1675 */       ResultSet a = this.ps.executeQuery();
/* 1676 */       while (a.next()) {
/* 1677 */         Object year = a.getString("year");
/* 1678 */         if (year.equals(thisYear)) {
/* 1679 */           i++;
/*      */         }
/*      */       }
/* 1682 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 1683 */       dtm.setRowCount(i);
/* 1684 */       String sql1 = "select year,name,sum(amount) from expense_table group by name order by sum(amount) desc";
/* 1685 */       this.ps = this.conn.prepareStatement(sql1);
/* 1686 */       ResultSet rs = this.ps.executeQuery();
/* 1687 */       while (rs.next())
/*      */       {
/* 1688 */         Object year = rs.getString(1);
/* 1689 */         if (year.equals(thisYear))
/*      */         {
/* 1690 */           Object expense = rs.getString(2);
/* 1691 */           int total = rs.getInt(3);
/* 1692 */           this.jTable3.getModel().setValueAt(expense, j, 0);
/* 1693 */           this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 1694 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1699 */       System.out.println(e);
/*      */     }
/*      */   }
/*      */   
/*      */   private JLabel jLabel9;
/*      */   private javax.swing.JPanel jPanel1;
/*      */   private javax.swing.JPanel jPanel2;
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt)
/*      */   {
/* 1707 */     this.jLabel5.setText("TODAY'S BUSSINESS");
/* 1708 */     this.jLabel12.setText("");
/* 1709 */     String todayDate = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1710 */     this.jLabel8.setText(todayDate);
/* 1711 */     this.conn = JavaConnect.connectDb();
/*      */     try {
/* 1713 */       String sql = "select * from income_table";
/* 1714 */       this.ps = this.conn.prepareStatement(sql);
/* 1715 */       this.rs = this.ps.executeQuery();
/* 1716 */       int i = 0;
/* 1717 */       this.totalToday = 0;
/* 1718 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1719 */       while (this.rs.next()) {
/* 1720 */         Object date = this.rs.getString("date");
/* 1721 */         Object subTotal = this.rs.getString("total");
/* 1722 */         int st = Integer.parseInt((String)subTotal);
/* 1723 */         if (date.equals(d)) {
/* 1724 */           this.totalToday = (st + this.totalToday);
/*      */         }
/* 1726 */         this.jTextField1.setText(String.valueOf(this.totalToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1732 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/* 1735 */       String sql = "select * from expense_table";
/* 1736 */       this.ps = this.conn.prepareStatement(sql);
/* 1737 */       this.rs = this.ps.executeQuery();
/* 1738 */       int i = 0;
/* 1739 */       this.expenseToday = 0;
/* 1740 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1741 */       while (this.rs.next()) {
/* 1742 */         Object date = this.rs.getString("date");
/* 1743 */         Object subTotal = this.rs.getString("amount");
/* 1744 */         int st = Integer.parseInt((String)subTotal);
/* 1745 */         if (date.equals(d)) {
/* 1746 */           this.expenseToday = (st + this.expenseToday);
/*      */         }
/* 1748 */         this.jTextField2.setText(String.valueOf(this.expenseToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1754 */       javax.swing.JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1756 */     if (this.totalToday >= this.expenseToday) {
/* 1757 */       this.jLabel11.setText("PROFIT");
/* 1758 */       this.jTextField3.setText(String.valueOf(this.totalToday - this.expenseToday));
/*      */     }
/*      */     else {
/* 1761 */       this.jLabel11.setText("LOSS");
/* 1762 */       this.jTextField3.setText(String.valueOf(this.expenseToday - this.totalToday));
/*      */     }
/*      */     try
/*      */     {
/* 1766 */       int i = 0;int j = 0;
/* 1767 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1768 */       this.conn = JavaConnect.connectDb();
/* 1769 */       String sql = "select * from history_table";
/* 1770 */       this.ps = this.conn.prepareStatement(sql);
/* 1771 */       ResultSet a = this.ps.executeQuery();
/* 1772 */       while (a.next()) {
/* 1773 */         Object date = a.getString("date");
/* 1774 */         if (date.equals(today)) {
/* 1775 */           i++;
/*      */         }
/*      */       }
/* 1778 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 1779 */       dtm.setRowCount(i);
/* 1780 */       String sql1 = "select * from history_table order by time desc";
/* 1781 */       this.ps = this.conn.prepareStatement(sql1);
/* 1782 */       ResultSet rs = this.ps.executeQuery();
/* 1783 */       while (rs.next()) {
/* 1784 */         Object date = rs.getString("date");
/* 1785 */         if (date.equals(today)) {
/* 1786 */           Object o = Integer.valueOf(rs.getInt("order_id"));
/* 1787 */           Object item = rs.getString("item");
/* 1788 */           Object type = rs.getString("type");
/* 1789 */           Object q = Integer.valueOf(rs.getInt("quantity"));
/* 1790 */           Object d = rs.getString("date");
/* 1791 */           Object t = rs.getString("time");
/* 1792 */           this.jTable1.getModel().setValueAt(o, j, 0);
/* 1793 */           this.jTable1.getModel().setValueAt(d, j, 1);
/* 1794 */           this.jTable1.getModel().setValueAt(t, j, 2);
/* 1795 */           this.jTable1.getModel().setValueAt(item, j, 3);
/* 1796 */           this.jTable1.getModel().setValueAt(type, j, 4);
/* 1797 */           this.jTable1.getModel().setValueAt(q, j, 5);
/* 1798 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1804 */       System.out.println(e);
/*      */     }
/*      */     try {
/* 1807 */       int i = 0;int j = 0;
/* 1808 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1809 */       this.conn = JavaConnect.connectDb();
/* 1810 */       String sql = "select * from expense_table";
/* 1811 */       this.ps = this.conn.prepareStatement(sql);
/* 1812 */       ResultSet a = this.ps.executeQuery();
/* 1813 */       while (a.next()) {
/* 1814 */         Object date = a.getString("date");
/* 1815 */         if (date.equals(today)) {
/* 1816 */           i++;
/*      */         }
/*      */       }
/* 1819 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable4.getModel();
/* 1820 */       dtm.setRowCount(i);
/* 1821 */       String sql1 = "select * from expense_table order by time desc";
/* 1822 */       this.ps = this.conn.prepareStatement(sql1);
/* 1823 */       ResultSet rs = this.ps.executeQuery();
/* 1824 */       while (rs.next()) {
/* 1825 */         Object date = rs.getString("date");
/* 1826 */         if (date.equals(today)) {
/* 1827 */           Object time = rs.getString("time");
/* 1828 */           Object name = rs.getString("name");
/* 1829 */           Object amount = rs.getString("amount");
/* 1830 */           this.jTable4.getModel().setValueAt(date, j, 0);
/* 1831 */           this.jTable4.getModel().setValueAt(time, j, 1);
/* 1832 */           this.jTable4.getModel().setValueAt(name, j, 2);
/* 1833 */           this.jTable4.getModel().setValueAt(amount, j, 3);
/* 1834 */           j++;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1839 */       System.out.println(e);
/*      */     }
/*      */     try {
/* 1842 */       int i = 0;int j = 0;
/* 1843 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1844 */       this.conn = JavaConnect.connectDb();
/* 1845 */       String sql = "select date,item from history_table where date='" + today + "' group by item";
/* 1846 */       this.ps = this.conn.prepareStatement(sql);
/* 1847 */       ResultSet a = this.ps.executeQuery();
/* 1848 */       while (a.next())
/*      */       {
/*      */ 
/* 1851 */         i++;
/*      */       }
/*      */       
/* 1854 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable2.getModel();
/* 1855 */       dtm.setRowCount(i);
/* 1856 */       String sql1 = "select date,item,sum(quantity) from history_table where date='" + today + "' group by item order by sum(quantity) desc";
/* 1857 */       this.ps = this.conn.prepareStatement(sql1);
/* 1858 */       ResultSet rs = this.ps.executeQuery();
/* 1859 */       while (rs.next())
/*      */       {
/*      */ 
/* 1862 */         Object type = rs.getString(2);
/* 1863 */         int count = rs.getInt(3);
/* 1864 */         this.jTable2.getModel().setValueAt(type, j, 0);
/* 1865 */         this.jTable2.getModel().setValueAt(Integer.valueOf(count), j, 1);
/* 1866 */         if (j == 0) {
/* 1867 */           this.jLabel12.setText("FOOD OF THE DAY");
/* 1868 */           this.jLabel13.setText((String)type);
/*      */         }
/* 1870 */         j++;
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1875 */       System.out.println(e);
/*      */     }
/*      */     try {
/* 1878 */       int i = 0;int j = 0;
/* 1879 */       String today = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/* 1880 */       this.conn = JavaConnect.connectDb();
/* 1881 */       String sql = "select date,name from expense_table where date='" + today + "'group by name";
/* 1882 */       this.ps = this.conn.prepareStatement(sql);
/* 1883 */       ResultSet a = this.ps.executeQuery();
/* 1884 */       while (a.next())
/*      */       {
/*      */ 
/* 1887 */         i++;
/*      */       }
/*      */       
/* 1890 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable3.getModel();
/* 1891 */       dtm.setRowCount(i);
/* 1892 */       String sql1 = "select date,name,sum(amount) from expense_table where date='" + today + "' group by name order by sum(amount) desc";
/* 1893 */       this.ps = this.conn.prepareStatement(sql1);
/* 1894 */       ResultSet rs = this.ps.executeQuery();
/* 1895 */       while (rs.next())
/*      */       {
/*      */ 
/* 1898 */         Object expense = rs.getString(2);
/* 1899 */         int total = rs.getInt(3);
/* 1900 */         this.jTable3.getModel().setValueAt(expense, j, 0);
/* 1901 */         this.jTable3.getModel().setValueAt(Integer.valueOf(total), j, 1);
/* 1902 */         j++;
/*      */       }
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/* 1907 */       System.out.println(e);
/*      */     }
/*      */   }
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane2;
/*      */   private javax.swing.JScrollPane jScrollPane3;
/*      */   private javax.swing.JScrollPane jScrollPane4;
/*      */   
/*      */   public static void main(String[] args) {
/* 1916 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : )
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/* 1921 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*      */       }
/*      */     }
/*      */     catch (ClassNotFoundException ex)
/*      */     {
/* 1926 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 1928 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 1930 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1932 */       java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1937 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 1939 */         new AdminPanel().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private JTable jTable1;
/*      */   private JTable jTable2;
/*      */   private JTable jTable3;
/*      */   private JTable jTable4;
/*      */   private JTextField jTextField1;
/*      */   private JTextField jTextField2;
/*      */   private JTextField jTextField3;
/*      */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\AdminPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
/*      */ package resturentapp;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Font;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.sql.Connection;
/*      */ import java.sql.PreparedStatement;
/*      */ import java.sql.ResultSet;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import java.util.logging.Level;
/*      */ import java.util.logging.Logger;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle.ComponentPlacement;
/*      */ import javax.swing.table.TableColumn;
/*      */ import javax.swing.table.TableColumnModel;
/*      */ import javax.swing.table.TableModel;
/*      */ import org.jfree.chart.ChartFrame;
/*      */ import org.jfree.chart.JFreeChart;
/*      */ import org.jfree.chart.plot.CategoryPlot;
/*      */ import org.jfree.chart.renderer.category.BarRenderer;
/*      */ import org.jfree.data.category.DefaultCategoryDataset;
/*      */ 
/*      */ public class Admin extends javax.swing.JFrame
/*      */ {
/*   39 */   Connection conn = null;
/*   40 */   ResultSet rs = null;
/*   41 */   PreparedStatement ps = null;
/*      */   
/*      */   int totalToday;
/*      */   
/*      */   int expenseToday;
/*      */   int totalMonth;
/*      */   int expenseMonth;
/*      */   int totalYear;
/*      */   
/*      */   public Admin()
/*      */   {
/*   52 */     initComponents();
/*   53 */     Toolkit tk = Toolkit.getDefaultToolkit();
/*   54 */     int xsize = (int)tk.getScreenSize().getWidth();
/*   55 */     int ysize = (int)tk.getScreenSize().getHeight();
/*   56 */     setSize(xsize, ysize);
/*   57 */     this.conn = JavaConnect.connectDb();
/*      */     try {
/*   59 */       String sql = "select * from income_table";
/*   60 */       this.ps = this.conn.prepareStatement(sql);
/*   61 */       this.rs = this.ps.executeQuery();
/*   62 */       int i = 0;
/*   63 */       this.totalToday = 0;
/*   64 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*   65 */       while (this.rs.next()) {
/*   66 */         Object date = this.rs.getString("date");
/*   67 */         Object subTotal = this.rs.getString("total");
/*   68 */         int st = Integer.parseInt((String)subTotal);
/*   69 */         if (date.equals(d)) {
/*   70 */           this.totalToday = (st + this.totalToday);
/*      */         }
/*   72 */         this.jTextField1.setText("Rs." + String.valueOf(this.totalToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*   78 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try {
/*   81 */       String sql = "select * from expense_table";
/*   82 */       this.ps = this.conn.prepareStatement(sql);
/*   83 */       this.rs = this.ps.executeQuery();
/*   84 */       int i = 0;
/*   85 */       this.expenseToday = 0;
/*   86 */       String d = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*   87 */       while (this.rs.next()) {
/*   88 */         Object date = this.rs.getString("date");
/*   89 */         Object subTotal = this.rs.getString("amount");
/*   90 */         int st = Integer.parseInt((String)subTotal);
/*   91 */         if (date.equals(d)) {
/*   92 */           this.expenseToday = (st + this.expenseToday);
/*      */         }
/*   94 */         this.jTextField2.setText("Rs." + String.valueOf(this.expenseToday));
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  100 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/*  103 */     if (this.totalToday >= this.expenseToday) {
/*  104 */       this.jLabel3.setText("PROFIT");
/*  105 */       this.jTextField3.setText("Rs." + String.valueOf(this.totalToday - this.expenseToday));
/*      */     }
/*      */     else {
/*  108 */       this.jLabel3.setText("LOSS");
/*  109 */       this.jTextField3.setText("Rs." + String.valueOf(this.expenseToday - this.totalToday));
/*      */     }
/*      */     try {
/*  112 */       String sql = "select * from income_table";
/*  113 */       this.ps = this.conn.prepareStatement(sql);
/*  114 */       this.rs = this.ps.executeQuery();
/*  115 */       int i = 0;
/*  116 */       this.totalMonth = 0;
/*  117 */       String m = new SimpleDateFormat("MM").format(new Date());
/*  118 */       int mm = Integer.parseInt(m);
/*  119 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/*  120 */       while (this.rs.next()) {
/*  121 */         Object month = this.rs.getString("month");
/*  122 */         int mmm = Integer.parseInt((String)month);
/*  123 */         Object year = this.rs.getString("year");
/*  124 */         Object subTotal = this.rs.getString("total");
/*  125 */         int st = Integer.parseInt((String)subTotal);
/*  126 */         if ((mm == mmm) && (year.equals(y))) {
/*  127 */           this.totalMonth = (st + this.totalMonth);
/*      */         }
/*  129 */         this.jTextField4.setText("Rs." + String.valueOf(this.totalMonth));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  133 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/*  137 */       String sql = "select * from expense_table";
/*  138 */       this.ps = this.conn.prepareStatement(sql);
/*  139 */       this.rs = this.ps.executeQuery();
/*  140 */       int i = 0;
/*  141 */       this.expenseMonth = 0;
/*  142 */       String m = new SimpleDateFormat("MM").format(new Date());
/*  143 */       int mm = Integer.parseInt(m);
/*  144 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/*  145 */       while (this.rs.next()) {
/*  146 */         Object month = this.rs.getString("month");
/*  147 */         int mmm = Integer.parseInt((String)month);
/*  148 */         Object year = this.rs.getString("year");
/*  149 */         Object subTotal = this.rs.getString("amount");
/*  150 */         int st = Integer.parseInt((String)subTotal);
/*  151 */         if ((mm == mmm) && (year.equals(y))) {
/*  152 */           this.expenseMonth = (st + this.expenseMonth);
/*      */         }
/*  154 */         this.jTextField5.setText("Rs." + String.valueOf(this.expenseMonth));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  158 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/*  161 */     if (this.totalMonth >= this.expenseMonth) {
/*  162 */       this.jLabel9.setText("PROFIT");
/*  163 */       this.jTextField6.setText("Rs." + String.valueOf(this.totalMonth - this.expenseMonth));
/*      */     }
/*      */     else {
/*  166 */       this.jLabel9.setText("LOSS");
/*  167 */       this.jTextField6.setText("Rs." + String.valueOf(this.expenseMonth - this.totalMonth));
/*      */     }
/*      */     try {
/*  170 */       String sql = "select * from income_table";
/*  171 */       this.ps = this.conn.prepareStatement(sql);
/*  172 */       this.rs = this.ps.executeQuery();
/*  173 */       int i = 0;
/*  174 */       this.totalYear = 0;
/*  175 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/*  176 */       while (this.rs.next()) {
/*  177 */         Object year = this.rs.getString("year");
/*  178 */         Object subTotal = this.rs.getString("total");
/*  179 */         int st = Integer.parseInt((String)subTotal);
/*  180 */         if (year.equals(y)) {
/*  181 */           this.totalYear = (st + this.totalYear);
/*      */         }
/*  183 */         this.jTextField7.setText("Rs." + String.valueOf(this.totalYear));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  187 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/*  191 */       String sql = "select * from expense_table";
/*  192 */       this.ps = this.conn.prepareStatement(sql);
/*  193 */       this.rs = this.ps.executeQuery();
/*  194 */       int i = 0;
/*  195 */       this.expenseYear = 0;
/*  196 */       String y = new SimpleDateFormat("YYYY").format(new Date());
/*  197 */       while (this.rs.next()) {
/*  198 */         Object year = this.rs.getString("year");
/*  199 */         Object subTotal = this.rs.getString("amount");
/*  200 */         int st = Integer.parseInt((String)subTotal);
/*  201 */         if (year.equals(y)) {
/*  202 */           this.expenseYear = (st + this.expenseYear);
/*      */         }
/*  204 */         this.jTextField8.setText("Rs." + String.valueOf(this.expenseYear));
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  208 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/*  211 */     if (this.totalYear >= this.expenseYear) {
/*  212 */       this.jLabel13.setText("PROFIT");
/*  213 */       this.jTextField9.setText("Rs." + String.valueOf(this.totalYear - this.expenseYear));
/*      */     }
/*      */     else {
/*  216 */       this.jLabel13.setText("LOSS");
/*  217 */       this.jTextField9.setText("Rs." + String.valueOf(this.expenseYear - this.totalYear));
/*      */     }
/*      */     try {
/*  220 */       String da = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  221 */       String sql = "select * from history_table order by date desc";
/*  222 */       this.ps = this.conn.prepareStatement(sql);
/*  223 */       this.rs = this.ps.executeQuery();
/*  224 */       int i = 0;
/*      */       
/*  226 */       while (this.rs.next()) {
/*  227 */         Object o = Integer.valueOf(this.rs.getInt("order_id"));
/*  228 */         Object item = this.rs.getString("item");
/*  229 */         Object type = this.rs.getString("type");
/*  230 */         Object q = Integer.valueOf(this.rs.getInt("quantity"));
/*  231 */         Object d = this.rs.getString("date");
/*  232 */         System.out.println(d);
/*  233 */         if (i < 100)
/*      */         {
/*  235 */           this.jTable1.getModel().setValueAt(o, i, 0);
/*  236 */           this.jTable1.getModel().setValueAt(d, i, 1);
/*  237 */           this.jTable1.getModel().setValueAt(item, i, 2);
/*  238 */           this.jTable1.getModel().setValueAt(type, i, 3);
/*  239 */           this.jTable1.getModel().setValueAt(q, i, 4);
/*      */         }
/*  241 */         i++;
/*      */       }
/*      */       
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  247 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */   }
/*      */   
/*      */   int expenseYear;
/*      */   private JButton jButton1;
/*      */   private JButton jButton2;
/*      */   private JButton jButton3;
/*      */   private JButton jButton4;
/*      */   private JButton jButton5;
/*      */   private JLabel jLabel1;
/*      */   
/*  259 */   private void initComponents() { this.jPanel1 = new JPanel();
/*  260 */     this.jPanel2 = new JPanel();
/*  261 */     this.jLabel1 = new JLabel();
/*  262 */     this.jLabel2 = new JLabel();
/*  263 */     this.jTextField1 = new JTextField();
/*  264 */     this.jTextField2 = new JTextField();
/*  265 */     this.jLabel3 = new JLabel();
/*  266 */     this.jTextField3 = new JTextField();
/*  267 */     this.jLabel5 = new JLabel();
/*  268 */     this.jButton1 = new JButton();
/*  269 */     this.jPanel3 = new JPanel();
/*  270 */     this.jLabel6 = new JLabel();
/*  271 */     this.jLabel7 = new JLabel();
/*  272 */     this.jLabel8 = new JLabel();
/*  273 */     this.jTextField4 = new JTextField();
/*  274 */     this.jTextField5 = new JTextField();
/*  275 */     this.jLabel9 = new JLabel();
/*  276 */     this.jTextField6 = new JTextField();
/*  277 */     this.jButton2 = new JButton();
/*  278 */     this.jLabel4 = new JLabel();
/*  279 */     this.jPanel4 = new JPanel();
/*  280 */     this.jLabel10 = new JLabel();
/*  281 */     this.jLabel11 = new JLabel();
/*  282 */     this.jLabel12 = new JLabel();
/*  283 */     this.jLabel13 = new JLabel();
/*  284 */     this.jTextField7 = new JTextField();
/*  285 */     this.jTextField8 = new JTextField();
/*  286 */     this.jTextField9 = new JTextField();
/*  287 */     this.jButton3 = new JButton();
/*  288 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  289 */     this.jTable1 = new JTable();
/*  290 */     this.jLabel14 = new JLabel();
/*  291 */     this.jButton4 = new JButton();
/*  292 */     this.jButton5 = new JButton();
/*      */     
/*  294 */     setDefaultCloseOperation(2);
/*      */     
/*  296 */     this.jPanel1.setBackground(new Color(0, 102, 102));
/*      */     
/*  298 */     this.jPanel2.setPreferredSize(new Dimension(310, 414));
/*      */     
/*  300 */     this.jLabel1.setFont(new Font("Montserrat", 0, 18));
/*  301 */     this.jLabel1.setText("INCOME");
/*      */     
/*  303 */     this.jLabel2.setFont(new Font("Montserrat", 0, 18));
/*  304 */     this.jLabel2.setText("EXPENSE");
/*      */     
/*  306 */     this.jTextField1.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  308 */     this.jTextField2.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  310 */     this.jLabel3.setFont(new Font("Montserrat", 0, 18));
/*  311 */     this.jLabel3.setText("PROFIT");
/*      */     
/*  313 */     this.jTextField3.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  315 */     this.jLabel5.setFont(new Font("Montserrat", 0, 18));
/*  316 */     this.jLabel5.setText("TODAY");
/*      */     
/*  318 */     this.jButton1.setFont(new Font("Montserrat", 0, 18));
/*  319 */     this.jButton1.setText("SHOW IN GRAPH");
/*  320 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  322 */         Admin.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  325 */     });
/*  326 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  327 */     this.jPanel2.setLayout(jPanel2Layout);
/*  328 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  329 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  330 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  331 */       .addGap(88, 88, 88)
/*  332 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  333 */       .addComponent(this.jLabel3)
/*  334 */       .addComponent(this.jLabel5))
/*  335 */       .addGap(0, 0, 32767))
/*  336 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  337 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  338 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  339 */       .addGap(20, 20, 20)
/*  340 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  341 */       .addComponent(this.jTextField3, -2, 234, -2)
/*  342 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  343 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  344 */       .addComponent(this.jLabel1)
/*  345 */       .addComponent(this.jLabel2))
/*  346 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  347 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  348 */       .addComponent(this.jTextField1, GroupLayout.Alignment.TRAILING, -2, 103, -2)
/*  349 */       .addComponent(this.jTextField2, GroupLayout.Alignment.TRAILING, -2, 103, -2)))))
/*  350 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  351 */       .addGap(34, 34, 34)
/*  352 */       .addComponent(this.jButton1, -2, 197, -2)))
/*  353 */       .addContainerGap(26, 32767)));
/*      */     
/*  355 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  356 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  357 */       .addGroup(jPanel2Layout.createSequentialGroup()
/*  358 */       .addGap(12, 12, 12)
/*  359 */       .addComponent(this.jLabel5)
/*  360 */       .addGap(18, 18, 18)
/*  361 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  362 */       .addComponent(this.jLabel1)
/*  363 */       .addComponent(this.jTextField1, -2, -1, -2))
/*  364 */       .addGap(26, 26, 26)
/*  365 */       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  366 */       .addComponent(this.jLabel2)
/*  367 */       .addComponent(this.jTextField2, -2, -1, -2))
/*  368 */       .addGap(25, 25, 25)
/*  369 */       .addComponent(this.jLabel3, -2, 23, -2)
/*  370 */       .addGap(26, 26, 26)
/*  371 */       .addComponent(this.jTextField3, -2, 34, -2)
/*  372 */       .addGap(35, 35, 35)
/*  373 */       .addComponent(this.jButton1, -2, 38, -2)
/*  374 */       .addContainerGap(84, 32767)));
/*      */     
/*      */ 
/*  377 */     this.jLabel6.setFont(new Font("Montserrat", 0, 18));
/*  378 */     this.jLabel6.setText("THIS MONTH");
/*      */     
/*  380 */     this.jLabel7.setFont(new Font("Montserrat", 0, 18));
/*  381 */     this.jLabel7.setText("INCOME");
/*      */     
/*  383 */     this.jLabel8.setFont(new Font("Montserrat", 0, 18));
/*  384 */     this.jLabel8.setText("EXPENSE");
/*      */     
/*  386 */     this.jTextField4.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  388 */     this.jTextField5.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  390 */     this.jLabel9.setFont(new Font("Montserrat", 0, 18));
/*  391 */     this.jLabel9.setText("PROFIT");
/*      */     
/*  393 */     this.jTextField6.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  395 */     this.jButton2.setFont(new Font("Montserrat", 0, 18));
/*  396 */     this.jButton2.setText("SHOW IN GRAPH");
/*  397 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  399 */         Admin.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  402 */     });
/*  403 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*  404 */     this.jPanel3.setLayout(jPanel3Layout);
/*  405 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/*  406 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  407 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  408 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  409 */       .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
/*  410 */       .addGap(21, 21, 21)
/*  411 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  412 */       .addComponent(this.jLabel7, -2, 125, -2)
/*  413 */       .addComponent(this.jLabel8))
/*  414 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, 32767)
/*  415 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  416 */       .addComponent(this.jTextField4, -2, 95, -2)
/*  417 */       .addComponent(this.jTextField5, -2, 95, -2)))
/*  418 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  419 */       .addContainerGap(-1, 32767)
/*  420 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  421 */       .addComponent(this.jTextField6, -2, 233, -2)
/*  422 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  423 */       .addGap(11, 11, 11)
/*  424 */       .addComponent(this.jLabel6)))))
/*  425 */       .addGap(26, 26, 26))
/*  426 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  427 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  428 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  429 */       .addGap(93, 93, 93)
/*  430 */       .addComponent(this.jLabel9))
/*  431 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  432 */       .addGap(42, 42, 42)
/*  433 */       .addComponent(this.jButton2)))
/*  434 */       .addContainerGap(-1, 32767)));
/*      */     
/*  436 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/*  437 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  438 */       .addGroup(jPanel3Layout.createSequentialGroup()
/*  439 */       .addContainerGap()
/*  440 */       .addComponent(this.jLabel6)
/*  441 */       .addGap(23, 23, 23)
/*  442 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  443 */       .addComponent(this.jTextField4, -2, -1, -2)
/*  444 */       .addComponent(this.jLabel7))
/*  445 */       .addGap(25, 25, 25)
/*  446 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  447 */       .addComponent(this.jLabel8)
/*  448 */       .addComponent(this.jTextField5, -2, -1, -2))
/*  449 */       .addGap(26, 26, 26)
/*  450 */       .addComponent(this.jLabel9)
/*  451 */       .addGap(26, 26, 26)
/*  452 */       .addComponent(this.jTextField6, -2, 35, -2)
/*  453 */       .addGap(33, 33, 33)
/*  454 */       .addComponent(this.jButton2, -2, 35, -2)
/*  455 */       .addContainerGap(-1, 32767)));
/*      */     
/*      */ 
/*  458 */     this.jLabel4.setFont(new Font("Montserrat", 0, 18));
/*  459 */     this.jLabel4.setForeground(new Color(255, 255, 255));
/*  460 */     this.jLabel4.setText("INCOME");
/*      */     
/*  462 */     this.jPanel4.setPreferredSize(new Dimension(310, 341));
/*      */     
/*  464 */     this.jLabel10.setFont(new Font("Montserrat", 0, 18));
/*  465 */     this.jLabel10.setText("THIS YEAR");
/*      */     
/*  467 */     this.jLabel11.setFont(new Font("Montserrat", 0, 18));
/*  468 */     this.jLabel11.setText("INCOME");
/*      */     
/*  470 */     this.jLabel12.setFont(new Font("Montserrat", 0, 18));
/*  471 */     this.jLabel12.setText("EXPENSE");
/*      */     
/*  473 */     this.jLabel13.setFont(new Font("Montserrat", 0, 18));
/*  474 */     this.jLabel13.setText("PROFIT");
/*      */     
/*  476 */     this.jTextField7.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  478 */     this.jTextField8.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  480 */     this.jTextField9.setFont(new Font("Poppins", 0, 18));
/*      */     
/*  482 */     this.jButton3.setFont(new Font("Montserrat", 0, 18));
/*  483 */     this.jButton3.setText("SHOW IN GRAPH");
/*  484 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  486 */         Admin.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  489 */     });
/*  490 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/*  491 */     this.jPanel4.setLayout(jPanel4Layout);
/*  492 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout
/*  493 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  494 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
/*  495 */       .addGap(24, 24, 24)
/*  496 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  497 */       .addComponent(this.jTextField9, GroupLayout.Alignment.TRAILING)
/*  498 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  499 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  500 */       .addComponent(this.jLabel12)
/*  501 */       .addComponent(this.jLabel11))
/*  502 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  503 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  504 */       .addComponent(this.jTextField7, GroupLayout.Alignment.TRAILING, -2, 103, -2)
/*  505 */       .addComponent(this.jTextField8, GroupLayout.Alignment.TRAILING, -2, 103, -2))))
/*  506 */       .addGap(26, 26, 26))
/*  507 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
/*  508 */       .addContainerGap(-1, 32767)
/*  509 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  510 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
/*  511 */       .addComponent(this.jLabel13)
/*  512 */       .addGap(95, 95, 95))
/*  513 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
/*  514 */       .addComponent(this.jLabel10)
/*  515 */       .addGap(78, 78, 78))))
/*  516 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  517 */       .addGap(39, 39, 39)
/*  518 */       .addComponent(this.jButton3, -2, 198, -2)
/*  519 */       .addContainerGap(39, 32767)));
/*      */     
/*  521 */     jPanel4Layout.setVerticalGroup(jPanel4Layout
/*  522 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  523 */       .addGroup(jPanel4Layout.createSequentialGroup()
/*  524 */       .addContainerGap()
/*  525 */       .addComponent(this.jLabel10, -2, 24, -2)
/*  526 */       .addGap(18, 18, 18)
/*  527 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  528 */       .addComponent(this.jTextField7, -2, -1, -2)
/*  529 */       .addComponent(this.jLabel11))
/*  530 */       .addGap(20, 20, 20)
/*  531 */       .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  532 */       .addComponent(this.jLabel12)
/*  533 */       .addComponent(this.jTextField8, -2, -1, -2))
/*  534 */       .addGap(35, 35, 35)
/*  535 */       .addComponent(this.jLabel13)
/*  536 */       .addGap(18, 18, 18)
/*  537 */       .addComponent(this.jTextField9, -2, 33, -2)
/*  538 */       .addGap(35, 35, 35)
/*  539 */       .addComponent(this.jButton3, -2, 32, -2)
/*  540 */       .addContainerGap(95, 32767)));
/*      */     
/*      */ 
/*  543 */     this.jTable1.setFont(new Font("Poppins", 0, 14));
/*  544 */     this.jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null } }, new String[] { "TABLE ", "DATE/TIME", "ITEM", "TYPE", "NO." }));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  651 */     this.jTable1.setRowHeight(25);
/*  652 */     this.jScrollPane1.setViewportView(this.jTable1);
/*  653 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/*  654 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
/*  655 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
/*  656 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
/*  657 */       this.jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
/*      */     }
/*      */     
/*  660 */     this.jLabel14.setFont(new Font("Montserrat", 0, 18));
/*  661 */     this.jLabel14.setForeground(new Color(255, 255, 255));
/*  662 */     this.jLabel14.setText(" ORDER HISTORY");
/*      */     
/*  664 */     this.jButton4.setFont(new Font("Montserrat", 0, 18));
/*  665 */     this.jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/edit.png")));
/*  666 */     this.jButton4.setText("EDIT");
/*  667 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  669 */         Admin.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  672 */     });
/*  673 */     this.jButton5.setFont(new Font("Arial Rounded MT Bold", 0, 11));
/*  674 */     this.jButton5.setText("LOG OUT");
/*  675 */     this.jButton5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  677 */         Admin.this.jButton5ActionPerformed(evt);
/*      */       }
/*      */       
/*  680 */     });
/*  681 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  682 */     this.jPanel1.setLayout(jPanel1Layout);
/*  683 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  684 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  685 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/*  686 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  687 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  688 */       .addGap(379, 379, 379)
/*  689 */       .addComponent(this.jLabel4, -2, 119, -2)
/*  690 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  691 */       .addComponent(this.jLabel14, -2, 173, -2)
/*  692 */       .addGap(88, 88, 88)
/*  693 */       .addComponent(this.jButton5))
/*  694 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  695 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  696 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  697 */       .addContainerGap()
/*  698 */       .addComponent(this.jButton4)
/*  699 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767))
/*  700 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  701 */       .addContainerGap(-1, 32767)
/*  702 */       .addComponent(this.jPanel2, -2, 280, -2)
/*  703 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  704 */       .addComponent(this.jPanel3, -2, -1, -2)
/*  705 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  706 */       .addComponent(this.jPanel4, -2, 276, -2)
/*  707 */       .addGap(10, 10, 10)))
/*  708 */       .addComponent(this.jScrollPane1, -2, 472, -2)))
/*  709 */       .addGap(580, 580, 580)));
/*      */     
/*  711 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  712 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  713 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  714 */       .addContainerGap()
/*  715 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  716 */       .addComponent(this.jButton5)
/*  717 */       .addComponent(this.jLabel14, -2, 23, -2)
/*  718 */       .addComponent(this.jLabel4, -2, 26, -2))
/*  719 */       .addGap(18, 18, 18)
/*  720 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  721 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  722 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  723 */       .addComponent(this.jPanel3, -1, -1, 32767)
/*  724 */       .addComponent(this.jPanel4, -1, 414, 32767)
/*  725 */       .addComponent(this.jPanel2, -1, -1, 32767))
/*  726 */       .addGap(101, 101, 101)
/*  727 */       .addComponent(this.jButton4))
/*  728 */       .addComponent(this.jScrollPane1, -2, 750, -2))
/*  729 */       .addContainerGap(37, 32767)));
/*      */     
/*      */ 
/*  732 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  733 */     getContentPane().setLayout(layout);
/*  734 */     layout.setHorizontalGroup(layout
/*  735 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  736 */       .addGroup(layout.createSequentialGroup()
/*  737 */       .addComponent(this.jPanel1, -2, 1764, -2)
/*  738 */       .addGap(0, 160, 32767)));
/*      */     
/*  740 */     layout.setVerticalGroup(layout
/*  741 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  742 */       .addGroup(layout.createSequentialGroup()
/*  743 */       .addComponent(this.jPanel1, -2, -1, -2)
/*  744 */       .addGap(0, 206, 32767)));
/*      */     
/*      */ 
/*  747 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  751 */     String day1 = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
/*  752 */     Calendar c = Calendar.getInstance();
/*  753 */     c.add(5, -1);
/*  754 */     String day2 = new SimpleDateFormat("dd-MM-yyyy").format(c.getTime());
/*  755 */     Calendar c1 = Calendar.getInstance();
/*  756 */     c1.add(5, -2);
/*  757 */     String day3 = new SimpleDateFormat("dd-MM-yyyy").format(c1.getTime());
/*  758 */     Calendar c2 = Calendar.getInstance();
/*  759 */     c2.add(5, -3);
/*  760 */     String day4 = new SimpleDateFormat("dd-MM-yyyy").format(c2.getTime());
/*  761 */     Calendar c3 = Calendar.getInstance();
/*  762 */     c3.add(5, -4);
/*  763 */     String day5 = new SimpleDateFormat("dd-MM-yyyy").format(c3.getTime());
/*  764 */     Calendar c4 = Calendar.getInstance();
/*  765 */     c4.add(5, -5);
/*  766 */     String day6 = new SimpleDateFormat("dd-MM-yyyy").format(c4.getTime());
/*  767 */     Calendar c5 = Calendar.getInstance();
/*  768 */     c5.add(5, -6);
/*  769 */     String day7 = new SimpleDateFormat("dd-MM-yyyy").format(c5.getTime());
/*  770 */     Calendar c6 = Calendar.getInstance();
/*  771 */     c6.add(5, -7);
/*  772 */     String day8 = new SimpleDateFormat("dd-MM-yyyy").format(c6.getTime());
/*  773 */     Calendar c7 = Calendar.getInstance();
/*  774 */     c7.add(5, -8);
/*  775 */     String day9 = new SimpleDateFormat("dd-MM-yyyy").format(c7.getTime());
/*  776 */     Calendar c8 = Calendar.getInstance();
/*  777 */     c8.add(5, -9);
/*  778 */     String day10 = new SimpleDateFormat("dd-MM-yyyy").format(c8.getTime());
/*  779 */     this.conn = JavaConnect.connectDb();
/*  780 */     double totalday1 = 0.0D;double totalday2 = 0.0D;double totalday3 = 0.0D;double totalday4 = 0.0D;double totalday5 = 0.0D;double totalday6 = 0.0D;double totalday7 = 0.0D;double totalday8 = 0.0D;double totalday9 = 0.0D;double totalday10 = 0.0D;
/*  781 */     double expenseday1 = 0.0D;double expenseday2 = 0.0D;double expenseday3 = 0.0D;double expenseday4 = 0.0D;double expenseday5 = 0.0D;double expenseday6 = 0.0D;double expenseday7 = 0.0D;double expenseday8 = 0.0D;double expenseday9 = 0.0D;double expenseday10 = 0.0D;
/*      */     try {
/*  783 */       String sql = "select * from income_table";
/*  784 */       this.ps = this.conn.prepareStatement(sql);
/*  785 */       this.rs = this.ps.executeQuery();
/*  786 */       while (this.rs.next()) {
/*  787 */         Object date = this.rs.getString("date");
/*  788 */         Object subTotal = this.rs.getString("total");
/*  789 */         int st = Integer.parseInt((String)subTotal);
/*  790 */         if (date.equals(day1)) {
/*  791 */           totalday1 = st + totalday1;
/*      */         }
/*  793 */         if (date.equals(day2)) {
/*  794 */           totalday2 = st + totalday2;
/*      */         }
/*  796 */         if (date.equals(day3)) {
/*  797 */           totalday3 = st + totalday3;
/*      */         }
/*  799 */         if (date.equals(day4)) {
/*  800 */           totalday4 = st + totalday4;
/*      */         }
/*  802 */         if (date.equals(day5)) {
/*  803 */           totalday5 = st + totalday5;
/*      */         }
/*  805 */         if (date.equals(day6)) {
/*  806 */           totalday6 = st + totalday6;
/*      */         }
/*  808 */         if (date.equals(day7)) {
/*  809 */           totalday7 = st + totalday7;
/*      */         }
/*  811 */         if (date.equals(day8)) {
/*  812 */           totalday8 = st + totalday8;
/*      */         }
/*  814 */         if (date.equals(day9)) {
/*  815 */           totalday9 = st + totalday9;
/*      */         }
/*  817 */         if (date.equals(day10)) {
/*  818 */           totalday10 = st + totalday10;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  823 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/*  827 */       String sql = "select * from expense_table";
/*  828 */       this.ps = this.conn.prepareStatement(sql);
/*  829 */       this.rs = this.ps.executeQuery();
/*  830 */       while (this.rs.next()) {
/*  831 */         Object date = this.rs.getString("date");
/*  832 */         Object subTotal = this.rs.getString("amount");
/*  833 */         int st = Integer.parseInt((String)subTotal);
/*  834 */         if (date.equals(day1)) {
/*  835 */           expenseday1 = st + expenseday1;
/*      */         }
/*  837 */         if (date.equals(day2)) {
/*  838 */           expenseday2 = st + expenseday2;
/*      */         }
/*  840 */         if (date.equals(day3)) {
/*  841 */           expenseday3 = st + expenseday3;
/*      */         }
/*  843 */         if (date.equals(day4)) {
/*  844 */           expenseday3 = st + expenseday3;
/*      */         }
/*  846 */         if (date.equals(day5)) {
/*  847 */           expenseday4 = st + expenseday4;
/*      */         }
/*  849 */         if (date.equals(day6)) {
/*  850 */           expenseday5 = st + expenseday5;
/*      */         }
/*  852 */         if (date.equals(day7)) {
/*  853 */           expenseday6 = st + expenseday6;
/*      */         }
/*  855 */         if (date.equals(day8)) {
/*  856 */           expenseday7 = st + expenseday7;
/*      */         }
/*  858 */         if (date.equals(day9)) {
/*  859 */           expenseday9 = st + expenseday9;
/*      */         }
/*  861 */         if (date.equals(day10)) {
/*  862 */           expenseday10 = st + expenseday10;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  867 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*  869 */     double profitday1 = totalday1 - expenseday1;
/*  870 */     double profitday2 = totalday2 - expenseday2;
/*  871 */     double profitday3 = totalday3 - expenseday3;
/*  872 */     double profitday4 = totalday4 - expenseday4;
/*  873 */     double profitday5 = totalday5 - expenseday5;
/*  874 */     double profitday6 = totalday6 - expenseday6;
/*  875 */     double profitday7 = totalday7 - expenseday7;
/*  876 */     double profitday8 = totalday8 - expenseday8;
/*  877 */     double profitday9 = totalday9 - expenseday9;
/*  878 */     double profitday10 = totalday10 - expenseday10;
/*      */     
/*  880 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/*  881 */     dataset.setValue(totalday1, "Income", day1);
/*  882 */     dataset.setValue(totalday2, "Income", day2);
/*  883 */     dataset.setValue(totalday3, "Income", day3);
/*  884 */     dataset.setValue(totalday4, "Income", day4);
/*  885 */     dataset.setValue(totalday5, "Income", day5);
/*  886 */     dataset.setValue(totalday6, "Income", day6);
/*  887 */     dataset.setValue(totalday7, "Income", day7);
/*  888 */     dataset.setValue(totalday8, "Income", day8);
/*  889 */     dataset.setValue(totalday9, "Income", day9);
/*  890 */     dataset.setValue(totalday10, "Income", day10);
/*      */     
/*  892 */     dataset.setValue(expenseday1, "expense", day1);
/*  893 */     dataset.setValue(expenseday2, "expense", day2);
/*  894 */     dataset.setValue(expenseday3, "expense", day3);
/*  895 */     dataset.setValue(expenseday4, "expense", day4);
/*  896 */     dataset.setValue(expenseday5, "expense", day5);
/*  897 */     dataset.setValue(expenseday6, "expense", day6);
/*  898 */     dataset.setValue(expenseday7, "expense", day7);
/*  899 */     dataset.setValue(expenseday8, "expense", day8);
/*  900 */     dataset.setValue(expenseday9, "expense", day9);
/*  901 */     dataset.setValue(expenseday10, "expense", day10);
/*      */     
/*  903 */     dataset.setValue(profitday1, "profit", day1);
/*  904 */     dataset.setValue(profitday2, "profit", day2);
/*  905 */     dataset.setValue(profitday3, "profit", day3);
/*  906 */     dataset.setValue(profitday4, "profit", day4);
/*  907 */     dataset.setValue(profitday5, "profit", day5);
/*  908 */     dataset.setValue(profitday6, "profit", day6);
/*  909 */     dataset.setValue(profitday7, "profit", day7);
/*  910 */     dataset.setValue(profitday8, "profit", day8);
/*  911 */     dataset.setValue(profitday9, "profit", day9);
/*  912 */     dataset.setValue(profitday10, "profit", day10);
/*      */     
/*      */ 
/*  915 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Date", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*  916 */     chart.setBackgroundPaint(Color.white);
/*  917 */     chart.getTitle().setPaint(Color.RED);
/*  918 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/*  919 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/*      */     
/*  921 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/*  922 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/*  923 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/*  924 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/*      */     
/*  926 */     CategoryPlot p = chart.getCategoryPlot();
/*  927 */     p.setRangeGridlinePaint(Color.BLACK);
/*  928 */     ChartFrame frame = new ChartFrame("bar chart for Daily Income", chart);
/*  929 */     frame.setVisible(true);
/*  930 */     frame.setSize(950, 550);
/*  931 */     frame.setLocation(320, 100);
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt)
/*      */   {
/*  936 */     String month1 = new SimpleDateFormat("MM").format(new Date());
/*  937 */     int m1 = Integer.parseInt(month1);
/*  938 */     Calendar c = Calendar.getInstance();
/*  939 */     c.add(2, -1);
/*  940 */     String month2 = new SimpleDateFormat("MM").format(c.getTime());
/*  941 */     int m2 = Integer.parseInt(month2);
/*  942 */     Calendar c1 = Calendar.getInstance();
/*  943 */     c1.add(2, -2);
/*  944 */     String month3 = new SimpleDateFormat("MM").format(c1.getTime());
/*  945 */     int m3 = Integer.parseInt(month3);
/*  946 */     Calendar c2 = Calendar.getInstance();
/*  947 */     c2.add(2, -3);
/*  948 */     String month4 = new SimpleDateFormat("MM").format(c2.getTime());
/*  949 */     int m4 = Integer.parseInt(month4);
/*  950 */     this.conn = JavaConnect.connectDb();
/*  951 */     double totalMonth1 = 0.0D;double totalMonth2 = 0.0D;double totalMonth3 = 0.0D;double totalMonth4 = 0.0D;
/*  952 */     double expenseMonth1 = 0.0D;double expenseMonth2 = 0.0D;double expenseMonth3 = 0.0D;double expenseMonth4 = 0.0D;
/*      */     try {
/*  954 */       String sql = "select * from income_table";
/*  955 */       this.ps = this.conn.prepareStatement(sql);
/*  956 */       this.rs = this.ps.executeQuery();
/*  957 */       while (this.rs.next()) {
/*  958 */         Object month = this.rs.getString("month");
/*  959 */         int mm = Integer.parseInt((String)month);
/*  960 */         Object subTotal = this.rs.getString("total");
/*  961 */         int st = Integer.parseInt((String)subTotal);
/*  962 */         if (mm == m1) {
/*  963 */           totalMonth1 = st + totalMonth1;
/*      */         }
/*  965 */         if (mm == m2) {
/*  966 */           totalMonth2 = st + totalMonth2;
/*      */         }
/*  968 */         if (mm == m3) {
/*  969 */           totalMonth3 = st + totalMonth3;
/*      */         }
/*  971 */         if (mm == m4) {
/*  972 */           totalMonth4 = st + totalMonth4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/*  977 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/*  981 */       String sql = "select * from expense_table";
/*  982 */       this.ps = this.conn.prepareStatement(sql);
/*  983 */       this.rs = this.ps.executeQuery();
/*  984 */       while (this.rs.next()) {
/*  985 */         Object month = this.rs.getString("month");
/*  986 */         int mm = Integer.parseInt((String)month);
/*  987 */         Object subTotal = this.rs.getString("amount");
/*  988 */         int st = Integer.parseInt((String)subTotal);
/*  989 */         if (mm == m1) {
/*  990 */           expenseMonth1 = st + expenseMonth1;
/*      */         }
/*  992 */         if (mm == m2) {
/*  993 */           expenseMonth2 = st + expenseMonth2;
/*      */         }
/*  995 */         if (mm == m3) {
/*  996 */           expenseMonth3 = st + expenseMonth3;
/*      */         }
/*  998 */         if (mm == m4) {
/*  999 */           expenseMonth4 = st + expenseMonth4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1004 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/* 1006 */     double profitMonth1 = totalMonth1 - expenseMonth1;
/* 1007 */     double profitMonth2 = totalMonth2 - expenseMonth2;
/* 1008 */     double profitMonth3 = totalMonth3 - expenseMonth3;
/* 1009 */     double profitMonth4 = totalMonth4 - expenseMonth4;
/*      */     
/*      */ 
/* 1012 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/* 1013 */     dataset.setValue(totalMonth1, "Income", month1);
/* 1014 */     dataset.setValue(totalMonth2, "Income", month2);
/* 1015 */     dataset.setValue(totalMonth3, "Income", month3);
/* 1016 */     dataset.setValue(totalMonth4, "Income", month4);
/*      */     
/* 1018 */     dataset.setValue(expenseMonth1, "Expense", month1);
/* 1019 */     dataset.setValue(expenseMonth2, "Expense", month2);
/* 1020 */     dataset.setValue(expenseMonth3, "Expense", month3);
/* 1021 */     dataset.setValue(expenseMonth4, "Expense", month4);
/*      */     
/* 1023 */     dataset.setValue(profitMonth1, "Profit", month1);
/* 1024 */     dataset.setValue(profitMonth2, "Profit", month2);
/* 1025 */     dataset.setValue(profitMonth3, "Profit", month3);
/* 1026 */     dataset.setValue(profitMonth4, "Profit", month4);
/*      */     
/* 1028 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Month", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*      */     
/* 1030 */     chart.getTitle().setPaint(Color.RED);
/* 1031 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/* 1032 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/*      */     
/* 1034 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/* 1035 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/* 1036 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/* 1037 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/* 1038 */     CategoryPlot p = chart.getCategoryPlot();
/* 1039 */     p.setRangeGridlinePaint(Color.BLACK);
/* 1040 */     ChartFrame frame = new ChartFrame("bar chart for Monthly Income", chart);
/* 1041 */     frame.setVisible(true);
/* 1042 */     frame.setSize(950, 550);
/* 1043 */     frame.setLocation(320, 100);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 1047 */     String year1 = new SimpleDateFormat("YYYY").format(new Date());
/* 1048 */     int y1 = Integer.parseInt(year1);
/* 1049 */     Calendar c = Calendar.getInstance();
/* 1050 */     c.add(1, -1);
/* 1051 */     String year2 = new SimpleDateFormat("YYYY").format(c.getTime());
/* 1052 */     int y2 = Integer.parseInt(year2);
/* 1053 */     Calendar c1 = Calendar.getInstance();
/* 1054 */     c1.add(1, -2);
/* 1055 */     String year3 = new SimpleDateFormat("YYYY").format(c1.getTime());
/* 1056 */     int y3 = Integer.parseInt(year3);
/* 1057 */     Calendar c2 = Calendar.getInstance();
/* 1058 */     c2.add(1, -3);
/* 1059 */     String year4 = new SimpleDateFormat("YYYY").format(c2.getTime());
/* 1060 */     int y4 = Integer.parseInt(year4);
/* 1061 */     this.conn = JavaConnect.connectDb();
/* 1062 */     double totalYear1 = 0.0D;double totalYear2 = 0.0D;double totalYear3 = 0.0D;double totalYear4 = 0.0D;
/* 1063 */     double expenseYear1 = 0.0D;double expenseYear2 = 0.0D;double expenseYear3 = 0.0D;double expenseYear4 = 0.0D;
/* 1064 */     double profitYear1 = 0.0D;double profitYear2 = 0.0D;double profitYear3 = 0.0D;double profitYear4 = 0.0D;
/*      */     try {
/* 1066 */       String sql = "select * from income_table";
/* 1067 */       this.ps = this.conn.prepareStatement(sql);
/* 1068 */       this.rs = this.ps.executeQuery();
/* 1069 */       while (this.rs.next()) {
/* 1070 */         Object year = this.rs.getString("year");
/* 1071 */         int yy = Integer.parseInt((String)year);
/* 1072 */         Object subTotal = this.rs.getString("total");
/* 1073 */         int st = Integer.parseInt((String)subTotal);
/* 1074 */         if (yy == y1) {
/* 1075 */           totalYear1 = st + totalYear1;
/*      */         }
/* 1077 */         if (yy == y2) {
/* 1078 */           totalYear2 = st + totalYear2;
/*      */         }
/* 1080 */         if (yy == y3) {
/* 1081 */           totalYear3 = st + totalYear3;
/*      */         }
/* 1083 */         if (yy == y4) {
/* 1084 */           totalYear4 = st + totalYear4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1089 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     try
/*      */     {
/* 1093 */       String sql = "select * from expense_table";
/* 1094 */       this.ps = this.conn.prepareStatement(sql);
/* 1095 */       this.rs = this.ps.executeQuery();
/* 1096 */       while (this.rs.next()) {
/* 1097 */         Object year = this.rs.getString("year");
/* 1098 */         int yy = Integer.parseInt((String)year);
/* 1099 */         Object subTotal = this.rs.getString("amount");
/* 1100 */         int st = Integer.parseInt((String)subTotal);
/* 1101 */         if (yy == y1) {
/* 1102 */           expenseYear1 = st + expenseYear1;
/*      */         }
/* 1104 */         if (yy == y2) {
/* 1105 */           expenseYear2 = st + expenseYear2;
/*      */         }
/* 1107 */         if (yy == y3) {
/* 1108 */           expenseYear3 = st + expenseYear3;
/*      */         }
/* 1110 */         if (yy == y4) {
/* 1111 */           expenseYear4 = st + expenseYear4;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (Exception e) {
/* 1116 */       JOptionPane.showMessageDialog(null, e);
/*      */     }
/*      */     
/* 1119 */     profitYear1 = totalYear1 - expenseYear1;
/* 1120 */     profitYear2 = totalYear2 - expenseYear2;
/* 1121 */     profitYear3 = totalYear3 - expenseYear3;
/* 1122 */     profitYear4 = totalYear4 - expenseYear4;
/*      */     
/* 1124 */     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
/* 1125 */     dataset.setValue(totalYear1, "Income", year1);
/* 1126 */     dataset.setValue(totalYear2, "Income", year2);
/* 1127 */     dataset.setValue(totalYear3, "Income", year3);
/* 1128 */     dataset.setValue(totalYear4, "Income", year4);
/*      */     
/* 1130 */     dataset.setValue(expenseYear1, "Expense", year1);
/* 1131 */     dataset.setValue(expenseYear2, "Expense", year2);
/* 1132 */     dataset.setValue(expenseYear3, "Expense", year3);
/* 1133 */     dataset.setValue(expenseYear4, "Expense", year4);
/*      */     
/* 1135 */     dataset.setValue(profitYear1, "Profit", year1);
/* 1136 */     dataset.setValue(profitYear2, "Profit", year2);
/* 1137 */     dataset.setValue(profitYear3, "Profit", year3);
/* 1138 */     dataset.setValue(profitYear4, "Profit", year4);
/*      */     
/*      */ 
/* 1141 */     JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Income chart", "Year", "Income/Expense/Profit", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
/*      */     
/* 1143 */     chart.getTitle().setPaint(Color.RED);
/* 1144 */     CategoryPlot cplot = (CategoryPlot)chart.getPlot();
/* 1145 */     ((BarRenderer)cplot.getRenderer()).setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
/* 1146 */     BarRenderer r = (BarRenderer)chart.getCategoryPlot().getRenderer();
/* 1147 */     r.setSeriesPaint(0, new Color(255, 204, 0));
/* 1148 */     r.setSeriesPaint(1, new Color(204, 51, 0));
/* 1149 */     r.setSeriesPaint(2, new Color(0, 153, 0));
/* 1150 */     CategoryPlot p = chart.getCategoryPlot();
/* 1151 */     p.setRangeGridlinePaint(Color.BLACK);
/* 1152 */     ChartFrame frame = new ChartFrame("bar chart for Yearly Income", chart);
/* 1153 */     frame.setVisible(true);
/* 1154 */     frame.setSize(950, 550);
/* 1155 */     frame.setLocation(320, 100);
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt)
/*      */   {
/* 1160 */     Edit e = new Edit();
/* 1161 */     e.setVisible(true);
/* 1162 */     close();
/*      */   }
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt)
/*      */   {
/* 1167 */     Login l = new Login();
/* 1168 */     l.setVisible(true);
/* 1169 */     close();
/*      */   }
/*      */   
/*      */   private JLabel jLabel10;
/*      */   private JLabel jLabel11;
/*      */   private JLabel jLabel12;
/*      */   private JLabel jLabel13;
/*      */   private JLabel jLabel14;
/*      */   private JLabel jLabel2;
/*      */   private JLabel jLabel3;
/*      */   private JLabel jLabel4;
/*      */   public static void main(String[] args) {
/*      */     try {
/* 1182 */       for (javax.swing.UIManager.LookAndFeelInfo info : )
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1195 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*      */ 
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */     }
/*      */     catch (ClassNotFoundException ex)
/*      */     {
/*      */ 
/*      */ 
/* 1206 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 1208 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 1210 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1212 */       Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1217 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 1219 */         new Admin().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */ 
/*      */   private JLabel jLabel5;
/*      */   
/*      */   private JLabel jLabel6;
/*      */   
/*      */   private JLabel jLabel7;
/*      */   
/*      */   private JLabel jLabel8;
/*      */   
/*      */   private JLabel jLabel9;
/*      */   
/*      */   private JPanel jPanel1;
/*      */   
/*      */   private JPanel jPanel2;
/*      */   
/*      */   private JPanel jPanel3;
/*      */   
/*      */   private JPanel jPanel4;
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
/*      */   private JTextField jTextField5;
/*      */   private JTextField jTextField6;
/*      */   private JTextField jTextField7;
/*      */   private JTextField jTextField8;
/*      */   private JTextField jTextField9;
/*      */   public void close()
/*      */   {
/* 1261 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 1262 */     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*      */   }
/*      */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Admin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
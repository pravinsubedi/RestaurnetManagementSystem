/*     */ package resturentapp;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ 
/*     */ public class Confirm extends javax.swing.JFrame
/*     */ {
/*  22 */   java.sql.Connection conn = null;
/*  23 */   ResultSet rs = null;
/*  24 */   java.sql.PreparedStatement ps = null;
/*     */   double firstnum;
/*     */   double secondnum;
/*     */   double result;
/*     */   String answer;
/*     */   String operation;
/*     */   int orderId;
/*     */   Boolean s1;
/*  32 */   int x = 2;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   
/*  37 */   public Confirm() { initComponents(); }
/*     */   
/*     */ 
/*     */ 
/*     */   public Confirm(int id)
/*     */   {
/*  43 */     initComponents();
/*  44 */     this.jLabel3.setVisible(false);
/*  45 */     java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
/*  46 */     int xsize = (int)tk.getScreenSize().getWidth();
/*  47 */     int ysize = (int)tk.getScreenSize().getHeight();
/*  48 */     setSize(xsize, ysize);
/*  49 */     this.orderId = id;
/*  50 */     this.conn = JavaConnect.connectDb();
/*  51 */     updateTable();
/*     */   }
/*     */   
/*     */   private void updateTable() {
/*  55 */     try { int s = 1;
/*  56 */       String sql = "select rowid,* from res_table where order_id= " + this.orderId;
/*  57 */       this.ps = this.conn.prepareStatement(sql);
/*  58 */       this.rs = this.ps.executeQuery();
/*  59 */       int i = 0;
/*  60 */       int total = 0;
/*  61 */       while (this.rs.next()) {
/*  62 */         Object name = this.rs.getString("item");
/*  63 */         Object type = this.rs.getString("type");
/*     */         
/*  65 */         Object code = this.rs.getString("rowid");
/*  66 */         Object number = this.rs.getString("quantity");
/*  67 */         Object subTotal = this.rs.getString("sub_total");
/*  68 */         int c = this.rs.getInt("order_id");
/*  69 */         int st = Integer.parseInt((String)subTotal);
/*  70 */         total = st + total;
/*  71 */         this.jTable1.getModel().setValueAt(code, i, 0);
/*  72 */         this.jTable1.getModel().setValueAt(name, i, 1);
/*  73 */         this.jTable1.getModel().setValueAt(type, i, 2);
/*  74 */         this.jTable1.getModel().setValueAt(number, i, 3);
/*  75 */         this.jTable1.getModel().setValueAt(subTotal, i, 4);
/*  76 */         i++;
/*     */       }
/*  78 */       this.jTextField1.setText(String.valueOf(this.orderId));
/*  79 */       this.jTextField2.setText("Rs." + String.valueOf(total));
/*     */     }
/*     */     catch (Exception e) {
/*  82 */       JOptionPane.showMessageDialog(null, "opps some error occured  \n click ok and try again", "", 0);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private JLabel jLabel1;
/*     */   
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private JLabel jLabel3;
/*     */   private void initComponents()
/*     */   {
/*  94 */     this.jPanel1 = new javax.swing.JPanel();
/*  95 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  96 */     this.jTable1 = new JTable();
/*  97 */     this.jTextField3 = new JTextField();
/*  98 */     this.jTextField4 = new JTextField();
/*  99 */     this.jButton2 = new JButton();
/* 100 */     this.jTextField2 = new JTextField();
/* 101 */     this.jLabel1 = new JLabel();
/* 102 */     this.jLabel3 = new JLabel();
/* 103 */     this.jButton3 = new JButton();
/* 104 */     this.jTextField1 = new JTextField();
/* 105 */     this.jLabel2 = new JLabel();
/* 106 */     this.jButton1 = new JButton();
/*     */     
/* 108 */     setDefaultCloseOperation(2);
/*     */     
/* 110 */     this.jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
/* 111 */     this.jTable1.setFont(new Font("Poppins", 0, 14));
/* 112 */     this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null } }, new String[] { "CODE", "ITEM NAME", "TYPE", "NUMBER", "SUB-TOTAL" })
/*     */     {
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
/* 151 */       boolean[] canEdit = { false, false, false, false, false };
/*     */       
/*     */ 
/*     */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*     */       {
/* 156 */         return this.canEdit[columnIndex];
/*     */       }
/* 158 */     });
/* 159 */     this.jTable1.setAlignmentX(2.0F);
/* 160 */     this.jTable1.setAlignmentY(2.0F);
/* 161 */     this.jTable1.setCursor(new java.awt.Cursor(12));
/* 162 */     this.jTable1.setRowHeight(30);
/* 163 */     this.jTable1.setSelectionBackground(new java.awt.Color(255, 204, 0));
/* 164 */     this.jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 166 */         Confirm.this.jTable1MouseClicked(evt);
/*     */       }
/* 168 */     });
/* 169 */     this.jScrollPane1.setViewportView(this.jTable1);
/* 170 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 171 */       this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
/* 172 */       this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
/* 173 */       this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
/* 174 */       this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
/* 175 */       this.jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
/*     */     }
/*     */     
/* 178 */     this.jTextField3.setEditable(false);
/* 179 */     this.jTextField3.setFont(new Font("Tahoma", 0, 18));
/*     */     
/* 181 */     this.jTextField4.setEditable(false);
/* 182 */     this.jTextField4.setFont(new Font("Tahoma", 0, 18));
/*     */     
/* 184 */     this.jButton2.setFont(new Font("Montserrat Hairline", 0, 24));
/* 185 */     this.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/cross.png")));
/* 186 */     this.jButton2.setText("REMOVE");
/* 187 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 189 */         Confirm.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/* 192 */     });
/* 193 */     this.jTextField2.setEditable(false);
/* 194 */     this.jTextField2.setFont(new Font("Tahoma", 0, 18));
/*     */     
/* 196 */     this.jLabel1.setFont(new Font("Montserrat Hairline", 0, 24));
/* 197 */     this.jLabel1.setText("Total:");
/*     */     
/* 199 */     this.jLabel3.setText("jLabel3");
/*     */     
/* 201 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 202 */     this.jPanel1.setLayout(jPanel1Layout);
/* 203 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 204 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 205 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 206 */       .addGap(190, 190, 190)
/* 207 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 208 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 209 */       .addComponent(this.jTextField3, -2, 158, -2)
/* 210 */       .addGap(18, 18, 18)
/* 211 */       .addComponent(this.jTextField4, -2, 204, -2)
/* 212 */       .addGap(18, 18, 18)
/* 213 */       .addComponent(this.jButton2)
/* 214 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 215 */       .addComponent(this.jLabel1)
/* 216 */       .addGap(29, 29, 29)
/* 217 */       .addComponent(this.jTextField2, -2, 206, -2))
/* 218 */       .addComponent(this.jScrollPane1, -2, 954, -2))
/* 219 */       .addContainerGap(246, 32767))
/* 220 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 221 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 222 */       .addGap(0, 0, 32767)
/* 223 */       .addComponent(this.jLabel3)
/* 224 */       .addGap(0, 0, 32767))));
/*     */     
/* 226 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 227 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 228 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 229 */       .addComponent(this.jScrollPane1, -2, 446, -2)
/* 230 */       .addGap(44, 44, 44)
/* 231 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 232 */       .addComponent(this.jTextField4, -2, 39, -2)
/* 233 */       .addComponent(this.jButton2, -2, 39, -2)
/* 234 */       .addComponent(this.jTextField3, -2, 39, -2)
/* 235 */       .addComponent(this.jLabel1)
/* 236 */       .addComponent(this.jTextField2, -2, 39, -2))
/* 237 */       .addContainerGap(203, 32767))
/* 238 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 239 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 240 */       .addGap(0, 0, 32767)
/* 241 */       .addComponent(this.jLabel3)
/* 242 */       .addGap(0, 0, 32767))));
/*     */     
/*     */ 
/* 245 */     this.jButton3.setFont(new Font("Montserrat Hairline", 0, 14));
/* 246 */     this.jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/left-arrow.png")));
/* 247 */     this.jButton3.setBorderPainted(false);
/* 248 */     this.jButton3.setContentAreaFilled(false);
/* 249 */     this.jButton3.setFocusPainted(false);
/* 250 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 252 */         Confirm.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 255 */     });
/* 256 */     this.jTextField1.setEditable(false);
/* 257 */     this.jTextField1.setFont(new Font("Poppins", 0, 14));
/* 258 */     this.jTextField1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 260 */         Confirm.this.jTextField1ActionPerformed(evt);
/*     */       }
/*     */       
/* 263 */     });
/* 264 */     this.jLabel2.setFont(new Font("Montserrat Hairline", 0, 24));
/* 265 */     this.jLabel2.setText("Order Id:");
/*     */     
/* 267 */     this.jButton1.setFont(new Font("Montserrat Hairline", 0, 24));
/* 268 */     this.jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturentapp/right-arrow.png")));
/* 269 */     this.jButton1.setBorderPainted(false);
/* 270 */     this.jButton1.setContentAreaFilled(false);
/* 271 */     this.jButton1.setFocusPainted(false);
/* 272 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 274 */         Confirm.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/* 277 */     });
/* 278 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 279 */     getContentPane().setLayout(layout);
/* 280 */     layout.setHorizontalGroup(layout
/* 281 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 282 */       .addGroup(layout.createSequentialGroup()
/* 283 */       .addContainerGap()
/* 284 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 285 */       .addGroup(layout.createSequentialGroup()
/* 286 */       .addGap(0, 16, 32767)
/* 287 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 288 */       .addContainerGap(27, 32767))
/* 289 */       .addGroup(layout.createSequentialGroup()
/* 290 */       .addComponent(this.jButton3)
/* 291 */       .addGap(135, 135, 135)
/* 292 */       .addComponent(this.jLabel2)
/* 293 */       .addGap(64, 64, 64)
/* 294 */       .addComponent(this.jTextField1, -2, 204, -2)
/* 295 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 296 */       .addComponent(this.jButton1)
/* 297 */       .addGap(68, 68, 68)))));
/*     */     
/* 299 */     layout.setVerticalGroup(layout
/* 300 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 301 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 302 */       .addContainerGap(55, 32767)
/* 303 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 304 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 305 */       .addComponent(this.jButton1, -1, -1, 32767)
/* 306 */       .addComponent(this.jButton3, -1, -1, 32767))
/* 307 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 308 */       .addComponent(this.jTextField1, -2, 39, -2)
/* 309 */       .addComponent(this.jLabel2)))
/* 310 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 311 */       .addComponent(this.jPanel1, -2, -1, -2)));
/*     */     
/*     */ 
/* 314 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/*     */     try {
/* 320 */       JOptionPane.showMessageDialog(null, "Your orders for table number " + this.orderId + " are saved", "Thank you", -1);
/* 321 */       if (this.orderId == 0) {
/* 322 */         this.jLabel3.setText("test");
/* 323 */         close();
/* 324 */         OrderHistory h = new OrderHistory(0);
/* 325 */         h.setVisible(true);
/*     */       }
/*     */       else {
/* 328 */         int statuss = 1;
/* 329 */         String sql = "update res_table set status='" + statuss + "' where order_id=" + this.orderId;
/* 330 */         this.ps = this.conn.prepareStatement(sql);
/* 331 */         this.ps.execute();
/* 332 */         this.jLabel3.setText("test");
/* 333 */         close();
/* 334 */         Welcome w = new Welcome();
/* 335 */         w.setVisible(true);
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 340 */       JOptionPane.showMessageDialog(null, "opps...error occured \n click ok and try again", "", 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jTable1MouseClicked(MouseEvent evt) {
/* 345 */     if (evt.getClickCount() == 1) {
/* 346 */       try { DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
/* 347 */         int selectedRowIndex = this.jTable1.getSelectedRow();
/* 348 */         this.jTextField3.setText(model.getValueAt(selectedRowIndex, 0).toString());
/* 349 */         this.jTextField4.setText(model.getValueAt(selectedRowIndex, 1).toString());
/*     */       }
/*     */       catch (Exception e) {
/* 352 */         JOptionPane.showMessageDialog(null, "select any item to remove \n click ok and try again", "", 0);
/*     */       }
/*     */     }
/* 355 */     if (evt.getClickCount() == 2) {
/* 356 */       int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete tnis item?", "Confirm", 0, 3);
/* 357 */       if (response == 0) {
/*     */         try {
/* 359 */           this.conn = JavaConnect.connectDb();
/* 360 */           String code = this.jTextField3.getText();
/* 361 */           int codeInt = Integer.parseInt(code);
/* 362 */           String sql = "delete from res_table where rowid=" + codeInt;
/* 363 */           this.ps = this.conn.prepareStatement(sql);
/* 364 */           this.ps.execute();
/*     */         }
/*     */         catch (Exception e) {
/* 367 */           JOptionPane.showMessageDialog(null, "please select any item to remove \n click ok and try again", "", 0);
/*     */         }
/*     */         
/* 370 */         close();
/* 371 */         this.jLabel3.setText("test");
/* 372 */         new Confirm(this.orderId).setVisible(true);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private javax.swing.JPanel jPanel1;
/*     */   
/*     */ 
/*     */   private javax.swing.JScrollPane jScrollPane1;
/*     */   
/*     */ 
/*     */   private JTable jTable1;
/*     */   
/*     */ 
/*     */   private JTextField jTextField1;
/*     */   
/*     */ 
/*     */   private JTextField jTextField2;
/*     */   
/*     */ 
/*     */   private JTextField jTextField3;
/*     */   
/*     */   private JTextField jTextField4;
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt)
/*     */   {
/* 400 */     int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete tnis item?", "Confirm", 0, 3);
/* 401 */     if (response == 0) {
/*     */       try {
/* 403 */         this.conn = JavaConnect.connectDb();
/* 404 */         String code = this.jTextField3.getText();
/* 405 */         int codeInt = Integer.parseInt(code);
/* 406 */         String sql = "delete from res_table where rowid=" + codeInt;
/* 407 */         this.ps = this.conn.prepareStatement(sql);
/* 408 */         this.ps.execute();
/*     */       }
/*     */       catch (Exception e) {
/* 411 */         JOptionPane.showMessageDialog(null, "please select any item to remove \n click ok and try again", "", 0);
/*     */       }
/*     */       
/* 414 */       close();
/* 415 */       this.jLabel3.setText("test");
/* 416 */       new Confirm(this.orderId).setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt)
/*     */   {
/* 422 */     MakeOrders m = new MakeOrders(this.orderId);
/* 423 */     this.jLabel3.setText("test");
/* 424 */     m.setVisible(true);
/* 425 */     close();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 442 */       for (javax.swing.UIManager.LookAndFeelInfo info : )
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 447 */         javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
/*     */       }
/*     */       
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 453 */       Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 455 */       Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 457 */       Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 459 */       Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 464 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 466 */         new Confirm().setVisible(true);
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
/*     */   private void close()
/*     */   {
/* 487 */     java.awt.event.WindowEvent winClosingEvent = new java.awt.event.WindowEvent(this, 201);
/* 488 */     java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
/*     */   }
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Confirm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
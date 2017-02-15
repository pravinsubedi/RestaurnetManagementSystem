/*     */ package resturentapp;
/*     */ 
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ 
/*     */ public class Calculator extends javax.swing.JFrame
/*     */ {
/*     */   double firstnum;
/*     */   double secondnum;
/*     */   double result;
/*     */   String operation;
/*     */   String answer;
/*     */   String enternum;
/*     */   private JButton jButton1;
/*     */   private JButton jButton10;
/*     */   private JButton jButton11;
/*     */   private JButton jButton12;
/*     */   
/*     */   public Calculator()
/*     */   {
/*  21 */     initComponents();
/*     */   }
/*     */   
/*     */ 
/*     */   private JButton jButton13;
/*     */   private JButton jButton14;
/*     */   private JButton jButton15;
/*     */   private JButton jButton16;
/*     */   private JButton jButton17;
/*     */   
/*     */   private void initComponents()
/*     */   {
/*  33 */     this.jPanel1 = new javax.swing.JPanel();
/*  34 */     this.jButton4 = new JButton();
/*  35 */     this.jButton1 = new JButton();
/*  36 */     this.jButton3 = new JButton();
/*  37 */     this.jButton2 = new JButton();
/*  38 */     this.jButton5 = new JButton();
/*  39 */     this.jButton6 = new JButton();
/*  40 */     this.jButton7 = new JButton();
/*  41 */     this.jButton8 = new JButton();
/*  42 */     this.jButton9 = new JButton();
/*  43 */     this.jButton10 = new JButton();
/*  44 */     this.jButton11 = new JButton();
/*  45 */     this.jButton12 = new JButton();
/*  46 */     this.jTextField1 = new javax.swing.JTextField();
/*  47 */     this.jButton13 = new JButton();
/*  48 */     this.jButton14 = new JButton();
/*  49 */     this.jButton15 = new JButton();
/*  50 */     this.jButton16 = new JButton();
/*  51 */     this.jPanel6 = new javax.swing.JPanel();
/*  52 */     this.jButton17 = new JButton();
/*  53 */     this.jButton18 = new JButton();
/*  54 */     this.jButton19 = new JButton();
/*  55 */     this.jButton20 = new JButton();
/*  56 */     this.jButton21 = new JButton();
/*  57 */     this.jButton22 = new JButton();
/*  58 */     this.jButton23 = new JButton();
/*  59 */     this.jButton24 = new JButton();
/*  60 */     this.jButton25 = new JButton();
/*  61 */     this.jButton26 = new JButton();
/*  62 */     this.jButton27 = new JButton();
/*  63 */     this.jButton28 = new JButton();
/*  64 */     this.jTextField2 = new javax.swing.JTextField();
/*  65 */     this.jButton29 = new JButton();
/*  66 */     this.jButton30 = new JButton();
/*  67 */     this.jButton31 = new JButton();
/*  68 */     this.jButton32 = new JButton();
/*     */     
/*  70 */     this.jButton4.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  71 */     this.jButton4.setText("1");
/*     */     
/*  73 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  74 */     this.jButton1.setText("2");
/*     */     
/*  76 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  77 */     this.jButton3.setText("3");
/*     */     
/*  79 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  80 */     this.jButton2.setText("4");
/*     */     
/*  82 */     this.jButton5.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  83 */     this.jButton5.setText("5");
/*     */     
/*  85 */     this.jButton6.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  86 */     this.jButton6.setText("6");
/*     */     
/*  88 */     this.jButton7.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  89 */     this.jButton7.setText("7");
/*     */     
/*  91 */     this.jButton8.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  92 */     this.jButton8.setText("8");
/*     */     
/*  94 */     this.jButton9.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  95 */     this.jButton9.setText("9");
/*     */     
/*  97 */     this.jButton10.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  98 */     this.jButton10.setText("0");
/*     */     
/* 100 */     this.jButton11.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 101 */     this.jButton11.setText("+");
/*     */     
/* 103 */     this.jButton12.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 104 */     this.jButton12.setText("-");
/*     */     
/* 106 */     this.jTextField1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 108 */         Calculator.this.jTextField1ActionPerformed(evt);
/*     */       }
/*     */       
/* 111 */     });
/* 112 */     this.jButton13.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 113 */     this.jButton13.setText("*");
/*     */     
/* 115 */     this.jButton14.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 116 */     this.jButton14.setText("/");
/*     */     
/* 118 */     this.jButton15.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 119 */     this.jButton15.setText("CLEAR");
/*     */     
/* 121 */     this.jButton16.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 122 */     this.jButton16.setText("=");
/*     */     
/* 124 */     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
/* 125 */     this.jPanel1.setLayout(jPanel1Layout);
/* 126 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 127 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 128 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 129 */       .addGap(10, 10, 10)
/* 130 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
/* 131 */       .addComponent(this.jTextField1)
/* 132 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 133 */       .addComponent(this.jButton13, -2, 60, -2)
/* 134 */       .addGap(18, 18, 18)
/* 135 */       .addComponent(this.jButton14, -2, 60, -2)
/* 136 */       .addGap(18, 18, 18)
/* 137 */       .addComponent(this.jButton15, -1, -1, 32767))
/* 138 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 139 */       .addComponent(this.jButton9, -2, 60, -2)
/* 140 */       .addGap(18, 18, 18)
/* 141 */       .addComponent(this.jButton10, -2, 60, -2)
/* 142 */       .addGap(18, 18, 18)
/* 143 */       .addComponent(this.jButton11, -2, 60, -2)
/* 144 */       .addGap(18, 18, 18)
/* 145 */       .addComponent(this.jButton12, -2, 60, -2))
/* 146 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 147 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
/* 148 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 149 */       .addComponent(this.jButton4, -2, 60, -2)
/* 150 */       .addGap(18, 18, 18)
/* 151 */       .addComponent(this.jButton1, -2, 60, -2)
/* 152 */       .addGap(18, 18, 18)
/* 153 */       .addComponent(this.jButton3, -2, 60, -2))
/* 154 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 155 */       .addComponent(this.jButton5, -2, 60, -2)
/* 156 */       .addGap(18, 18, 18)
/* 157 */       .addComponent(this.jButton6, -2, 60, -2)
/* 158 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 159 */       .addComponent(this.jButton7, -2, 60, -2)))
/* 160 */       .addGap(18, 18, 18)
/* 161 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 162 */       .addComponent(this.jButton2, -2, 60, -2)
/* 163 */       .addComponent(this.jButton8, -2, 60, -2))))
/* 164 */       .addContainerGap(-1, 32767))
/* 165 */       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 166 */       .addContainerGap()
/* 167 */       .addComponent(this.jButton16, -1, -1, 32767)
/* 168 */       .addContainerGap()));
/*     */     
/* 170 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 171 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 172 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 173 */       .addContainerGap()
/* 174 */       .addComponent(this.jTextField1, -2, 54, -2)
/* 175 */       .addGap(18, 18, 18)
/* 176 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 177 */       .addComponent(this.jButton4, -2, 54, -2)
/* 178 */       .addComponent(this.jButton1, -2, 54, -2)
/* 179 */       .addComponent(this.jButton3, -2, 54, -2)
/* 180 */       .addComponent(this.jButton2, -2, 54, -2))
/* 181 */       .addGap(18, 18, 18)
/* 182 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 183 */       .addComponent(this.jButton5, -2, 54, -2)
/* 184 */       .addComponent(this.jButton6, -2, 54, -2)
/* 185 */       .addComponent(this.jButton7, -2, 54, -2)
/* 186 */       .addComponent(this.jButton8, -2, 54, -2))
/* 187 */       .addGap(18, 18, 18)
/* 188 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 189 */       .addComponent(this.jButton12, -2, 54, -2)
/* 190 */       .addComponent(this.jButton11, -2, 54, -2)
/* 191 */       .addComponent(this.jButton10, -2, 54, -2)
/* 192 */       .addComponent(this.jButton9, -2, 54, -2))
/* 193 */       .addGap(18, 18, 18)
/* 194 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 195 */       .addComponent(this.jButton13, -2, 54, -2)
/* 196 */       .addComponent(this.jButton14, -2, 54, -2)
/* 197 */       .addComponent(this.jButton15, -2, 54, -2))
/* 198 */       .addGap(18, 18, 18)
/* 199 */       .addComponent(this.jButton16, -2, 60, -2)
/* 200 */       .addContainerGap(-1, 32767)));
/*     */     
/*     */ 
/* 203 */     setDefaultCloseOperation(2);
/*     */     
/* 205 */     this.jPanel6.setBackground(new java.awt.Color(153, 153, 153));
/* 206 */     this.jPanel6.setForeground(new java.awt.Color(51, 51, 51));
/*     */     
/* 208 */     this.jButton17.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 209 */     this.jButton17.setText("1");
/* 210 */     this.jButton17.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 212 */         Calculator.this.jButton17ActionPerformed(evt);
/*     */       }
/*     */       
/* 215 */     });
/* 216 */     this.jButton18.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 217 */     this.jButton18.setText("2");
/* 218 */     this.jButton18.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 220 */         Calculator.this.jButton18ActionPerformed(evt);
/*     */       }
/*     */       
/* 223 */     });
/* 224 */     this.jButton19.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 225 */     this.jButton19.setText("3");
/* 226 */     this.jButton19.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 228 */         Calculator.this.jButton19ActionPerformed(evt);
/*     */       }
/*     */       
/* 231 */     });
/* 232 */     this.jButton20.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 233 */     this.jButton20.setText("4");
/* 234 */     this.jButton20.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 236 */         Calculator.this.jButton20ActionPerformed(evt);
/*     */       }
/*     */       
/* 239 */     });
/* 240 */     this.jButton21.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 241 */     this.jButton21.setText("5");
/* 242 */     this.jButton21.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 244 */         Calculator.this.jButton21ActionPerformed(evt);
/*     */       }
/*     */       
/* 247 */     });
/* 248 */     this.jButton22.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 249 */     this.jButton22.setText("6");
/* 250 */     this.jButton22.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 252 */         Calculator.this.jButton22ActionPerformed(evt);
/*     */       }
/*     */       
/* 255 */     });
/* 256 */     this.jButton23.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 257 */     this.jButton23.setText("7");
/* 258 */     this.jButton23.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 260 */         Calculator.this.jButton23ActionPerformed(evt);
/*     */       }
/*     */       
/* 263 */     });
/* 264 */     this.jButton24.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 265 */     this.jButton24.setText("8");
/* 266 */     this.jButton24.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 268 */         Calculator.this.jButton24ActionPerformed(evt);
/*     */       }
/*     */       
/* 271 */     });
/* 272 */     this.jButton25.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 273 */     this.jButton25.setText("9");
/* 274 */     this.jButton25.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 276 */         Calculator.this.jButton25ActionPerformed(evt);
/*     */       }
/*     */       
/* 279 */     });
/* 280 */     this.jButton26.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 281 */     this.jButton26.setText("0");
/* 282 */     this.jButton26.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 284 */         Calculator.this.jButton26ActionPerformed(evt);
/*     */       }
/*     */       
/* 287 */     });
/* 288 */     this.jButton27.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 289 */     this.jButton27.setText("+");
/* 290 */     this.jButton27.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 292 */         Calculator.this.jButton27ActionPerformed(evt);
/*     */       }
/*     */       
/* 295 */     });
/* 296 */     this.jButton28.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 297 */     this.jButton28.setText("-");
/* 298 */     this.jButton28.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 300 */         Calculator.this.jButton28ActionPerformed(evt);
/*     */       }
/*     */       
/* 303 */     });
/* 304 */     this.jTextField2.setFont(new java.awt.Font("Poppins Light", 0, 18));
/* 305 */     this.jTextField2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 307 */         Calculator.this.jTextField2ActionPerformed(evt);
/*     */       }
/*     */       
/* 310 */     });
/* 311 */     this.jButton29.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 312 */     this.jButton29.setText("*");
/* 313 */     this.jButton29.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 315 */         Calculator.this.jButton29ActionPerformed(evt);
/*     */       }
/*     */       
/* 318 */     });
/* 319 */     this.jButton30.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 320 */     this.jButton30.setText("/");
/* 321 */     this.jButton30.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 323 */         Calculator.this.jButton30ActionPerformed(evt);
/*     */       }
/*     */       
/* 326 */     });
/* 327 */     this.jButton31.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 328 */     this.jButton31.setText("CLEAR");
/* 329 */     this.jButton31.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 331 */         Calculator.this.jButton31ActionPerformed(evt);
/*     */       }
/*     */       
/* 334 */     });
/* 335 */     this.jButton32.setFont(new java.awt.Font("Tahoma", 0, 18));
/* 336 */     this.jButton32.setText("=");
/* 337 */     this.jButton32.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 339 */         Calculator.this.jButton32ActionPerformed(evt);
/*     */       }
/*     */       
/* 342 */     });
/* 343 */     javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(this.jPanel6);
/* 344 */     this.jPanel6.setLayout(jPanel6Layout);
/* 345 */     jPanel6Layout.setHorizontalGroup(jPanel6Layout
/* 346 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 347 */       .addGroup(jPanel6Layout.createSequentialGroup()
/* 348 */       .addGap(10, 10, 10)
/* 349 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
/* 350 */       .addComponent(this.jTextField2)
/* 351 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
/* 352 */       .addComponent(this.jButton29, -2, 60, -2)
/* 353 */       .addGap(18, 18, 18)
/* 354 */       .addComponent(this.jButton30, -2, 60, -2)
/* 355 */       .addGap(18, 18, 18)
/* 356 */       .addComponent(this.jButton31, -1, -1, 32767))
/* 357 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
/* 358 */       .addComponent(this.jButton25, -2, 60, -2)
/* 359 */       .addGap(18, 18, 18)
/* 360 */       .addComponent(this.jButton26, -2, 60, -2)
/* 361 */       .addGap(18, 18, 18)
/* 362 */       .addComponent(this.jButton27, -2, 60, -2)
/* 363 */       .addGap(18, 18, 18)
/* 364 */       .addComponent(this.jButton28, -2, 60, -2))
/* 365 */       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
/* 366 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
/* 367 */       .addGroup(jPanel6Layout.createSequentialGroup()
/* 368 */       .addComponent(this.jButton17, -2, 60, -2)
/* 369 */       .addGap(18, 18, 18)
/* 370 */       .addComponent(this.jButton18, -2, 60, -2)
/* 371 */       .addGap(18, 18, 18)
/* 372 */       .addComponent(this.jButton19, -2, 60, -2))
/* 373 */       .addGroup(jPanel6Layout.createSequentialGroup()
/* 374 */       .addComponent(this.jButton21, -2, 60, -2)
/* 375 */       .addGap(18, 18, 18)
/* 376 */       .addComponent(this.jButton22, -2, 60, -2)
/* 377 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 378 */       .addComponent(this.jButton23, -2, 60, -2)))
/* 379 */       .addGap(18, 18, 18)
/* 380 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 381 */       .addComponent(this.jButton20, -2, 60, -2)
/* 382 */       .addComponent(this.jButton24, -2, 60, -2))))
/* 383 */       .addContainerGap(-1, 32767))
/* 384 */       .addGroup(jPanel6Layout.createSequentialGroup()
/* 385 */       .addContainerGap()
/* 386 */       .addComponent(this.jButton32, -1, -1, 32767)
/* 387 */       .addContainerGap()));
/*     */     
/* 389 */     jPanel6Layout.setVerticalGroup(jPanel6Layout
/* 390 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 391 */       .addGroup(jPanel6Layout.createSequentialGroup()
/* 392 */       .addContainerGap()
/* 393 */       .addComponent(this.jTextField2, -2, 54, -2)
/* 394 */       .addGap(18, 18, 18)
/* 395 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 396 */       .addComponent(this.jButton17, -2, 54, -2)
/* 397 */       .addComponent(this.jButton18, -2, 54, -2)
/* 398 */       .addComponent(this.jButton19, -2, 54, -2)
/* 399 */       .addComponent(this.jButton20, -2, 54, -2))
/* 400 */       .addGap(18, 18, 18)
/* 401 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 402 */       .addComponent(this.jButton21, -2, 54, -2)
/* 403 */       .addComponent(this.jButton22, -2, 54, -2)
/* 404 */       .addComponent(this.jButton23, -2, 54, -2)
/* 405 */       .addComponent(this.jButton24, -2, 54, -2))
/* 406 */       .addGap(18, 18, 18)
/* 407 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 408 */       .addComponent(this.jButton28, -2, 54, -2)
/* 409 */       .addComponent(this.jButton27, -2, 54, -2)
/* 410 */       .addComponent(this.jButton26, -2, 54, -2)
/* 411 */       .addComponent(this.jButton25, -2, 54, -2))
/* 412 */       .addGap(18, 18, 18)
/* 413 */       .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
/* 414 */       .addComponent(this.jButton29, -2, 54, -2)
/* 415 */       .addComponent(this.jButton30, -2, 54, -2)
/* 416 */       .addComponent(this.jButton31, -2, 54, -2))
/* 417 */       .addGap(18, 18, 18)
/* 418 */       .addComponent(this.jButton32, -2, 60, -2)
/* 419 */       .addContainerGap(-1, 32767)));
/*     */     
/*     */ 
/* 422 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 423 */     getContentPane().setLayout(layout);
/* 424 */     layout.setHorizontalGroup(layout
/* 425 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 426 */       .addGroup(layout.createSequentialGroup()
/* 427 */       .addContainerGap()
/* 428 */       .addComponent(this.jPanel6, -2, -1, -2)
/* 429 */       .addContainerGap(-1, 32767)));
/*     */     
/* 431 */     layout.setVerticalGroup(layout
/* 432 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 433 */       .addGroup(layout.createSequentialGroup()
/* 434 */       .addContainerGap()
/* 435 */       .addComponent(this.jPanel6, -2, -1, -2)
/* 436 */       .addContainerGap(-1, 32767)));
/*     */     
/*     */ 
/* 439 */     pack();
/* 440 */     setLocationRelativeTo(null); }
/*     */   
/*     */   private JButton jButton18;
/*     */   private JButton jButton19;
/*     */   private JButton jButton2;
/*     */   private JButton jButton20;
/*     */   private JButton jButton21;
/*     */   
/*     */   private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
/*     */   
/*     */   private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}
/*     */   
/* 452 */   private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) { this.enternum = (this.jTextField2.getText() + this.jButton17.getText());
/* 453 */     this.jTextField2.setText(this.enternum); }
/*     */   
/*     */   private JButton jButton22;
/*     */   
/* 457 */   private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) { this.enternum = (this.jTextField2.getText() + this.jButton18.getText());
/* 458 */     this.jTextField2.setText(this.enternum); }
/*     */   
/*     */   private JButton jButton23;
/*     */   
/* 462 */   private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) { this.enternum = (this.jTextField2.getText() + this.jButton19.getText());
/* 463 */     this.jTextField2.setText(this.enternum); }
/*     */   
/*     */   private JButton jButton24;
/*     */   
/* 467 */   private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) { this.enternum = (this.jTextField2.getText() + this.jButton20.getText());
/* 468 */     this.jTextField2.setText(this.enternum); }
/*     */   
/*     */   private JButton jButton25;
/*     */   private JButton jButton26;
/* 472 */   private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) { this.enternum = (this.jTextField2.getText() + this.jButton21.getText());
/* 473 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
/* 477 */     this.enternum = (this.jTextField2.getText() + this.jButton22.getText());
/* 478 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
/* 482 */     this.enternum = (this.jTextField2.getText() + this.jButton23.getText());
/* 483 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
/* 487 */     this.enternum = (this.jTextField2.getText() + this.jButton24.getText());
/* 488 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
/* 492 */     this.enternum = (this.jTextField2.getText() + this.jButton25.getText());
/* 493 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
/* 497 */     this.enternum = (this.jTextField2.getText() + this.jButton26.getText());
/* 498 */     this.jTextField2.setText(this.enternum);
/*     */   }
/*     */   
/*     */   private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
/* 502 */     this.firstnum = Double.parseDouble(this.jTextField2.getText());
/* 503 */     this.jTextField2.setText("");
/* 504 */     this.operation = "+";
/*     */   }
/*     */   
/*     */   private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
/* 508 */     this.secondnum = Double.parseDouble(this.jTextField2.getText());
/* 509 */     if (this.operation.equals("+")) {
/* 510 */       this.result = (this.firstnum + this.secondnum);
/* 511 */       this.answer = String.format("%.2f", new Object[] { Double.valueOf(this.result) });
/* 512 */       this.jTextField2.setText(this.answer);
/*     */     }
/* 514 */     if (this.operation.equals("-")) {
/* 515 */       this.result = (this.firstnum - this.secondnum);
/* 516 */       this.answer = String.format("%.2f", new Object[] { Double.valueOf(this.result) });
/* 517 */       this.jTextField2.setText(this.answer);
/*     */     }
/* 519 */     if (this.operation.equals("*")) {
/* 520 */       this.result = (this.firstnum * this.secondnum);
/* 521 */       this.answer = String.format("%.2f", new Object[] { Double.valueOf(this.result) });
/* 522 */       this.jTextField2.setText(this.answer);
/*     */     }
/* 524 */     if (this.operation.equals("/")) {
/* 525 */       this.result = (this.firstnum / this.secondnum);
/* 526 */       this.answer = String.format("%.2f", new Object[] { Double.valueOf(this.result) });
/* 527 */       this.jTextField2.setText(this.answer);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
/* 532 */     this.firstnum = Double.parseDouble(this.jTextField2.getText());
/* 533 */     this.jTextField2.setText("");
/* 534 */     this.operation = "-";
/*     */   }
/*     */   
/*     */   private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
/* 538 */     this.firstnum = Double.parseDouble(this.jTextField2.getText());
/* 539 */     this.jTextField2.setText("");
/* 540 */     this.operation = "*";
/*     */   }
/*     */   
/*     */   private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
/* 544 */     this.firstnum = Double.parseDouble(this.jTextField2.getText());
/* 545 */     this.jTextField2.setText("");
/* 546 */     this.operation = "/"; }
/*     */   
/*     */   private JButton jButton27;
/*     */   
/* 550 */   private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) { this.jTextField2.setText(""); }
/*     */   
/*     */   private JButton jButton28;
/*     */   private JButton jButton29;
/*     */   private JButton jButton3;
/*     */   
/*     */   public static void main(String[] args) {
/*     */     
/*     */     
/*     */ 
/*     */ 
/* 579 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 581 */         new Calculator().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */   private JButton jButton30;
/*     */   private JButton jButton31;
/*     */   private JButton jButton32;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   private JButton jButton8;
/*     */   private JButton jButton9;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private javax.swing.JPanel jPanel6;
/*     */   private javax.swing.JTextField jTextField1;
/*     */   private javax.swing.JTextField jTextField2;
/*     */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\Calculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
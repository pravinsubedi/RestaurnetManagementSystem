/*    */ package resturentapp;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JavaConnect
/*    */ {
/* 16 */   Connection conn = null;
/*    */   
/*    */   public static Connection connectDb() {
/*    */     try {
/* 20 */       Class.forName("org.sqlite.JDBC");
/*    */       
/* 22 */       return DriverManager.getConnection("jdbc:sqlite:restdb.sqlite");
/*    */ 
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 27 */       JOptionPane.showMessageDialog(null, e); }
/* 28 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\arestro install\ResturentApplication.jar!\resturentapp\JavaConnect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
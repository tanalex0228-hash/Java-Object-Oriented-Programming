package db;
//Code in class "jdbcmysql"

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class jdbcmysql {
	  private Connection con = null; //Database objects 
	  //connect to object
	  private Statement stat = null; 
	  //Execute ,send "sql" as string
	  private ResultSet rs = null; 
	  // result set
	  private PreparedStatement pst = null; 
	  //Execute ,send "sql" as string , the place for variable
	  private String selectSQL = "select * from student where height<180 "; //可以玩檢索條件(查詢語法)
	  
	  public jdbcmysql(){ 	  
	        try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        // Registe driver
	        try {
				con = DriverManager.getConnection( 
				"jdbc:mysql://localhost/sample?useUnicode=true&characterEncoding=Big5", 
				"root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	  }
	  
      public void SelectTable(){ 
          try {
			stat = con.createStatement();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  } 
          try {
			rs = stat.executeQuery(selectSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
          System.out.println("ID\t\tName\t\tHEIGHT"); 
          try {
			while(rs.next()) { 
			      System.out.println(rs.getString("student_id")+"\t\t"+ 
			          rs.getString("name")+"\t\t"+rs.getInt("height")); 
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
          
          
/*        } finally { 
            Close(); 
        } */

      }
      
      private void Close() 
      { 
          if(rs!=null){ 
             try {
				rs.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
             rs = null; 
          } 
          if(stat!=null){ 
             try {
				stat.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
             stat = null; 
          } 
          if(pst!=null){ 
             try {
				pst.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
             pst = null; 
          } 
     } 
}

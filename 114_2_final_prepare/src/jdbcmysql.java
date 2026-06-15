//package db;
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
	  private String selectSQL =
			  "select * from `student table`"; //可以玩檢索條件(查詢語法)
	  
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
				"jdbc:mysql://localhost/final_exam_test_db?useUnicode=true&characterEncoding=UTF-8", 
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
          System.out.println("ID\tName\tAGE\tSEX"); 
          try {
        	  while(rs.next()) {

        		    System.out.println(
        		        rs.getInt("id")
        		        + "\t"
        		        + rs.getString("name")
        		        + "\t"
        		        + rs.getInt("age")
        		        + "\t"
        		        + rs.getString("sex")
        		    );

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

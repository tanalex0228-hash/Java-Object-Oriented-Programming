/*請依以下要求撰寫 Q03java 程式碼
（④a） 撰寫必要程式碼，以帳號/密碼：root/statl23連接指定IP的mySQL 资料庫中的 position 資料表。
該資料表每筆资料包含一個地名及兩個小數欄位代表二維座標系統中的（x,y）請將 position 中的所有記錄分別讀入 String []location
及 double [][]pposition 的二维小數陣列後將所有資料輸出到 console。
（b） 找到歐氏距離最接近（25.0. 121.4）的座標點，將其地名、堅標值及距離以 println 函式輸出。（說明：
若前一小題無法完成，則請利用題目所附的資料檔 sPol Ixt 匯人或自行鍵人資料後進行本題處理-）*/
import java.sql.*;
import java.util.ArrayList;

public class previous_test_Q3 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
		ArrayList locationList = new ArrayList();
		ArrayList xList = new ArrayList();
		ArrayList yList = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/final_exam_test_db?useUnicode=true&characterEncoding=UTF-8","root","statl23");
			stat = con.createStatement();
			rs = stat.executeQuery("select * from position");
			System.out.println("Location\tX\tY");
			while(rs.next()) {
				System.out.println(
					rs.getString("location") + "\t" +
					rs.getDouble("x") + "\t" +
					rs.getDouble("y")
				);
				locationList.add(rs.getString("location"));
				xList.add(rs.getDouble("x"));
				yList.add(rs.getDouble("y"));
			}
			double targetX = 25.0;
			double targetY = 121.4;
			double[] distance = new double[locationList.size()];
			for(int i=0;i<locationList.size();i++) {
				distance[i] =
					Math.sqrt(Math.pow(targetX - (Double)xList.get(i),2) + Math.pow(targetY -(Double)yList.get(i),2));
				System.out.println(locationList.get(i)+ " Distance = "+ distance[i]);
			}

			double min = distance[0];
			int minIndex = 0;
			for(int i=1;i<distance.length;i++) {
				if(distance[i] < min) {
					min = distance[i];
					minIndex = i;
				}
			}
			System.out.println();
			System.out.println("Nearest Location = "+ locationList.get(minIndex));
			System.out.println("Distance = "+ min);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


import java.io.*;
public class week10_2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data.txt", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw); //將BufferedWeiter與FileWrite物件做連結
		try {
			bw.write("Hello, my friend!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.newLine( );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close( );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

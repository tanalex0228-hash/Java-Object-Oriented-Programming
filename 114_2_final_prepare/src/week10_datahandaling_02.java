import java.io.*;
public class week10_datahandaling_02 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data out.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write("Hello, Fuck you the Final");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}

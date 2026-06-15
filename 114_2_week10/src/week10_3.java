import java.io.*;
public class week10_3 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data in.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line;
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data out.txt", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			while ((line=br.readLine()) != null) {
				
				bw.write(line);
				bw.newLine( );
				
			}
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

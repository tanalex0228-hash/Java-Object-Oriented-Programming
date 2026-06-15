import java.io.*;
public class week10_datahandaling_01 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/irisdata.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}


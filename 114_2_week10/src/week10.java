import java.io.*;
public class week10 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 例如 d:\\input.txt
		BufferedReader br=new BufferedReader(fr);
		String line;
		try {
			while ((line=br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//try catch用來捕捉監控藥try的事情是否有發生問題，如果發生問題就會直行catch的代碼片段
import java.io.*;
public class week10_datahandaling_03_in_out {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data in.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/data out.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String line;
		try {
			while((line = br.readLine())!=null) {
				try {
					bw.write(line);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//呼叫line變數
				//System.out.println(line);//這邊要改
			}
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

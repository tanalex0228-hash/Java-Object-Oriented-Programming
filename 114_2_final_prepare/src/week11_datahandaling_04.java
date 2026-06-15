import java.io.*;
import java.util.ArrayList;
public class week11_datahandaling_04 {
	public static void main(String [] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line , tempstring;
		String[] tempArray = new String[3];
		ArrayList myList = new ArrayList();
		int i = 0;
		try {
			while((line=br.readLine())!=null) {
				tempstring = line;//將迴圈讀入的陣列轉入中間變數tempstring中
				tempArray = tempstring.split("\\s");//看到空白就切～存入固定陣(tempArray.length<=3)中
				for (i=0 ; i<tempArray.length ; i++) {//將固定陣列(tempArray.length<=3)時逐項讀入動態陣列中
					myList.add(tempArray[i]);
					System.out.println("切割結果：");
				for(int j=0;j<tempArray.length;j++) {
				    System.out.print(tempArray[j]+" ");
				    System.out.println();
				    }  
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = myList.size()/3;
		int count = 0;
		double[][]trans_array = new double[k][3];
		for(int x=0 ; x<myList.size()/3 ; x++) {
			for(int y=0 ; y<3 ; y++) {
				trans_array[x][y] = Double.parseDouble((String)myList.get(count));
				count++;
			}
		}
	}	
}

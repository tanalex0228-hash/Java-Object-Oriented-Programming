import java.io.*;
import java.util.ArrayList;
public class week11_datahandaling_05 {
	public static void main(String [] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/irisdata.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line , tempstring;
		String[] tempArray = new String[5];
		ArrayList myList = new ArrayList();
		ArrayList myList2 = new ArrayList();
		int i = 0;
		try {
			while((line=br.readLine())!=null) {
				tempstring = line;//將迴圈讀入的陣列轉入中間變數tempstring中
				tempArray = tempstring.split("\\s");//看到空白就切～存入固定陣(tempArray.length<=3)中
				for (i=0 ; i<tempArray.length-1 ; i++) {//將固定陣列(tempArray.length<=4)時逐項讀入動態陣列中
					myList.add(tempArray[i]);
				}
				myList2.add(tempArray[tempArray.length-1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = myList.size()/4;
		int count = 0;
		double[][]trans_array = new double[k][4];
		for(int x=0 ; x<myList.size()/4 ; x++) {
			for(int y=0 ; y<4 ; y++) {
				trans_array[x][y] = Double.parseDouble((String)myList.get(count));
				count++;
			}
		}
		System.out.println("Rows = " + k);
		for(int x=0;x<k;x++){
		    for(int y=0;y<4;y++){
		        System.out.print(trans_array[x][y] + " ");
		    }
		    System.out.println(myList2.get(x));
		    System.out.println();
		}	
	}
}

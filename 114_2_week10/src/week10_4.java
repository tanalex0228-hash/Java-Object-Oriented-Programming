import java.io.*;
import java.util.ArrayList;
public class week10_4 {
	public static void main(String[ ] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/apple/Desktop/大學學習資料/114-2進階程式設計/test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line,tempstring;
		String[ ] tempArray= new String[3];
		ArrayList myList = new ArrayList( );
		int i=0;
		try {
			while((line = br.readLine( ))!=null){
				tempstring = line;
				tempArray = tempstring.split("\\s"); //指定分隔符號
				for(i=0;i< tempArray.length;i++){
					myList.add(tempArray[i]); //就像是 append
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = myList.size( )/3;//計算資料有多少筆，因為每一筆資料被掛三節車廂，所以每掛多一筆資料就會是三的倍數
		int count=0;
		double[ ][ ] trans_array = new double[k][3];
		for(int x=0;x<myList.size()/3;x++){
			for(int y=0;y<3;y++){
			trans_array[x][y]=Double.parseDouble((String)myList.get(count));
			count++;
			}
		}
		System.out.println("Count = "+ count);

		for(int x=0;x<myList.size()/3;x++) {
			for(int y=0;y<3;y++) {
				System.out.printf("%4.1f ",trans_array[x][y]);
			}
			System.out.println();
		}
	}
}

import java.io.*;
import java.util.ArrayList;
public class previous_test_Q2 {
	public static void main(String[] args) {
		OpenFile op = new OpenFile("dataAll.txt");

		BufferedReader br = op.getReader();
		
		String line;
		String[] tempArray;

		ArrayList myList = new ArrayList();
		
		try {
			while((line=br.readLine())!=null){
				tempArray = line.split("\\s");
				for(int i=0;i<tempArray.length;i++){
					myList.add(tempArray[i]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
				int rows =myList.size()/5;
				int count = 0;
				int[][] data = null;
				
				for(int x=0;x<rows;x++){
					for(int y=0;y<5;y++){
						data[x][y] =Integer.parseInt((String)myList.get(count));
						count++;
					}
				}
				for(int x=0;x<rows;x++){
					for(int y=0;y<5;y++){
						System.out.print(data[x][y]+" ");

					}

					System.out.println();

				}
				
		
	}
	
	
}

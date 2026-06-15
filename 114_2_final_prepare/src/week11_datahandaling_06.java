import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class week11_datahandaling_06 {
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
		
		Scanner sc = new Scanner(System.in);
		double[] test = new double[4];
		
		System.out.println("Sepal Length: ");
		test[0]=sc.nextDouble();
		
		System.out.println("Sepal Width: ");
		test[1]=sc.nextDouble();
		
		System.out.println("Petal Length: ");
		test[2]=sc.nextDouble();
		
		System.out.println("Petal Width: ");
		test[3]=sc.nextDouble();
		
		System.out.println("Input Data");

		for(int v=0 ;v<4 ;v++){
		    System.out.print(test[v]+" ");
		}

		System.out.println();
		
		
		double[] distance = new double[k];
		for( int g=0 ; g<k ; g++) {
			distance[g]=
					Math.sqrt(
		            Math.pow(test[0]-trans_array[g][0],2)
		            +
		            Math.pow(test[1]-trans_array[g][1],2)
		            +
		            Math.pow(test[2]-trans_array[g][2],2)
		            +
		            Math.pow(test[3]-trans_array[g][3],2)
		        );
			System.out.println(distance[g]);
			
			
			
		}
		
		double min = distance[0];
		int minIndex = 0 ;

		for(int r=1;r<distance.length;r++){

		    if(distance[r] < min){
		        min = distance[r];
		        minIndex = r;
		    }
		}
		System.out.println(min);
		System.out.println(minIndex);
		System.out.println(myList2.get(minIndex));
		
		
		
		
	}
	
	
	
	
}

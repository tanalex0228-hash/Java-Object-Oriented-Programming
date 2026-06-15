import java.io.*;
import java.util.*;

public class week11 {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader(
				"/Users/apple/Desktop/大學學習資料/114-2進階程式設計/irisdata.txt"
			);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fr);

		String line, tempstring;

		// 每行有 5 個欄位
		String[] tempArray = new String[5];

		ArrayList myList = new ArrayList();

		int i = 0;

		try {

			while ((line = br.readLine()) != null) {

				tempstring = line;

				// 用空白切割
				tempArray = tempstring.split("\\s+");

				for (i = 0; i < tempArray.length; i++) {

					myList.add(tempArray[i]);

				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		// 每筆資料有 5 個欄位
		int k = myList.size() / 5;

		int count = 0;

		// 前四個是數值
		double[][] trans_array = new double[k][4];

		// 最後一個是字串(label)
		String[] string_array = new String[k];

		for (int x = 0; x < k; x++) {

			// 四個 feature
			for (int y = 0; y < 4; y++) {
				trans_array[x][y] =Double.parseDouble((String) myList.get(count));
				count++;
			}

			// label
			string_array[x] =(String) myList.get(count++);

		}

		System.out.println("Count = " + count);

		// 印出資料
		for (int x = 0; x < k; x++) {

			for (int y = 0; y < 4; y++) {
				System.out.printf("%4.1f ",trans_array[x][y]);
			}
			System.out.println(string_array[x]);
		}

	
	double [] measure = new double[4];
	Scanner sc = new Scanner(System.in);
	System.out.println("Sepal length : > ");
	measure [0] =  sc.nextDouble();
	System.out.println("Sepal width : > ");
	measure [1] =  sc.nextDouble();
	System.out.println("petal length : > ");
	measure [2] =  sc.nextDouble();
	System.out.println("petal width : > ");
	measure [3] =  sc.nextDouble();
	System.out.println("Input k value : > ");
	int kValue = sc.nextInt();
	
	
	double[] distance = new double[k];

	for(int x = 0; x < k; x++) {

		for(int y = 0; y < 4; y++) {
			distance[x] += Math.pow((trans_array[x][y] - measure[y]), 2);
		}
		distance[x] = Math.sqrt(distance[x]);
	}
	
	/*double min = distance[0];
	int minIndex = 0;

	for(int x = 1; x < k; x++) {

		if(distance[x] < min) {

			min = distance[x];
			minIndex = x;

		}
	}
	System.out.println("Prediction = " + string_array[minIndex]);
	*/
	
	
	for(int n = 0; n < kValue; n++) {

		double min = Double.MAX_VALUE;
		int minIndex = -1;

		for(int x = 0; x < k; x++) {

			if(distance[x] < min) {

				min = distance[x];
				minIndex = x;

			}
		}

		System.out.println(
			"Neighbor " + (n+1) +
			" : " + string_array[minIndex] +
			" distance = " + min
		);

		
		distance[minIndex] = Double.MAX_VALUE;
	}

	}
}




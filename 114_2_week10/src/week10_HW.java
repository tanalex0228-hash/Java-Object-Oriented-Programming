import java.io.*;
import java.util.*;

public class week10_HW {

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

				trans_array[x][y] =
					Double.parseDouble(
						(String) myList.get(count)
					);

				count++;

			}

			// label
			string_array[x] =
				(String) myList.get(count++);

		}

		System.out.println("Count = " + count);

		// 印出資料
		for (int x = 0; x < k; x++) {

			for (int y = 0; y < 4; y++) {

				System.out.printf("%4.1f ",
					trans_array[x][y]);

			}

			System.out.println(string_array[x]);

		}

	}

}
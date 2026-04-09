package week2;
import java.util.*;
public class partice002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入陣列長度＿n");
		int n = sc.nextInt();
		
		int array [] = creat_array(n);
		int sorted [] = after_sort(n,array);
		for (int j=0;j<n;j++) {
			//System.out.println(array[j]);
			System.out.println(sorted[j]);
		}
		System.out.println("min = "+sorted[0]);
		System.out.println("max = "+sorted[n-1]);
		
	}

	
	public static int[] creat_array(int n) {
		Scanner sc = new Scanner(System.in);
		int array_list []=new int[n];	
		
		System.out.println("請輸入陣列內容");
		
		for (int i = 0; i<n ;i++) {
			System.out.println("第"+(i+1)+"項");
			array_list[i]=sc.nextInt();
		}
		return array_list;
	}
	
	

	public static int[] after_sort(int n ,int array_list []) {
		
		for (int i=0 ; i<n-1 ;i++) {
			int toolsperson = 0 ;
			if( array_list[i]> array_list[i+1]) {
				toolsperson=array_list[i];
				array_list[i]=array_list[i+1];
				array_list[i+1]=toolsperson;			
			}
			for (int j = 0 ; j<n-1 ; j++) {
				if( array_list[j]> array_list[j+1]) {
					toolsperson=array_list[j];
					array_list[j]=array_list[j+1];
					array_list[j+1]=toolsperson;	
				}
			}
		}
		return array_list;
	}

}

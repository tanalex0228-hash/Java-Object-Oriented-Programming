package week2;
import java.util.*;
public class week_practice001 {
/*
	public static void main(String[] args) {
		int[] data = new int[3];
		int size =0;
		
		for(int i = 1;i<=5;i++) {
			data[size]  = i;
			size++;
			System.out.println("加入: "+i);
		}
		
		System.out.println("完成");

	}
	*/
	
	public static void main(String[] args) {
		int[] data = new int[3];
		int size = 0;
		
		for (int i=1;i<=5;i++) {
			if (size == data.length){
				
			}
			
			data[size]= i;
			size++;
			System.out.println("輸入: "+i);
			
		}
		
		System.out.println("完成");
	}

}

import java.util.*;
import java.util.Scanner;
public class week4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		computer cp = new computer();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(cp.computeArea(a,b));
		
	}
}

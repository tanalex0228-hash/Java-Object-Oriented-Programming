import java.util.Scanner;

public class week5 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		knight k1 = new knight(1);
		knight k2 = new knight(2);
		
		System.out.println("input k1:x");
		int x1 = sc.nextInt();
		System.out.println("input k1:y");
		int y1 = sc.nextInt();
		
		k1.setposition(x1 , y1);
		k1.fill(k1.getX() , k1.getY());
		
		
		System.out.println("input k2:x");
		int x2 = sc.nextInt();
		System.out.println("input k2:y");
		int y2 = sc.nextInt();
		
		k2.setposition(x2,y2);
		k2.fill(k2.getX(),k2.getY());
		
		while(true) {
			knight.printGrid();
			
			System.out.println("k1 input case 1~8");
			int c1 = sc.nextInt();
		
					
/*============This is Week_5 Add===============*/
/*				
			
			
			k1.returner(k1.getX(),k1.getY());
			k1.move(c1);
		
			if(k1.checker(k1.getX(),k1.getY())) {
				System.out.println("k1 catch k2");
				break;
			}
			
			k1.fill(k1.getX(),k1.getY());
*/
			
			k1.move(c1);
			k1.showposition();
			

			knight.printGrid();
			
			
			
			System.out.println("k2 input case 1~8");
			int c2 = sc.nextInt();
			
			
/*============This is Week_5 Add===============*/
/*			
			k2.returner(k2.getX(),k2.getY());
			k2.move(c2);
			if(k2.checker(k2.getX(),k2.getY())) {
				System.out.println("k2 catch k1");
				break;
			}
			
			k2.fill(k2.getX(),k2.getY());
*/
			
			k2.move(c2);
			k2.showposition();
		}
			
			
	/*k1.move(2);
		k1.showposition();
		
		
		
		k2.setposition(2,6);
		k1.fill(2,6);
		k2.move(3);
		k2.showposition();
		
		
		System.out.println(Knight.board[2][3]);
		
		*/
	}
}

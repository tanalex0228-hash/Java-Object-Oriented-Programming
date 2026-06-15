import java.util.Scanner;
import org.jfugue.player.Player;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Player player = new Player();

		System.out.print("Input a 4-digit integer: ");
		int num = sc.nextInt();

		// 檢查是否為四位數
		if(num < 1000 || num > 9999) {

			System.out.println("Input domain error!!");

		}
		else {

			// 拆位數
			int a = num / 1000;
			int b = (num / 100) % 10;
			int c = (num / 10) % 10;
			int d = num % 10;

			// 判斷是否遞增
			if(a < b && b < c && c < d) {

				System.out.println("Do Mi So");

				player.play("C E G");

			}
			else {

				System.out.println("So Mi Do");

				player.play("G E C");

			}
		}

		sc.close();
	}
}
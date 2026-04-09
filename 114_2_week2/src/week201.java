import java.util.*;
public class week201 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(); // object physicalization
		
		s1.name="Alex_Tan";
		s1.sex=true;
		s1.id="s413411539";
		
		s1.enroll();
		
		Student s2 = new Student();
		Student s3 = new Student();
		
		Superhero hulk = new Superhero();
		
		hulk.name = "Hulk";
		hulk.hp = 100;
		hulk.attackpower = 20;
		hulk.status = true;
		
		Superhero superman = new Superhero();
		
		superman.name = "Superman";
		superman.hp = 120;
		superman.attackpower = 15;
		superman.status = true;
		
		
		
		for (int i=0;i<2;i++) {
			
			System.out.println("Round" + i);
			hulk.attack(superman);
			superman.attack(hulk);
		
		}
	}

}

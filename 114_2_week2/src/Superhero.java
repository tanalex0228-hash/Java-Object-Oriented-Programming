
public class Superhero {
	
	String name;
	boolean status;
	int hp;
	int attackpower;
	
	public void attack(Superhero p) {
		p.hp = p.hp-attackpower;
		System.out.println(name + "attack" + p.name);
		System.out.println(p.name + "HP left" + p.hp);
		
	}
}

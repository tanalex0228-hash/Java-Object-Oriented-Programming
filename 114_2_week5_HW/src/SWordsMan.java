
public class SWordsMan {
	
	private String name;
	private int level;
	private int blood;
	private int attackpower;
	
	
	public int getblood() {
		return blood;
		
	}
	
	public void setblood(int blood) {
		this.blood = blood;
		
	}
	
	public int getlevel() {
		return level;
		
	}
	
	public void setlevel(int level) {
		this.level = level;
	
	}
	
	public void setattackpower(int attackpower) {
		this.attackpower = attackpower;
		
	}
	
	public int getattackpower() {
		return attackpower;
		
	}
	
	
	public String getname() {
		return name;
		
	}
	
	public void setname(String name) {
		this.name = name;
		
	}
	
	public void fight(SWordsMan p) {
		System.out.println("揮劍攻擊");
		
		p.blood = p.blood-attackpower;
		System.out.println(name + "attack" + p.name);
		System.out.println(p.name + "Blood left" + p.blood);
	}
}

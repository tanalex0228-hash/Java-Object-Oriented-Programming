		
public class week5 {
	public static void main(String[] args) {
		MagicSWordsman m1 = new MagicSWordsman();
		MagicSWordsman m2 = new MagicSWordsman();
		
		m1.setname("Alex");
		m1.setlevel(3);
		m1.setblood(100);
		m1.setattackpower(10);
		
		
		m1.fight();
		m1.cure();
		
		
		
		
		m2.setname("Nina");
		m2.setlevel(3);
		m2.setblood(100);
		m2.setattackpower(20);
		
		
		while (m1.getblood() > 0 && m2.getblood() > 0) {
			m1.fight(m2);
			System.out.println(m2.getname()+" Bloos: "+m2.getblood());
			if (m2.getblood() <=0 ) {
				System.out.println(m1.getname()+" Win ");
				break;
			}
			m2.fight(m1);
			System.out.println(m1.getname()+" Bloos: "+m1.getblood());
			if (m1.getblood() <=0 ) {
				System.out.println(m2.getname()+" Win ");
				System.out.println(m2.getname()+" Bloos: "+m2.getblood());
				if (m2.getblood() <=0 ) {
					System.out.println(m1.getname()+" Win ");
				}
			}
			
			
		}
		
		
	}
}

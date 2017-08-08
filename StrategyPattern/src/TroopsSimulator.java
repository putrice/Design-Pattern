
public class TroopsSimulator {
	public static void main (String [] args){
		Troops newbie = new NewbieTroops();
		newbie.attack();
		newbie.performRun();
		newbie.performShoot();
		
		Troops advanced = new AdvancedTroops();
		advanced.attack();
		advanced.performRun();
		advanced.performShoot();
		advanced.setShootBehavior(new ShootWithHandgun());
		advanced.performShoot();
	}
	
}

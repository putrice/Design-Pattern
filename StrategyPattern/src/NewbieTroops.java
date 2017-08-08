
public class NewbieTroops extends Troops{

	public NewbieTroops() {
		shootBehavior = new ShootWithHandgun();
		runBehavior = new RunWithFoot();
	}
	
	@Override
	public void attack() {
		System.out.println("Newbie troops start attacking");
	}

}

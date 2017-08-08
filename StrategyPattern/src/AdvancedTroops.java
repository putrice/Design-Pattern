
public class AdvancedTroops extends Troops{

	public AdvancedTroops() {
		shootBehavior = new ShootWithSniper();
		runBehavior = new RunWithSkateboard();
	}
	
	@Override
	public void attack() {
		System.out.println("Advanced troops start attacking");
	}

}


public abstract class Troops {
	
	RunBehavior runBehavior;
	ShootBehavior shootBehavior;
	
	public Troops(){}
	
	public abstract void attack();

	public void performShoot(){
		shootBehavior.shoot();
	}
	
	public void performRun(){
		runBehavior.run();
	}
	
	public void setRunBehavior(RunBehavior runBehavior) {
		this.runBehavior = runBehavior;
	}
	
	public void setShootBehavior(ShootBehavior shootBehavior) {
		this.shootBehavior = shootBehavior;
	}
}


public class AutomationMachine {
	private Driller driller;
    private Shovel shovel;
    private Light light;
 
    public AutomationMachine() {
        this.driller = new Driller();
        this.shovel = new Shovel();
        this.light = new Light();
    }
 
    public void run() {
        light.switchOn();
        driller.drill();
        light.switchOn();
    }
}

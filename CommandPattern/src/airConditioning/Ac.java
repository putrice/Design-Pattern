package airConditioning;

public class Ac {
	public static final int HIGH_MODE = 10;
	public static final int MEDIUM_MODE = 5;
	public static final int LOW_MODE = 2;
	public static final int OFF_MODE = 0;
	int mode;
	
	public void highMode(){
		mode = HIGH_MODE;
	}
	
	public void mediumMode(){
		mode = MEDIUM_MODE;
	}
	
	public void lowMode(){
		mode = LOW_MODE;
	}
	
	public void offMode(){
		mode = OFF_MODE;
	}
	
	public void on(){
		System.out.println("AC on");
	}
	
	public void off(){
		System.out.println("AC off");
	}
	
	public int getMode() {
		return mode;
	}
}

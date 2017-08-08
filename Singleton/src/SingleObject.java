
public class SingleObject {
	
	private SingleObject(){}
	
	private static class LazyHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }
	
	public static SingleObject getInstance() {
        return LazyHolder.INSTANCE;
    }
	
	public void showMessage(){
		System.out.println("Hello World !! ");
	}
}


public abstract class Game {
	
	final void play(){
		startGame();
		if(isUserWantToConnectGoogleAccount()){//ganti jadi strategy pattern
			connectToGoogleAccount();
		}
		saveGame();
		endGame();
	}
	
	abstract void saveGame();
	abstract void connectToGoogleAccount();
	
	private void startGame(){
		System.out.println("Starting game..");
	}
	
	private void endGame(){
		System.out.println("Stoping game..");
	}
	
	public boolean isUserWantToConnectGoogleAccount(){
		return false;
	}
}

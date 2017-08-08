import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClashOfClans extends Game{

	@Override
	void saveGame() {
		System.out.println("Save game in every time user want to end game");
	}

	@Override
	void connectToGoogleAccount() {
		System.out.println("Connected to Google Account. Access Profile User.");
	}
	
	@Override
	public boolean isUserWantToConnectGoogleAccount() {
		return getUserPermission().toUpperCase().startsWith("Y");
	}
	
	private String getUserPermission(){
		String answer = null;
		System.out.println("Do you allow Clash of Clans to access your public profile ? (Y/N)");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return answer != null ? answer : "N";
	}

}

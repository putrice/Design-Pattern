
public class GameSimulator {
	public static void main(String [] args){
		ClashOfClans coc = new ClashOfClans();
		Sims sims = new Sims();
		
		System.out.println("================= Clash of Clans ===============");
		coc.play();
		
		System.out.println("================= Sims ===============");
		sims.play();
	}
}

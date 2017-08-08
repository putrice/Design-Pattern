public class GameContext {
	
	private PlayerState state;
	private Player player = new Player();

	public void setState(PlayerState state) {
		this.state = state;
	}

	public void gameAction() {
		state.action(player);
	}
}
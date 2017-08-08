
public abstract class Room {
	String roomName = "Common Room";
	
	public String getDescription(){
		return roomName;
	}
	
	public abstract double costPerNight();
}


public class ExtraTowel extends RoomDecorator {
	Room room;
	
	public ExtraTowel(Room room) {
		this.room = room;
	}
	
	@Override
	public String getDescription() {
		return room.getDescription().concat(", with Extra Towel");
	}

	@Override
	public double costPerNight() {
		return 2 + room.costPerNight();
	}

}

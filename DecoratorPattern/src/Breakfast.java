
public class Breakfast extends RoomDecorator {

    private Room room;

    public Breakfast(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription().concat(", with Breakfast");
    }

    @Override
    public double costPerNight() {
        return 5 + room.costPerNight();
    }

}

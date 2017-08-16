
public abstract class Room {

    private String roomName = "Common Room";

    public String getDescription() {
        return roomName;
    }

    public abstract double costPerNight();
}

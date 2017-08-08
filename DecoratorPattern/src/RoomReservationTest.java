
public class RoomReservationTest {
	
	public static void main(String [] args){
		Room deluxeRoom = new DeluxeRoom();
		System.out.println(deluxeRoom.getDescription() + " $" + deluxeRoom.costPerNight());
		
		Room superiorRoom = new SuperiorRoom();
		superiorRoom = new ExtraTowel(superiorRoom);
		superiorRoom = new Breakfast(superiorRoom);
		System.out.println(superiorRoom.getDescription() + " $" + superiorRoom.costPerNight());
		
		Room deluxeRoom2 = new DeluxeRoom();
		deluxeRoom2 = new Breakfast(deluxeRoom2);
		System.out.println(deluxeRoom2.getDescription() + " $" + deluxeRoom2.costPerNight());
		
	}

}

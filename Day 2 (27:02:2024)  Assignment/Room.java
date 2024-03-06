public class Room {

    // Fields 
    float height = 5.7f;
    float width = 1.9f;
    float breadth = 5.2f;

    float volume = height * width * breadth;

    // Main method 
    public static void main(String args[]) {
   	
	Room myRoom = new Room();
	System.out.println("Volume of the room: " + myRoom.volume);
    }
}

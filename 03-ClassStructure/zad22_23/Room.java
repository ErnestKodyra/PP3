public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
        this.number = number;
    }
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    void checkIn(String guestName){
        guestName = guestName;
    }
    void checkOut(){
        guestName = "";
    }
    boolean isOccupied(){
        return occupied;
    }
    public String toString(){
        if(occupied == true){
            return ("Room no. " + number + " No. of beds: " + beds + " Occupied by " + guestName);
        }
        else{
            return ("Room no. " + number + "No. of beds: " + beds + " Unoccupied");
        }
    }
    static void displayInfo(Room[] rooms, int roomNumber){
        System.out.println(rooms[roomNumber].toString());
    }
    static void displayAllRooms(Room[] rooms){
        for(int i = 0; i < rooms.length; i++){
            rooms[i].toString();
        }
    }
    static void displayRoomsWithXBeds(Room[] rooms, int bedNumber){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].beds == bedNumber){
                rooms[i].toString();
            }
        }   
    }
    static void displayVacantRooms(Room[] rooms){
        int counter = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupied == false){
                counter++;
            }
        }
        System.out.println(counter + "rooms are vacant");
    }
    static void displayOccupiedRooms(Room[] rooms){
        int counter = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupied == true){
                counter++;
            }
        }
        System.out.println(counter + "rooms are occupied");
    }
    static void displayVacantBeds(Room[] rooms){
        int counter = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupied == false){
                counter += rooms[i].beds;
            }
        }
        System.out.println(counter + "beds are vacant");
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1,2);
        rooms[1] = new Room(2,2);
        rooms[2] = new Room(3,2);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(1,1);
        displayInfo(rooms, 2);
        displayAllRooms(rooms);
        displayRoomsWithXBeds(rooms, 3);
        displayVacantRooms(rooms);
        displayOccupiedRooms(rooms);
        displayVacantBeds(rooms);
    }
}

package TaskTwo;

public class Main {

  public static void main(String[] args) {
    
    Room room1 = new Room(2, 3, 4);
    Room room2 = new Room(6, 7, 8);
    Room room3 = new Room(10, 11, 12);

    Room[] rooms = {room1, room2, room3};

    Building building1 = new Building(1, 2, false, rooms);

    int totalLampsInBuilding1 = 0;

    for(int i = 0; i < building1.rooms.size(); i++){
      totalLampsInBuilding1 += building1.rooms.get(i).numberOfLamps;
    }

    System.out.println(totalLampsInBuilding1);

    if(building1.numberOfFloors > building1.rooms.size()){
      System.out.println("This is an odd bilding...");
    }

  }

}
package TaskTwo;

import java.util.ArrayList;

public class Building {
  final ArrayList<Room> rooms = new ArrayList<Room>();
  int numberOfBathrooms;
  int numberOfFloors;
  boolean isOfficeBuilding;

  public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, Room[] room){
    this.numberOfBathrooms = numberOfBathrooms;
    this.numberOfFloors = numberOfFloors;
    this.isOfficeBuilding = isOfficeBuilding;

    for(int i = 0; i < room.length; i++){
      this.rooms.add(room[i]);
    }
    
  }
}

package TaskTwo;

public class Wall {
  int number;

  public Wall(int number) {
    this.number = number;
  }

  @Override
  public String toString(){
    return Integer.toString(number);
  }
}

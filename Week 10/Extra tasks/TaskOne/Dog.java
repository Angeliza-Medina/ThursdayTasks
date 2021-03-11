package TaskOne;

class Dog{

  String name;
  String breed;
  Person owner;

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDogBreed() {
    return breed;
  }

  public void setDogBreed(String dogBreed) {
    this.breed = dogBreed;
  }

  public Person getOwner() {
    return owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  @Override
  public String toString(){
    return "Name: " + name + "\nBreed: " + breed;
  }

}
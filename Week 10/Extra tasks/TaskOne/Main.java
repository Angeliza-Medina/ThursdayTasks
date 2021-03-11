package TaskOne;

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("Angeliza", 25);
    Dog dog1 = new Dog("Charlie", "English Bulldog");
    Dog dog2 = new Dog("Bruno", "English Bulldog");

    dog1.setOwner(person1);
    dog2.setOwner(person1);

    System.out.println(dog1.toString() + person1.toString());
    System.out.println(dog2.toString() + person1.toString());
  }

}
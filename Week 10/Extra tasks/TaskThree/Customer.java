package TaskThree;

public class Customer {
  static int counter = 0;
  int id;
  private String firstName; 
  private String lastName;
  private String username;

  public Customer(String firstName, String lastName, String username) {
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    counter++;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString(){
    return "Id: " + id + "\nFirstname: " + firstName + "\nLastname: " + lastName + "\nUsername: " + username + "\n";
  }

}

package TaskThree;

import java.util.ArrayList;

public class Main {

  static ArrayList<Customer> customers = new ArrayList<>();

  public static void main(String[] args) {

    Customer customer1 = new Customer("Angeliza1", "Quintana", "user1");
    Customer customer2 = new Customer("Angeliza2", "Quintana", "user2");
    Customer customer3 = new Customer("Angeliza3", "Quintana", "user3");
    Customer customer4 = new Customer("Enjay1", "Medina", "user4");
    Customer customer5 = new Customer("Enjay2", "Medina", "user5");
    Customer customer6 = new Customer("Enjay3", "Medina", "user6");
    
    customers.add(customer1);
    customers.add(customer2);
    customers.add(customer3);
    customers.add(customer4);
    customers.add(customer5);
    customers.add(customer6);

    printCustomers(customers);
  }

  public static void printCustomers(ArrayList<Customer> customers){
    for(Customer customer : customers){
      System.out.println(customer);
    }
  }

}
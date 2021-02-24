
class Main{

  public static void main(String[] args){

    printEmptyLine();
    printString("My name is Angeliza");
    printNameAndAge("Angeliza", 25);
  }

  public static void printEmptyLine(){
    System.out.println();
  }

  public static void printString(String yourString){
    System.out.println(yourString);
  }

  public static void printNameAndAge(String name, int age){
    System.out.println("My name is " + name + ", I am " + age + " years old.");
  }

}
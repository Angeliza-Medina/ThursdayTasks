
class Main{

  public static boolean happy = true;

  public static void main(String[] args){
    if (iAmHappy()){
      System.out.println("I clap my hands");
    }else{
      System.out.println("I don't clap my hands"); 
    }

    int sum = addTwoInt(2, 5);
    System.out.println(sum);

    String stringInUppercase = returnStringInUppercase("I turned this string into uppercase!");
    System.out.println(stringInUppercase);

    boolean checkedFirstLetter = isFirstLetterUppercase("The first letter in this string is in uppercase.");
    System.out.println(checkedFirstLetter);
  }


  public static boolean iAmHappy(){
    // fill out what is missing here: 
    if(happy == true){
      return true;
    }
    return false;  
  }

  public static int addTwoInt(int int1, int int2){
    int sum = int1 + int2;

    return sum;
  }

  public static String returnStringInUppercase(String yourString){
    return yourString.toUpperCase();
  }

  public static boolean isFirstLetterUppercase(String stringToBeChecked){

    boolean checkedFirstChar = Character.isUpperCase(stringToBeChecked.charAt(0));

    if(checkedFirstChar){
      return true;
    }
    return false;
  }

}
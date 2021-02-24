
class Main{

  public static void main(String[] args){

    int[] intArr = {25, 9, 1995};
    String[] stringArr = {"I like cake.", "I don't like boiled carrots.", "I snack a lot."};
    boolean[] booleanArr = {true, true, false};

    printStrings(stringArr);

    System.out.println("Sum of intArr: " + addUpIntArr(intArr));

    System.out.println("Average of intArr: " + calculateAverageOfIntArr(intArr));

  }


  public static void printStrings(String[] arrayOfStrings){
    for(int i = 0; i < arrayOfStrings.length; i++){
      System.out.println(arrayOfStrings[i]);
    }
  }

  public static int addUpIntArr(int[] arrayOfInt){
    int sum = 0;

    for(int i = 0; i < arrayOfInt.length; i++){
      sum += arrayOfInt[i];
    }
    return sum;
  }

  public static float calculateAverageOfIntArr(int[] arrayOfInt){
    int sum = 0;

    for(int i = 0; i < arrayOfInt.length; i++){
      sum += arrayOfInt[i];
    }

    float average = sum/arrayOfInt.length;

    return average;
  }

}
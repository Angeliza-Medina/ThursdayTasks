import java.util.*;

public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

      // Task 1
//      System.out.println(min(3, -2, 7));

      // Task 2
//      printEvenNumbers(8);

      // Task 3
//      System.out.println(smallestAbsVal(-8, 2, 12));

      // Task 4
//      System.out.println(sumDigits(-99));

      // Task 5
//      reverseVertical("laptop");

      // Task 6
//      processName(scanner);

      // Task 7
//      System.out.println(repeat("Hello"));

      // Task 8
//      shortestName(scanner, 3);

      // Task 9
//      randomNumbers();

      // Task 10
//      maxMin(scanner);

      // Task 11
//      printMultiple(5);

      // Task 12
//      int[] intArr = {25, 9, 1995};
//      System.out.println(max(intArr));

      // Task 13
//      int[] arr1 = {};
//      int[] arr2 = {};
//
//      System.out.println(allLess(arr1, arr2));

   }

   // Task 1
   public static int min(int int1, int int2, int int3){
      int smallestInt = int1;
      int[] intArr = {int1, int2, int3};

      for(int i : intArr){
         smallestInt = Math.min(smallestInt, i);
      }

      return smallestInt;
   }

   // Task 2
   public static void printEvenNumbers(int maximum){
      if(maximum < 2){
         System.out.println("Please provide a number equal to or higher than 2");
      }else{
         int max = maximum;
         int currentEvenNum = 0;

         if(maximum%2 != 0){
            max--;
         }

         while(currentEvenNum < maximum){
            currentEvenNum += 2;
            System.out.print(" {" + currentEvenNum + "} ");
         }
      }
   }

   // Task 3
   public static int smallestAbsVal(int int1, int int2, int int3){
      int smallestAbsVal = int1;

      int[] intArr = {int1, int2, int3};

      for(int i : intArr){
         smallestAbsVal = Math.min(Math.abs(smallestAbsVal), i);
      }

      return smallestAbsVal;
   }

   // Task 4
   public static int sumDigits(int number){
      int absSum = 0;

      String numberAsString = String.valueOf(Math.abs(number)); // Set int numbar to absolute value then convert it to a String
      char[] digitsAsCharArr = numberAsString.toCharArray(); // Split String number, convert into char and save each char to an array
      ArrayList<Integer> digitsAsIntArr = new ArrayList<Integer>(); // Contains our char number after they have been converted back to int

      for(char digit : digitsAsCharArr){
         digitsAsIntArr.add(Character.getNumericValue(digit));
      }

      for(int i = 0; i < digitsAsIntArr.size(); i++){
         absSum += digitsAsIntArr.get(i);
      }

      return absSum;
   }

   // Task 5
   public static void reverseVertical(String stringInput){
      for(int i = stringInput.length()-1; i >= 0; i--){
         System.out.println(stringInput.charAt(i));
      }
   }

   // Task 6
   public static void processName(Scanner nameScanner){
      System.out.println("Write your full name: ");
      String nameInput = nameScanner.nextLine();
      nameScanner.close();
      System.out.println("Your name in uppercase: " + nameInput.toUpperCase());
   }

   // Task 7
   public static String repeat(String stringInput){
      String repeatedStringInput = "";
      int numOfTimesToRepeat = stringInput.length();

      for(int i = 0; i < numOfTimesToRepeat; i++){
         repeatedStringInput += stringInput;
      }

      return repeatedStringInput;
   }

   // Task 8
   public static void shortestName(Scanner nameScanner, int numberOfNames){
      ArrayList<String> names = new ArrayList<String>();

      for(int i = 0; i < numberOfNames; i++){
         System.out.println("Enter a name: ");
         String nameInput = nameScanner.nextLine();
         names.add(nameInput);
      }

      nameScanner.close();

      String shortestName = names.get(0);

      for(String name : names){
         if(name.length() < shortestName.length()){
            shortestName = name;
         }
      }

      System.out.println(shortestName + " is the shortest provided name.");
   }

   // Task 9
   public static void randomNumbers(){
      Random random = new Random();
      int randomInt;

      do {
         randomInt = random.nextInt(1001);
         System.out.println(randomInt);
      }while(randomInt < 900);
   }

   // Task 10
   public static void maxMin(Scanner intScanner){
      ArrayList<Integer> inputNums = new ArrayList<Integer>();
      int newInput = 0;

      while(newInput != -1){
         System.out.print("Write a whole number (or -1 to end): ");
         newInput = intScanner.nextInt();

         if(newInput != -1){
            inputNums.add(newInput);
         }
      }

      intScanner.close();

      try{
         int highestInput = Collections.max(inputNums);
         int lowestInput = Collections.min(inputNums);

         System.out.println("Highest input was: " + highestInput);
         System.out.println("Lowest input was: " + lowestInput);
      }catch(NoSuchElementException e){
         System.out.println("You have ended before providing numbers we could calculate on...");
      }
   }

   // Task 11
   public static void printMultiple(int numberToMultiply){
      int counter = 0;
      int timesToMultiply = 10;
      int currentNumber = 0;

      while(counter < timesToMultiply){
         currentNumber+= numberToMultiply;

         if(counter == timesToMultiply-1){
            System.out.print(currentNumber);
         }else{
            System.out.print(currentNumber + " og ");
         }
         counter++;
      }
   }

   // Task 12
   public static int max(int[] intArr){
      try{
         int highestValue = intArr[0];

         for(int i = 0; i < intArr.length; i++){
            if(intArr[i] > highestValue){
               highestValue = intArr[i];
            }
         }
         return highestValue;
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Can't calculate highest value on an empty array");
         return -1;
      }
   }

   // Task 13
   public static boolean allLess(int[] arr1, int[] arr2){
      boolean allIsLess = true;

      if(arr1.length != arr2.length){
         System.out.println("arr1 and arr2 does not contain an equal amount of elements.");
         return false;
      }else if(arr1.length == 0 && arr2.length == 0){
         System.out.println("Cannot evaluate due to both provided arrays being empty.");

         return false;
      }else{
         for(int i = 0; i < arr1.length; i++){
            if(arr1[i] >= arr2[i]){
               allIsLess = false;
               System.out.println("Every element in arr1 are not less than their corresponding element in arr2.");
               return allIsLess;
            }
         }
      }
      System.out.println("Every elements in arr1 are less than their corresponding element in arr2.");
      return allIsLess;
   }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList; // *** Used for task 3 ***

public class Main {

   private static String[][] text = new String[12][1];
   private static String[][] text2 = new String[12][1]; // *** Used for task 2 ***
   /*
   [12] Arrays horizontally (rows). In this case, arrays representing our data.txt lines.
   [1] Arrays vertically (columns) inside each row. In this case, arrays inside each line from our data.txt
   */

   public static void main(String[] args) throws FileNotFoundException{
      File dataFile = new File("src/data.txt"); // Save our data.txt inside a variable
      Scanner dataFileScanner = new Scanner(dataFile);
      Scanner dataFileScanner2 = new Scanner(dataFile);

      int i = 0; // Counter for the following while loop. Represents which line we're currently looping through

      while(dataFileScanner.hasNextLine()){
         text[i] = dataFileScanner.nextLine().split(" ");
         //System.out.println(text[i].length);

         i++;
      }

      /*
      Explanation of the while loop above

      - The while loop runs once for every line (row) in our data.txt
      - Split the single array (column) inside each line (row) from our data.txt into multiple arrays (columns)
      - We make a split for every space " " in the line there is
      */ //Explanation of the while loop above

      int j = 0; // *** Used for task 2 ***

      String longestSentence = ""; // *** Used for task 2 ***

      // *** Used for task 2 ***
      while(dataFileScanner2.hasNextLine()){
         text2[j] = dataFileScanner2.nextLine().split("\\.");

         for(int k = 0; k < text2[j].length; k++){ // [j] is the line we're currently on. [k] represents a sentences inside line[j]

            if(k < text2[j].length - 1){
               longestSentence = matchForLongestSentence(text2[j][k], text2[j][k+1]);
            }
         }

         j++;

         /*
         Note:
         The code above splits lines after every "." to split data.txt into sentences
         Well, that was the intention... But reality is, NOT every sentence ends on a "." e.g. some ends with "!".
         And not every "." indicates the end of a sentence.

         Following are some examples from the data.txt file:
         Numbers like "1.330.993" and "630.000"
         Abbreviations like "A.P." and "f.eks."

         But for simplification we will continue to split at every "." and treat every split as a sentence (tho' it's not...).
         */ //Note
      }

      /*
      Explanation for task 2

      - String longestSentence saves the current longest sentence
      - The while loop runs through every line in data.txt
      - For every "." we make a split inside line[j]
      - The for loop runs through every sentence[k] inside line[j]
      - For every loop, each sentence's length is checked
      - If the current sentence[k] in line[j] has a longer length than the saved one in String longestSentence,
        assign String longestSentence a new value of sentence[k] in line[j]
      */ //Explanation for task 2

      // printWordsStartingWith("Ø");
      // printWordsOfLength(3);
       printWordsWithDoubleConsonant(); // *** Task 1 ***
       printTheLongestSentence(longestSentence); // *** Task 2 ***
       printPartOfWord("Guldfisk", 0, 4); // *** Task 3 ***
       printIfPalindrome("Den laks skal ned"); // *** Task 4 ***

   }


   private static void printWordsStartingWith(String pattern){
      for(int i = 0; i < text.length; i++){
         for(String word : text[i]){
            if(word.startsWith(pattern) || word.startsWith(pattern.toLowerCase())){
               System.out.println(word);
            }
         }
      }
   }

   /*
   Explanation of printWordsStartingWith()

   - Start with a for loop which loops for every line there is in data.txt (12)
   - Inside we have a forEach loop
   - For each word on line[i] do following...
   - Compare the start of each word with our pattern
   */
  
   private static void printWordsOfLength(int wordLength){
      boolean wordIsValid = true;

      for(int i = 0; i < text.length; i++){
         for(String word : text[i]){
            if(word.length() == wordLength){

               if(word.contains(",") || word.contains(".")){
                  wordIsValid = false;
               }

               if(wordIsValid == true) {
                  System.out.println(word);
               }
            }
         }
      }
   }

   /*
   Explanation of printWordsOfLength()

   - Loop through every line in data.txt
   - For each word on every line, check if the length of the word matches our specified length
   - If the length matches, but the word contains either "," or "." as the third character, deem the word invalid
   - If the word is still valid print it
   */

   public static void printWordsWithDoubleConsonant(){
      boolean isValid = false;

      for(int i = 0; i < text.length; i++){
         for(String word : text[i]){
            for(int j = 0; j < word.length(); j++){
               if(j != word.length()-1){
                  if(word.toLowerCase().charAt(j) == word.toLowerCase().charAt(j+1)){
                     isValid = checkIfValid(word.charAt(j));

                     if(isValid){
                        System.out.println(word);
                     }
                  }
               }
            }
         }
      }
   }

   /*
   Explanation of printWordsWithDoubleConsonant()

   - Loop through every line in data.txt
   - For each word on every line, loop through the word
   - The loop iterates as many times as the amount of characters the word consists of
   - As long as we aren't at the last character of a word, compare a character to the one that follows it
   - If two neighboring characters are identical, check if those two are valid characters with checkIfValid()
   - If boolean isValid is true, print the word
   */

   public static boolean checkIfValid(char charToCheck){
      char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};

      for(int i = 0; i < vowels.length; i++){ // Check if charToCheck is a vowel
         if(charToCheck == vowels[i]){
            return false;
         }
      }

      if(Character.isDigit(charToCheck)){ // Check if charToCheck is a number
         return false;
      }

      return true;
   }

   public static String matchForLongestSentence(String prevLongestSentence, String nextSentenceToCheck){

      if(prevLongestSentence.length() >= nextSentenceToCheck.length()){
         return prevLongestSentence;
      }else{
         return nextSentenceToCheck;
      }
   }

   public static void printTheLongestSentence(String theLongestSentence){
      System.out.println("The longest setence in data.txt consists of ~ " + theLongestSentence.length() + " ~ characters.");
      System.out.println(theLongestSentence);
   }

   public static void printPartOfWord(String word, int subStringStart, int subStringLength){
      try{
         String partOfWord = word.substring(subStringStart, subStringStart + subStringLength);

         System.out.println(partOfWord);

      }catch(StringIndexOutOfBoundsException e){

         if(subStringStart < 0 || subStringStart > word.length()){
            String msg = "Your substring's starting point may only be an index from 0 to " + word.length() + ". \nYour starting point was: " + subStringStart;
            System.out.println(msg);
            return;
         }
         if(subStringStart + subStringLength > word.length()){
            System.out.println(word.substring(subStringStart));
         }

      }
   }

   public static void printIfPalindrome(String stringToBeChecked){
    String ourString = stringToBeChecked.toLowerCase();
    String ourStringInReverse = new StringBuilder(ourString).reverse().toString();

    if(ourString.equals(ourStringInReverse)){
       System.out.println(ourStringInReverse);
    }
   }

}


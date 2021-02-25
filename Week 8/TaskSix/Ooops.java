  
/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */

public class Ooops{

  public static void main(String[] args) {
    int a = 7, b = 42;

    char smaller = minimum(a, b);

    if(smaller == 'a'){
      System.out.println(a + " is the smallest!");
    }
  }

  public static char minimum(int a, int b) {
    char charA = 'a';
    char charB = 'b';

    char smaller = 'x';

    if(a < b) {
      smaller = charA;
    }else{
      smaller = charB;
    }

    if(smaller == 'a'){
      return charA;
    }

    return charB;
  }

}


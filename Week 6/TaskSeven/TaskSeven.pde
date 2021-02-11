
/*  TASK 7  */

int input = 20;

if (input < 0) {
  for (int i = input; i <= 0; i++) {
    if(i == input/2){
      println("HALF!");
    }else{
      println(i);
    }
  }
} else {
  for (int i = 0; i <= input; i++) {
    if (i >= 0 && i < 6) {
      println(i);
    } else if (i == 6) {
      println("six");
    } else if (i == input/2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
}

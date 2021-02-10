
/*  TASK 6  */

// 6.a
int a = (int) random(11);
int b = (int) random(11);
int ab_sum = a + b;

if (a == 10 || b == 10 || ab_sum == 10) {
  println("Success!");
} else {
  println("Failure!");
}

// 6.b
int x = (int) random(31);
int y = (int) random(31);
int z = (int) random(31);
int xyz_sum = x + y + z;
int[] xyz_arr = {x, y, z};
boolean containsBannedNum = false;

for (int i = 0; i < xyz_arr.length; i++) {
  if (xyz_arr[i] == 10 || xyz_arr[i] == 20 || xyz_arr[i] == 30) {
    containsBannedNum = true;
  }
}

if (containsBannedNum == false) {
  if (xyz_sum == 30) {
    println("Success!");
  }
} else {
  println("Failure!");
}


class Datamatik{

  public static void main(String[] args){

    //Student[] students = new Students[10];
    
    Student student1 = new Student("Angeliza", 25, true, "Datamatiker - l-dat-da 0221a");
    Student student2 = new Student("Philippe", 25, false, "Datamatiker - l-dat-da 0221a");
    Student student3 = new Student("Bjarke", 25, false, "Datamatiker - l-dat-da 0221a");
    Student student4 = new Student("Mie", 20, true, "Datamatiker - l-dat-da 0221a");
    Student student5 = new Student("Victoria", 20, true, "Datamatiker - l-dat-da 0221a");
    Student student6 = new Student("Christian", 19, false, "Datamatiker - l-dat-da 0221a");
    Student student7 = new Student("Louise", 23, true, "Datamatiker - l-dat-da 0221a");
    Student student8 = new Student("Mads", 41, false, "Datamatiker - l-dat-da 0221a");
    Student student9 = new Student("Oliver", 22, false, "Datamatiker - l-dat-da 0221a");
    Student student10 = new Student("Nikolaj", 25, false, "Datamatiker - l-dat-da 0221a");

    Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
    
    printAStudent(students, 1);
    findAStudent(students, "Angeliza");
  }


  public static String printAStudent(Student[] studentArr, int studentIndex){
    Student student = studentArr[studentIndex];

    System.out.println("The student with index " + studentIndex + " is: " + student.name);

    return student.name;
  }

  public static int findAStudent(Student[] studentArr, String studentName){
    int studentMatch = 0;

    for(int i = 0; i < studentArr.length; i++){
      if(studentArr[i].name == studentName){
        studentMatch = i;
      }
    }

    System.out.println("The student named " + studentArr[studentMatch].name + " is at index: " + studentMatch);

    return studentMatch;
  }

}


class Datamatik{

  public static void main(String[] args){
    Teacher myTeacher = new Teacher("Tess", 47, true);
    Student student1 = new Student("Angeliza", 25, true, "Datamatiker - l-dat-da 0221a");
    Student student2 = new Student("Philippe", 25, false, "Datamatiker - l-dat-da 0221a");

    Student[] students = {student1, student2};

    System.out.println("Teacher: " + myTeacher.name);

    for(int i = 0; i < students.length; i++){
      System.out.println();
      System.out.println("Student name: " + students[i].name);
      System.out.println("Class: " + students[i].datamatikerTeam);
    }
  }

}

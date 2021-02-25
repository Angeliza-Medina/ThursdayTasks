# cph-1st-w38
Exercises for week 38

Alle opgaverne kan løses ud fra den viden I har tilegnet jer fra bogen. 
I enkelte tilfælde er der behov for viden vi endnu ikke har været igennem - i disse tilfælde, vil der være et hint i opgaveformuleringen. 

Opgaverne er struktureret således at de følger kapitlerne i bogen. 

Såfremt I sidder fast ved en opgave, så tag en kort pause og prøv igen. Hvis I stadig sidder fast ved den, så hop videre til den næste.
Generelt er det bedre at I får tænkt over alle opgaverne, end at I får løst dem allesammen fuldkommen. 
Endvidere er I meget velkommen til at tale sammen om opgaverne, men det forventes at I alle koder hver jeres løsning. 


Opgaverne skal ligesom sidste uge, afleveres på moodle, via et link til jeres github repo. 



## Task 1 - functions: 
    1.a Create a file and name it Main.java, include a main method.
    1.b Write a function that prints an empty line and call it from main();
    1.c Write a function that receives a string as a parameter and prints it. call this function from main()
    1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".


## Task 2 - functions return types
    2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
    2.b Write a function that receives to integers as parameters and returns the sum of them.
    2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
    2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )


## Task 3 - Objects: 
    3.a Create a new file and save it by the name "Datamatik".
    3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java
    3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
    3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
    3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)
    3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.
    3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f
    3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g

    3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 
    3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 
    3.k in the main() function print the name of the teacher
    3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods
        

## Task 4 (Arrays): 
    For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
    4.a create arrays of the following type and assign it at least 3 different values: 
        - Integer array
        - String array
        - boolean array
    4.b Write a function that takes in an array of strings as parameter and prints each string.
    4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
    4.d Write a function that receives an integer array as a parameter and returns the average value.	
    4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
    

## Task 5 - Putting it all together
    For this task you should reuse the Student class from Task 3. 
        Methods of reusing the class could be: 
        - copy the Students.java file and add it to a new folder called task5
        - copy the content of the Students class from Task 3 and create the class once more in this folder
        - Open the task 3 folder and continue working in this.
        Either method is fine - it is up to you. 
        
    5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.
    
    5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

    5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik


## Task 6 /*
    Start en ny java fil med din tekst editor og sæt koden fra 'debug' ind i filen. Gem filen med det rigtige navn og compile klassen - du vil se at der er 7 fejl. Fix dem. '
    


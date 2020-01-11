# Accessing a method from another folder class using creating the instance of classes

There are two file outside of the folder "002", there are Student.java and Application.java files, 
the compilation and the running command is very simple to compile and run the program 

Another program inside the folder "002" Which has three folders: A, B, C
 A - Application.java
 B - Course.java
 C - Student.java
 
 Here I have Three packages A, B, C
 
 *The Command to compile the code is:
 
 #Course.java file
	javac -d "classes" 002/B/Course.java

#Student.java file
	javac -d "classes" -classpath "classes" 002/C/Student.java
	
#Application.java file
	javac -d "classes" -classpath "classes" 002/A/Application.java
	
*To run the class files
	java -classpath "classes" A/Application


	
 
 
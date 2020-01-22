package com.kayal.program1;

public class App 
{
    public static void main( String[] args )
    {
       App.printValues();
    }
    
    public static void printValues() {
    	Student student = new Student();
    	
    	student.setName("Antony Edward Stark");
    	student.setAge(25);
    	
    	System.out.println("Name: " + student.getName());
    	System.out.println("Age: " + student.getAge());
    }
}

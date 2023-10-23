package com.xpanxion.assignments.student;
import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();

        String upperCase = name.toUpperCase();
        System.out.println("You Name in Upper Case: " + upperCase);

    }

    public void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String statement = scan.nextLine();

        int length = statement.length();
        int count = 0;


        for(int i=0; i< length; i++){
            if(Character.isUpperCase(statement.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of UpperCase Letters: " + count);


    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}

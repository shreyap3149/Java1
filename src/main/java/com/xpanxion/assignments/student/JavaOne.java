package com.xpanxion.assignments.student;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String statement = scan.nextLine();
        String[] arrofStr = statement.split(" ");

       // String[] result = new String[];
        StringBuilder result = new StringBuilder();


        for(int i =0; i< arrofStr.length; i++){
            if(i%2 ==0){
                result.append(arrofStr[i].toUpperCase());
                result.append(" ");
            }else{
                result.append(arrofStr[i]);
                result.append(" ");
            }

          //  if(i)
        }
        System.out.println(result.toString());


      /*  for(String a: arrofStr ){
            if(a.indexOf(0))
            System.out.println(a);
        }*/

    }

    public void ex4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String statement = scan.nextLine();

        int length = statement.length();
        boolean check = true;

        for(int i=0; i<(length/2); i++){
            if(statement.charAt(i) != statement.charAt(length-i-1)){
                check = false;
            }
        }

        if(check==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");

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

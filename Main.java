/**
 * Write a description of class JavaBasics here.
 *
 * @author (Kevin Uriel Azuara Fonseca)
 * @version (12/05/2019)
 */
import java.util.Scanner; // Equivalent to cin
import java.lang.NumberFormatException;

public class Main {
    
    public static void main(String[] args){
        // Declare and Initialize variables
        /*
        int myNum = 5;
        float myFloatNum = 5.99f;
        double myDoubleNum = 5.99;
        char myLetter = 'K';
        boolean myBool = true;
        String myText = "Hello";
        
        System.out.println("Please type a string");
        Scanner in  = new Scanner(System.in);
        String  s   = in.nextLine();
        System.out.println("You entered string: " + s);
        
        System.out.println("Please type an integer: ");
        myNum = in.nextInt();
        System.out.println("You entered integer: " + myNum);
        
        System.out.print("Please enter a number with or without decimal:\n");
        myDoubleNum = in.nextDouble();
        System.out.println("You entered double: " + myDoubleNum);
        in.close();
        */
        
        // Basic input validation in Java
        /*
        Scanner sc = new Scanner(System.in);
        double userInput = 0.0;
        
        while(true){
            System.out.println("Type a double-type number: ");
            try {
                userInput = Double.parseDouble(sc.next());
                break;
            } catch(NumberFormatException ignore) {
                System.out.println("Invalid Input at: " + ignore);
            }
        }
        */
        
        // Dr.T challenge
        /*
         *  Accept input of two numbers of data type double num1, num2 (valid input)
         *  Accept input two numbers of data type integer num3, num4 (valid input)
         *  Calculate (proccess) add = num1 + num2; substract, multiply, divide
         *  modulus = num3 % num4
         *  OUTPUT the results of add, substract, multiply, divide and modulus.
         * 
         */
       
        Scanner pc = new Scanner(System.in);
        
        double num1 = 0.0, num2 = 0.0, add = 0.0, substract = 0.0, multiply = 0.0, divide = 0.0;
        
        int num3 = 0, num4 = 0, modulus = 0;
        
        while(true) {
            System.out.println("Type a double-type number");
            try {
                num1 = Double.parseDouble(pc.next());
                break;
            } catch(NumberFormatException ignore) {
                System.out.println("Invalid Input at: " + ignore);
            }
        }
        
        while(true) {
            System.out.println("Type a double-type number");
            try {
                num2 = Double.parseDouble(pc.next());
                break;
            } catch(NumberFormatException ignore) {
                System.out.println("Invalid Input at: " + ignore);
            }
        }
        
        while(true) {
            System.out.println("Type a integer-type number");
            try {
                num3 = Integer.parseInt(pc.next());
                break;
            } catch(NumberFormatException ignore) {
                System.out.println("Invalid Input at: " + ignore);
            }
        }
        
        while(true) {
            System.out.println("Type a integer-type number");
            try {
                num4 = Integer.parseInt(pc.next());
                break;
            } catch(NumberFormatException ignore) {
                System.out.println("Invalid Input at: " + ignore);
            }
        }
        
        
        add = num1 + num2;
        substract = num1 - num2;
        multiply = num1 * num2;
        divide = num1 / num2;
        modulus = num3 % num4;
        
        System.out.println(num1 + " + "+ num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + substract);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);        
        System.out.println(num3 + " % " + num4 + " = " + modulus);
                
    }
    
}
/**
 * Write a description of class JavaBasics here.
 *
 * @author (Kevin Uriel Azuara Fonseca)
 * @version (12/05/2019)
 */
import java.util.Scanner; // Equivalent to cin

public class Main {
    
    public static void main(String[] args){
        // Declare and Initialize variables
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
    }
    
}
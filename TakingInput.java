import java.util.Scanner; // This will import the Scanner class in Java.
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user.");
        Scanner sc = new Scanner(System.in); // Create a Scanner object (named sc). System.in to read input from the keyboard.
        // Scanner class has a lot of methods to read the data.
        // 1. nextInt() - to read an integer value. 
        // 2. nextFloat() - to read a float value.
        System.out.println("Enter number 1: ");
        int a = sc.nextInt(); // Read an integer value from the user and store it in a. (sc) is the object of Scanner class.
        System.out.println("Enter number 2: ");
        int b = sc.nextInt(); // Read an integer value from the user and store it in b.
        int sum = a+b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum); // Print the sum of a and b.
        // sc.hasNextInt() method is used to check if the next input is an integer.

    }
}



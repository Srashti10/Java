public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        int p = 5, q = 3; // 0101 and 0011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 0001
        System.out.println("Bitwise OR: " + (p | q)); // 0111
        System.out.println("Bitwise XOR: " + (p ^ q)); // 0110
    }
}

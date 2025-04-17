public class Literals {
    public static void main(String[] args) {
        // The value which can be assigned to a variable is called a literal.
        // Literals in Java: 1- Integer Literals 2- Floating Point Literals 3- Character Literals 4- String Literals 5- Boolean Literals
        // Integer Literals: Decimal, Octal, Hexadecimal, Binary
        int age = 23; //23 is the integer literal.
        int decimal = 10; // Decimal
        int octal = 012; // Octal
        int hexadecimal = 0xA; // Hexadecimal
        int binary = 0b1010; // Binary
        long distance = 10000000000L; // Long literal with 'L' suffix(We have to use l or L suffix for the long data type.)
        boolean a = true;
        char c = 'A'; // Character literal with single quotes
        String str = "Hello"; // String literal with double quotes

        System.out.println("Character: " + c);
        System.out.println("String: " + str);
        System.out.println("Boolean: " + a);
        System.out.println("Long: " + distance);
        System.out.println("Integer: " + age);  
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Binary: " + binary);

        // Floating Point Literals: float, double
        // By default decimals are double literal. You can use 'f' or 'F' to specify float literal.
        float floatLiteral = 10.5f; // Float
        double doubleLiteral = 10.5; // Double

        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);

        // Character Literals: char
        char charLiteral = 'A'; // Character

        System.out.println("Character: " + charLiteral);

        // String Literals: String
        String stringLiteral = "Hello World"; // String

        System.out.println("String: " + stringLiteral);

        // Boolean Literals: boolean
        boolean booleanLiteral = true; // Boolean

        System.out.println("Boolean: " + booleanLiteral);
    }
}

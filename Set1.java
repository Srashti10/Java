import java.util.Scanner;
public class Set1{
    public static void main(String[] args){
        // Sum of three numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = sc.nextInt();
        // System.out.println("Enter third number:");
        // int num3 = sc.nextInt();
        // int sum = num1 + num2 + num3;
        // System.out.println("Sum of three numbers is:" + sum);



        // Calculate CGPA using marks
        System.out.println("Enter marks of Subject 1:");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of Subject 2:");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of Subject 3:");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks of Subject 4:");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks of Subject 5:");
        float sub5 = sc.nextFloat();
        float totalMarks = 500.00f;
        float totalObtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float average = (totalObtainedMarks/5);
        float cgpa = (average/10);
        System.out.println("CGPA of the student is:" + cgpa);


    }
}
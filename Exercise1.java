// Write a Program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as
// input from the keyword. (Marks are out of 100.)
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalMarks = 500.00f; 
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
        float totalObtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (totalObtainedMarks / totalMarks) * 100;
        System.out.println("Percentage of the student is:" + percentage);
    }
}

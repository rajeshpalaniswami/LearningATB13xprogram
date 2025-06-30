package Assignments;

import java.util.Scanner;

public class InterviewQa010 {
    public static void main(String[] args) {
        //Swap numbers (no 3rd variable)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();

        System.out.println("The given value of a = "+a+", b = "+b);
        a= a+b;
        b= a-b;
        a = a-b;
        System.out.println("The change value of a = "+a+", b = "+b);
    }
}

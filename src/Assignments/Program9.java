package Assignments;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        // Find the Largest of Two Numbers.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=  scan.nextInt();
        System.out.println("Enter the second number");
        int b=  scan.nextInt();
        if (a>b){
            System.out.println("The largest number is "+a);
        }else {
            System.out.println("The largest number is "+b);
        }
    }
}
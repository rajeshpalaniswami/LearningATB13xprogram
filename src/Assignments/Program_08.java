package Assignments;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
//Find the Smallest of Three Numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println("Enter the third number");
        int c = scan.nextInt();

        if (a<b && a<c){
            System.out.println("The smallest number is "+a);
        } else if (b<a && b <c) {
            System.out.println("The smallest number is "+b);
        }else{
            System.out.println("The smallest number is "+c);
        }


    }
}

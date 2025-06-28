package Assignments;

import java.util.Scanner;

public class Program015_Assignment {
    //Check if a Triangle is Valid Based on Three Sides.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of side A");
        int a = scan.nextInt();
        System.out.println("Enter the length of side B");
        int b = scan.nextInt();
        System.out.println("Enter the length of side C");
        int c = scan.nextInt();
        if ((a+b>c)||(a+c>b)||(b+c>a)){
            System.out.println("it is a valid triangle");
        }else {
            System.out.println("it is not a valid triangle");
        }
    }
}

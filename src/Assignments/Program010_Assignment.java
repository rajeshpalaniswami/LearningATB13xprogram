package Assignments;

import java.util.Scanner;

public class Program010_Assignment {
    public static void main(String[] args) {
        //Check if a Year is a Leap Year.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year");
        int year = scan.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.print("Yes the given year "+year+" is leap year");
        }else {
            System.out.print("The given year "+year+" is not a leap year");
        }
    }
}
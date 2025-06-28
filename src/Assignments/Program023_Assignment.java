package Assignments;

import java.util.Scanner;

public class Program023_Assignment {
    //Check if a Number is Divisible by 5 and 11
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =0;
        System.out.println("Enter the number to check if it is Divisible by 5 and 11");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Invalid input! Must be an integer.");
        }
        if ( number%5==0&& number%11==0){
            System.out.println("The give number is Divisible by 5 and 11");
        }else{
            System.out.println("The give number is not Divisible by 5 and 11 both at a time");
        }
    }
}

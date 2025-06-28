package Assignments;

import java.util.Scanner;

public class Program_016 {
    //Check if a Number is a Palindrome.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
       int num = scan.nextInt();
       int reversNum = 0;

       while(num>0){
           int digit = num%10;
           reversNum = reversNum*10+digit;

           num = num/10;
       }
       if (num == reversNum){
           System.out.println("The Given Number is Palindrome");
        }else
       {
           System.out.println("The Given Number is not a Palindrome");
       }

    }
}

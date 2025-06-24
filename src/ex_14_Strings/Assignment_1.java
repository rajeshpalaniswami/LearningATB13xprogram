package ex_14_Strings;

import java.util.Scanner;

public class Assignment_1 {


    //Check if a Number is Positive or Negative.
    public static void main(String[] args) {
        Scanner Scan = new  Scanner(System.in);

        System.out.println("Enter the number to check");
        int a = Scan.nextInt();

        if (a==0){
            System.out.println("Please enter the number grater or lesser to zero");
        }else if (a>0){
            System.out.println("The give number is positive");
        }else {
            System.out.println("The give number is negative");
        }
    }
}

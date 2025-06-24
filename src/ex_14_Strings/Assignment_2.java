package ex_14_Strings;

import java.util.Scanner;

public class Assignment_2 {
    //Check if a Number is Even or Odd.
    public static void main(String[] args) {

        Scanner Scan = new  Scanner(System.in);

        System.out.println("Enter the number to check");
        int a = Scan.nextInt();

        if(a%2 == 0){
            System.out.println("The given number is even");
        }else {
            System.out.println("The given number is odd");
        }
    }
}

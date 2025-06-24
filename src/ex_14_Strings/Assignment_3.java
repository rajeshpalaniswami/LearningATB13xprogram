package ex_14_Strings;

import java.util.Scanner;

public class Assignment_3 {
    //Find the Maximum of Two Numbers.
    public static void main(String[] args) {

        Scanner Scan = new  Scanner(System.in);
        System.out.println("Enter the First number");
        int a = Scan.nextInt();
        System.out.println("Enter the second number");
        int b = Scan.nextInt();

        if (a==b){
            System.out.println("please enter the Second number value bigger or smaller to first number");
        }else if (a > b){
            System.out.println("first number is bigger number");
        }else {
            System.out.println("Second number is bigger number");
        }

    }
}

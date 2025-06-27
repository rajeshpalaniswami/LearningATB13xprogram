package Assignments;

import java.util.Scanner;

public class Program13 {
    //Check if a Number is Prime
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        if (num>=1){
            System.out.println("The given number is not a Prime Number");
            return;
        }
        for (int i =2; i<=num;i++){
            if (num%i==0){
                System.out.println("The given number is not a Prime Number");
                return;
            }
        }
        System.out.println("The given number is a Prime Number");
    }
}

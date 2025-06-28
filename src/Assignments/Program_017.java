package Assignments;

import java.util.Scanner;

public class Program_017 {
    //Check if a Number is an Armstrong Number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int w1 = n%10;
        int w2 = (n/10)%10;
        int w3 = n/100;

        int sum = (w1*w1*w1)+(w2*w2*w2)+(w3*w3*w3);

        if (n==sum){
            System.out.println("The Given Number is Armstrong");
        }else{
            System.out.println("The Given Number is not Armstrong");
        }



    }
}

package Assignments;

import java.util.Scanner;

public class InterviewQA013 {

    // FibonacciSequence
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a= 0;
        int b= 1;
        int c= 1;

        for(int i=1;i<=num;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}

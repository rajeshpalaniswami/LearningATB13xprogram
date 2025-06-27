package Assignments;

import java.util.Scanner;

public class ReversTheString {
    public static void main(String[] args) {
        Scanner scan = new  Scanner (System.in);
        System.out.println("Enter the string which you want to reverse");
        String givenString = scan.next();
        String reversString = "";

        for (int i= givenString.length()-1;i>=0;i--){
            reversString = reversString + givenString.charAt(i);
        }
        System.out.println("After reversing the string value is :- "+reversString);
    }
}

package Assignments;

import java.util.Scanner;

public class InterviewQA03 {
    /*
     *  Write a Java program to compute and display the frequency of every character in a given string.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String givStr =  scan.next();

        int [] count = new int[256];

        for (int i=0;i<=givStr.length()-1;i++){
            count[givStr.charAt(i)]++;
        }
        for (int i=0;i<256;i++){
            if(count[i]>0){
                System.out.println((char)i+" = "+count[i]);
            }
        }
    }
}

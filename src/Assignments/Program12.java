package Assignments;

import java.util.Scanner;

public class Program12 {
    //Check if a Character is an Alphabet
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Character");
        int letter = scan.next().toUpperCase().charAt(0);
        if ((letter>='a')&&(letter<='z')){
            System.out.println("The given letter is a Character");
        }else {
            System.out.println("The given letter is Not a Character");
        }
    }
}

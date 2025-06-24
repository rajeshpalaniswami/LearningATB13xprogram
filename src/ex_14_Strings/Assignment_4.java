package ex_14_Strings;

import java.util.Scanner;

public class Assignment_4 {
   // Check if a Character is a Vowel or Consonant.
   public static <Char> void main(String[] args) {

       Scanner Scan = new  Scanner(System.in);
       System.out.println("Enter the First number");
       char a = Scan.next().toLowerCase().charAt(0);

       if (a=='a'|| a=='e'|| a=='i'||a=='o'||a=='u'){
           System.out.println("The given Character is a Vowel");

       }else {
           System.out.println("The given Character is a Consonant");
       }
   }
}

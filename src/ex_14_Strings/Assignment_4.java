package ex_14_Strings;

import java.util.Scanner;

public class Assignment_4 {
   // Check if a Character is a Vowel or Consonant.
   public static void main(String[] args) {

       String s1 = new String("Java");
       String s2 = "Java";
       if(s1 == s2) {
           System.out.println("true");
       }
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

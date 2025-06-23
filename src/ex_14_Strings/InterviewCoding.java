package ex_14_Strings;

import java.util.Scanner;


public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String which you want to check for Palindrome ");
       String givenString = scanner.next();

        String reversString ="";
        for (int i=givenString.length()-1;i>=0;i--){
            reversString = reversString + givenString.charAt(i);
        }
        System.out.println(reversString);
            if (reversString.equals(givenString)){
                System.out.println("The Given String is Palindrome");
                }else {
                System.out.println("The Given String is Not a Palindrome");
            }
    }
}

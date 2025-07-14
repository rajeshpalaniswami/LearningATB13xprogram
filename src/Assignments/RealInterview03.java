package Assignments;

import static java.lang.System.out;

public class RealInterview03 {
    public static void main(String[] args) {
        String givenStr = "car rac";
        givenStr.toLowerCase();
        String out1 = "";
        String out2 ="";
        for (int i=givenStr.length()-1;i>=0;i--) {
           if(givenStr.charAt(i)<'a'&&givenStr.charAt(i)>'z'){
               out1 = out1 + givenStr.charAt(i);
           }
        }

            for (int i=givenStr.length()-1;i>=0;i--){
out1 = out1 + givenStr.charAt(i);
        }

        if (out1.equals(out2)){
            out.println("given string is Palindrome");
        }else{
            out.println("given string is not a Palindrome");
        }
    }
}

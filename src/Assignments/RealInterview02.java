package Assignments;

public class RealInterview02 {
    public static void main(String[] args) {
        String givenStr = "Rajesh12333  0 1";
        int out = 0;
        for (int i=0;i<=givenStr.length()-1;i++){

            if (Character.isDigit(givenStr.charAt(i))){
                out = out + givenStr.charAt(i)-'0' ;
            }
        }
        System.out.println(out);
    }
}

package Assignments;

public class ConvertTheStringIntoArray {
    public static void main(String[] args) {
        String givenString = "Rajesh";
        int len = givenString.length();
        char [] stringArray = new char [len];

        for (int i=0;i<=len-1;i++){
            stringArray [i] = givenString.charAt(i);
            System.out.println(stringArray [i]);
        }

    }
}

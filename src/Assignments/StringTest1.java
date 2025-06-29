package Assignments;

public class StringTest1 {
    public static void main(String[] args) {
        //Write a Java program that demonstrates basic string operations including
        // concatenation, length, substring, and character extraction.

        String given = "Hello";
        String given1 = "World";

        String concatenation = given + given1;
        System.out.println(concatenation);

        int length = concatenation.length();
        System.out.println(length);

        //substring
        System.out.println(concatenation.subSequence(5,10));

        //character extraction
        System.out.println(concatenation.charAt(4));

    }
}

package Assignments;

public class StringTest2 {
    //Create a program that demonstrates different ways to compare strings in Java, including == operator,
    // equals(), equalsIgnoreCase(), and compareTo() methods.
    public static void main(String[] args) {

       String  string1= "Hello", string2 ="hello", string3 = "Hello";
        System.out.println(string1==string2);
        System.out.println(string1==string3);
        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareToIgnoreCase(string2));

    }
}

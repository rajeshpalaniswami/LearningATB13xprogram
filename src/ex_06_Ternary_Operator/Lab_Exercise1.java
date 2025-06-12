package ex_06_Ternary_Operator;

public class Lab_Exercise1 {
    // Program 1: Find Max of Two Numbers using Ternary Operators.
    //Description: Uses ternary operator to compare a and b and print the
    // maximum value.A =10, B= 20;
    public static void main(String[] args) {
        int A = 10;
        int B= 20;

        int max = (A > B )? A :B ;
        System.out.println(max);
        char max1 = (A > B )? 'A' :'B' ;
        System.out.println("Output in Char vlaue "+max1);

    }

}

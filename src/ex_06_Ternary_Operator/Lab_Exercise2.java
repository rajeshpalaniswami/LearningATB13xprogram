package ex_06_Ternary_Operator;

public class Lab_Exercise2 {
    public static void main(String[] args) {

        /**Description: Uses ternary to check whether a number is even or
        odd. A = 19, update the a value and check again A =20;**/
        int A = 19;
         String value = (A%2 ==0)? "Even":"odd";
        System.out.println(value);

    }
}

package ex_06_Ternary_Operator;

public class Lab_Exercise4 {
    public static void main(String[] args) {
        /***
         * Program 4: Implicit Typecasting (Widening)
         *Description: Convert int A =100 to double.
         */
        int A = 100;
        double B = A;
        System.out.println(B);

        /***
         * Program 5: Explicit Typecasting (Narrowing)
         *Description: Casts a double to an int, cutting off decimals value.
         */
        double c = 100.1223;
        int d = (int)c;
        System.out.println(d);

        /****
         * Program 6: Character to ASCII
         *Description: Typecasts a character to its ASCII integer value.
         * Example Print A ASCII Int value.
         */
        char value = 'A';
        char value1 = 'B';
        int r = value ;
        int r1 = value1 ;
        System.out.println(r);
        System.out.println(r1);

/****
 * Program 7: Typecasting in Division
 *Description: int a = 10, int b = 3; now divide 10/3 and store the decimal
 *  value in the Result variable and print it.
 */
int a =10;
int b= 3;
float resultR =10/3f ;
System.out.println(resultR);

    }
}

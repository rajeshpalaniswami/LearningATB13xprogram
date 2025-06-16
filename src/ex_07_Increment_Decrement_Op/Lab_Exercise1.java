package ex_07_Increment_Decrement_Op;

public class Lab_Exercise1 {
    public static void main(String[] args) {
       // 🔹 Program 1:
        int a = 5;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);// a: 6, b: 5

       // 🔹 Program 2:
        int i = 1;
        i = i++ + ++i;
        System.out.println(i); // 4

        //🔹 Program 3:
        int x = 5;
        System.out.println(x++ + ++x); // 12

        //🔹 Program 4:
        int x1 = 5;
        System.out.println(++x1); // 6
        System.out.println(x1++); // 7
        System.out.println(x1);   //

        //🔹 Program 5:  Interview Question
        int a1 = 5;
        int b1 = a1++ + ++a1;
        System.out.println("a: " + a1); // a: 7
        System.out.println("b: " + b1); // b: 12

        //🔹Program 6:  Interview Question
        int x2 = 5;
        int y = x2++ + ++x2 + x2++ + ++x2;
        System.out.println("x = " + x2 + ", y = " + y); // x = 9, y = 28

        //🔹Program 7:  Interview Question
        int x3 = 5;
        int y3 = x3++ + ++x3 + x3++ + ++x3;
        System.out.println("x = " + x3 + ", y = " + y3); // x = 9, y = 28
    }
}

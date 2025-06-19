package ex_14_Test;

public class Program5 {
    public static void main(String[] args) {
        //Create a program to demonstrate all types of operators


        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // 2. Relational (Comparison) Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // 4. Bitwise Operators
        int m = 5, n = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("m & n: " + (m & n));   // AND
        System.out.println("m | n: " + (m | n));   // OR
        System.out.println("m ^ n: " + (m ^ n));   // XOR
        System.out.println("~m: " + (~m));         // NOT
        System.out.println("m << 1: " + (m << 1)); // Left Shift
        System.out.println("m >> 1: " + (m >> 1)); // Right Shift
        System.out.println();

        // 5. Assignment Operators
        int num = 5;
        System.out.println("Assignment Operators:");
        num += 3;
        System.out.println("num += 3: " + num);
        num -= 2;
        System.out.println("num -= 2: " + num);
        num *= 2;
        System.out.println("num *= 2: " + num);
        num /= 3;
        System.out.println("num /= 3: " + num);
        num %= 2;
        System.out.println("num %= 2: " + num);
        System.out.println();

        // 6. Unary Operators
        int u = 10;
        System.out.println("Unary Operators:");
        System.out.println("u: " + u);
        System.out.println("++u: " + (++u));
        System.out.println("--u: " + (--u));
        System.out.println("-u: " + (-u));
        System.out.println("+u: " + (+u));
        System.out.println();

        // 7. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Operator:");
        System.out.println("Age is " + age + " → " + result);
    }
}

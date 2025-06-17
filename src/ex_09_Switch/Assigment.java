package ex_09_Switch;

import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
        /**
         * ✅ Triangle Classifier:Write a program that classifies a triangle based
         * on its side lengths. Given three input values representing the lengths of the sides,
         * determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
         * or scalene (no sides are equal). Use an if-else statement to classify the triangle.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side length");
        int a = scan.nextInt();
        System.out.println("Enter the second side length");
        int b = scan.nextInt();
        System.out.println("Enter the third side length");
        int c = scan.nextInt();

        if ((a==b)&&(b==c)&&(c==a)){
            System.out.println("It is an equilateral triangle because three sides are equal");
        }else if ((a==b)||(b==c)||(c==a)){
            System.out.println("It is an isosceles triangle because two sides are equal");
        }else{
            System.out.println("It is an scalene triangle because no sides are equal");
        }
    }

}

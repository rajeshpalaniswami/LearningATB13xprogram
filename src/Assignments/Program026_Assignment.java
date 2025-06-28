package Assignments;

import java.util.Scanner;

public class Program026_Assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age =0;
        if (scan.hasNextInt()){
            age = scan.nextInt();
        } else {
            System.out.println("Invalid input! Must be an integer.");
        }
        if (age<=12){
            System.out.println("As pre the this is a child.");
        } else if (age<=19) {
            System.out.println("As pre the this is a Teenager.");
        }else if (age<=65) {
            System.out.println("As pre the this is a Adult.");
        }else {
            System.out.println("As pre the this is a Senior Citizen.");
        }


    }
}

package ex_09_Switch;

import java.util.Scanner;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int itemcode = scanner .nextInt();

        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}

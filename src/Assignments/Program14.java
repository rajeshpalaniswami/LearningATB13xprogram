package Assignments;

import java.util.Scanner;

public class Program14 {
    /***
     *ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
     *        Steps to Write the Program
     * 1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
     * 2️⃣ Take user input for the amount they want to withdraw.
     * 3️⃣ Check withdrawal conditions:
     * The amount should be greater than zero.
     * The amount should be a multiple of 100 (common ATM rule).
     * The amount should not exceed the account balance.
     * 4️⃣ Deduct the amount from the balance if conditions are met.
     * 5️⃣ Display the updated balance or an error message if the withdrawal fails.
     */

    public static void main(String[] args) {
        int fixedBalance = 10000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Withdraw Amount");
        Double withDrawAmount= scan.nextDouble();
if (withDrawAmount % 100 == 0) {

    if (withDrawAmount <= 0) {
        System.out.println("Please enter the valid amount");
    } else if (withDrawAmount > 10000) {
        System.out.println("Entered Amount is grater than the balance please enter the valid amount");
    } else {
        System.out.println("Entered Amount " + withDrawAmount + "  is successfully withdrawn.");
        Double balance = fixedBalance - withDrawAmount;
        System.out.println("Please find the balance account after withdraw " + balance);
    }
        }else {
            System.out.println("Please enter the amount which is multiple of 100");
        }
    }
}

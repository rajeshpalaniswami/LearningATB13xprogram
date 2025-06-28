package Assignments;

import java.util.Scanner;

public class Program21 {
    /*
    Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
    Reserch from your side for this program.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total CTC of an Employee");
        int ctc = scan.nextInt();
        if (ctc>0){
            double basicPay = 0.4*ctc;
            double hra = 0.2*ctc;
            double da = 0.05*ctc;
            double specialAllowances = 0.25*ctc;
            double BonusORGratuity = 0.05*ctc;
            double EmployerPFContribution = 0.05*ctc;
            if (ctc>120000) {
                double deduction = 0.12*basicPay+200;
            }

        }else{
            System.out.println("Enter the CTC value grate than zero");
        }

    }
}

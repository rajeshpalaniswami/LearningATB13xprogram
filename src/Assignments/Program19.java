package Assignments;

import java.util.Scanner;

public class Program19 {
    /***
     * Electricity Bill Calculation (Based on Units Consumed)
     *            :- take the input from the user of Units.
     *     Implement Rate Structure:
     *     Define the rate structure for calculating the bill based on the number of units consumed.
     *             :-  First 100 units: 0.50Rs per unit
     *             :-  Next 100 units (101-200): 0.75Rs per unit
     *             :- Next 100 units (201-300): 1.20Rs per unit
     *             :- Above 300 units: 1.50Rs per unit
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double unit = scan.nextDouble();
        double  charge = 0.0;

        if (unit>0 && unit<=100){
            charge = unit * 0.50;

        } else if (unit<=200) {
            double a =  unit -100;
            charge = ((100*0.50) + (a*0.75));

        }else if (unit<=300) {
            double a =  unit-200;
            charge = ((100 * 0.50) + (100 * 0.75) + (a * 1.20));
        }else{
            double a = unit - 300;
            charge = ((100 * 0.50) + (100 * 0.75) + (100 * 1.20)+(a*1.50));
        }
        System.out.println("Electricity Bill is "+charge);
    }
}

package Assignments;

import java.util.Scanner;

public class Program20 {
    /*
     * Calculate Bonus Based on Salary and Years of Experience.
     *           :- take the salary and Year info from the User.
     * Implement Bonus Calculation Logic:
     *      Define the bonus structure based on salary and years of experience.
     *            :- If years of experience is less than 1 year: No bonus.
     *            :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
     *            :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
     *            :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = scan.nextInt();
        System.out.println("Enter the year of experience");
        int experience = scan.nextInt();
        double bous= 0.0;
        if (experience<=0){
            System.out.println("No Bonus for the employee");
        } else if(experience<=3){
             bous = (salary*0.05);
            System.out.println("The Bonus for the employee is "+bous);
        }else if(experience<=6){
            bous = (salary*0.1);
            System.out.println("The Bonus for the employee is "+bous);
        }else{
            bous = (salary*0.15);
            System.out.println("The Bonus for the employee is "+bous);
        }

    }
}

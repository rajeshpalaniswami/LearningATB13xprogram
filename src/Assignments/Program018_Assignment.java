package Assignments;

import java.util.Scanner;

public class Program018_Assignment {
    /****
     * Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
     *     * Take the below User info and store it into the variables:
     *               Age (integer)
     *               Salary (double or float)
     *               Credit Score (integer)
     *     Age Validation:
     *               :- Check if the age is a positive integer.
     *               :- Ensure the age is at least 18 years old.
     *               :- Max age can be 80.
     *     Salary Validation:
     *              :- Check if the salary is a positive number.
     *              :- Define a minimum salary threshold (e.g., 30,000).
     *     Credit Score Validation:
     *              :- Check if the credit score is a positive integer.
     *              :- Define a minimum credit score threshold (e.g., 650).
     *              :- Max credit score threshold (e.g., 850).
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = scan.nextInt(); //age
        System.out.println("Enter the salary");
        Double b= scan.nextDouble(); //Salary
        System.out.println("Enter the Credit Score");
        int c = scan.nextInt(); // Credit Score


        if ((a>=18)&&(a<80)){
                   if((b>30000)){
                       if ((c>650)&&(c<850)){
                           System.out.println("Person is Eligible for a Loan");
               }else{
                   System.out.println("Person is not Eligible for loan due to Credit Score ");
               }
           }else {
               System.out.println("Person is not Eligible for loan due to salary");
           }
        }else {
            System.out.println("Person is not Eligible for loan due to Age ");
        }
    }
}

package Assignments;

import java.util.Scanner;

public class Program_022 {
    public static void main(String[] args) {
        /*
        Find if a Person Can Travel Based on Visa Status and Age.
     take the input from the user for
            Age (integer).
            Visa Status (String or boolean).
     Check Eligibility:
             :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
        Validation Criteria
                Age: - Must be a non-negative integer.
                        Should be greater than or equal to 18 to be eligible to travel.
        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
         You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
         */
        Scanner scanner = new Scanner(System.in);
        int age =0;
        boolean visaStatus = false;
        System.out.println("Enter the age of the passenger");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Invalid input! Must be an integer.");
        }
        System.out.println("Enter the visa status of the passenger");
        if (scanner.hasNextBoolean()) {
             visaStatus = scanner.nextBoolean();
        } else {
            System.out.println("Invalid input! Must be a true/false.");
        }
        if (age>18 && visaStatus){
            System.out.println("Passenger is eligible for the travel");
        }else{
            System.out.println("Passenger is not eligible for the travel");
        }
    }
}

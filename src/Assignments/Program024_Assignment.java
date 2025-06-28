package Assignments;

import java.util.Scanner;
/*
Convert Days into Years, Months, and Days.
       Take the Days Input from the User
    Define the conversion logic:
        Assume 1 year = 365 days.
        Assume 1 month = 30 days
        Convert the Days into Years, Month and days and Print it.
if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
 */
public class Program024_Assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days =0;
        if(scan.hasNextInt()){
             days = scan.nextInt();
        }else{
            System.out.println("Invalid input! Must be an integer.");
        }
        // to find the number of years
        double a = days/365;
        int years = (int) a;

        // to find the number of months
        int t = days -(years*365);
        double y = t/30;
        int months = (int) y;

        //to find the days
        days = days -(years*365) - (months*30);
        // giving the print statement
        System.out.println(years +" years " +months+" months "+days+" days ");
    }
}

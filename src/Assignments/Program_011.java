package Assignments;

import java.util.Scanner;

public class Program_011 {
    /***
     * Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
     * 1️⃣ Take user input for marks (Use Scanner class).
     * 2️⃣ Check the validity of marks (ensure they are between 0 and 100).
     * 3️⃣ Use if-else-if conditions to determine the grade based on marks.
     * 4️⃣ Display the grade as output.
     * 📌 Grading Criteria (Example)
     * Marks Range Grade
     * 90 - 100   A+
     * 80 - 89     A
     * 70 - 79      B
     * 60 - 69     C
     * 50 - 59      D
     * 40 - 49      E
     * Below 40   Fail
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the marks of the student");
        int marks = scan.nextInt();
        if ((marks>=0)&&(marks<=100)){
            if((marks>=90)){
                System.out.println("As per the marks the student Grade is A+");
            } else if (marks>=80) {
                System.out.println("As per the marks the student Grade is A");
            }else if (marks>=70) {
                System.out.println("As per the marks the student Grade is B");
            }else if (marks>=60) {
                System.out.println("As per the marks the student Grade is c");
            }else if (marks>=50) {
                System.out.println("As per the marks the student Grade is D");
            }else if (marks>=40) {
                System.out.println("As per the marks the student Grade is E");
            }else {
                System.out.println("As per the marks the student Grade is Fail");
            }
        }else
            System.out.println("Enter the proper marks");
    }
}

package ex_06_Ternary_Operator;

public class Lab_Exercise3 {
    /****
     * Program 3: Grade Calculation Using Nested Ternary
     * Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
     */
    public static void main(String[] args) {
        int student_marks = 79;
        String marks_Grade = (student_marks > 90)? "A+":(student_marks > 75)? "A":(student_marks > 60)? "B":(student_marks > 40)?"c":"Fail";
        System.out.println(marks_Grade);
    }


}

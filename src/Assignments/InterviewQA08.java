package Assignments;

public class InterviewQA08 {
    //Write a Java program for the given string transformation:
    //Input: tomorrow
    //Output: t3m3223w

    public static void main(String[] args) {
        String givStr = "tomorrow";
        for (int i=0;i<=givStr.length()-1;i++){
         char cu = givStr.charAt(i);
            if (cu=='o'){
               cu= '3';
            }
            if (cu=='r'){
                cu= '2';
            }
            System.out.print(cu);
        }
    }
}

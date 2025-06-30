package Assignments;

public class InterviewQA01 {
    /*
    Given an array (6, 8, 11, 6, 7, 18) and a target sum of 17,
    write a program to find the indices of any two elements whose sum equals the target.
     */
    public static void main(String[] args) {
        int [] givenarray = {6,8,11,7,6,18};
        int sum = 17;

        for(int i=0;i<=givenarray.length-1;i++){
            for(int j=i+1;j<=givenarray.length-1;j++){
                if( givenarray[i]+ givenarray[j]==sum){
                    System.out.println(i+" "+ j);
                }

            }
        }

    }
}

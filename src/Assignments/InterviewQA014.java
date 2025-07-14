package Assignments;

import java.util.*;

public class InterviewQA014 {
    // Write Java program that checks if two arrays contain the same elements
    public static void main(String[] args) {
       int [] array1 = {1,2,3,4,5,6,7,8,99,10,11};
       int [] array2 = {8,9,0,10,11,7};

       for (int i =0;i<=array1.length-1;i++){
           for (int j =0;j<=array2.length-1;j++){
               if (array1 [i] == array2 [j]){
                   System.out.println(array1 [i]);
                   break;
               }
           }

       }

    }
}
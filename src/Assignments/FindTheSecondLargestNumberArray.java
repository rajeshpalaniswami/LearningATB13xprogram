package Assignments;

import java.util.Arrays;

public class FindTheSecondLargestNumberArray {
    public static void main(String[] args) {
        int [] array = {100,200,500,600,700};
        Arrays.sort(array);
        int secondLargestNumber = array[array.length-2];
        System.out.println(secondLargestNumber);
    }
}

package Assignments;

public class InterviewQA09 {
    //find the largest number in the given array

    public static void main(String[] args) {
        int[] array = {10,5, 30, 25};
        int max=0;
        for(int i=0;i<=array.length-1;i++){
            if (array[i]>=max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

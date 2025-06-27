package Assignments;

public class FindTheArrayAverage {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i=0;i<=array.length-1;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
        double average  = sum/array.length;
        System.out.println(average);

    }
}

package Assignments;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i =0;i<=array.length-1;i++){
            sum = sum + array[i];
    }
        System.out.println("The sum of all the Elements in the array");
        System.out.println(sum);
}
}
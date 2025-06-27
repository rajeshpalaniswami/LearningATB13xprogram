package Assignments;

public class FindTheSmallestElementInArray {
    public static void main(String[] args) {
        int [] array ={7,4,6,8,9};
        int smallNum = array[0];

        for(int i=0;i<=array.length-1;i++){
            if (smallNum>array[i]){
                smallNum= array[i];
            }
        }
       System.out.println(smallNum);
    }
}

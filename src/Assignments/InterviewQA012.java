package Assignments;

public class InterviewQA012 {
    //find the second-largest number in the given array without using Array.sort function.

    public static void main(String[] args) {
        int [] givenArray = {22,6,7,99,55,66};
        int firstMax =givenArray[0];
        int secnodMax = 0;

        for (int i=0;i<=givenArray.length-1;i++){

            if ( givenArray[i] > firstMax){
                secnodMax = firstMax;
                firstMax = givenArray[i];
            }else if (givenArray[i]> secnodMax && givenArray[i]!= firstMax){
                secnodMax =  givenArray[i];
            }

        }
        System.out.println( secnodMax);
    }
}

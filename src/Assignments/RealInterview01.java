package Assignments;

public class RealInterview01 {
    /*
    arr[] = [1, 1, 2, 1, 3, 5, 1]
n
Majority Element -> which occurs more than n/2 times in the array
[] = [1, 1, 2, 1, 3, 5, 1]
n
Majority Element -> which occurs more than n/2 times in the array
     */
    public static void main(String[] args) {
        int [] arry = {1,1,2,1,3,5,1};

        for (int i=0;i<=arry.length-1;i++){
            int count =0;
            for (int j=i+1;j<=arry.length-1;j++){
                if (arry[i]==arry[j]){
                    count=count+1;
                }
            }
            if (count<arry.length/2){
                System.out.println(arry[i]);
                break;
            }

        }

    }
}

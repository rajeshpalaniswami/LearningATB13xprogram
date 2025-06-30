package Assignments;

public class InterviewQA05 {
    //We have 3 stairs need to find number of possibilities to reach the 3rd stair from ground using java.
    public static void main(String[] args) {
        int n = 3;
        int no_of_ways = noways(n);
        System.out.println("Total ways to reach step " + n + ": " + no_of_ways);
    }

    public static int noways(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int a=1;
        int b=1;
        int result = 0;
        for (int i=2;i<=n;i++){
            result = a+b;
            a=b;
            b=result;

        }
        return result;
    }
}

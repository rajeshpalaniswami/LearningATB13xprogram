package Assignments;

public class RealInterview {
    // given input String a ="10+2*5"
    //Expected out put int b = 20;

    public static void main(String[] args) {
        String given = "10+2*5";
        //splitting thr give string into array
        String [] giveString = given.split("\\+");
        String [] temparray =   giveString [1].split("\\*");
        int multi = 1;
        for(int i=0;i<=temparray.length-1;i++){
            int a = Integer.parseInt(temparray[i]);
            multi = multi*a;
        }
        int b = Integer.parseInt(giveString[0]);
        int out = multi+b;
        System.out.println(out);
    }


}

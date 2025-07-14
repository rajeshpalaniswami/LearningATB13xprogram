package Assignments;

public class RealInterview04 {
    public static void main(String[] args) {
        String giveStr = "RajeshPPhsejaR";
        int[] count = new int [256];
        String output = "";
        String poutput = "";

        for (int i=0;i<=giveStr.length()-1;i++){
            count[giveStr.charAt(i)]++;
        }
        for (int i=0;i<=count.length-1;i++){
            if (count[i]>0){
                System.out.println((char)i+" = "+count[i]);
            }
        }
        for (int i=giveStr.length()-1;i>=0;i--){
            output = output+giveStr.charAt(i);
        }
        if(giveStr.equals(output)){
            System.out.println("The given string is piledrom");
        }else{
            System.out.println("The given string is not a piledrom");
            giveStr = giveStr+output;
        }
        System.out.println(giveStr);
    }
}

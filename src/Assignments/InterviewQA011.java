package Assignments;

public class InterviewQA011 {
    //Write a Java program to remove duplicate characters from a string
    public static void main(String[] args) {
        String giv = "RRRRRRRajeshjjjjj";
        String out = "";
        for (int i =0;i<=giv.length()-1;i++){
          //  char a = giv.charAt(i);
            if (out.indexOf(giv.charAt(i))== -1){
                out = out +giv.charAt(i);
            }
        }
        System.out.println(out);
    }
}

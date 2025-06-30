package Assignments;

public class InterviewQA07 {
    //Write a Java program to reverse the entire sentence.
    public static void main(String[] args) {
        String givSrt = "I am a software Tester";
        String[] words = givSrt.split(" ");

        String reversSent = "";
        for (int i=words.length-1;i>=0;i--){
            reversSent = reversSent + words[i]+" ";
        }
        System.out.println(reversSent);

    }
}

package Assignments;

public class InterviewQA06 {
    //Write a Java program to reverse each word in a string.
    public static void main(String[] args) {
        String givSrt = "I am a software Tester";
        String[] words = givSrt.split(" ");

        String result = "";
        for (int i =0;i<=words.length-1;i++){
            String word = words[i];
            String reversWord = "";

            for (int j=word.length()-1;j>=0;j--){
                reversWord = reversWord+word.charAt(j);
            }
            result = result + reversWord+" ";
        }
        System.out.println(result);
    }
}

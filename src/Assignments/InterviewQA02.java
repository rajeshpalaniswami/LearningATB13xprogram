package Assignments;

public class InterviewQA02 {
    /**
     * Write a Java program to determine the frequency of each character in a given string
     * and identify the character that appears most frequently.
     */
    public static void main(String[] args) {
        String givenString = "Java is a most difficult programming language";
        givenString.toLowerCase();
        int [] count = new int[256];

        for (int i=0;i<=givenString.length()-1;i++){
            count[givenString.charAt(i)]++;
        }
        for (int i=0;i<256;i++){
            if(count[i]>0){
                System.out.println((char)i+" = "+count[i]);
            }
        }
        int max = 0;
        char maxChar = ' ';
        for (int i=0;i<256;i++){
            if (count[i]>max && (char)i != ' '){
                max = count[i];
                maxChar = (char)i;
            }
        }
        System.out.println( "The answer is "+maxChar +" = "+max);
    }
    }

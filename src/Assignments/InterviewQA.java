package Assignments;

public class InterviewQA {
    public static void main(String[] args) {
        // given string ttessst@innnn123ggg!
        //print only characters

        String givenString = "ttessst@innnn123ggg!";
        for (int i=0;i<=givenString.length()-1;i++){
            char a = givenString.toLowerCase().charAt(i);
            if (a>='a'&&a<='z'){
                System.out.println(a);
            }
        }

    }
}

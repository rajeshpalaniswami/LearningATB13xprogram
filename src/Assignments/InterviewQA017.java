package Assignments;

public class InterviewQA017 {
    //

    public static void main(String[] args) {
        String given = "Tomorrow";
        String out = "";
        int temp = 0;

        for (int i = 0; i <= given.length() -1; i++) {
            char ch = given.charAt(i);
            if (ch == 'o') {
                temp++;
                for (int j = 0; j < temp; j++) {
                    out = out + "$";
                }
            } else {
                out = out + ch;

            }

        }
        System.out.print(out);
    }
}
package Assignments;

public class Practice01 {
    //Remove whitespaces
    public static void main(String[] args) {
        String givStrig = "   a   b   c   d";
        String noSpace = " ";
        for (int i=0;i<= givStrig.length()-1;i++){
            char cu = givStrig.charAt(i);
            if (cu==' '){
                continue;
            }else {
                noSpace =  noSpace + givStrig.charAt(i);
            }
        }
        System.out.println(noSpace.trim());
    }
}

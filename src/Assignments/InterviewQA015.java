package Assignments;

public class InterviewQA015 {
    //Covert upper cases to lower cases and vice versa given HexAwarE

    public static void main(String[] args) {
        String givenStr = "HexAwarE";
                String result = " ";
                for (int i=0;i<=givenStr.length()-1;i++){
                    char temp = givenStr.charAt(i);
                    if (Character.isUpperCase(temp)){
                        result = result+Character.toLowerCase(temp);
                    }else{
                        result = result+Character.toUpperCase(temp);
                    }
                }
                System.out.println( result);
    }
}

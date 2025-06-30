package Assignments;

public class Practice02 {
    //Remove whitespaces from sentence
    public static void main(String[] args) {
        String givStr = "my name is rajesh";
        char[] array = givStr.toCharArray();
        for(int i=0;i<=array.length-1;i++){
            if (array [i]==' '){
                continue;
            }else {
                System.out.print(array [i]);
            }
        }
    }
}

package Assignments;

public class InterviewQA018 {
    //Write code to find the middle of a string
    public static void main(String[] args) {
        String givStr = "my name is rajesh";
        String [] array = givStr.split(" ");
        for (int i=0;i<=array.length-1;i++){
            String c = array[i];
            if(i>=array.length/2){
                System.out.println(c);
                break;
            }

        }
    }
}

package Assignments;

public class Practice03 {
    //Reverse words in sentence
    public static void main(String[] args) {
        String givSen = "i to want to code";
        String [] array = givSen.split(" ");

       int count =0;
        for (int i=0;i<=array.length-1;i++){
            if (array[i].equals("to") && count ==0){
                count++;
                continue;
            }else {
                System.out.print(array[i]+" ");
            }
        }
    }
}

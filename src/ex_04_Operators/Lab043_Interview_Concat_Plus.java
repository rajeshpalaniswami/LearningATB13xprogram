package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Rajesh";
        String last_name = "Kavya";

        int a = 10;
        int b = 10;

       System.out.println(first_name + last_name + a + b); //RajeshKavya1010
       System.out.println(a + b + first_name + last_name);//20RajeshKavya

        System.out.println(first_name + last_name + (a + b));// RajeshKavya20

        // BODMAS - Bracket of Div, mul, add, sub
    }
}

package ex_04_Operators;

public class Lab051_InstanceOf_Operator {
    public static void main(String[] args) {
        String s1 = new String("Rajesh");
        System.out.println(s1 instanceof String);// true
       System.out.println(s1 instanceof Object);//true
      // System.out.println(s1 instanceof Integer); //compile time error
    }
}

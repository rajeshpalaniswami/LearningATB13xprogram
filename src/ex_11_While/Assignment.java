package ex_11_While;

public class Assignment {
    public static void main(String[] args) {
        //✅ Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        int j = 0;
        int m = 0;
        String name = "pramod";
        for (int i = 0; i < name.length(); i++) {

            char y = name.charAt(i);
            if (y == 'a' || y == 'e' || y == 'i' ||
                    y == 'o' || y == 'u') {
                j++;
            } else {
                m++;
            }

        }
        System.out.println(j);
        System.out.println(m);

        //✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        String name1 = "naman";
        String revname = "";

        for (int i = name1.length() - 1; i >= 0; i--) {
            revname = revname + name1.charAt(i);
        }
        System.out.println(revname);

        String name2 = " madam";
        String revname2 = "";

        for (int i = name2.length() - 1; i >= 0; i--) {
            revname2 = revname2 + name2.charAt(i);
        }
        System.out.println(revname2);
    }
}
package Assignments;

public class StringTest3 {
    public static void main(String[] args) {
        int iterations = 100_000; // number of string operations

        // -------------------------------
        // 1. String (immutable concatenation)
        // -------------------------------
        long start1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a"; // creates new object each time
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken using String:       " + (end1 - start1) + " ms");

        // -------------------------------
        // 2. StringBuilder (non-synchronized, fast)
        // -------------------------------
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (end2 - start2) + " ms");

        // -------------------------------
        // 3. StringBuffer (synchronized, thread-safe)
        // -------------------------------
        long start3 = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("a");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time taken using StringBuffer:  " + (end3 - start3) + " ms");
    }
}




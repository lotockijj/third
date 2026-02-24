package org.example.warmup;

//Reduce Short-lived Objects
public class StringConcatenationExample {
    public static void main(String[] args) {
        // BAD: Creates new StringBuilder per iteration
        long startTime = System.nanoTime();
        int item1 = getConcatenationStringsBad(100_000, "Item");
        long endTime = System.nanoTime();
        long durationInNanos = endTime - startTime;
        System.out.println(item1 + " " + durationInNanos);
        // GOOD: Reuse buffer
        startTime = System.nanoTime();
        int item2 = getConcatenationStringsGood(100_000, "Item");
        endTime = System.nanoTime();
        durationInNanos = endTime - startTime;
        System.out.println(item2 + " " + durationInNanos);
        /*
            BAD  vs GOOD
            27822502-20590620 = 7_231_882
            32968738-20726496 = 12_242_242
            27950756-20735550 = 7_215_206
         */

    }

    public static int getConcatenationStringsBad(int number, String str){
        String[] res = new String[number];
        for (int i = 0; i < number; i++) {
            String s = new StringBuilder().append(str).append(i).toString();
            res[i] = s;
        }
        return res.length;
    }

    public static int getConcatenationStringsGood(int number, String str){
        String[] res = new String[number];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.setLength(0);
            sb.append("Item ").append(i);
            String s = sb.toString();
            res[i] = s;
        }
        return res.length;
    }
}

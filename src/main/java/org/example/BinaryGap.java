package org.example;

public class BinaryGap {

    public static void main(String[] args) {
        int binaryGap = findBinaryGap(101);
        System.out.println(binaryGap);
        binaryGap = findBinaryGap(529);
        System.out.println(binaryGap);
    }

    public static int findBinaryGap(int number) {
        String s = Integer.toBinaryString(number);
        System.out.println(s);
        int res = 0;
        int tempRes = 0;
        for (int j = 1; j < s.length(); j++) {
            if(s.charAt(j) == '0'){
                tempRes++;
            } else if(s.charAt(j) == '1'){
                res = Math.max(res, tempRes);
                tempRes = 0;
            }
        }
        return res;
    }
}

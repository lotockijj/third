package leetcode;

import java.math.BigInteger;

public class BinaryAddition67 {

    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        return num1.add(num2).toString(2);
    }
}

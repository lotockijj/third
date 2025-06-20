package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    private Solution6 solution6;

    @BeforeEach
    void setUp() {
        solution6 = new Solution6();
    }

    @Test
    void convert1() {
        String input = "PAYPALISHIRING";

        String result = solution6.convert(input, 3);

        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void convert2() {
        String input = "PAYPALISHIRING";

        String result = solution6.convert(input, 4);

        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void convert3() {
        String input = "AB";

        String result = solution6.convert(input, 1);

        assertEquals("AB", result);
    }

    @Test
    void convert4() {
        String input = "ABC";

        String result = solution6.convert(input, 1);

        assertEquals("ABC", result);
    }
}
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:
Input: s = "A", numRows = 1
Output: "A"
Constraints:
1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
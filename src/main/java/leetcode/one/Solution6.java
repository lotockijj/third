package leetcode.one;

public class Solution6 {

    /*
    "PAYPALISHIRING"
     12345678911234
    0, 4, 8, 12,  1, 3, 5, 7, 9, 11, 13,  2, 6, 10
    3             2                       4
    P   A   H   N
    A P L S I I G
    Y   I   R
    "PAYPALISHIRING"
     012345678911234
     P     I    N
     A   L S  I G
     Y A   H R
     P     I

     */
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        int tempRow = 0;
        int tempColumn = 0;
        boolean reverse = false;
        char[][] arr = new char[numRows][s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (tempRow == numRows && !reverse) {
                tempRow -= 2;
                tempColumn++;
                reverse = true;
            } else if (tempRow == -1) {
                reverse = false;
                tempRow = 1;
                tempColumn--;
            }
            arr[tempRow][tempColumn] = s.charAt(i);
            if (reverse) {
                tempRow--;
                tempColumn++;
            } else {
                tempRow++;
            }
        }
        return printMyArr(arr);
    }

    private String printMyArr(char[][] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    stringBuilder.append(arr[i][j]);
                }
            }
        }
        return stringBuilder.toString();
    }


}


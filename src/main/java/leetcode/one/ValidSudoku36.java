package leetcode.one;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
    private static final char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    public boolean isValidSudoku(char[][] board) {
        boolean validSudoku = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> lineChars = new HashSet<>();
            Set<Character> columnChars = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char lineChar = board[i][j];
                char columnChar = board[j][i];
                if (lineChar != '.' && !lineChars.add(lineChar)) {
                    validSudoku = false;
                    break;
                }

                if (columnChar != '.' && !columnChars.add(columnChar)) {
                    return false;
                }
            }
        }
        for (int k = 0; k < 9; k += 3) {
            for (int m = 0; m < 9; m += 3) {
                Set<Character> subBoxes = new HashSet<>();
                for (int i = k; i < 3 + k; i++) {
                    for (int j = m; j < 3 + m; j++) {
                        char c = board[i][j];
                        if (c != '.' && !subBoxes.add(c)) {
                            return false;
                        }
                    }
                }
            }
        }
        return validSudoku;
    }

    public static void main(String[] args) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            Set<Character> lineChars = new HashSet<>();
            Set<Character> columnChars = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                char lineChar = board[i][j];
                char columnChar = board[j][i];
                if (lineChar != '.' && !lineChars.add(lineChar)) {
                    res = false;
                    break;
                }

                if (columnChar != '.' && !columnChars.add(columnChar)) {
                    res = false;
                    break;
                }
            }
        }

        for (int k = 0; k < 9; k += 3) {
            for (int m = 0; m < 9; m += 3) {
                Set<Character> subBoxes = new HashSet<>();
                for (int i = k; i < 3 + k; i++) {
                    for (int j = m; j < 3 + m; j++) {
                        char c = board[i][j];
                        if (c != '.' && !subBoxes.add(c)) {
                            res = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}

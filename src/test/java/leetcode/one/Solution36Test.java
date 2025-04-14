package leetcode.one;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    private static final String[][] sudokuArr = {
            {"5", "3", ".", ".", "7", ".", ".", ".", "."},
            {"6", ".", ".", "1", "9", "5", ".", ".", "."},
            {".", "9", "8", ".", ".", ".", ".", "6", "."},
            {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
            {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
            {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
            {".", "6", ".", ".", ".", ".", "2", "8", "."},
            {".", ".", ".", "4", "1", "9", ".", ".", "5"},
            {".", ".", ".", ".", "8", ".", ".", "7", "9"}
    };

    private static final String[][] sudokuArr2 = {
            {"8", "3", ".", ".", "7", ".", ".", ".", "."}
            , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
            , {".", "9", "8", ".", ".", ".", ".", "6", "."}
            , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
            , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
            , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
            , {".", "6", ".", ".", ".", ".", "2", "8", "."}
            , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
            , {".", ".", ".", ".", "8", ".", ".", "7", "9"}
    };

    @Test
    void isSudokuValid() {
        assertTrue(areAllLinesValid(sudokuArr));
        assertTrue(areAllColumnsValid(sudokuArr));
        assertTrue(arrAllSudokuSellsValid(sudokuArr));
    }

    @Test
    void isSudokuValid2() {
        assertFalse(areAllColumnsValid(sudokuArr2));
        assertFalse(arrAllSudokuSellsValid(sudokuArr2));
    }

    private boolean arrAllSudokuSellsValid(String[][] sudokuArr) {
        Set<Character> lines = new HashSet<>();
        Boolean result = true;
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                //System.out.println("i: " + i + " j:" + j);
                lines.clear();
                result = checkPartOfSells(sudokuArr, lines, i, j);
                if (result == null) return false;
            }
            System.out.println();
        }
        return result;
    }

    private static Boolean checkPartOfSells(String[][] sudokuArr, Set<Character> lines, int indexRow, int indexColumn) {
        boolean result = true;
        for (int i = indexRow; i < indexRow + 3; i++) {
            for (int j = indexColumn; j < indexColumn + 3; j++) {
                char cellRow = sudokuArr[j][i].charAt(0);
                if (cellRow != '.') {
                    boolean isAdded = lines.add(cellRow);
                    if (!isAdded) {
                        return null;
                    }
                }
            }
        }
        return result;
    }

    private boolean areAllLinesValid(String[][] sudokuArr) {
        Set<Character> lines = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < sudokuArr.length; i++) {
            for (int j = 0; j < sudokuArr.length; j++) {
                char cellRow = sudokuArr[i][j].charAt(0);
                if (cellRow != '.') {
                    boolean isAdded = lines.add(cellRow);
                    if (!isAdded) {
                        return false;
                    }
                }
            }
            lines.clear();
        }
        return result;
    }

    private boolean areAllColumnsValid(String[][] sudokuArr) {
        Set<Character> lines = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < sudokuArr.length; i++) {
            for (int j = 0; j < sudokuArr.length; j++) {
                char cellRow = sudokuArr[j][i].charAt(0);
                if (cellRow != '.') {
                    boolean isAdded = lines.add(cellRow);
                    if (!isAdded) {
                        //System.out.println("i: " + i + ";" + " j:" + j);
                        return false;
                    }
                }
            }
            lines.clear();
        }
        return result;
    }
}
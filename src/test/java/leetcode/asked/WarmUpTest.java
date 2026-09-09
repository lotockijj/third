package leetcode.asked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class WarmUpTest {

    @Test
    void findFirstNotRepeatable1() {
        assertEquals("b", WarmUp.findFirstNotRepeatable("aabccdeff"));
    }

    @Test
    void findFirstNotRepeatable2() {
        assertEquals("d", WarmUp.findFirstNotRepeatable("aabbccdeff"));
    }

    @Test
    void findFirstNotRepeatable() {
        assertEquals("d", WarmUp.findFirstNotRepeatable("aabbccdef"));
    }

    @Test
    void findFirstNotRepeatable3() {
        assertNull(WarmUp.findFirstNotRepeatable("aaa"));
    }

    @Test
    void findFirstNotRepeatable4() {
        assertEquals("b", WarmUp.findFirstNotRepeatable("aaaaaab"));
    }

    @Test
    void findNumbersThatSumTarget1() {
        int[] numbersThatSumTarget = WarmUp.findNumbersThatSumTarget(new int[]{2, 7, 11, 15}, 9);

        assertEquals(0, numbersThatSumTarget[0]);
        assertEquals(1, numbersThatSumTarget[1]);
    }

    @Test
    void findNumbersThatSumTarget2() {
        int[] numbersThatSumTarget = WarmUp.findNumbersThatSumTarget(new int[]{2, 7, 11, 15}, 1);

        assertNull(numbersThatSumTarget);
    }

    @Test
    void findNumbersThatSumTarget3() {
        int[] numbersThatSumTarget = WarmUp.findNumbersThatSumTarget(new int[]{2, 7, 11, 15}, 16);

        assertNull(numbersThatSumTarget);
    }

    @Test
    void findNumbersThatSumTarget4() {
        int[] numbersThatSumTarget = WarmUp.findNumbersThatSumTarget(new int[]{2, 7, 11, 1500}, 1511);

        assertEquals(2, numbersThatSumTarget[0]);
        assertEquals(3, numbersThatSumTarget[1]);
    }

    @Test
    void areParenthesesValid1(){
        Assertions.assertTrue(WarmUp.areParenthesesValid("()[]{}"));
    }

    @Test
    void areParenthesesValid2(){
        Assertions.assertFalse(WarmUp.areParenthesesValid("([]{}"));
    }

    @Test
    void areParenthesesValid3(){
        Assertions.assertTrue(WarmUp.areParenthesesValid("([]{})"));
    }

    @Test
    void areParenthesesValid4(){
        Assertions.assertTrue(WarmUp.areParenthesesValid("((([]{})))"));
    }

    @Test
    void areParenthesesValid5(){
        Assertions.assertTrue(WarmUp.areParenthesesValid("((([][][]{}{})))"));
    }

    @Test
    void areParenthesesValid6(){
        Assertions.assertFalse(WarmUp.areParenthesesValid("([)]"));
    }

    @Test
    void removeDuplicates1(){
        int[] ints = WarmUp.removeDuplicates(new int[]{1, 1, 1, 2, 3, 4, 5});
        for (int i = 0; i < 5; i++) {
            assertEquals(i + 1, ints[i]);
        }
    }

    @Test
    void removeDuplicates2(){
        int[] ints = WarmUp.removeDuplicates(new int[]{1, 1, 1, 2, 3, 4, 5, 5});
        assertEquals(5, ints.length);
        for (int i = 0; i < 5; i++) {
            assertEquals(i + 1, ints[i]);
        }
    }

    @Test
    void removeDuplicates3(){
        int[] ints = WarmUp.removeDuplicates(new int[]{1, 2, 3, 4, 5});
        assertEquals(5, ints.length);
        for (int i = 0; i < 5; i++) {
            assertEquals(i + 1, ints[i]);
        }
    }

    @Test
    void fibonacci(){
        assertEquals(8, WarmUp.fibonacci(6));
        assertEquals(13, WarmUp.fibonacci(7));
        assertEquals(34, WarmUp.fibonacci(9));
        assertEquals(987, WarmUp.fibonacci(16));
    }
}
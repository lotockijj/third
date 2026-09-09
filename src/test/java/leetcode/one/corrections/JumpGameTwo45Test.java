package leetcode.one.corrections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameTwo45Test {

    private JumpGameTwo45 jumpGame;

    @BeforeEach
    void setUp() {
        jumpGame = new JumpGameTwo45();
    }

    @Test
    void jump1() {
        int[] arr = {2, 3, 1, 1, 4};

        int jump = jumpGame.jump(arr);

        assertEquals(2, jump);
    }

    @Test
    void jump2() {
        int[] arr = {2, 3, 0, 1, 4};

        int jump = jumpGame.jump(arr);

        assertEquals(2, jump);
    }

    @Test
    void jump3() {
        int[] arr = {0};

        int jump = jumpGame.jump(arr);

        assertEquals(0, jump);
    }

    @Test
    void jump4() {
        int[] arr = {1};

        int jump = jumpGame.jump(arr);

        assertEquals(0, jump);
    }

    @Test
    void jump5() {
        int[] arr = {1, 2};

        int jump = jumpGame.jump(arr);

        assertEquals(1, jump);
    }

    //1,1,1,1 java.lang.StackOverflowError after 32 / 110 testcases passed
    @Test
    void jump6() {
        int[] arr = {1, 1, 1, 1};

        int jump = jumpGame.jump(arr);

        assertEquals(3, jump);
    }

    //1,2,0,1
    @Test
    void jump7() {
        int[] arr = {1, 2, 0, 1};

        int jump = jumpGame.jump(arr);

        assertEquals(2, jump);
    }

    @Test
    void jump8() {
        int[] arr = {2, 1};

        int jump = jumpGame.jump(arr);

        assertEquals(1, jump);
    }

    @Test
    void jump9() {
        int[] arr = {1, 1, 2, 1, 1};

        int jump = jumpGame.jump(arr);

        assertEquals(3, jump);
    }
}
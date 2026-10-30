package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution71Test {

    private Solution71 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution71();
    }

    @Test
    void simplifyPath1() {
        assertEquals("/", unit.simplifyPath("/"));
        assertEquals("/home", unit.simplifyPath("/home/"));
        assertEquals("/home/foo", unit.simplifyPath("/home//foo/"));
        assertEquals("/home/user/Pictures", unit.simplifyPath("/home/user/Documents/../Pictures"));
        assertEquals("/", unit.simplifyPath("/../"));
        assertEquals("/.../b/d", unit.simplifyPath("/.../a/../b/c/../d/./"));
    }

    //5 / 265 testcases passed
    @Test
    void simplifyPath2() {
        assertEquals("/c", unit.simplifyPath("/a/./b/../../c/"));
        //7 / 265 testcases passed
        assertEquals("/a/b/c", unit.simplifyPath("/a//b////c/d//././/.."));
        //11 / 265 testcases passed
        assertEquals("/", unit.simplifyPath("/./"));
    }

    //202 / 265 testcases passed
    @Test
    void simplifyPath3() {
        assertEquals("/...", unit.simplifyPath("/.../"));
    }

    //203 / 265 testcases passed
    @Test
    void simplifyPath4() {
        assertEquals("/..hidden", unit.simplifyPath("/..hidden"));
    }

    //207 / 265 testcases passed
    @Test
    void simplifyPath5() {
        assertEquals("/hello../world", unit.simplifyPath("/hello../world"));
    }

    //208 / 265 testcases passed
    @Test
    void simplifyPath6() {
        assertEquals("/is/here", unit.simplifyPath("/home/of/foo/../../bar/../../is/./here/."));
    }
}
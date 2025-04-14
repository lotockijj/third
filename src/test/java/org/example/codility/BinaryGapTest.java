package org.example.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void findBinaryGap1() {
        int binaryGap = BinaryGap.findBinaryGap(9);

        assertEquals(2, binaryGap);
    }

    @Test
    void findBinaryGap2() {
        int binaryGap = BinaryGap.findBinaryGap(529);

        assertEquals(4, binaryGap);
    }

    @Test
    void findBinaryGap3() {
        int binaryGap = BinaryGap.findBinaryGap(20);

        assertEquals(1, binaryGap);
    }

    @Test
    void findBinaryGap4() {
        int binaryGap = BinaryGap.findBinaryGap(32);

        assertEquals(0, binaryGap);
    }
}
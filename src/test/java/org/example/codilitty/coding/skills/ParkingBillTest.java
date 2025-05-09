package org.example.codilitty.coding.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingBillTest {

    private ParkingBill parkingBill;

    @BeforeEach
    void setUp() {
        parkingBill = new ParkingBill();
    }

    @Test
    void solution1() {
        String entranceTime = "10:00";
        String leavingTime = "13:21";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(17, result);
    }

    @Test
    void solution2() {
        String entranceTime = "10:00";
        String leavingTime = "13:00";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(13, result);
    }

    @Test
    void solution3() {
        String entranceTime = "10:00";
        String leavingTime = "12:01";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(13, result);
    }

    @Test
    void solution4() {
        String entranceTime = "00:00";
        String leavingTime = "00:01";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(5, result);
    }

    @Test
    void solution5() {
        String entranceTime = "01:00";
        String leavingTime = "02:01";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(9, result);
    }

    @Test
    void solution6() {
        String entranceTime = "00:00";
        String leavingTime = "00:00";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(0, result);
    }

    @Test
    void solution7() {
        String entranceTime = "00:11";
        String leavingTime = "12:10";

        int result = parkingBill.solution(entranceTime, leavingTime);

        assertEquals(49, result);
    }
}
package com.hrchallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class HourglassesTest {

    private Hourglasses testHourglasses = new Hourglasses();

    @Test
    public void hourglass1(){
        int [][] test2DArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = 19;
        int hourglassesSum = testHourglasses.hourglassSum(test2DArray);
        assertEquals(result, hourglassesSum);
    }

    @Test
    public void hourglass2(){
        int [][] test2DArray = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = 28;
        int hourglassesSum = testHourglasses.hourglassSum(test2DArray);
        assertEquals(result, hourglassesSum);
    }
}

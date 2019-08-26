package com.hrchallenges;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValleysTest {

    private Valleys testValleys = new Valleys();

    @Test
    public void testCountingOneValley(){
        int countValleys = testValleys.countingValleys(8, "UDDDUDUU");
        assertEquals(1,countValleys);
    }

    @Test
    public void testCountingOneValley2(){
        int countValleys = testValleys.countingValleys(8, "DDUUUUDD");
        assertEquals(1,countValleys);
    }
}

package com.hrchallenges;
import org.junit.Test;

import static org.junit.Assert.*;

public class CloudTest {

    private Clouds testClouds = new Clouds();

    @Test
    public void testjumpingOnCloudsThreeStepsOddClouds(){
        int [] input = {0, 1,0, 0, 0,1,0};
        int steps = testClouds.jumpingOnClouds(input);
        assertEquals(3, steps);
    }

    @Test
    public void testjumpingOnCloudsFourSteps(){
        int [] input = {0, 0, 1,0, 0, 1,0};
        int steps = testClouds.jumpingOnClouds(input);
        assertEquals(4, steps);
    }

    @Test
    public void testjumpingOnCloudsThreeStepsEvenClouds(){
        int [] input = {0, 0, 0, 1,0, 0};
        int steps = testClouds.jumpingOnClouds(input);
        assertEquals(3, steps);
    }
}

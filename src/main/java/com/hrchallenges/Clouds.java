package com.hrchallenges;

public class Clouds {

    public int jumpingOnClouds(int[] c){
        int steps = 0;
        for(int cloud = 0; cloud< c.length -1; cloud++) {
            if (cloud + 2 >= c.length) {
                steps++;
                break;
            } else {
                int twoSteps = c[cloud + 2];
                if (twoSteps == 0) {
                    cloud++;
                }
                steps++;
            }
        }
        return steps;
    }
}

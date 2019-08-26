package com.hrchallenges;

public class Valleys {

    private final static char UP = 'U';
    private final static char DOWN = 'D';

    public int countingValleys(int n, String s) {
        int valleys = 0;
        int seaLevel = 0;
        for(char currentStep :s.toCharArray()){
            if (UP == currentStep){
                seaLevel++;
                if(seaLevel ==0){
                    valleys++;
                }
            } else if(DOWN == currentStep){
                seaLevel--;
            }
        }
        return valleys;
    }
}

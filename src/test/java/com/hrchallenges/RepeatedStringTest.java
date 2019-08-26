package com.hrchallenges;
import org.junit.Test;

import static org.junit.Assert.*;


public class RepeatedStringTest {

    private RepeatedString testRepeatedString = new RepeatedString();
    @Test
    public void threeLettersTenLength(){
        String input = "aba";
        long count = 10l;
        int result = 7;
        long occurences = testRepeatedString.repeatedString(input, count);
        assertEquals(result, occurences);
    }

    @Test
    public void oneLettersBigLength(){
        String input = "a";
        long count = 1000000000l;
        long result = 1000000000l;
        long occurences = testRepeatedString.repeatedString(input, count);
        assertEquals(result, occurences);
    }
}

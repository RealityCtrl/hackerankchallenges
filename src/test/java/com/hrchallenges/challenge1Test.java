package com.hrchallenges;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import java.util.List;

public class challenge1Test {

    challenge1 myChallenge;

    @Before
    public void setup(){
        myChallenge = new challenge1();
    }

    @Test
    public void testChallenge1FindNumFalse(){
        Integer arr[] = {1,2,4,5,6};
        List<Integer> arr1 =  Arrays.asList(arr);
        int numberToFind = 3;
        String result = myChallenge.findNumber(arr1, numberToFind);
        assertEquals("NO", result);
    }

    @Test
    public void testChallenge1FindNumTrue(){
        Integer arr[] = {1,2,4,5,6};
        List<Integer> arr1 =  Arrays.asList(arr);
        int numberToFind = 4;
        String result = myChallenge.findNumber(arr1, numberToFind);
        assertEquals("YES", result);
    }

    @Test
    public void testoddNumbers(){
        int start = 2;
        int end = 5;
        Integer arr[] = {3,5};
        List<Integer> expected = Arrays.asList(arr);
        List<Integer> result = myChallenge.oddNumbers(start, end);
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testoddNumbers2(){
        int start = 3;
        int end = 9;
        Integer arr[] = {3,5,7,9};
        List<Integer> expected = Arrays.asList(arr);
        List<Integer> result = myChallenge.oddNumbers(start, end);
        assertTrue(result.containsAll(expected));
    }
}

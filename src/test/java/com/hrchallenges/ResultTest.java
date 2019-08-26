package com.hrchallenges;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ResultTest {

    @Test
    public void test1(){
        Integer arr[] = {4,4,9,2,3};
        List<Integer> arr1 =  Arrays.asList(arr);
        long result = Result.calculateAmount(arr1);
        assertEquals(10, result);
    }

}

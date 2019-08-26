package com.hrchallenges;

import java.util.*;

import static java.util.stream.Collectors.joining;


public class Result {

    /*
     * Complete the 'calculateAmount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY prices as parameter.
     */

    public static long calculateAmount(List<Integer> prices) {
        int minPrice = 0;
        long costItems = 0;
        for(int price: prices){
            minPrice = Math.min(price,minPrice);
            costItems += price - minPrice;
            if(minPrice == 0){
                minPrice = price;
            }
        }
        return  costItems;
    }
}

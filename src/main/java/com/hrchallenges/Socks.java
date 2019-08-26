package com.hrchallenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Socks {

    public int sockMerchant(int n, int[] ar){
        Arrays.sort(ar);
        int pairs = 0;
        for (int currentIndex = 0;currentIndex < ar.length-1;currentIndex++ ){
            int currentColour = ar[currentIndex];
            int nextIndex = currentIndex +1;
            int nextColour = ar[nextIndex];
            if (currentColour % nextColour == 0){
                pairs++;
                currentIndex++;
            }
        }
        return pairs;
    }

    public int sockMerchant2(int n, int[] ar){
        int pairs = 0;
        Set<Integer> mySet = new HashSet<>();
        for(int currentValue : ar) {
            if(mySet.contains(currentValue)){
                pairs++;
                mySet.remove(currentValue);
            }else {
                mySet.add(currentValue);
            }
        }
        return pairs;
    }

    public int sockMerchant3(int n, int[] ar){
        int increment = 1;
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int currentValue : ar) {
            myMap.merge(currentValue, 1, (oldValue, count) -> oldValue+1);
        }
        int pairs = 0;
        for(int count: myMap.values()){
            pairs = pairs + count / 2;
        }
        return pairs;
    }


}

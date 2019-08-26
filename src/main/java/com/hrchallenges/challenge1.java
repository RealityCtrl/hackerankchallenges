package com.hrchallenges;

import java.util.ArrayList;
import java.util.List;

public class challenge1 {

    public String findNumber(List<Integer> numbers, int numberToFind){
        if(numbers.contains(numberToFind)){
            return "YES";
        }else{
            return "NO";
        }
    }

    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumber = new ArrayList<>();
        for(int i =l; i<=r;i++){
            if(i %2 != 0){
                oddNumber.add(i);
            }
        }
        return oddNumber;
    }
}

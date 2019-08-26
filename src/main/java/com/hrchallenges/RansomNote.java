package com.hrchallenges;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class RansomNote {

    public boolean checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magazineWords = Arrays.stream(magazine).collect(groupingBy(Function.identity(), counting()));
        boolean found = true;
        for(String ransomWord : note){
            if(null == magazineWords.
                    computeIfPresent(ransomWord, (key, count) -> {
                        if (count > 0) {
                            return --count;
                        } else {
                            return null;
                        }
                    })
            )
            {
                found = false;
                break;
            }
        }
        return found;
    }
}

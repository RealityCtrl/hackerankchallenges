package com.hrchallenges;

import java.util.Arrays;

public class RepeatedString {

    private final static String desiredCharacter = "a";

    public long repeatedString(String s, long n) {
        long occurencesInString = Arrays.stream(s.split("")).filter(str -> str.equals(desiredCharacter)).count();
        if(occurencesInString == 0){
            return 0;
        }else {
            long occursWholeString = (n / s.length()) * occurencesInString;
            long subStringCovered = n % s.length();
            long partial = Arrays.stream(s.substring(0, (int)subStringCovered).split("")).filter(str -> str.equals(desiredCharacter)).count();
            long occurs = occursWholeString + partial;
            return occurs;
        }
    }
}

package com.hrchallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class RansomNoteTest {

    private RansomNote testRansomNote = new RansomNote();

    @Test
    public void test1(){
        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");
        boolean matches = testRansomNote.checkMagazine(magazine, note);
        assertTrue(matches);
    }

    @Test
    public void test2(){
        String[] magazine = "two times three is not four".split(" ");
        String[] note = "two times two is four".split(" ");
        boolean matches = testRansomNote.checkMagazine(magazine, note);
        assertFalse(matches);
    }

    @Test
    public void test3(){
        String[] magazine = "ive got a lovely bunch of coconuts".split(" ");
        String[] note = "ive got some coconuts".split(" ");
        boolean matches = testRansomNote.checkMagazine(magazine, note);
        assertFalse(matches);
    }
}

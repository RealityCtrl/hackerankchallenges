package com.hrchallenges;
import java.util.*;

public class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        int result = -1;
        if(a.score < b.score){
            result = 1;
        }else if(a.score > b.score){
            result = -1;
        }else{
            result =  b.name.compareToIgnoreCase(a.name);
        }
        return result;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


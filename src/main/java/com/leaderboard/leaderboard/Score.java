package com.leaderboard.leaderboard;

import org.springframework.data.annotation.Id;



public class Score {
    @Id
    private final int id;
    
    public Score(int id) {
        this.id = id;
    }
}

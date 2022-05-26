package com.leaderboard.leaderboard;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("score")
public class Score {
    @Id
    private final int id;
    
    public Score(int id) {
        this.id = id;
    }
}

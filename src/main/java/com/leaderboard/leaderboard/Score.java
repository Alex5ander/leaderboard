package com.leaderboard.leaderboard;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("score")
public class Score {
    @Id;
    private String id;
    public Score(String id) {
        this.id = id;
    }
}

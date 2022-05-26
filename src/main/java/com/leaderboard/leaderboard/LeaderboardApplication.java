package com.leaderboard.leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaderboardApplication {

    @Autowired
    static ScoreRepository ScoreItem;
    public static void main(String[] args) {
        SpringApplication.run(LeaderboardApplication.class, args);
    }
}

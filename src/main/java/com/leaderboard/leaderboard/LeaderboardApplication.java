package com.leaderboard.leaderboard;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaderboardApplication {

        @Autowired
        static ScoreRepository ScoreItem;
        public List<Score> findAll;
	public static void main(String[] args) {
            
            SpringApplication.run(LeaderboardApplication.class, args);
	}

}

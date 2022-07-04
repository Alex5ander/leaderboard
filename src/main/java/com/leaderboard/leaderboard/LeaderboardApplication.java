package com.leaderboard.leaderboard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class LeaderboardApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LeaderboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}

package com.leaderboard.leaderboard;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Player {
  public int score = 0;
  public Player() {
      
  }
  public Player(int score) {
      this.score = score;
  }
}

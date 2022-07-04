/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leaderboard.leaderboard;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
public class LeaderBoardController {
    @Autowired
    PlayerRepository Item;
    
    @GetMapping("/")
    public List<Player> get() {
        List<Player> list = Item.findAll();
        return list;
    }
    
    @GetMapping("/update")
    public String update(@RequestParam(name = "count") String c) {
        Player p = new Player(Integer.parseInt(c));
        Item.insert(p);
        return "teste";
    } 
}

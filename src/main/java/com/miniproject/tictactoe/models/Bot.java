package com.miniproject.tictactoe.models;

public class Bot extends Player{
    private BotsLevel level;
    public Bot(String name, Character symbol){
        super(name,symbol);
        this.level = level;
    }

}

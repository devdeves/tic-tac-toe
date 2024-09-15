package com.miniproject.tictactoe.models;

public class Player {
    private String name;
    protected Character symbol;
    public Player(String name ,Character symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }
}

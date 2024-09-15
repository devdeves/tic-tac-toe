package com.miniproject.tictactoe.controller;

import com.miniproject.tictactoe.exceptions.InvalidGameConstructionException;
import com.miniproject.tictactoe.models.Game;
import com.miniproject.tictactoe.models.GameStatus;
import com.miniproject.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.List;


public class GameController {
    public Game createGame(List<Player> players) throws InvalidGameConstructionException {
        return  Game.getBuilder()
                     .setPlayers(players)
                     .setGameStatus(GameStatus.IN_PROGRESS)
                     .setMoves(new ArrayList<>())
                     .setCurrPlayerIndex(0)
                     .build();
    }



    public void makeMove(){

    }
    public GameStatus getGameStatus(){
        return null;
    }
    public void undo(){
    }
    public void exitGame(){
    }
}

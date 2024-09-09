package com.miniproject.tictactoe.models;

import com.miniproject.tictactoe.exceptions.InvalidGameConstructionException;
import com.miniproject.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class Game {

//    private List<Player> players;
//    private Board board;
//    private GameStatus gameStatus;
//    private int currPlayerIndex;
//    private List<Move> moves;
//    private WinningStrategy strategy;

//    public Game(GameBuilder builder){
//        this.players = builder.players;
//        this.board = builder.board;
//        this.gameStatus = builder.gameStatus;
//        this.currPlayerIndex = builder.currPlayerIndex;
//        this.moves = builder.moves;
//        this.strategy = new OrderNWinningStrategy();
//    }

    private List<Player> players;
    private Board Board;
    private GameStatus gameStatus;
    private int currPlayerIndex;
    private List<Move> moves;
//    private WinningStrategy strategy;

    public Game(GameBuilder builder){
        this.players = builder.players;
        this.board = builder.board;
        this.gameStatus = builder.gameStatus;
        this.currPlayerIndex = builder.currPlayerIndex;
        this.moves = builder.moves;
       // this.strategy = new OrderNWinningStrategy();
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }
    static class GameBuilder{
        private List<Player> players;
        private Board boards;
        private GameStatus gameStatus;
        private int currPlayerIndex;
        private List<Move> moves;

    public GameBuilder setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }

    public GameBuilder setBoards(com.miniproject.tictactoe.models.Board boards) {
        this.boards = boards;
        return this;
    }

    public GameBuilder setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
        return this;
    }

    public GameBuilder setCurrPlayerIndex(int currPlayerIndex) {
        this.currPlayerIndex = currPlayerIndex;
        return this;
    }

    public GameBuilder setMoves(List<Move> moves) {
        this.moves = moves;
        return this;
    }

    // Build Game Obj //

        public Game build() throws InvalidGameConstructionException{
            if(this.boards == null){
                throw new InvalidGameConstructionException("Board Could not be Empty");
            }
            if(this.players == null || this.players.size() <= 1){
                throw new InvalidGameConstructionException("Atleast two Player required");
            }
            return new Game(this);
        }


}
}

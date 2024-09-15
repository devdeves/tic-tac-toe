package com.miniproject.tictactoe.models;

import com.miniproject.tictactoe.exceptions.InvalidGameConstructionException;
import com.miniproject.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class Game {

    private List<Player> players;
    private Board board;
    private GameStatus gameStatus;
    private int currPlayerIndex;
    private List<Move> moves;
//    private WinningStrategy strategy;

    // Here setting constructor with help of builder //
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

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getCurrPlayerIndex() {
        return currPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public static class GameBuilder{
        private List<Player> players;
        private Board board ;
        private GameStatus gameStatus;
        private int currPlayerIndex;
        private List<Move> moves;

        // 'GameBuilder' in every function because using this chain the constructer //

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
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
            this.board  = new Board(this.players.size()+1);

            if(this.board == null){
                throw new InvalidGameConstructionException("Board Could not be Empty");
            }
            if(this.players == null || this.players.size() <= 1){
                throw new InvalidGameConstructionException("Atleast two Player required");
            }
            // From here intilise board values //
            return new Game(this);
        }


}
}

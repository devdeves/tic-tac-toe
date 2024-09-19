package com.miniproject.tictactoe.strategies;

import com.miniproject.tictactoe.models.Board;
import com.miniproject.tictactoe.models.Move;

public interface WinningStartegy {
    public interface WinningStrategy {
        boolean checkIfWon(Board board, Move move);
    }
}

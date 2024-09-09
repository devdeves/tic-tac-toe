package com.miniproject.tictactoe.exceptions;

public class InvalidGameConstructionException extends Exception {
    public InvalidGameConstructionException() {
    }

    public InvalidGameConstructionException(String message) {
        super(message);
    }
}

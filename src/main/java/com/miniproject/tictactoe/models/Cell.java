package com.miniproject.tictactoe.models;

public class Cell {
//    private int row;
//    private int col;
//    private Player player;
//    private CellState cellState;
//
//    public Cell(int row, int col, CellState cellState){
//        this.row = row;
//        this.col = col;
//        this.cellState = cellState;
//        this.player = null;
//    }

    private  int row;
    private int col;
    private Player players;
    private CellState cellState;

    public Cell(int row, int col, CellState cellState){
        this.row = row;
        this.col = col;
        this.cellState = cellState;
        this.players = null;
    }

}

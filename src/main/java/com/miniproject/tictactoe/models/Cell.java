package com.miniproject.tictactoe.models;

public class Cell {
    public CellState getCellState;

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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayers() {
        return players;
    }

    public Cell setPlayers(Player players) {
        this.players = players;
        this.cellState = CellState.OCCUPIED;
        return this;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}

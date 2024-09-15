package com.miniproject.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    public Board(int dimension){
        cells = new ArrayList<>();
        for(int i=0 ; i<dimension ; i++){
            ArrayList<Cell>row = new ArrayList<>();
            for(int j=0; j<dimension ;j++){
                row.add(new Cell(i,j,CellState.EMPTY));
            }
        }
    }
}

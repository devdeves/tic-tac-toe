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

    public void displayBoard(){
        // TO do need to fix here //
        //cells = 0 //
        for(int i=0 ; i<cells.size() ; i++){
            System.out.println("|");
            for(int j=0; j<cells.size() ;j++){
                Cell cell = cells.get(i).get(j);
                if(cell.getCellState.equals(CellState.EMPTY)){
                   System.out.println(" _ ");
                }else{
                    System.out.println(" " + cell.getPlayers().getSymbol() + " ");
                };
            }
            System.out.println("|");
        }
    }
}

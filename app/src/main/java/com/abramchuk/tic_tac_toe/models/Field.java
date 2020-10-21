package com.abramchuk.tic_tac_toe.models;

public class Field {
    private Node[][] field;
    private final int size;
    private boolean isComplete;
    private boolean crossTurn;

    public Field(int size){
        this.size = size;
        field = new Node[size][size];
        isComplete = false;
        crossTurn = true;
    }

    public void MakeStep(int x, int y){
        Node tempNode = this.field[x][y];
        if(tempNode.isActive() && tempNode.isFree()){
            if(crossTurn)
                tempNode.setFigure(Figure.CROSS);
            else  tempNode.setFigure(Figure.NOUGHT);
            this.crossTurn=!crossTurn;
        }
    }

}

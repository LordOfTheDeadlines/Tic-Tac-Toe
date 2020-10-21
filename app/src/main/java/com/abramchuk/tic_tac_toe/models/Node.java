package com.abramchuk.tic_tac_toe.models;

public class Node {
    private boolean isActive;//пользователь нажал на ячейку
    private boolean isFree;//ячейка пуста
    private Figure figure;

    public Node(){
        isActive = false;
        isFree = true;
        figure = null;
    }

    public void setFigure(Figure figure) {
        this.isFree=false;
        this.figure = figure;
    }

    public Figure getFigure(){
        return figure;
    }

    public void setActive(boolean act){
        isActive = act;
    }

    public boolean isActive(){
        return isActive;
    }

    public void setFree(boolean fr){
        isFree = fr;
    }

    public boolean isFree(){
        return isFree;
    }
}

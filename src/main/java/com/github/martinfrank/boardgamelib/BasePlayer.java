package com.github.martinfrank.boardgamelib;

public class BasePlayer<G extends BoardGame<?>> implements Player<G>{

    private final String name;
    private final int color;
    private final boolean isHuman; //human player or ai player
    private G boardGame;
    
    public BasePlayer(String name, int color, boolean isHuman) {
        this.name = name;
        this.color = color;
        this.isHuman = isHuman;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void performAiTurn() {
        //this method is empty to provide an implementation of the abstract methode.
        //not every board game needs an Ai
    }

    @Override
    public void setGame(G boardGame) {
        this.boardGame = boardGame;
    }

    @Override
    public G getBoardGame() {
        return boardGame;
    }

    @Override
    public boolean isHuman() {
        return isHuman;
    }

    @Override
    public boolean isAi() {
        return !isHuman;
    }
}

package de.elite.games.boardgamelib;

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

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public void performAiTurn() {
    }

    public void setGame(G boardGame) {
        this.boardGame = boardGame;
    }

    public G getBoardGame() {
        return boardGame;
    }

    public boolean isHuman() {
        return isHuman;
    }

}

package de.elite.games.boardgamelib;

public interface Player<G extends BoardGame<?>> {

    String getName();

    int getColor();

    void performAiTurn();

    void setGame(G boardGame);

    G getBoardGame();

    boolean isHuman();
}

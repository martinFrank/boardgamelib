package com.github.martinfrank.boardgamelib;

public interface Player<G extends BoardGame<?>> {

    String getName();

    int getColor();

    void performAiTurn();

    void setGame(G boardGame);

    G getBoardGame();

    boolean isHuman();

    boolean isAi();
}

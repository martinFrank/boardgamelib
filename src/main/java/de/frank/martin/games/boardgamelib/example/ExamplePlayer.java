package de.frank.martin.games.boardgamelib.example;

import de.frank.martin.games.boardgamelib.BasePlayer;

public class ExamplePlayer extends BasePlayer<ExampleGame> {

    private int currentPoints;

    public ExamplePlayer(String name, int color, boolean isHuman) {
        super(name, color, isHuman);
    }

    public void addPoints(int dice) {
        currentPoints = currentPoints + dice;
    }

    public int getPoints() {
        return currentPoints;
    }
}

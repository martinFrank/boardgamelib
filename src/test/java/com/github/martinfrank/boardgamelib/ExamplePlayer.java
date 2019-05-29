package com.github.martinfrank.boardgamelib;

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

    @Override
    public void performAiTurn() {
        super.performAiTurn();
        ExampleGame game = getBoardGame();
        game.startPlayersTurn();

        System.out.println("Now it's " + getName() + "'s turn");
        game.dice();
        game.endPlayersTurn();
        System.out.println(getName() + " has now " + getPoints());
    }
}

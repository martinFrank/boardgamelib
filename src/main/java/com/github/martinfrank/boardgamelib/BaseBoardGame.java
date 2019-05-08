package com.github.martinfrank.boardgamelib;

import java.util.List;

public class BaseBoardGame<P extends BasePlayer> implements BoardGame<P>{

    private List<P> players;
    private int currentPlayerIndex;
    private int maximumRounds;
    private int round;

    @Override
    public void setup(BoardGameSetup<P> setup){
        this.players = setup.getPlayers();
        maximumRounds = setup.getMaximumRounds();
        players.forEach(p -> p.setGame(this));
    }

    @Override
    public P getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }

    @Override
    public void endPlayersTurn(){
        currentPlayerIndex = currentPlayerIndex + 1;
        if (currentPlayerIndex > players.size()-1){
            currentPlayerIndex = 0;
            round = round + 1;
        }
    }

    @Override
    public void startPlayersTurn() {
        //this method is empty to provide an implementation of the abstract methode.
        //not every board game needs this methods hence it may be empty
    }

    @Override
    public List<P> getPlayers() {
        return players;
    }

    @Override
    public int getMaximumRounds() {
        return maximumRounds;
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public void initGame() {
        //this method is empty to provide an implementation of the abstract methode.
        //not every board game needs this methods hence it may be empty
    }

}

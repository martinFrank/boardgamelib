package de.frank.martin.games.boardgamelib;

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
    public P getCurrent(){
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

    }

}

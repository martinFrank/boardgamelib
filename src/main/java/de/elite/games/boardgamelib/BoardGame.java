package de.elite.games.boardgamelib;

import java.util.List;

public interface BoardGame<P extends Player> {

    /**
     * load the setup into the game - all information required to play the game
     * should be handled here, e.g. the players,
     * @param setup Data container for setup data
     */
    void setup(BoardGameSetup<P> setup);

    /**
     * @return the current BasePlayer
     */
    P getCurrentPlayer();

    /**
     * @return all Players
     */
    List<P> getPlayers();

    /**
     * this method should be invoked when the player has finished its turn.
     * use either this method or startPlayersTurn to move to the next player
     */
    void endPlayersTurn();

    /**
     * this method should be invoked when the player starts its turn
     * use either this method or startPlayersTurn to move to the next player
     */
    void startPlayersTurn();

    /**
     * @return the limit of rounds
     */
    int getMaximumRounds();

    /**
     * @return the value of the current round counter
     */
    int getRound();

    /**
     * after setup you might want to init the game, maybe shuffle some cards
     */
    void initGame();
}

package com.github.martinfrank.boardgamelib;

import java.util.List;

public interface BoardGameSetup<P extends Player> {

    /**
     * @return the list of all participants of the game
     */
    List<P> getPlayers();

    /**
     * @return the amount of round the game should take
     */
    int getMaximumRounds();
}

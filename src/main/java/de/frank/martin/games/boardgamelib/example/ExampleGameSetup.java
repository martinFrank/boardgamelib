package de.frank.martin.games.boardgamelib.example;

import de.frank.martin.games.boardgamelib.BoardGameSetup;

import java.util.Arrays;
import java.util.List;

public class ExampleGameSetup implements BoardGameSetup<ExamplePlayer> {

    private final List<ExamplePlayer> players;

    public ExampleGameSetup(){
        super();
        players = Arrays.asList(
                new ExamplePlayer("Josh", 0xFF0000, false),
                new ExamplePlayer("Peter", 0x0000FF, false)
        );
    }


    @Override
    public List<ExamplePlayer> getPlayers() {
        return players;
    }

    @Override
    public int getMaximumRounds() {
        //each player may roll thrice
        return 3;
    }
}

package com.github.martinfrank.boardgamelib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleGameSetup implements BoardGameSetup<ExamplePlayer> {

    private final List<ExamplePlayer> players;
    private final ExamplePlayer[] template = new ExamplePlayer[]{
            new ExamplePlayer("Josh", 0xFF0000, false),
            new ExamplePlayer("Peter", 0x0000FF, false),
            new ExamplePlayer("Henry", 0x00FF00, false),

    };

    public ExampleGameSetup(int amountPlayer) {
        super();
        players = new ArrayList<>();
        for (int i = 0; i < amountPlayer; i++) {
            players.add(template[i]);
        }
        Collections.shuffle(players);
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

package com.github.martinfrank.boardgamelib;

import org.junit.Assert;
import org.junit.Test;

public class GameFlowTest {

    @Test
    public void testPosition() {
        ExampleGame game = new ExampleGame();
        ExampleGameSetup setup = new ExampleGameSetup(2);
        game.setup(setup);
        game.initGame();

        game.startPlayersTurn();
        Assert.assertTrue(game.isFirstPlayer());
        Assert.assertFalse(game.isLastPlayer());
        game.endPlayersTurn();
        Assert.assertFalse(game.isFirstPlayer());
        Assert.assertTrue(game.isLastPlayer());
    }
}

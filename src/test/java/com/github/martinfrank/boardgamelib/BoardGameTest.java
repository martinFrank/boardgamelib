package com.github.martinfrank.boardgamelib;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

    @Test
    public void test() {
        ExampleGame game = new ExampleGame();
        ExampleGameSetup setup = new ExampleGameSetup(2);
        game.setup(setup);
        game.initGame();

        //play automated
        for (int round = 0; round < game.getMaximumRounds(); round++) {
            Assert.assertFalse(game.isOver());
            System.out.println("round: " + game.getRound());
            for (int p = 0; p < game.getPlayers().size(); p++) {

                ExamplePlayer player = game.getCurrentPlayer();
                player.performAiTurn();
            }
            System.out.println();
        }
        game.printResults();
        Assert.assertTrue(game.isOver());
    }

}

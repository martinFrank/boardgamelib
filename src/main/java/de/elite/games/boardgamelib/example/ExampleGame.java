package de.elite.games.boardgamelib.example;

import de.elite.games.boardgamelib.BaseBoardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExampleGame extends BaseBoardGame<ExamplePlayer> {

    private final Random random = new Random();

    public void dice() {
        ExamplePlayer examplePlayer = getCurrentPlayer();
        int dice = rollDice();
        examplePlayer.addPoints(dice);
        System.out.println(examplePlayer.getName() + " rolled " + dice);
    }

    public int rollDice() {
        return 1 + random.nextInt(6);
    }

    public void printResults() {
        System.out.println("Result:");
        for (ExamplePlayer player : getPlayers()) {
            System.out.println(player.getName() + " has " + player.getPoints());
        }
        List<ExamplePlayer> winners = getWinners();
        if(winners.size() > 1){
            System.out.print("the winners are: ");
            winners.forEach(p -> System.out.print(p.getName()+" "));
        }else{
            System.out.println("the winners is: "+winners.get(0).getName());
        }
    }

    private List<ExamplePlayer> getWinners() {
        int best = -1;
        List<ExamplePlayer> winner = new ArrayList<>();
        for (ExamplePlayer player : getPlayers()) {
            if (player.getPoints() > best) {
                best = player.getPoints();
                winner.clear();
            }
            if (player.getPoints() == best) {
                winner.add(player);
            }
        }
        return winner;
    }
}

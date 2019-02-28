package de.frank.martin.games.boardgamelib.example;

public class App {

    public static void main (String[] args){
        ExampleGame game = new ExampleGame();
        ExampleGameSetup setup = new ExampleGameSetup();
        game.setup(setup);
        game.initGame();

        //play automated
        for (int round = 0; round < game.getMaximumRounds(); round ++){
            System.out.println("round: "+game.getRound());
            for(int p = 0; p < game.getPlayers().size(); p ++){
                ExamplePlayer player = game.getCurrentPlayer();
                System.out.println("Now it's "+player.getName()+"'s turn");
                game.dice();
                game.endPlayersTurn();
                System.out.println(player.getName()+" has now "+player.getPoints() );
            }
            System.out.println();
        }
        game.printResults();
    }
}

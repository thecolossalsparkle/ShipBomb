import java.util.Scanner;

public class ShipFlow {
    public static void main(String[] args) {
        GameStartMusic gameStartMusic = new GameStartMusic();
        GameEndMusic gameEndMusic = new GameEndMusic();
        SinglePlayerRules rulessp = new SinglePlayerRules();
        MultiPlayerRules rulesmp = new MultiPlayerRules();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" WELCOME! ");
        gameStartMusic.playSound();

        System.out.println("Menu :");
        System.out.println("1.Single Player");
        System.out.println("2.MultiPlayer");
        if(scanner.nextInt()==1)
            rulessp.displayRules();
        else
            rulesmp.displayRules();


//        if(play == 1) {
//            // Its player vs Computer
//            // Computer asks for the player name
                //rulessp.displayRules();
//
//            // Computer clears the screen
//            // Computer displays empty grid and asks for the coordinates
//            // Check if the chances <= 20 and not win yet if yes then
//            // Takes the coordinate and checks if its a hit or a miss
//            // Redraws the grid by playing the music with H or M
//            // if chances > 20 and check win fails tell retry with some sad music
//
//        } else {
//            // Its Player 1 v/s Player 2
//            // It displays a 5 x 5 grid for player 1 and 2
//            // Hey player 1 enter you name and your ship coordinates
//            // Hey player 2 enter you name and your ship coordinates
//            //
//            //
//            //
//            //
//            //
//        }


        gameEndMusic.playSound();
        System.out.println("Thanks for Playing see you next time");
    }
}

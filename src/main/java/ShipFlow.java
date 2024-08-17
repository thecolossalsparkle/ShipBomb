import java.util.ArrayList;
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

        while (true) {
            System.out.println("Menu :");
            System.out.println("1.Single Player");
            System.out.println("2.MultiPlayer");
            int choice = scanner.nextInt();
            boolean restart;

            DrawBoard board = new DrawBoard();


            if (choice == 1) {
            while(true) {
                    rulessp.displayRules();
                    int i = 1;
                    boolean flag = true;
                    System.out.println("WELCOME");
                    System.out.println("Player enter your name");
                    Player player = new Player();
                    String name = scanner.nextLine();
                    player.setName(name);

                    System.out.println("MAY THE WAR BEGIN!!");

                    Computer computer = new Computer();
                    computer.setShips();
                    computer.displayRandomCoord();

                    board.setGrid(computer.getGrid());
                    board.display(computer.getGrid());

                    CheckWin check = new CheckWin();
                    while (i <= 20) {
                        ArrayList<Integer> pair;
                        player.setPair();
                        pair = player.getPair();
                        board.reSetGrid(pair, computer.getShips(), computer.getGrid());
                        board.display(computer.getGrid());
                        i++;
                        pair.clear();
                        if (check.checkWin(computer.getGrid())) {
                            System.out.println("You win!");
                            flag = true;
                            System.out.println("1 - Restart 2 - Exit");
                            if (scanner.nextInt() == 1) {
                                restart = true;
                            } else {
                                break;
                            }

                            if(restart) {
                                continue; //check this
                            }
                        }


                    }
                    if (i > 20 && flag == false) {
                        System.out.println("You lost:/");
                        break;
                    }
                }
            }
            else{
                rulesmp.displayRules();
                while(true) {
                    Player player1 = new Player();
                    Player player2 = new Player();

                    System.out.println("Player 1 enter your name");
                    String name1 = scanner.nextLine();
                    player1.setName(name1);
                    System.out.println( player1.getName() + "Enter your ship locations");
                    player1.setAns();


                    System.out.println("Player 2 enter your name");
                    String name2 = scanner.nextLine();
                    player2.setName(name2);
                    player2.setAns();

                    board.setGrid(player1.getGrid());//fix this
                    board.setGrid(player2.getGrid());
                    board.display(player1.getGrid());

                    CheckWin check = new CheckWin();
                    char[][] player1Grid = new char[11][11];
                    char[][] player2Grid = new char[11][11];
                    int i = 1;
                    while (check.checkWin(player1.getGrid()) == false && check.checkWin(player2.getGrid()) == false) {
                        if(i % 2 == 1) {
                            System.out.println("Player 1, your turn!");
                            player2.setGrid(player2Grid);
                            board.display(player2.getGrid());
                            ArrayList<Integer> pair;
                            player1.setPair();
                            pair = player1.getPair();
                            player2Grid = board.reSetGrid(pair, player2.getAns(), player2.getGrid());
                            board.display(player2Grid);

                        } else {
                            System.out.println("Player 2, your turn!");
                            player1.setGrid(player1Grid);
                            board.display(player1.getGrid());
                            ArrayList<Integer> pair;
                            player2.setPair();
                            pair = player2.getPair();
                            player1Grid = board.reSetGrid(pair, player1.getAns(), player1.getGrid());
                            board.display(player1Grid);
                        }

                        i++;
                    }

                    System.out.println("You win!!");
                    System.out.println("1. Restart 2. Exit");
                    if(scanner.nextInt() == 1) {
                        continue;
                    } else {
                        break;
                    }

                }
            }
        }


    }



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


       // gameEndMusic.playSound();
        //System.out.println("Thanks for Playing see you next time");
    }


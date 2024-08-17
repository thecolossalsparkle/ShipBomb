import java.util.ArrayList;
import java.util.Scanner;

public class ShipFlow {
    public static void main(String[] args) {
        GameStartMusic gameStartMusic = new GameStartMusic();
        GameEndMusic gameEndMusic = new GameEndMusic();
        SadMusic sadMusic = new SadMusic();
        HappyMusic happyMusic = new HappyMusic();
        SinglePlayerRules rulessp = new SinglePlayerRules();
        MultiPlayerRules rulesmp = new MultiPlayerRules();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" WELCOME! ");
        gameStartMusic.playSound();

        while (true) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Menu :");
            System.out.println("1.Single Player");
            System.out.println("2.MultiPlayer");
            System.out.println("--------------------------------------------------------------------------------");
            int choice = scanner.nextInt();
            boolean restart;

            DrawBoard board = new DrawBoard();


            if (choice == 1) {
            while(true) {
                    rulessp.displayRules();
                    int i = 20;
                    boolean flag = false;
                    System.out.println("WELCOME");
                    System.out.println("Player enter your name");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    Player player = new Player();
                    player.setName(name);

                    System.out.println("MAY THE WAR BEGIN!!");

                    Computer computer = new Computer();
                    computer.setShips();
                    computer.displayRandomCoord();

                    board.setGrid(computer.getGrid());
                    board.display(computer.getGrid());

                    CheckWin check = new CheckWin();
                    ArrayList<Integer> pair = new ArrayList<>();
                    while (i != 0) {

                        boolean correct = player.setPair();

                        if(!correct) {
                            i++;
                            pair.clear();
                            continue;
                        } else {
                            pair = player.getPair();
                            board.reSetGrid(pair, computer.getShips(), computer.getGrid());
                            board.display(computer.getGrid());
                            pair.clear();
                            if (check.checkWin(computer.getGrid())) {
                                System.out.println("You win!");
                                happyMusic.playSound();
                                break;
                            }
                            i--;
                            System.out.println("You have " + i + " chances left!");
                            if (i == 0 && flag == false) {
                                System.out.println("You lost:/");
                                sadMusic.playSound();
                                break;
                            }
                        }

                    }

                System.out.println("1 - Restart 2 - Exit");
                if (scanner.nextInt() == 1) {
                    continue;
                } else {
                    break;
                }

                }

            }
            else{
                rulesmp.displayRules();
                while(true) {

                    Player player1 = new Player();
                    Player player2 = new Player();

                    Scanner obj1= new Scanner(System.in);
                    System.out.println("Player 1 enter your name");
                    String name1 = obj1.nextLine();
                    player1.setName(name1);
                    player1.setAns();


                    System.out.println("Player 2 enter your name");
                    Scanner obj2 = new Scanner(System.in);
                    String name2 = obj2.nextLine();
                    player2.setName(name2);
                    player2.setAns();

                    char[][] player1Grid = new char[11][11];
                    char[][] player2Grid = new char[11][11];

                    player1Grid = board.setGrid(player1.getGrid());//fix this
                   player2Grid =  board.setGrid(player2.getGrid());

                    CheckWin check = new CheckWin();
                    boolean correct1 = false;
                    boolean correct2 = false;

                    int i = 1;
                    while (check.checkWin(player1.getGrid()) == false && check.checkWin(player2.getGrid()) == false) {

                        if(i % 2 == 1) {
                            System.out.println();
                            System.out.println();
                            System.out.println(player1.getName() +", your turn!");
                            System.out.println("This is " + player2.getName() +"'s grid:");
                            board.display(player2.getGrid());
                            ArrayList<Integer> pair1 = new ArrayList<>();
                            correct1 = player1.setPair();
                            pair1 = player1.getPair();

                            if(!correct1) {
                                pair1.clear();
                                i--;
                            } else {
                                board.display(board.reSetGrid(pair1, player2.getAns(), player2.getGrid()));
                                pair1.clear();
                            }

                        } else{
                            System.out.println();
                            System.out.println();
                            System.out.println(player2.getName() + ", your turn!");
                            System.out.println("This is " + player1.getName() +"'s grid:");
                            board.display(player1.getGrid());
                            ArrayList<Integer> pair2 = new ArrayList<>();

                            correct2 = player2.setPair();
                            pair2 = player2.getPair();

                            if(!correct2) {
                                pair2.clear();
                                i--;
                            } else {
                                board.display(board.reSetGrid(pair2, player1.getAns(), player1.getGrid()));
                                pair2.clear();
                            }
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
            System.out.println("1.Redirect to Menu 2.Exit");
            if(scanner.nextInt() == 1) {
                continue;
            } else {
                break;
            }
        }


    }

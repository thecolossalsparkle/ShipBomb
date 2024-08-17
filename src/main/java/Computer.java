import java.util.ArrayList;
import java.util.Random;

public class Computer {
    private ArrayList<ArrayList<Integer>>ships= new ArrayList<>(9);
    private char[][]grid = new char[11][11];

    public char[][] getGrid() {
        return grid;
    }

    public void setShips() {
        Random random1 = new Random();
        //ship 1
        int row1 = random1.nextInt(10);
        int col1 = random1.nextInt(8);
        ArrayList<Integer>ship11 = new ArrayList<>();
        ship11.add(row1);
        ship11.add(col1);//{row1, col1}

        int row2 = row1;
        int col2 = col1 + 1;
        ArrayList<Integer>ship12 = new ArrayList<>();
        ship12.add(row2);
        ship12.add(col2);

        int row3 = row1;
        int col3 = col2 + 1;
        ArrayList<Integer>ship13 = new ArrayList<>();
        ship13.add(row3);
        ship13.add(col3);//{row1, col1}

        //ship 2
        ArrayList<Integer>ship21 = new ArrayList<>();

        int row21 = random1.nextInt(10);
        int col21 = random1.nextInt(8);
        ship21.add(row21);
        ship21.add(col21);

        int row22 = row21;
        int col22 = col21 + 1;
        ArrayList<Integer>ship22 = new ArrayList<>();
        ship22.add(row22);
        ship22.add(col22);

        int row23 = row21;
        int col23 = col22 + 1;
        ArrayList<Integer>ship23 = new ArrayList<>();
        ship23.add(row23);
        ship23.add(col23);


        //ship 3
        ArrayList<Integer>ship31 = new ArrayList<>();

        int row31 = random1.nextInt(10);
        int col31 = random1.nextInt(8);
        ship31.add(row31);
        ship31.add(col31);

        int row32 = row31;
        int col32 = col31 + 1;
        ArrayList<Integer>ship32 = new ArrayList<>();
        ship32.add(row32);
        ship32.add(col32);

        int row33 = row31;
        int col33 = col32 + 1;
        ArrayList<Integer>ship33 = new ArrayList<>();
        ship33.add(row33);
        ship33.add(col33);


//adding all the ship coordinates
        ships.add(ship11);
        ships.add(ship12);
        ships.add(ship13);

        ships.add(ship21);
        ships.add(ship22);
        ships.add(ship23);

        ships.add(ship31);
        ships.add(ship32);
        ships.add(ship33);


    }

    public ArrayList<ArrayList<Integer>> getShips() {
        return this.ships;
    }

    public void displayRandomCoord() {

        for(int i = 0; i < ships.size(); i++) {
            for(int j = 0; j < ships.get(i).size(); j++) {
                System.out.print(ships.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }
}

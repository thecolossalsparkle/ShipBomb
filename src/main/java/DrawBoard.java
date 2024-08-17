import java.util.ArrayList;

public class DrawBoard {
    private char[][] grid = new char[11][11];

    public char[][] getGrid() {
        return grid;
    }

    public char[][] setGrid(char[][] grid) {
        for(int i = 0; i < 11; i++) {//default
            for(int j = 0; j < 11; j++) {
                if(i == 0 && j == 0) {
                    grid[i][j] = ' ';
                }

                else if(i == 0) {
                    grid[i][j] = (char)((j-1) + '0');
                }
                else if(j == 0) {
                    grid[i][j] = (char)((i-1) + '0');
                }

                else {
                    grid[i][j] = 'X';
                }

            }
        }
        return grid;

    }

    public void display(char[][] grid) {
        for(int i = 0; i < 11; i++) {//default
            for(int j = 0; j < 11; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char[][] reSetGrid(ArrayList<Integer>pair, ArrayList<ArrayList<Integer>> ans, char[][] grid) {//pair = {1, 1}
        //clear screen
//        ClearScreen obj = new ClearScreen();
//        obj.clearScreen();//fix this

        int row = pair.get(0);
        int col = pair.get(1);
        if(ans.contains(pair)) {
            grid[row+1][col+1] = 'H';
        }
        else {
            grid[row+1][col+1] = 'M';
        }
        return grid;
    }


}

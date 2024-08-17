public class DrawBoard {
    private char[][] grid = new char[11][11];

    // Setting the default values to the grid 'x'
    public void setGrid() {
        for(int i = 0; i < 11; i++) {//default
            for(int j = 0; j < 11; j++) {
                if(i == 0 && j == 0) {
                    grid[i][j] = ' ';
                } else if(i == 0) {
                    grid[i][j] = (char)(j-1 + '0');
                } else if(j == 0) {
                    grid[i][j] = (char)(i-1 + '0');
                } else {
                    grid[i][j] = 'X';
                }
            }
        }
    }

    // Displaying the values
    public void display() {
        for(int i = 0; i < 11; i++) {//default
            for(int j = 0; j < 11; j++) {
                System.out.print(this.grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
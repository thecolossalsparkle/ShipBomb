public class CheckWin {

    public boolean checkWin(char[][] grid) {
        int count = 0;
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                if(grid[i][j] == 'H') {
                    count++;
                    if(count == 9) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

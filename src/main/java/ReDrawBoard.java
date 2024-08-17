//
public class ReDrawBoard {
//    private DrawBoard board;
//    private AcceptCoordinates ac;
//    private ConsoleReader console;
//
//    public ReDrawBoard() {
//        this.board = new DrawBoard();
//        this.ac = new AcceptCoordinates();
//        try {
//            this.console = new ConsoleReader();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        board.setGrid();
//    }
//
//    // Mock method to simulate computer's response, replace with actual method when available
//    private char mockComputerAnswer(int x, int y) {
//        // This is a mock. Replace with the real logic to get the answer from Computer class
//        if (x == 2 && y == 3) { // Example: Assume 2,3 is a hit
//            return 'H';
//        } else {
//            return 'M';
//        }
//    }
//
//    public void redrawBoard() {
//        ac.getcoord();
//        int x = ac.i + 1; // Adjust for grid index
//        int y = ac.j + 1; // Adjust for grid index
//
//        char result = mockComputerAnswer(x - 1, y - 1);
//
//        if (board.grid[x][y] == 'X') {
//            board.grid[x][y] = result;
//        } else {
//            System.out.println("Already checked this coordinate. Try a different one.");
//        }
//
//        try {
//            console.clearScreen();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        board.display();
//    }
//
}

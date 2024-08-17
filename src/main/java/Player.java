import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<ArrayList<Integer>> ans = new ArrayList<>(9);
    private char[][] grid = new char[11][11];
    private String name;
    private ArrayList<Integer>pair = new ArrayList<>();

    public char[][] getGrid() {
        return this.grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public ArrayList<Integer> getPair() {
        return pair;
    }

    public ArrayList<ArrayList<Integer>> getAns() {
        return ans;
    }

    public boolean setPair() {
        System.out.println("Enter the coordinates from 0 to 9, Row: , Col: ");
        Scanner scanner = new Scanner(System.in);
        pair.add(scanner.nextInt());
        pair.add(scanner.nextInt());
        if(pair.get(0) >= 10 || pair.get(0) < 0 || pair.get(1) >= 10 || pair.get(1) < 0) {
            System.out.println("Invalid coordinates, enter again!");
            return false;
        }
        return true;
    }

    public void setAns () {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int count = 0;
        ArrayList<Integer>coor;
        int coordinate;
        System.out.println("Enter three sets of coordinates for your three ships:");
        for(int i = 0; i < 9; i++) {
            coor = new ArrayList<>();
            for(int j = 0; j < 2; j++) {
                coordinate = scanner.nextInt();
                coor.add(coordinate);
            }


            if(!ans.isEmpty()  && ans.contains(coor)) {
                System.out.println("No overlap allowed, enter different coordinates!");
                i--;
            } else if(coor.get(0) >= 10 || coor.get(1) >= 10) {
                System.out.println("Please enter numbers from 0 to 9 only, try again!");
                i--;
            } else if(i == 0 || i == 3 || i == 6) {
                ans.add(coor);
            }
            else if(!ans.isEmpty() && ans.get(i-1).get(0) != coor.get(0) && ans.get(i-1).get(1) != coor.get(1)) {
                System.out.println("Your ship should be continuous along the same row or same column!");
                i--;
            }  else if(!ans.isEmpty() && (ans.get(i-1).get(0) == coor.get(0)) && (ans.get(i-1).get(1) != coor.get(1) + 1 && ans.get(i-1).get(1) != coor.get(1) - 1)) {
                System.out.println("Ship coordinates should be continuous");
                i--;
            } else if(!ans.isEmpty() && (ans.get(i-1).get(1) == coor.get(1)) && (ans.get(i-1).get(0) != coor.get(0) + 1 && ans.get(i-1).get(0) != coor.get(0) - 1) ) {
                System.out.println("Ship coordinates should be continuous");
                i--;
            }
            else {
                ans.add(coor);
            }

        }
    }

    public void displayAns(){
        System.out.println("Your ship coordinates are:");
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 2; j++) {
                if(j != 1) {
                    System.out.print(ans.get(i).get(j) + ", ");
                }
                else {
                    System.out.print(ans.get(i).get(j));
                }
            }
            System.out.println();
        }
    }

}

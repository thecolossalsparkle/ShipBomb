import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<ArrayList<Integer>> ans = new ArrayList<>(9);
    private char[][] grid = new char[11][11];
    private String name;
    private ArrayList<Integer>pair = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[][] getGrid() {
        return grid;
    }

    public ArrayList<Integer> getPair() {
        return pair;
    }

    public void setPair() {
        System.out.println("Enter the coordinates from 0 to 9, Row: , Col: ");
        Scanner scanner = new Scanner(System.in);
        pair.add(scanner.nextInt());
        pair.add(scanner.nextInt());

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

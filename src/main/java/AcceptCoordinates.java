import java.util.Scanner;

public class AcceptCoordinates {
    protected int i;
    protected int j;
    public void getcoord() {
        System.out.println("Enter the coordinates from 0 to 9, Row: , Col: ");
        Scanner scanner = new Scanner(System.in);
        this.i = scanner.nextInt();
        this.j = scanner.nextInt();
    }

    public void printcord() {
        System.out.println("The coordinates are "+ i + " " + j);
    }
}
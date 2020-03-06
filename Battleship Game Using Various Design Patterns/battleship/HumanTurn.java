package battleship;

import java.util.Scanner;

/*
Logic for human player moves and state maintenance goes here.
 */
public class HumanTurn {

  public HumanTurn() { //non-parameterized constructor.

  }

  //Logic for player move.
  public static void playerTurn() {
    Battleship b = new Battleship();
    System.out.println("\nYOUR TURN");
    int x = -1;
    int y = -1;
    int count = b.getComputerShips();
    do {
      //scanner method to read values from console.
      @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in, "UTF-8");
      System.out.print("Enter X coordinate: ");
      x = input.nextInt(); //get x coordinate value from console.
      System.out.print("Enter Y coordinate: ");
      y = input.nextInt(); //get y coordinate value from console.
      if ((x >= 0 && x < Constants.nRows) && (y >= 0 && y < Constants.nCols)) {
        //if computer ship is already there; computer loses ship.
        if (Constants.grid[x][y].equals("C")) {
          System.out.println("Boom! You sunk the ship!");
          Constants.grid[x][y] = "X"; //Hit mark
          --count; //decrement the count for computer ship.
          Battleship.setComputerShips(count);
        }
        else if (Constants.grid[x][y].equals("H")) {
          //player made incorrect move to its own position.
          System.out.println("Please try again, this is your own ship, missed.");
          Constants.grid[x][y] = "H";
        }
        else if (Constants.grid[x][y].equals("-")) {
          //player made incorrect move to water instead of ship.
          System.out.println("Sorry, you missed");
          Constants.grid[x][y] = "*";
        }
      }
      else if ((x < 0 || x >= Constants.nRows) || (y < 0 || y >= Constants.nCols)) {
        //player made a move which is outside the board.
        System.out.println("You can't place ships outside the grid");
      }
    } while ((x < 0 || x >= Constants.nRows) || (y < 0 || y >= Constants.nCols));
  }

}

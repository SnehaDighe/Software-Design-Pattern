package battleship;

import java.util.Random;

/*
Logic for computer moves and state maintenance goes here.
 */
public class ComputerTurn {
  private int x;
  private int y;

  public ComputerTurn() { //non-parameterized constructor.

  }

  /*Method to calculate the random co-ordinate values for computer
  and display it on the ocean map, calculate count of players turn
  left and maintaining player moves.
   */
  public void computerTurn() {
    Battleship b1 = new Battleship();
    int count = b1.getPlayerShips();
    System.out.println("\nCOMPUTER'S TURN" + count);
    //Guess co-ordinates
    x = -1;
    y = -1;
    do {
      Random ran = new Random();
      x = ran.nextInt(Constants.random_integer_bound);
      y = ran.nextInt(Constants.random_integer_bound);

      if ((x >= 0 && x < Constants.nRows) && (y >= 0 && y < Constants.nCols)) {
        if (Constants.grid[x][y].equals("H")) { //if player ship is already there; player loses ship.
          System.out.println("The Computer sunk one of your ships!");
          Constants.grid[x][y] = "X";
          count = b1.getPlayerShips();
          --count; //decrement counter for player.
          Battleship.setPlayerShips(count);
        }
        else if (Constants.grid[x][y].equals("C")) {
          //computer made incorrect move to its own ship position.
          System.out.println("Computer shoot his own ship, missed.");
          Constants.grid[x][y] = "C";
        }
        else if (Constants.grid[x][y].equals("-")) {
          //computer made a move to water position.
          System.out.println("Computer missed");
          //Saving missed guesses for computer
          if (Constants.missedGuesses[x][y] != 1) {
            Constants.missedGuesses[x][y] = 1;
          }
        }
      }
    } while ((x < 0 || x >= Constants.nRows) || (y < 0 || y >= Constants.nCols));
  }
}

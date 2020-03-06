package battleship;

import java.util.Random;

/*
Deploying Human player and computer ships to the battleship board.
 */
public class Battleship {

  private static int playerShips; //player ships counter.
  private static int computerShips; //computer ships counter.

  public Battleship() { //constructor without parameters.

  }

  //placing player ships at random positions on the board.
  public void deployPlayerShips() {

    System.out.println("\nDeploy your ships:");
    //Deploying ships for player
    setPlayerShips(Constants.playerShipsCount);
    for (int i = 1; i <= Constants.playerShipsCount; ) {
      //generating random values for x and y coordinates to place the player ship.
      int[] arr = generateRandomValues();
      int x = arr[0];
      int y = arr[1];
      //place player ships.
      if ((x >= 0 && x < Constants.nRows) && (y >= 0 && y < Constants.nCols)
          && (Constants.grid[x][y].equals("-"))) {
        Constants.grid[x][y] = "H";
        i++;
      }
    }
    BoardController.printOceanMap();
  }

  //placing computer ships at random positions on the board.
  public void deployComputerShips() {
    System.out.println("\nComputer is deploying ships");
    //Deploying three ships for computer
    setComputerShips(Constants.computerShipsCount);
    for (int i = 1; i <= Constants.computerShipsCount; ) {
      //generating random values for x and y coordinates to place the player ship.
      int[] arr = generateRandomValues();
      int x = arr[0];
      int y = arr[1];
      //place computer ships.
      if ((x >= 0 && x < Constants.nRows) && (y >= 0 && y < Constants.nCols)
          && (Constants.grid[x][y].equals("-"))) {
        Constants.grid[x][y] =   "C";
        System.out.println(i + ". ship DEPLOYED");
        i++;
      }
    }
    BoardController.printOceanMap(); //display the board with ship positions.
  }

  //getter for playership count.
  public int getPlayerShips() {
    return playerShips;
  }

  //setter method for player ship count.
  public static void setPlayerShips(int p) {
    playerShips = p;
  }

  //getter method for computership count.
  public int getComputerShips() {
    return computerShips;
  }

  //setter method for computership count.
  public static void setComputerShips(int c) {
    computerShips = c;
  }

  //generate random values for x and y coordinates
  public static int[] generateRandomValues(){
    Random ran = new Random();
    int x = ran.nextInt(Constants.random_integer_bound);
    int y = ran.nextInt(Constants.random_integer_bound);
    int[] array = {x,y};
    return array;
  }
}

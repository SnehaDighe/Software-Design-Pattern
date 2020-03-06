package battleship;

/*
Creates a 5 by 5 matrix as an Ocean map where we can place ships to start the game.
Initialization of the board for battleship.
 */
public class BoardController {

  //Method to create and display the ocean map.
  public static void createOceanMap() {
    //First section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < Constants.nCols; i++) {
      System.out.print(i);
    }
    System.out.println();

    //Middle section of Ocean Map
    for (int i = 0; i < Constants.grid.length; i++) {
      for (int j = 0; j < Constants.grid[i].length; j++) {
        Constants.grid[i][j] = "-";
        if (j == 0) {
          System.out.print(i + "|" + Constants.grid[i][j]);
        }
        else if (j == Constants.grid[i].length - 1) {
          System.out.print(Constants.grid[i][j] + "|" + i);
        }
        else {
          System.out.print(Constants.grid[i][j]);
        }
      }
      System.out.println();
    }

    //Last section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < Constants.nCols; i++) {
      System.out.print(i);
    }
    System.out.println();
  }

  //Method to display the map.
  public static void printOceanMap() {
    System.out.println();
    //First section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < Constants.nCols; i++) {
      System.out.print(i);
    }
    System.out.println();

    //Middle section of Ocean Map
    for (int x = 0; x < Constants.grid.length; x++) {
      System.out.print(x + "|");
      for (int y = 0; y < Constants.grid[x].length; y++) {
        System.out.print(Constants.grid[x][y]);
      }
      System.out.println("|" + x);
    }

    //Last section of Ocean Map
    System.out.print("  ");
    for (int i = 0; i < Constants.nCols; i++) {
      System.out.print(i);
    }
    System.out.println();
  }
}

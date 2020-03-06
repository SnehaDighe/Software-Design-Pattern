package battleship;

public class Constants {
  public static final int nRows = 5; //no. of rows on board game
  public static final int nCols = 5; //no. of columns on board game.
  public static final int random_integer_bound = 5;//limit for the random integers.
  static final String[][] grid = new String[nRows][nCols]; //grid matrix for the board.
  static final int[][] missedGuesses = new int[nRows][nCols]; //counter to maintain missed moves.
  public static final int playerShipsCount = 3; //counter to maintain player ships on the board.
  public static final int computerShipsCount = 3; //counter to maintain computer ships on the board.
}

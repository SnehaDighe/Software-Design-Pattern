package battleship;

/*
Handles the battleship board, player moves and state of the board.
 */
public class BattleshipController {
  static Battleship b = new Battleship();

  // Displays the battle board and adds ship positions to the board game.
  public static void battle() {
    HumanTurn.playerTurn();
    ComputerTurn ct = new ComputerTurn();
    ct.computerTurn();
    BoardController.printOceanMap();
    System.out.println();
    System.out.println("Player:" + b.getPlayerShips()
        + " | Computer:" + b.getComputerShips());
    System.out.println();
  }

  //Calculates and Displays the player who won the game.
  public static void gameOver() {
    System.out.println("Player:" + b.getPlayerShips()
        + " | Computer:" + b.getComputerShips());
    if (b.getPlayerShips() > 0 && b.getComputerShips() <= 0) {
      System.out.println("Hooray! You won the battle :)");
    }
    else {
      System.out.println("Sorry, you lost the battle");
    }
    System.out.println();
  }

}

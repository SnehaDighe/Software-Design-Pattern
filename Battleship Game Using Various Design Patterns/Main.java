

import battleship.Battleship;
import battleship.BattleshipController;
import battleship.BoardController;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();

    logger.info(m.doIt());

    //logger.trace("Trace Message!");
    //logger.debug("Debug Message!");
    //logger.info("Info Message!");
    //logger.warn("Warn Message!");
    //logger.error("Error Message!");
    //logger.fatal("Fatal Message!");
    
  }
  
  private String doIt() {
    System.out.println("**** Welcome to Battle Ships game ****");
    System.out.println("Right now, sea is empty\n");

    //Step 1 – Create the ocean map
    BoardController.createOceanMap();

    Battleship b = new Battleship();
    //Step 2 – Deploy player’s ships
    b.deployPlayerShips();

    //Step 3 - Deploy computer's ships
    b.deployComputerShips();

    //Step 4 Battle
    //BattleshipController c = new BattleshipController();
    do {
      BattleshipController.battle();
    } while (b.getPlayerShips() != 0 &&  b.getComputerShips() != 0);

    //Step 5 - Game over
    BattleshipController.gameOver();
    return "Game Over!";
  }

}

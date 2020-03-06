package cs665;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import org.junit.Test;
import battleship.Position;

public class TestGame {
  Random ran = new Random();
  int x = ran.nextInt(5);
  int y = ran.nextInt(5);
  public TestGame() {

  }
  @Test
  public void testGetPositionX(){
    Position p = new Position(x,y);
    p.setPositionX(x);
    assertEquals(x, p.getPositionX());
  }
  @Test
  public void testGetPositionY(){
    Position p = new Position(x,y);
    p.setPositionY(y);
    assertEquals(y, p.getPositionY());
  }
  @Test
  public void testSetPositionX(){
    Position p = new Position(x,y);
    p.setPositionX(x);
    assertEquals(x, p.getPositionX());
  }
  @Test
  public void testSetPositionY(){
    Position p = new Position(x,y);
    p.setPositionY(y);
    assertEquals(y, p.getPositionY());
  }
  @Test
  public void testPosition(){
    Position p = new Position(x,y);
    p.setPositionX(x);
    p.setPositionY(y);
    assertEquals(x, p.getPositionX());
    assertEquals(y, p.getPositionY());
  }
  //@Test
  /*public void testMain() {
    String[] args = {"one", "two", "three"};
    Main.main(args);
  }*/
}

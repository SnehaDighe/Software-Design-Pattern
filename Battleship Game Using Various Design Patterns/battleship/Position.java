package battleship;

/*
Maintaining positions of the ships using x and y coordinates.
 */
public class Position {

  private int xcoordinate; //x -coordinate variable.
  private int ycoordinate; //y co-ordinate variable.

  public Position(int x,int y) { //parameterized constructor.
    this.xcoordinate = x;
    this.ycoordinate = y;
  }

  //getter method for xcoordinate.
  public int getPositionX() {
    return xcoordinate;
  }

  //setter method for xcoordinate.
  public void setPositionX(int x) {
    xcoordinate = x;
  }

  //getter method for y cooordinate.
  public int getPositionY() {
    return ycoordinate;
  }

  //setter method for y coordinate.
  public void setPositionY(int y) {
    ycoordinate = y;
  }

}

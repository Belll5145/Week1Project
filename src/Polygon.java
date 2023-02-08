/**
 * @file Polygon.java
 * @author Landon Bell
 * @date 2/2/23
 */
public class Polygon {
    private int numSides;
    private double sideLength;
    private String type;
    private double perimeter;
    private double area;

    // default constructor
    public Polygon(){
       numSides = 4;
       sideLength = 1.0;
       type = "square";
    }
  /**
  * Creates a Polygon object with specified sides, side lengths,
  * and shape type. If the number of sides is 0 or less, it is
  * is set to 4. If the side lengths are 0 or less, it is set to
  * 1.0.
  */
    public Polygon(int sides, double length, String shape){
      numSides = 4;
      sideLength = 1.0;
      type = shape;
      if(length > 0.0){
        sideLength = length;
      }
      if(sides > 0){
        numSides = sides;
      }
    }
    /**
    * 
`   *@return the number of sides of the polygon
    */
    public int getNumSides(){
      return numSides;
    }
    /**
    *
    *@return the length of the sides of the polygon
    */
    public double getSideLength(){
      return sideLength;
    }
    /**
    *
    *@return the type of polygon
    */
  public String getShapeType(){
    return type;
  }

    /**
     * Assigns the value of newLength to sideLength
     * @param newLength
     */
  public void setLength(double newLength){
      sideLength = newLength;
  }

    /**
     * Assigns the value of newNumSides to numSides
     * @param newNumSides
     */
  public void setNumSides(int newNumSides){
      numSides = newNumSides;
  }

    /**
     * Assigns the string in newName to type
     * @param newName
     */
  public void setShapeName(String newName){
      type = newName;
  }

    /**
     * Calculates the perimeter of the polygon
     */
  public void calculatePerimeter(){
       perimeter = sideLength*numSides;
  }

  /**
  * Prints the type of polygon and the number sides on one line,
  * then the side length on the next line.
  */
  public String toString(){
    return "Your shape is a "+ type + " and it has "+ numSides +" sides.\n It has a side length of "+ sideLength +" units.";
  }
}
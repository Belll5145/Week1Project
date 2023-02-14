import java.text.DecimalFormat;
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
    private boolean valid;


    // default constructor
    public Polygon(){
       numSides = 3;
       sideLength = 1.0;
       type = "Triangle";
       valid = true;

    }
  /**
  * Creates a Polygon object with specified sides, side lengths,
  * and shape type. If the number of sides is 2 or less, or the
   * side length is 0.0 or less, than all values are set to the
   * default values.
  *
  */
    public Polygon(int sides, double length, String shape){
      if(length <= 0.0 || sides <= 2){
          numSides = 3;
          sideLength = 1.0;
          type = "Triangle";
          valid = false;
      }
      else{
          numSides = sides;
        sideLength = length;
        type = shape;
        valid = true;
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
     * Assigns the value of newLength to sideLength. If the
     * value of newLength is invalid, the value of sideLength
     * is unchanged.
     * @param newLength
     */
  public void setSideLength(double newLength){
      if(newLength <= 0.0){
          sideLength = sideLength;
      }
      else{
          sideLength = newLength;
      }
  }

    /**
     * Assigns the value of newNumSides to numSides. If the
     * value of newNumSides is invalid, the value of numSides
     * is unchanged.
     * @param newNumSides
     */
  public void setNumSides(int newNumSides){
      if(newNumSides <= 2){
          numSides = numSides;
      }
      else{
          numSides = newNumSides;
          valid = true;
      }
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
  public double calculatePerimeter(){
     perimeter = Math.round(sideLength*numSides*1000);
      
       return perimeter/1000;
  }



  /**
  * Prints the type of polygon and the number sides on one line,
  * then the side length on the next line, and then the perimeter.
   * If the polygon is invalid, it prints that it was set to the
   * default values.
  */
  public String toString(){
      DecimalFormat df = new DecimalFormat("#.###");
      if(valid){
          return "Your shape is a " + type + " and it has " + numSides + " sides.\nIt has a side length of " + sideLength + " units.\n" +
                  "It has a perimeter of " + df.format(perimeter) + " units.";
      }
      else{
          return "Not a valid polygon. Your polygon was given a default of 3 sides, was named 'Triangle', and each side" +
                  " has a length of 1.0 units.";
      }
  }
}

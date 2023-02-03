/**
 * @file PolygonTester.java
 * @author Landon Bell
 * @date 2/2/23
 */
public class PolygonTester {
  public static void main(String[] args) {
        
        Polygon poly1 = new Polygon(5,6.865,"pentagon");
        System.out.println(poly1);

        
        Polygon poly2 = new Polygon();
        System.out.println(poly2);

        
        Polygon poly3 = new Polygon(1,785,"line");
        System.out.println(poly3);
    }
}

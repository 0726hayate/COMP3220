/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class Canvas has a list of shapes associated with it that is stored in an array
*
*/

import java.util.ArrayList;
import java.util.List;
public class CCanvas {
    private List <CShape> shapes;
    private static final int maxShapes = 10;

    //Constructor
    public CCanvas(){
        shapes = new ArrayList<>();
        System.out.println(">> Canvas has the following random shapes:");
        generateShapes();
    }

    /**Method to generate 10 random shapes, adds each shape to the list of shapes and prints a description of each shape generated
     * @param: no parameters
     * @return: none
     */
    private void generateShapes() {
        while (shapes.size() < maxShapes) {
            CShape shape = makeShape();
            System.out.println(shape.description());
            shapes.add(shape);

        }
    }

    /**Method to generate a random shape based on a random number from 0 to 3
     * @param: no parameters
     * @return: none
     */
    private CShape makeShape(){
        // 0 - Circle, 1 - Oval, 2 - Rectangle, 3 - Square
        int type = (int) (Math.random() * 4);
        int length = (int) (Math.random() * 100) + 1;
        int width = (int) (Math.random() * 100) + 1;

        switch (type) {
            case 0: return new CCircle(length);
            case 1: return new COval(length, width);
            case 2: return new CRectangle(length, width);
            case 3: return new CSquare(length);
            default: return null;
        }
    }

}

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
    //a list that will hold the random shapes generated
    private List <CShape> shapes;
    //a variable to make sure that the number of random shapes generated is 10
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

    /**Method to generate a random shape based on a random number from 0 to 3 with random dimensions from 1 to 100
     * @param: no parameters
     * @return: none
     */
    private CShape makeShape(){
        //generates a random number between 0 to 3 to dtermine the shape generated in the switch statement below
        int type = (int) (Math.random() * 4);
        //generates a random number between 1 - 100 for the vertical dimensions of the shape
        int length = (int) (Math.random() * 100) + 1;
        //generates a random number between 1 - 100 for the horizontal dimensions of the shape
        int width = (int) (Math.random() * 100) + 1;

        //determines the random shape generated based on a random number from 0 to 3, 0 - Circle, 1 - Oval, 2 - Rectangle, 3 - Square
        switch (type) {
            case 0: return new CCircle(length);
            case 1: return new COval(length, width);
            case 2: return new CRectangle(length, width);
            case 3: return new CSquare(length);
            default: return null;
        }
    }

}

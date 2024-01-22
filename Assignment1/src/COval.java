/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class COval is a subclass of CShape with a horizontal and vertical radius
*
*/

public class COval extends CShape {

    //a random number between 1-100 that determines the width of the oval, generated in CCanvas through the makeShape method
    private int horizontalRadius;
    //a random number between 1-100 that determines the height of the oval, generated in CCanvas through the makeShape method
    private int verticalRadius;

    //Constructor
    public COval(int horizontalRadius, int verticalRadius){

        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;

    }

    /**Method to print the description of the oval
     * @param: no parameters
     * @return: the oval id, horizontal radius and vertical radius as a console message
     */
    @Override
    public String description() {
        return  "Shape " + getId() +":" + "OVAL " + horizontalRadius + "x" + verticalRadius;
    }

    /**Method to get the horizontal radius, used in CCircle
     * @param: no parameters
     * @return: the horizontal radius as an int
     */
    public int getHorizontalRadius() {
        return horizontalRadius;
    }
}

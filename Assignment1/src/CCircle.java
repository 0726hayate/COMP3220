/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class CCircle is a subclass of COval with a radius
*
*/
public class CCircle extends COval{

    //Constructor
    public CCircle(int radius){
        super(radius, radius);
    }

    /**Method to print the description of the circle
     * @param: no parameters
     * @return: the circle id and radius as a console message
     */
    @Override
    public String description() {
        return "Shape " + getId() +":" + "CIRCLE " + getHorizontalRadius();
    }
}

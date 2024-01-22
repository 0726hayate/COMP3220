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
        //CCircle has 1 parameter, radius which determines the size of the circle, it is a number between 1-100 generated in CCanvas through the makeShape method
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

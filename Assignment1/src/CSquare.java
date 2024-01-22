/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class CSquare is a subclass of CRectangle with a length
*
*/
public class CSquare extends CRectangle{

    //Constructor
    public CSquare(int length){
        //CSquare has 1 parameter, length which determines the size of the square, it is a number between 1-100 generated in CCanvas through the makeShape method
        super(length,length);
    }

    /**Method to print the description of the square
     * @param: no parameters
     * @return: the square id and length as a console message
     */
    @Override
    public String description() {
        return "Shape " + getId() +":" + "SQUARE " + getLength() + "x" + getLength();
    }
}

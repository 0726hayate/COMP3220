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

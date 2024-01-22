/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class CRectangle is a subclass of CShape with a length and width
*
*/
public class CRectangle extends CShape{

    //a random number between 1-100 that determines the length of the rectangle, generated in CCanvas through the makeShape method
    private int length;
    //a random number between 1-100 that determines the width of the rectangle, generated in CCanvas through the makeShape method
    private int width;

    //Constructor
    public CRectangle(int length, int width){

        this.length=length;
        this.width=width;

    }

    /**Method to print the description of the rectangle
     * @param: no parameters
     * @return: the rectangle id, length and width as a console message
     */
    @Override
    public String description() {
        return "Shape " + getId() +":" + "RECTANGLE " + length + "x" + width;
    }

    /**Method to get the length of the rectangle, used in CSquare
     * @param: no parameters
     * @return: the length as an int
     */
    public int getLength() {
        return length;
    }
}

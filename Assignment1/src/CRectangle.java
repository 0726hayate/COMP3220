/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class CRectangle is a subclass of CShape with a length and width
*
*/
public class CRectangle extends CShape{

    private int length;
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

/*
*@author Chun Yiu Jason Yau
*@version 1.0
*
*Class CShape is an abstract class
*CShape maintains a unique ID for each shape must be a positive integer starting at 1
*ID is auto generated in sequence
*/

public abstract class CShape {

    //Keeps count of the id
    private static int idCounter = 1;
    //unique id of each shape
    private final int id;


    //Constructor
    public CShape(){
        this.id = idCounter++;
    }

    /**Method to get  ID of shape
     * @param: no parameters
     * @return: an int from 1-10
     */
    public int getId() {
        return id;
    }

    /**Abstract method to print shape description on console
     * @param: no parameters
     * @return: none
     */
    public abstract String description();


}

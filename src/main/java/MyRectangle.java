//skeleton class code
public class MyRectangle {
    //declare instance variables here.

    public MyRectangle()
    {
        //default constructor -- initialize all instance variables
        //to 0
    }//end of default constructor

    public MyRectangle (int rStartX, int rStartY, int rWidth, int rHeight)
    {
        //initialize instance variables based on parameters shown.
        //be careful to get the order correct!
    }//end of constructor all fields

    public int area()
    {
        //return the area of this Rectangle
    }//end of area

    public boolean isInside(int x, int y)
    {
        //this is the trickiest of the methods to write.  This should
        //return true if point (x,y) is anywhere within the borders of the
        //current MyRectangle (including the borders themselves).  Use a
        //pencil and paper to figure out how this can be determined with
        //just a few simple relational operations.
    }//end of isInside

    public void setSize(int rWidth, int rHeight)
    {
        //update width and height as shown
    }//end of setSize

    public void setPosition(int x, int y)
    {
        //update startX and startY as shown
    }//end of setPosition

    public String toString()
    {
        //return the data about this rectangle in a user-friendly manner
        //remember that the user-friendly display should look like the following
        //Width: ZZ Height: ZZ X: ZZ Y: ZZ
        //the ZZ's should be the various numbers for this rectangle
    }//end of toString

}//end of class

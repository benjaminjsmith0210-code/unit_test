
/**
 * Name: Benjamin Smith
 * Student #: T00769893
 * Assignment Number: 1
 * Due Date: Feb 4/2026
 * Program Description: A child class of class Item that adds a colour paramater and required methods for the colour paramater, also updates the toString
 * method of the parents class to include the colour methods
 */
public class Pen extends Item
{
    
    private String inkCol;
    
    public Pen( )                   //constructor for an pen that has no set colour
    {
         inkCol = "not set";
    }
    
    public Pen(String newCol )      //constructor for a pens colour 
    {
        inkCol = newCol;
    }
    
    public String getCol( )         //constructor for retrieving a set colour
    {
        return inkCol;   
    }
    
    public void setCol(String newCol)   //constructor for setting colour
    {
        inkCol = newCol;   
    }
    
    public void set(String name, double price, String newCol )     //constructor for a set method 
    {
        super.set(name, price);
        inkCol = newCol;
    }
    
    public String toString( )       //constructor for an updated toSting method that adds a colour variable to the default toString
    {   
        return super.toString() + ", colour = " + inkCol;    
    }
    
    public boolean equals(Item o, Pen p)
    {
        super.equals(o);
            if(!(p instanceof Pen))
                return false;
                
            Pen pen  = (Pen) p;
                return  this.inkCol.equals(pen.inkCol);
    }
}
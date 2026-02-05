
/**
 * Name: Benjamin Smith
 * Student #: T00769893
 * Assignment Number: 1
 * Due Date: Feb 4/2026
 * Program Description: A child of class Item that adds a size paramater and methods for using that size method as well as a toString to add the size 
 * to parent classes toString
 */
public class Sweater extends Item
{
    // instance variables - replace the example below with your own
    private String size;
    

    public Sweater()            //constructor for a sweater without a set size
    {
        size = "not defined";
    }
    
    public Sweater(String newSize)      //constructor for size
    {
        size = newSize;   
    }
    
    public String getSize( )            //constructor for retrieving size
    {
        return size;   
    }
    
    public void setSize(String newSize)     //constructor for setting the size of a sweater item
    {
        size = newSize;    
    }
    
    public void set(String name, double price, String newSize)
    {
        super.set(name,price);
        size = newSize;
    }
    
    public String toString( )           //constructor for an updated toString for the sweater class with an updated paramater for size
    {
        return super.toString() + ", size = " + size;
    }
    
    public boolean equals(Sweater s, Item o)
    {
        super.equals(o);
        
            if(!(s instanceof Sweater))
                return false;
            
            Sweater sweater = (Sweater)s;
        
            return this.size.equals(sweater.size);
    }
}
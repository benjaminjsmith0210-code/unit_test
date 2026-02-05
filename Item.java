
/**
 * Name: Benjamin Smith
 * Student #: T00769893
 * Assignment Number: 1
 * Due Date: Feb 4/2026
 * Program Description: A default parent class file to be used as a constructor in the other classes
 * and act as the blueprint for the declorations and formating required
 */
public class Item
{
   
    private String name;
    private double price;
    
    public Item( )              //creates default paramters to be called when item is created
    {
        name = "not defined";
        price = 0;
    } 
    
    public Item(String newName, double newPrice)   //creates variables to be called by later methods
    {
        name = newName;
        price = newPrice;
    }
    
    public String getName( )        //contructor for retrieving name
    {
        return name;
    }
    
    public double getPrice( )      //constructor for retrieving price
    {
        return price;
    }
    
    public void setName(String newName )    //constructor for setting the name of a created Item
    {
        name = newName;
    }
    
    public void setPrice(double newPrice )     //constructor for setting price of a created Item
    {
        price = newPrice;
    }
    
    public void set (String newName, double newPrice )     //constructor for setting both prices and names for created Items
    {
        name = newName;
        price = newPrice;
    }
    
    public String toString ( )              //constructor for a toString method that will be used by child classes
    {
        return "Name = " + name + ", price = $" + price;
    }
    
    public boolean equals(Item o)
    {
        if (this == o)
            return true;
            
        if(o==null)
            return false;
        
        if(!(o instanceof Item))
            return false;
            
        Item item = (Item)o;
        
        return this.name.equals(item.name)
            && this.price == (item.price);
            
    }
}


/**
 * Write a description of class Textbook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Textbook extends Item
{
    // instance variables - replace the example below with your ow
    private String title;

    public Textbook()
    {
        title = "not defined";
    }
    
    public Textbook(String newTitle)
    {
        title = newTitle;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    
    public void set(String name, double price, String newTitle)
    {
        super.set(name,price);
        title = newTitle;
    }
    
    public String toString()
    {
        return super.toString() + ", textbook title: " + title;
    }
    
        public boolean equals(Textbook t, Item o)
    {
        super.equals(o);
        
            if(!(t instanceof Textbook))
                return false;
            
            Textbook textbook = (Textbook)t;
        
            return this.title.equals(textbook.title);
    }
    
}

/**
 * Name: Benjamin Smith
 * Student #: T00769893
 * Assignment Number: 1
 * Due Date: Feb 4/2026
 * Program Description: A test application program to test created methods in created classes to be shown in the console
 */
public class Application extends Item 
{
    public static void main(String[] args)
    {
        Item item1 = new Item();            //default Item for testing
        Item item2 = new Item("Item", 10);  //Item with name and price set
        Pen pen1 = new Pen();               //Pen, child of Item with nothing set
        Pen pen2 = new Pen("black");        //Pen, child of Item with colour
        Sweater sweater1 = new Sweater();   //Sweater, child of Item with nothing set
        Sweater sweater2 = new Sweater("medium");   //Sweater, child of Item with size
        
       
        
        
        //initial test for items with no set paramters
        System.out.println("testing items with no information and default constructor: ");
        System.out.println("variable item1: " + item1);
        
        //testing items with paramaters set at decloration only in the parent class
        System.out.println("\ntesting items with information and methods from the parent class: ");
        System.out.println("variable item2: " + item2);
        
        //using setCol and setSize
        System.out.println("\nusing methods setCol from class Pen and setSize from class Sweater setting just those values: ");
        System.out.println("\npen1.setCol(\"orange\") ");
        System.out.println("\nsweater1.setSize(\"small\")");
        
        //assigning data using specific set methods from child classes
        pen1.setCol("orange");
        sweater1.setSize("small");
        
        //test case for specifc set methods setCol and setSize
        System.out.println("\nsetCol method for pen1 expected values: name = \"not defined\", price = 0.0, colour = \"orange\" ");
        System.out.println(pen1);
        System.out.println("\nsetSize method for sweater expected values: name = \"not defined\", price = 0.0, size = \"small\" ");
        System.out.println(sweater1);
        
        //testing set methods for parent class Item and child classes Pen and Sweater
        System.out.println("\nShowing initial data values for objects of the \"Item\", \"Pen\", \"Sweater\" classes: ");
        System.out.println("\nitem1: " + item1 + "\npen1" + pen1 + "\nsweater1: " + sweater1);
        System.out.println("\nusing \"variable\".set() method for name and price for item1, pen1, sweater1, as well as setting \"size\" for sweater1 and \"inkCol\" for pen1: ");
        
        //using .set methodfor intializing variables
        System.out.println("\nitem1.set(\"Chair\", 99.99) ");
        System.out.println("pen1.set(\"Ballpoint\",25.50) ");
        System.out.println("sweater1.set(\"Jumper\",37.50) ");
        item1.set("Chair", 99.99);
        pen1.set("Ballpoint", 25.50, "black");
        sweater1.set("Jumper", 37.50, "yellow");
        
        //printing the set variables
        System.out.println(item1 + "\n" + pen1 + "\n" + sweater1); 
        
        //set methods used to add data to variables using class methods
        item1.set("notebook",5);
        pen1.set("TRU Pen", 3, "black");
        sweater1.set("TRU Sweater", 15, "medium");
        
        //printing item1, pen1, sweater1, with information added by set method
        System.out.println("\nvariable item1 with inputs given: \"notebook\", \"5\"");
        System.out.println("item1: " + item1);
        
        System.out.println("\nvariable pen1 with inputs given: \"TRU Pen\", \"3\", \"black\"");
        System.out.println("pen1: " + pen1);
        
        System.out.println("\nvariable sweater1 with inputs given: \"TRU Sweater\", \"15\", \"medium\"");
        System.out.println("sweater1: " + sweater1);
        
        //testing getName and getPrice methods 
        System.out.println("\ntesting getName and getPrice methods in the Item class: ");
        System.out.println("item1.getName(): " + item1.getName() + "\n" + "item1.getPrice(): " + item1.getPrice());
        
        //testing getCol and getSize methods
        System.out.println("\ntesting getCol and getSize methods for Pen and Sweater child classes ");
        System.out.println("pen1.getCol(): " + pen1.getCol() + "\nsweater1.getSize(): " + sweater1.getSize());
        
        //testing equals method
        System.out.println("\ntesting \"equals\" methods for Item, Pen, and Sweater classes. ");
        //testing for cases with different object paramaters
        System.out.println("\ntesting for equals method between classes, expected output: \"false\"");
        System.out.println("item1.equals(pen1): " + item1.equals(pen1));
        //equals method must have variables with data, cannot be null
        //setting initial values for item1 and item2
        System.out.println("\nusing set method for item1 and item2: item.set(\"blanket\", 17.50) ");
        item1.set("blanket",17.50);
        item2.set("blanket",17.50);
        System.out.println("\ntesting item1.equals(item2), expected output \"true\": " + item1.equals(item2));
        
        //changing one paramater and expecting false
        System.out.print("\nsetting price on item2: item2.setPrice(15.50) ");
        item2.setPrice(15.50);
        System.out.println("new price is: " + item2.getPrice());
        System.out.println("\ntesting item1.equals(item2), expected output \"false\": " + item1.equals(item2));
        
        //testing equals methods for objects of Pen and Sweater classes
        System.out.println("\ntesting .equals methods of child classes Pen and Sweater. ");
        //setting intial values
        System.out.println("\nsetting values for object pen1.set(\"Tru Pen\", 6.25, \"blue\") ");
        System.out.println("setting values for object pen2.set(\"TRU Pen\", 5.50, \"blue\") ");
        System.out.println("setting values for object sweater1.set(\"TRU Sweater\", 27.75, \"large\") ");
        System.out.println("setting values for object sweater2.set(\"TRU Pullover\", 19.95, \"large\") ");
        
        //setting values for Pen objects
        pen1.set("Tru Pen", 5.50, "blue");
        pen2.set("TRU Pen", 5.50, "blue");
        
        //setting values for Sweater objects
        sweater1.set("TRU Sweater", 27.75, "large");
        sweater2.set("TRU Pullover", 19.95, "large");
        
        //testing the equals methods of Pen and Sweater when inkCol and Size are the same 
        System.out.println("\ntesting equals method of child classes to see if parent class is properly called due to the specific variables in the child classes being equal. ");
        System.out.println("\npen1.equals(pen2), expected result \"false\": " + pen1.equals(pen2));
        System.out.println("sweater1.equals(sweater2), expected result \"false\": " + sweater1.equals(sweater2));
        
        //setting values of Pen and Sweater objects to be equal
        System.out.println("\nsetting pen1,pen2(\"TRU Pen\", 5.50, )");
        System.out.println("setting sweater1,sweater2.set(TRU \"Sweater\", 19.95) ");
        
        //setting pen1 pen2 sweater1 sweater 2 to above values
        pen1.set("TRU Pen", 5.50);
        pen2.set("TRU Pen", 5.50);
        sweater1.set("TRU Sweater", 19.95);
        sweater2.set("TRU Sweater", 19.95);
        
        
        //testing equals methods for expected "true"
        System.out.println("\ntesting equals method on expected true outcomes: ");
        System.out.println("\npen1.equals(pen2): expected output \"true\": " + pen1.equals(pen2) );
        System.out.println("\nsweater1.equals(sweater2): expected output \"true\": " + sweater1.equals(sweater2));
        
        
        //testing for case sensitivty in equals method
        System.out.println("\ntesting the equals method for case sensitivity ");
        System.out.println("\npen1.equals(pen2) expected output: \"false\": " + pen1.equals(pen2));
        
        
        
        
    
        
         }

}
package Store;

public class Item {

    // field declarations
    private static String name;
    private static String description;
    private static double price;

    /**
     * Constructor
     */
    public Item(String newName, String newDes, double newPrice){
        setName(newName);
        setDescription(newDes);
        setPrice(newPrice);
    }

    // Methods

    /**
     * Method to set the name of the item
     */
    public static void setName(String newName){
        name = newName;
    }

    /**
     * Method to get the name of the item
     */
    public static String getName(){
        return name;
    }

    /**
     * Method to set the description of the item
     */
    public static void setDescription(String newDes){
        description = newDes;
    }

    /**
     * Method to get the description of the item
     */
    public static String getDescription() {
        return description;
    }

    /**
     * Method to set the price of the item
     */
    public static void setPrice(double newPrice){
        price = newPrice;
    }

    /**
     * Method to get price of the item
     */
    public static double getPrice(){
        return price;
    }

}

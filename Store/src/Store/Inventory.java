package Store;

public class Inventory {

    // field declarations
    private static Item inventoryItem;
    private static int stock;

    /**
     * Constructor
     */

    // Methods

    /**
     * Method to create a new item for the inventory
     */
    public static void newItem(String newName, String newDes, double newPrice){
        inventoryItem = new Item(newName, newDes, newPrice);
    }

    /**
     * Method to get information about the item of the inventory
     */
    public static void printInventoryItemInfo(){
        inventoryItem.printItemInfo();
    }

    /**
     * Method to set the inventory stock of this item
     */
    public static void setStock(int newStock){
        stock = newStock;
    }

    /**
     * Method to get information about the inventoryItem
     */
    public static void 

}

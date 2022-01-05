package Store;

import java.util.*;

public class Store {

    // field declarations
    public static String sName;
    public static String sDescription;
    public static ArrayList storeItems;

    /**
     * Constructor
     */
    public Store(){
        storeItems = new ArrayList <Inventory> ();
    }

    // Methods

    /**
     * Method to set the name of the store
     */
    public static void setSName(String newSName){
        sName = newSName;
    }

    /**
     * Method to get the name of the item
     */
    public static String getSName(){
        return sName;
    }

    /**
     * Method to set the description of the store
     */
    public static void setSDescription(String newSDes){
        sDescription = newSDes;
    }

    /**
     * Method to get the description of the store
     */
    public static String getSDescription(){
        return sDescription;
    }

    /**
     * Method to set an inventoryItem to the storeItems list
     */
    public static void setNewiItem(Item tempItem){
        storeItems.add(tempItem);
    }

    /**
     * Method to add a new inventoryItem to the storeItems list
     */
    public static void addNewiItem(String newItem, String newDes, double newPrice, int newStock){
        Item tempItem = new Item(newItem, newDes, newPrice);
        Inventory tempInv = new Inventory(tempItem, newStock);
        storeItems.add(tempInv);
    }

    /**
     * Method to set an existing inventoryItem to the storeItems list
     */
    public static void setNewiItem(Inventory iItem){
        storeItems.add(iItem);
    }

    /**
     * Method to print all the items in the storeItems list
     */
    public static void printAllItems(){
        Inventory tempItem = null;
        for (int tempNum = 0; tempNum <= storeItems.size(); tempNum++){
            tempItem = storeItems.get(tempNum);
        }
    }

}

package Store;

import java.util.*;

public class RunTime {

    public static void main (String[]arges){
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter in the name of the product: ");
        String tempName = keybd.nextLine();
        System.out.print("Please enter in the description of the product: ");
        String tempDes = keybd.nextLine();
        System.out.print("Please enter in the price of the item: ");
        double tempPrice = keybd.nextDouble();
        Item tempItem  = new Item(tempName, tempDes, tempPrice);
        tempItem.printItemInfo();
        System.out.println("Now we will make an inventory for the store.");
        System.out.print("Please enter in how many items are in the inventory: ");
        int tempStock = keybd.nextInt();
        Inventory tempInventoryItem = new Inventory(tempItem, tempStock);
        tempInventoryItem.printInventoryInfo();
    }

}

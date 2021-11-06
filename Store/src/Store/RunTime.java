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
    }

}

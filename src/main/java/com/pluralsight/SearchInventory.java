package com.pluralsight;
import java.awt.print.Book;
import java.util.*;
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f" + "\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(5158, "Book", 14.32f));
        inventory.add(new Product( 5416, "Music", 26.92f));
        inventory.add(new Product(9832, "Trinkets and Shinies", 367.51f));
        inventory.add(new Product(6347, "Snacks", 4.58f));
        inventory.add(new Product(2482, "Oddities", 554.73f));

// this method loads product objects into inventory
// and its details are not shown
        return inventory;
    }



}

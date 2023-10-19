package com.pluralsight;
import java.awt.print.Book;
import java.io.*;
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
        try {
            BufferedReader bufRead = new BufferedReader( new FileReader("src/main/resources/Inventory.csv"));
            String input;
            ArrayList<Product> inventory = new ArrayList<Product>();
            while((input = bufRead.readLine()) != null) {
                String [] categories = input.split("\\|");
                int productId = Integer.parseInt(categories[0]);
                String productName = categories[1];
                float productPrice = Float.parseFloat(categories[2]);
                inventory.add(new Product(productId, productName, productPrice));
            }

// this method loads product objects into inventory
// and its details are not shown
            return inventory;
        }
        catch (IOException error) {
            error.printStackTrace();
            return new ArrayList<Product>();
        }

     }
    }


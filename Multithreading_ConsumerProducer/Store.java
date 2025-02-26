package Multithreading_ConsumerProducer;

import java.util.ArrayList;
import java.util.Random;

public class Store {
    private int capacity;
    private ArrayList<Integer> products;

    public Store(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void addProduct(String productName, int product) {
            products.add(product);
            System.out.println("-----------------------------------------");
            System.out.println("Producer " + productName + " added product " + product);
            System.out.println("Inventory quantity: " + products.size());
    }

    public void removeProduct(String consumerName) {
            int product = products.remove(0);
            System.out.println("===================================");
            System.out.println("Consumer " + consumerName + " removed product " + product);
            System.out.println("Inventory quantity: " + products.size());
    }

    public int getSize() {
        return this.products.size();
    }

    public int getCapacity() {
        return capacity;
    }
}

package Multithreading_ConsumerProducer;

import java.util.Random;

public class Producer implements Runnable {
    private String productName;
    private Store store;

    public Producer(String productName, Store store) {
        this.productName = productName;
        this.store = store;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
                if (store.getSize() < store.getCapacity()) {
                    store.addProduct(productName, i++);
                }
            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

package Multithreading_ConsumerProducer;

import java.util.Random;

public class Consumer implements Runnable {
    private String consumerName;
    private Store store;

    public Consumer(String consumerName, Store store) {
        this.consumerName = consumerName;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            if (store.getSize() > 0) { // Chỉ lấy nếu có hàng
                if (store.getSize() > 0) {
                    store.removeProduct(consumerName);
                }
                try {
                    Thread.sleep((long) (Math.random() * 100));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
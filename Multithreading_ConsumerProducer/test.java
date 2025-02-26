package Multithreading_ConsumerProducer;

public class test {
    public static void main(String[] args) {
        Store store=new Store(40);
        Thread producer=new Thread(new Producer("Apple",store));
        Thread consumer=new Thread(new Consumer("FPT",store));
        consumer.start();
        producer.start();

    }
}

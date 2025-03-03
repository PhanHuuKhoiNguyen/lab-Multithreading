package Multithreading_Resource1_2;

public class task implements Runnable {
    private  Object resource1;
    private  Object resource2;

    public task(Object resource1, Object resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " got resource 1");
                resource1.notify();
                try {
                    Thread.sleep((long) (Math.random() * 500));
                    resource1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " got resource 2");

                    try {
                        Thread.sleep((long) (Math.random() * 500));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

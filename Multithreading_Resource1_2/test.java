package Multithreading_Resource1_2;

public class test {
    public static void main(String[] args) {
        Object resource1=new Object();
        Object resouce2=new Object();

        Thread t1=new Thread(new task(resource1,resouce2),"Thread 1");
        Thread t2=new Thread(new task(resource1,resouce2),"Thread 2");
        t1.start();
        t2.start();
    }
}

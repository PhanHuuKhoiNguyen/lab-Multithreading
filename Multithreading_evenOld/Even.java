package Multithreading_evenOld;

public class Even implements Runnable{
    private int x;


    public Even(int x) {
        this.x = x;
    }

    @Override
    public synchronized void run() {
        for (int i=0;i<=x;i++){
            if(i%2!=0){
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(i%2==0){
                System.out.println(i);
                notify();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

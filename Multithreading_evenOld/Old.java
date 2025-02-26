package Multithreading_evenOld;

public class Old implements Runnable{
    private int x;

    public Old(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public synchronized void run() {
        for(int i=0;i<=x;i++){
            if(i%2==0){
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(i%2!=0){
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

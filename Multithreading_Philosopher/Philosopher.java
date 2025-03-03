package Multithreading_Philosopher;

import java.util.concurrent.ThreadLocalRandom;


public class Philosopher implements Runnable{
    private Object leftFork;
    private Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public Object getLeftFork() {
        return leftFork;
    }

    public void setLeftFork(Object leftFork) {
        this.leftFork = leftFork;
    }

    public Object getRightFork() {
        return rightFork;
    }

    public void setRightFork(Object rightFork) {
        this.rightFork = rightFork;
    }

    private void Action(String action) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" "+action);
        Thread.sleep((long) (Math.random()*100));
    }



    @Override
    public void run() {
        try{
            while(true){
                Action("Thinking");
                    synchronized (leftFork){
                        Action("Pick up leftFork");
                        synchronized (rightFork){
                            Action("Pick up rightFork- Eating");
                            Action("Put down rightFork");
                        }
                        Action("Put down leftFork");
                    }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

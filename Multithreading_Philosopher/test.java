package Multithreading_Philosopher;

public class test {
    public static void main(String[] args) {
        Philosopher[] philosophers=new Philosopher[5];
        Object[] fork=new Object[philosophers.length];

        for(int i=0;i<fork.length;i++){
            fork[i]=new Object();
        }

        for(int i=0;i<philosophers.length;i++){
            Object leftFork=fork[i];
            Object rightFork= fork[(i+1)% philosophers.length];
            if(i==philosophers.length-1){
                philosophers[i]=new Philosopher(rightFork,leftFork);
            }else
                philosophers[i]=new Philosopher(leftFork,rightFork);
            Thread t=new Thread(philosophers[i],"Philosopher "+ (i+1));
            t.start();
        }

    }
}

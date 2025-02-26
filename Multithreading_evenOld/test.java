package Multithreading_evenOld;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Object lock=new Object();
        System.out.println("X:");
        int x=scanner.nextInt();
        Thread taskA=new Thread(new Even(x));
        Thread taskB=new Thread(new Old(x));

        taskA.start();
        taskB.start();
    }
}

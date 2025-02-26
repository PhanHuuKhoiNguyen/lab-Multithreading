package Multithreading_Ticket;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ticket for sale:");
        int capacity=scanner.nextInt();
        Ticket ticket=new Ticket(capacity);
        ticket.addticket();
        Thread agency1=new Thread(new Agency(ticket,"Da Nang"));
        Thread agency2=new Thread(new Agency(ticket,"Ha Noi"));
        agency1.start();
        agency2.start();
    }
}

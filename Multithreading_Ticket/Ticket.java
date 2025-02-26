package Multithreading_Ticket;

import java.util.ArrayList;

public class Ticket{
    private ArrayList<Integer> ticket;
    private  int capacity;

    public Ticket( int capacity) {
        this.ticket =new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void sellTicket(String agencyName){
            int removeTicket=ticket.remove(0);
            System.out.println("Agency "+agencyName+" sold "+removeTicket);
    }
    public void addticket(){
        for(int i=1;i<=capacity;i++){
         ticket.add(i);
        }
        System.out.println("Add ticket success");
    }
    public boolean hasTicket(){
        return !ticket.isEmpty();
    }
}

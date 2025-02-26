package Multithreading_Ticket;

public class Agency implements Runnable{
    private Ticket ticket;
    private String agencyName;

    public Agency(Ticket ticket, String agencyName) {
        this.ticket = ticket;
        this.agencyName = agencyName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getAgencyName() {
        return agencyName;
    }

    @Override
    public void run() {
       while (ticket.hasTicket()){
               ticket.sellTicket(agencyName);
               try {
                   Thread.sleep((long) (Math.random()*1000));
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
       }
        System.out.println("sold out!");
    }
}

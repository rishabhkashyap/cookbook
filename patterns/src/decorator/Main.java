package patterns.src.decorator;

public class Main {
    public static void main(String[] args){
        Component ticket=new Header2(new Footer1(new Footer3(new TicketPrinter())));
        ticket.printTicket();
    }
}

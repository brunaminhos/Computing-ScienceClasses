public class ticketTest {
    public static void main(String args[]) {
        TicketManager tm = new TicketManager();
        
        // prints empty array
        System.out.println(tm);
        Ticket t1 = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
        tm.buy(t1);

        // prints array with 1 ticket
        System.out.println(tm);
        Ticket t2 = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
        tm.buy(t2);

        // prints array with 2 tickets
        System.out.println(tm);
        for (int j = 0; j < 200; j++) {
            tm.buy(new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5)));
        }

        // prints number of tickets sold (202)
        System.out.println(tm.sold());
        Ticket draw = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));

        // prints number of winning tickets, Good Luck! 
        System.out.println(tm.freqWinner(draw));
    }
}

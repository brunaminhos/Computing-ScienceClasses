import java.util.Random;

class TicketManager{
	private Ticket[] tickets;
	private int sold = 0;
	private int maxTickets = 500;

	TicketManager(){
		tickets = new Ticket[maxTickets];
	}

	public boolean buy(Ticket t){
		if (sold < maxTickets){
			for (int i = 0; i < tickets.length; i++){
				tickets[sold] = t;
			}
			sold++;
			return true;
		}
		else{
			return false;
		}
		//Add the ticket to the next available slot in the list
	}

	public boolean buy(){
		if (sold < maxTickets){
			Random random = new Random();
			int randomNumber1 = random.nextInt(6);
			int randomNumber2 = random.nextInt(6);
			Ticket ticket = new Ticket(randomNumber1, randomNumber2);
			buy(ticket);
			return true;
		}
		else{
			return false;
		}
		//Generate and add the ticket to the next available slot in the list
	}

	public int freqWinner(Ticket t){
		int numberOfWinners = 0;
		for (int i = 0; i < sold; i++){
			if (tickets[i].a()==t.a()&&tickets[i].b()==t.b()){
				numberOfWinners++;
			}
		}
		return numberOfWinners;
		//Count how many tickets match the winning ticket drawn
	}

	public Ticket[] getWinners(Ticket t){
		int numberOfWinners = freqWinner(t);
		Ticket[] ticketsArr = new Ticket[numberOfWinners];
		int ticketArrCount = 0;
		for (int i = 0; i < tickets.length; i++){
			if (tickets[i] == t){
				ticketsArr[ticketArrCount] = tickets[i];
				ticketArrCount++;
			}
		}
		return ticketsArr;
		// Return a list of all tickets that match the winning ticket drawn
		// Do not break encapsulation!
	}

	public boolean search(Ticket t){
		boolean win = false;
		for (int i = 0; i < tickets.length; i++){
			if (tickets[i] == t){
				win = true;
			}
		}
		return win;
		//return true if a matching ticket is in the list
	}

	public int sold(){
		int numberOfTickets = sold;
		return numberOfTickets;
		//The number of tickets sold
	}

	public boolean allsold(){
		if (tickets.length == maxTickets){
			return true;
		}
		else {
			return false;
		}
		//Return true if all tickets have been sold
	}

	public String toString(){
		if(sold == 0)
			return "[]";

		String s = "[";
		for(int j = 0; j < sold - 1; j++) {
			s = s + tickets[j] + ",";
		}
		return s+tickets[sold-1]+"]";
	}
}
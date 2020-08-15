package com.dxc.logical;

class TicketNotFoundException extends Exception{


public TicketNotFoundException() {
super(" Sorry you are Out of Stock ");
}
}

class BookMyShow
{
static int tickets=10;
void bookTicket(int NoOfTickets)throws TicketNotFoundException
{
if(NoOfTickets > tickets)
throw new TicketNotFoundException();

else
{
tickets=tickets-NoOfTickets;
System.out.println(NoOfTickets +" tickets Booked enjoy the show and avaliable tickets are "+tickets);
}
}

}
public class d9MyExceptionDemo {
public static void main(String[] args) {
BookMyShow b=new BookMyShow();

try{
b.bookTicket(6);
b.bookTicket(2);
b.bookTicket(1);
b.bookTicket(2);
}
catch (Exception e) {
//e.printStackTrace();
System.out.println(e);
}

System.out.println("end of main");
}

}

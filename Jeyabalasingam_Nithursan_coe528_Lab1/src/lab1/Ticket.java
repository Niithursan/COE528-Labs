/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author nithy
 */
public class Ticket {

    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticket;
    private static int ticketCount = 1;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.ticket = ticketCount;
        ticketCount++;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTicket() {
        return ticket;
    }

    public static int getTicketCount() {
        return ticketCount;
    }

    @Override
    public String toString() {
        return this.getPassenger().getName() + ", " + this.getFlight() + ", ticket price: " + this.getPrice();
    }
}

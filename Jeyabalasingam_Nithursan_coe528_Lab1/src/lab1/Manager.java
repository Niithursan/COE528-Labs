/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.*;

/**
 *
 * @author nithy
 */
public class Manager {
    //Instance Variables
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    //Initialize Scanner
    private static Scanner input = new Scanner(System.in);
    
    public void createFlights()
    {        
        boolean validCreation = false;
        
        do
        {
            try
            {
                System.out.print("\nEnter a new flight number: ");
                int flightNumber = Integer.parseInt(input.nextLine());

                System.out.print("Enter the flight origin: ");
                String origin = input.nextLine();

                System.out.print("Enter the flight destination: ");
                String destination = input.nextLine();

                System.out.print("Enter the departure time of the flight: ");
                String departureTime = input.nextLine();

                System.out.print("Enter the flight capacity: ");
                int capacity = Integer.parseInt(input.nextLine());

                System.out.print("Enter the original price of the flight: ");
                double originalPrice = Double.parseDouble(input.nextLine());
                
                Flight f = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
                this.flights.add(f);
                System.out.println("Flight created successfully. Here are the details: " + f);
                validCreation = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid input; restarting flight creation...");
            }
        }
        while(!validCreation);
    }
    
    public void displayAvailableFlights(String origin, String destination)
    {
        boolean flightFound = false;
        
        for(Flight f: this.flights) //Loop through all flights
        { 		      
           if(f.getNumberOfSeatsLeft() > 0) //Check if there are available spots on the flight
           {
               if((f.getOrigin().equals(origin) && f.getDestination().equals(destination))) //Check if origin and destiation match query
               {
                   System.out.println(f); //Print flight
                   flightFound = true;
               }
           }      	
        }
        
        if(!flightFound)
            System.out.println("No available flights found from " + origin + " to " + destination);
    }
    
    public Flight getFlight(int flightNumber)
    {
        for(Flight f: this.flights) //Loop through all flights
        { 		      
           if(f.getFlightNumber() == flightNumber) //Check if flight number matches query
               return f;    	
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p)
    {
        boolean flightFound = false;
        
        for(Flight f: this.flights) //Loop through all flights
        { 
           if(flightNumber == f.getFlightNumber()) //Check if flight number matches query
           {
               flightFound = true;
               
               if(f.bookASeat()) //Check if booking was successful
               {
                   System.out.println("Booking successful. Issuing ticket...");
                   double price = p.applyDiscount(f.getOriginalPrice()); //Calculate price of ticket
                   Ticket t = new Ticket(p, f, price); //Issue ticket
                   this.tickets.add(t);
                   System.out.println(t);
               }
               else
                   System.out.println("Booking was unsuccessful: flight has reached capacity.");
           }
        }
        
        if(!flightFound)
            System.out.print("Booking was unsuccessful: flight number not found.");
    }
    
    public static void main(String[] args)
    {
        //--OBJECT CREATION--
        
        //Create manager
        Manager m = new Manager();
        
        //Format for member is (yearsOfMembership, name, age)
        Member testMember_NoDiscount = new Member(0, "Yannick", 40);
        Member testMember_10Discount = new Member(2, "LeBron", 40);
        Member testMember_50Discount = new Member(10, "Jordan", 35);
        
        //Format for non-member is (name, age)
        NonMember testNonMember_Adult = new NonMember("Carl", 35);
        NonMember testNonMember_Senior = new NonMember("Joe", 70);
        
        //6th passenger to test overbooking case
        NonMember testOverbook = new NonMember("Preet", 50);
        
        //--TESTS--
        
        //Test createFlights() method
        System.out.println("testing createFlights() method:");
        m.createFlights();
        
        //Test displayAvailableFlights() method
        System.out.print("Enter origin: ");
        String origin = input.nextLine();
        System.out.print("Enter destination: ");
        String destination = input.nextLine();
        m.displayAvailableFlights(origin, destination);
        
        //Test getFlight() method
        System.out.print("Enter the flight number: ");
        int flightNum = Integer.parseInt(input.nextLine());
        System.out.println(m.getFlight(flightNum));
        
        //--AUTORUN TESTS--
        System.out.println("\n--AUTORUN TESTS--");
        
        //Create new flight to run pre-made tests
        int capacity = 5;
        System.out.println("\nCreating new flight to run additional tests:");
        System.out.println("New flight created: " + m.flights.add(new Flight(100, "Toronto", "India", "Jan. 24, 2023 12:00 PM", capacity, 600)));
        System.out.println("Flight info: " + m.getFlight(100) + " Capacity: " + capacity);
        
        //Test bookSeat() method for member
        System.out.println("\nTesting bookSeat() method (using test person \"Yannick\" who is a new member):");
        m.bookSeat(100, testMember_NoDiscount);
        System.out.println("Testing bookSeat() method (using test person \"LeBron\" with a membership of 2 years):");
        m.bookSeat(100, testMember_10Discount);
        System.out.println("Testing bookSeat() method (using test person \"Jordan\" with a membership of 10 years):");
        m.bookSeat(100, testMember_50Discount);
        
        //Test bookSeat() method for non member
        System.out.println("\nTesting bookSeat() method (using test person \"Carl\" who is a non-member of age 35):");
        m.bookSeat(100, testNonMember_Adult);
        System.out.println("Testing bookSeat() method (using test person \"Joe\" who is a non-member of age 70):");
        m.bookSeat(100, testNonMember_Senior);
        
        //--TESTING EXCEPTIONS USING FLIGHT 100--
        System.out.println("\n--TESTING EXCEPTIONS--");
        
        //Testing overbooking case
        System.out.println("\nTesting overbooking case (using test person \"Preet\"):");
        m.bookSeat(100, testOverbook);
        
        //Testing getFlight() with unknown flight number
        System.out.println("\nTesting getFlight() with unknown flight number:");
        System.out.println("Return value of flight with flight number 999: " + m.getFlight(999));
        
        //Testing displayAvailableFlights() with unknown origin and destination
        System.out.println("\nTesting displayAvailableFlights() with unknown origin and destination:");
        System.out.println("Displaying available flights from x to y:");
        m.displayAvailableFlights("x", "y");
    
        //Testing displayAvailableFlights() where flight is at capacity
        System.out.println("\nTesting displayAvailableFlights() where flight is at capacity:");
        System.out.println("Displaying available flights from Toronto to India: ");
        m.displayAvailableFlights("Toronto", "India");
    }
}
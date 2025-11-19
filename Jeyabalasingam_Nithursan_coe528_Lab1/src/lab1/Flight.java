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
public class Flight {

    private int flightNumber, capacity, numberOfSeatsLeft;
    private String origin, destination, departureTime;
    private double originalPrice;

    //Constructor
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        if (origin.equals(destination)) {
            throw new IllegalArgumentException();
        } else {
            this.origin = origin;
            this.destination = destination;
        }
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
    }

    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        } else {
            return false;
        }
    }

    //Getter and Setter Methods
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Override
    public String toString() {
        return "Flight " + this.getFlightNumber() + ", " + this.getOrigin() + " to " + this.getDestination() + ", " + this.getDepartureTime() + ", Original Price: " + this.getOriginalPrice();
    }
}

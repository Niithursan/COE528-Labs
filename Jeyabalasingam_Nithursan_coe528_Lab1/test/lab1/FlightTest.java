/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nithy
 */
public class FlightTest {

    public FlightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Flight constructor with valid parameters, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        boolean exceptionThrown = false;
        try {
            Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(!exceptionThrown);
    }

    /**
     * Test of Flight constructor with invalid parameters, of class Flight.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("testInvalidConstructor");
        boolean exceptionThrown = false;
        try {
            Flight f = new Flight(1, "[Origin]", "[Origin]", "01/01/01 01:01:01", 1, 1);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        String expResult = "Flight 1, [Origin] to [Destination], 01/01/01 01:01:01, Original Price: 1.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setFlightNumber(2);
        int expResult = 2;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        String expResult = "[Origin]";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setFlightNumber");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setOrigin("[Origin2]");
        String expResult = "[Origin2]";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        String expResult = "[Destination]";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setDestination("[Destination2]");
        String expResult = "[Destination2]";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        String expResult = "01/01/01 01:01:01";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setDepartureTime("02/02/02 02:02:02");
        String expResult = "02/02/02 02:02:02";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        int expResult = 1;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setFlightNumber");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setCapacity(2);
        int expResult = 2;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        double expResult = 1;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
        instance.setOriginalPrice(2);
        double expResult = 2;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}

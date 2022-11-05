package Airline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    private Airline airline;
    private AirlineBoard boarding;

    @BeforeEach
    void setUp(){
        boarding = new AirlineBoard();
        airline = new Airline();
    }
    @Test
    void airlineClassIsNotNull(){
        assertNotNull(airline);
        assertNotNull(boarding);
    }
    @Test
    void ensureTheBoardIsAllFalse(){
        boarding.displaySeats();
    }

    @Test
    void seatCanBeAssignInTheFirstClassSection(){
        airline.assignSeat(boarding, 1);
        airline.assignSeat(boarding, 1);
        airline.assignSeat(boarding, 1);
        airline.assignSeat(boarding, 1);
        airline.assignSeat(boarding, 1);
        boarding.displaySeats();
        assertTrue(airline.isPlaneSeats());
    }

    @Test
    void ticketCanBeBookedOnEconomyClassSection(){
        airline.assignSeat(boarding, 2);
        boarding.displaySeats();
        assertTrue(airline.isPlaneSeats());
    }
}

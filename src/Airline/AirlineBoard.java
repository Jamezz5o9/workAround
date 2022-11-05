package Airline;

import java.util.Arrays;

public class AirlineBoard {
    private final boolean[] airlineSeats = new boolean[10];

    public AirlineBoard(){
        Arrays.fill(airlineSeats, false);
    }
    public void displaySeats(){
        for(int i = 0; i < airlineSeats.length; i++){
            System.out.print(airlineSeats[i] + " | ");
        }
    }
    public boolean[] getAirlineSeats() {
        return airlineSeats;
    }
}

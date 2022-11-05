package Airline;

import java.util.Arrays;
import java.util.Scanner;

public class Airline {
    private boolean planeSeats;

    public void assignSeat(AirlineBoard board, int pickType) {
        if(pickType == 1) assignFirstClass(board);
        if(pickType == 2) assignEconomy(board);
    }

    public void assignFirstClass(AirlineBoard boarding) {
        boolean[] board = boarding.getAirlineSeats();
        for (int i = 0; i < 5; i++) {
            if (!board[i]) {
                board[i] = true;
                planeSeats = board[i];
                if (i == 4) {
                    System.out.printf("The total available seats is %d and all have been fully booked%n", i + 1);
                    break;
                }
            }

        }
    }

    public void assignEconomy(AirlineBoard boarding) {
        boolean[] board = boarding.getAirlineSeats();
        for(int i = 4; i < board.length; i++){
            if(!board[i]){
                board[i] = true;
                planeSeats = board[i];
                break;
            }
        }

    }

    public boolean isPlaneSeats() {
        return planeSeats;
    }
}

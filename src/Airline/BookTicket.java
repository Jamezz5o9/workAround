package Airline;

import Airline.Exceptions.InvalidSeat;

import java.util.Scanner;

import static java.lang.System.exit;

public class BookTicket {
    private static final boolean[] economySeats = new boolean[5];
    private static final boolean[] firstClassSeats = new boolean[5];
    private static Airline airline = new Airline();
    private static AirlineBoard airplaneBoard = new AirlineBoard();


    public static void main(String[] args) {
        display("Welcome to Aimez airline");
        display("Which type of seat will you like to choose? ");
        startProcess();
    }

    private static void startProcess() {
        String airlineOption = """
                1 -> Economy type,
                2 -> First class type,
                3 -> exit
                """;


        String inputResult = input(airlineOption);
        switch(inputResult){
            case "1" -> economyFlight();
           //case "2" -> firstClassFlight();
            case "3" -> exit(3);
        }
    }

    private static void economyFlight() {
        display("Book a seat in the economy type");
        display("Available seat options are from 1 - 5");
        int bookSeat = inputInt();
        if(bookSeat > 5 || bookSeat < 1) throw new InvalidSeat(String.format("Seat number %d is not part of the available seat options", bookSeat));
        airline.assignEconomy(new AirlineBoard());


//        for(int i = 1; i <= economySeats.length; i++){
//            if( i == bookSeat && !economySeats[i]) economySeats[i] = true;
//        }

    }

    private static String input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    private static int inputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static void display(String prompt){
        System.out.println(prompt);
    }
}

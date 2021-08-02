package Kodluyoruz_HomeWork_AbdAlrahimZakaria.Week3_AirplaneSystem.Concrete_Classes;

import Kodluyoruz_HomeWork_AbdAlrahimZakaria.Week3_AirplaneSystem.Abstract_Classes.FlightTicketSystem;

public class THYAirLines extends FlightTicketSystem {

    public static void main(String[] args) {
        THYAirLines THY = new THYAirLines();
        THY.setSeatsNumber();
        System.out.println("Welcome to THY Airlines system!");
        THY.createTicket();
    }
}

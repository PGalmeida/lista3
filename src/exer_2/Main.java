package exer_2;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(11,"pedro","852.147.369-37");

        Flight flight1 = new Flight(111, "Ribeirão", "Rio de janeiro");

        Date date1 = new Date(2026, 6, 10);
        Reservation reservation1 = new Reservation(1111, date1, passenger1, flight1);

        System.out.println(reservation1);
    }
}

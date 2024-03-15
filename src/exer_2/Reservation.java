package exer_2;

import java.util.Date;

public class Reservation {
    private Number id;
    private Date date;
    Flight flight;
    Passenger passenger;

    public Reservation() {
    }

    public Reservation(Number id, Date date,  Passenger passenger, Flight flight) {
        this.setId(id);
        this.setDate(date);
        this.setFlight(flight);
        this.setPassenger(passenger);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Flight getFight() {
        return flight;
    }

    public void setFlight(Flight fight) {
        this.flight = fight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "\nid=" + id +
                ", date=" + date +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}

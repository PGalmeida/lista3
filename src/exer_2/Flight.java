package exer_2;

public class Flight {
    private Number id;
    private String origin, destination;

    public Flight() {
    }

    public Flight(Number id, String origin, String destination) {
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Flight{" +
                "\nid=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}

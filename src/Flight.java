public class Flight {
    private int number;
    private String destination;

    public Flight() {

    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString() {
        return "Flight= " + this.number + ", " + this.destination;
    }

    public static void main(String[] args) {
        Flight gl = new Flight(857, "Toronto");
        System.out.println(gl.toString());
    }
}

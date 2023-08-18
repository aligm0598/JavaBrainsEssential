public class Car {
    int seats;
    int wheels;
    double weight;
    double topSpeed;

    boolean canSeat(int seats) {
        return this.seats >= seats;
    }
}


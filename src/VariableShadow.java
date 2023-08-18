public class VariableShadow {

    public static void main(String[] args) {
        Car carInstance = new Car();
        carInstance.seats = 4;

        int requiredSeats = 2;
        if (carInstance.canSeat(requiredSeats)) {
            System.out.println("The car can seat " + requiredSeats + " or more people.");
        } else {
            System.out.println("The car cannot seat " + requiredSeats + " people.");
        }
    }
}


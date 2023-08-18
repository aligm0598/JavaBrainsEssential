public class VariableShadow {
    class Car {
        int seats;
        int wheels;
        double weight;
        double mileage;

        boolean canSeat(int seats) {
            return this.seats >= seats;
        }
    }
    public static void main(String[] args) {
        VariableShadow outerInstance = new VariableShadow();
        Car carInstance = outerInstance.new Car();

        carInstance.seats = 4;

        int requiredSeats = 2;
        if (carInstance.canSeat(requiredSeats)) {
            System.out.println("The car can seat " + requiredSeats + " or more people.");
        } else {
            System.out.println("The car cannot seat " + requiredSeats + " people.");
        }
    }
}


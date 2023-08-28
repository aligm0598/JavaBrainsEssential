public class Car4 {
    public static void main(String[] args) {
        Car4 car4 = new Car4();

        int seats = 4;
        double weight = 1500.0;

        double anotherCarWeight = 1800.0;

        boolean canSeatResult = car4.canSeat(seats, 3);
        System.out.println("Can the car seat 3 people? " + canSeatResult);

        boolean isHeavierResult = car4.isHeavierThan(weight, anotherCarWeight);
        System.out.println("Is the first car heavier than the second car? " + isHeavierResult);
    }

    boolean canSeat(int seats, int numberOfPeople) {
        return seats >= numberOfPeople;
    }

    boolean isHeavierThan(double weight1, double weight2) {
        return weight1 > weight2;
    }
}
public class Car2 {
    int seats;
    int wheels;
    double weight;
    double mileage;

    Car2() {
        mileage = 0;
    }

    Car2(int numberOfSeats) {
        this(); 
        seats = numberOfSeats;
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();        
        Car2 c2 = new Car2(5);       

        System.out.println("Car c1 has " + c1.seats + " seats");
        System.out.println("Car c2 has " + c2.seats + " seats");
    }
}

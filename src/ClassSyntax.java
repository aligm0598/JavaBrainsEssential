public class ClassSyntax {
    public static void main(String[] args) {
        Car myNewCar; 
        Car neighborCar; 
        
        myNewCar = new Car(); 
        neighborCar = new Car(); 
        myNewCar.seats = 4; 
        neighborCar.seats = 2; 
        
        System.out.println(myNewCar.seats); 
        System.out.println(neighborCar.seats); 
    }
}

class Car {
    int seats;
    int wheels;
    double weight;
    double topSpeed;
}





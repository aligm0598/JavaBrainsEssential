public class App {
    public static void main(String[] args) throws Exception {
        testDay05();
    }

    public static void testDay01(){
        System.out.println("Hello, World!");
    }

    public static void testDay02(){
        varables v1 = new varables();
        System.out.println("Age is " + v1.age);
        System.out.println("Count is " + v1.count);
        System.out.println("Price is " + v1.coeff);
        System.out.println("Sum is " + v1.sum);
    }
    
    public static void testDay03(){
        casting v1 = new casting();
        System.out.println("A = " + v1.a);
        System.out.println("B = " + v1.b);
        System.out.println("C = " + v1.c);

    }

     public static void testDay04(){
        Precisionloss v1 = new Precisionloss();
        System.out.println("A = " + v1.a);
        System.out.println("B = " + v1.b);
        System.out.println("C = " + v1.c);
        System.out.println("D = " + v1.d);

    }

    public static void testDay05(){
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







public class App {
    public static void main(String[] args) throws Exception {
        testDay02();
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
}

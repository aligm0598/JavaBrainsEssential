public class ForEach {
    public static void main(String[] args) {
        int someNumbers[] = { 25, 42, 36, 75, 91 };
        int total = 0;
        int maxNumber = Integer.MIN_VALUE; 

        for (var element : someNumbers) {
            total = total + element;
            
            if (element > maxNumber) {
                maxNumber = element;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Max Number: " + maxNumber);
    }
}
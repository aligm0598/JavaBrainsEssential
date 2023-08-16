public class Arrays {
    public static void main(String[] args) {
        int slNos[] = new int[10];
        slNos[0] = 2;
        slNos[3] = 100;

        int largerNumber = slNos[0]; 
        if (slNos[3] > largerNumber) {
            largerNumber = slNos[3]; 
        }

        System.out.println("slNos[0]: " + slNos[0]);
        System.out.println("slNos[3]: " + slNos[3]);
        System.out.println("Larger number: " + largerNumber);
    }
}


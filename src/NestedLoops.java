public class NestedLoops{
    public static void main(String[] args) {
        int matrix[][] = new int[10][20]; 

        for (int[] subArray : matrix) {
            for (int element : subArray) {
                System.out.println("Element is: " + element); 
            }
        }
    }
}

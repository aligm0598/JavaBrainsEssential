public class NestedLoops {
    public static void main(String[] args) {
        int matrix[][] = new int[10][20];
        
        int minNumber = 10;  
        int maxNumber = 50;  

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));

        int maxInMatrix = matrix[0][0];

        for (int[] subArray : matrix)
            for (int element : subArray)
                maxInMatrix = Math.max(maxInMatrix, element);

        System.out.println("Max number in the matrix: " + maxInMatrix);
    }
}


import java.util.Arrays;

public class ArraysTwo {
    public static void main(String [] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Matrix: " + matrix[2][0]);

        for (int i = 0; i < matrix.length; i++){
            System.out.printf("\nMatrix: %s", Arrays.toString(matrix[i]));
        }

        // Strings array
        String [][] strings = {
                {"Hello", "java", "arrays"},
                {"Hello", "Sergio", "!"}
        };

        System.out.println();

        for (int i = 0; i < strings.length; i++){
            System.out.printf("\nMatrix strings: %s", Arrays.toString(strings[i]));
        }

        // Some matrix
        int [][] someMatrix = {
                {1,2,3,4,5},
                {6,7,8,9},
                {10,11},
                {12},
                {13,14,15,16}
        };

        System.out.printf("\n\n");

        for (int i = 0; i < someMatrix.length; i++) {
            for(int j = 0; j < someMatrix[i].length; j++) {
                System.out.print(someMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

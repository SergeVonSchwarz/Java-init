import java.util.Arrays;

public class ArraysOne {
    public static void main(String [] args) {
        int [] numbers = new int[5];
        int [] numbersInit = {5,3,9,2,4,1};

        // one
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Arrays: " + numbers[i]);
        }

        // two
        System.out.printf("\nNumbers : %s", Arrays.toString(numbersInit));

        // three
        Arrays.sort(numbersInit);
        System.out.printf("\nSorted : %s\n", Arrays.toString(numbersInit));
    }
}
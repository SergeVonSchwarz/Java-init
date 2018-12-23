import java.util.Scanner;

public class Input {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = s.nextLine();
        System.out.println("You entered: " + str);
        /*System.out.println("Enter digit: ");
        int digit = s.nextInt();
        System.out.println("You entered: " + digit);*/
    }
}

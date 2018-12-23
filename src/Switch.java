import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your test value(1-5): ");
        int test = s.nextInt();

        switch (test) {
            case 5:
                System.out.println("Very good!");
                break;

            case 4:
                System.out.println("Good!");
                break;

            case 3:
                System.out.println("So so!");
                break;

            case 2:
                System.out.println("Bad!");
                break;

            case 1:
                System.out.println("God damn it!");
                break;

            default:
                System.out.println("False input!");
        }
    }
}

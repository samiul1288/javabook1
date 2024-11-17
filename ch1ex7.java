package samiuljava;
import java.util.Scanner;
public class ch1ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int terms = scanner.nextInt();

        double pi = 0.0;
        for (int i = 0; i < terms; i++) {

            if (i % 2 == 0) {
                pi += 1.0 / (2 * i + 1);
            } else {
                pi -= 1.0 / (2 * i + 1);
            }
        }


        pi *= 4;


        System.out.println("The approximate value of pi using " + terms + " terms is: " + pi);

    }
}

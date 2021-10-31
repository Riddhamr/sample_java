import java.util.Scanner;

import static java.lang.Math.sqrt;

public class is_prime {
    static boolean check_prime(int num) {
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an positive integer value: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println(num + " is not a positive integer.");
            return;
        }

        if (check_prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

import java.util.Scanner;

public class ip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int octet1, octet2, octet3, octet4;
        boolean valid = true;

        System.out.print("Enter the first octet (0-255): ");
        octet1 = scanner.nextInt();

        System.out.print("Enter the second octet (0-255): ");
        octet2 = scanner.nextInt();

        System.out.print("Enter the third octet (0-255): ");
        octet3 = scanner.nextInt();

        System.out.print("Enter the fourth octet (0-255): ");
        octet4 = scanner.nextInt();

        if (octet1 < 0 || octet1 > 255) {
            System.out.println("Octet 1 is incorrect");
            valid = false;
        }

        if (octet2 < 0 || octet2 > 255) {
            System.out.println("Octet 2 is incorrect");
            valid = false;
        }

        if (octet3 < 0 || octet3 > 255) {
            System.out.println("Octet 3 is incorrect");
            valid = false;
        }

        if (octet4 < 0 || octet4 > 255) {
            System.out.println("Octet 4 is incorrect");
            valid = false;
        }

        if (valid) {
            System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
        }
    }
}

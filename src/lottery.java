import java.util.Scanner;
import java.util.Random;

public class lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int WinningNumber = random.nextInt(99) + 1;
        boolean z;

        System.out.println("pick a 2 digit number");
        int y = scanner.nextInt();
        while (true) {
            if (y < 10 || y > 99) {
                System.out.println("Try again");
                y = scanner.nextInt();
            } else
                break;
        }

        int digit1 = y / 10;
        int digit2 = y % 10;

        int windigit1 = WinningNumber / 10;
        int windigit2 = WinningNumber % 10;

        System.out.println("Debug Info: Winning Number is " + WinningNumber);

        if (y == WinningNumber) {
            System.out.println("Congratulations! You win $10,000.");
        } else if ((digit1 == windigit2 && digit2 == windigit1) || (digit1 == windigit1 && digit2 == windigit2)) {
            System.out.println("You got both digits correct, but in the wrong order. You win $2,000.");
        } else if (digit1 == windigit1 || digit2 == windigit2 || digit1 == windigit2 || digit2 == windigit1) {
            System.out.println("You got one of the digits correct. You win $500.");
        } else {
            System.out.println("Sorry, you didn't win anything. Better luck next time.");
        }
    }
}

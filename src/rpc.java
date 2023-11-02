import java.util.Random;
import java.util.Scanner;

public class rpc {
    public static void main(String[] args) {
        // 1 = rock
        // 2 = paper
        // 3 = scissors

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = random.nextInt(3) + 1;

        System.out.println("Rock, Paper, or Scissors?");
        String selection = scanner.nextLine().toLowerCase();

        if (x == 1) {
            if (selection.equals("rock")) {
                System.out.println("It's a draw");
            } else if (selection.equals("paper")) {
                System.out.println("You won");
            } else if (selection.equals("scissors")) {
                System.out.println("You lost");
            }
        } else if (x == 2) {
            if (selection.equals("rock")) {
                System.out.println("You lost");
            } else if (selection.equals("paper")) {
                System.out.println("It's a draw");
            } else if (selection.equals("scissors")) {
                System.out.println("You won");
            }
        } else if (x == 3) {
            if (selection.equals("rock")) {
                System.out.println("You won");
            } else if (selection.equals("paper")) {
                System.out.println("You lost");
            } else if (selection.equals("scissors")) {
                System.out.println("It's a draw");
            }
        }
    }
}

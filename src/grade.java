import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your numerical grade: ");
        int grade = scan.nextInt();

        String letter = "";

        if (grade >= 98 && grade <= 100) {
            letter = "A+";
        } else if (grade >= 93 && grade <= 97) {
            letter = "A";
        } else if (grade >= 90 && grade <= 92) {
            letter = "A-";
        } else if (grade >= 87 && grade <= 89) {
            letter = "B+";
        } else if (grade >= 83 && grade <= 86) {
            letter = "B";
        } else if (grade >= 80 && grade <= 82) {
            letter = "B-";
        } else if (grade >= 77 && grade <= 79) {
            letter = "C+";
        } else if (grade >= 73 && grade <= 76) {
            letter = "C";
        } else if (grade >= 70 && grade <= 72) {
            letter = "C-";
        } else if (grade >= 67 && grade <= 69) {
            letter = "D+";
        } else if (grade >= 63 && grade <= 66) {
            letter = "D";
        } else if (grade >= 60 && grade <= 62) {
            letter = "D-";
        } else if (grade >= 0 && grade <= 59) {
            letter = "F";
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        System.out.println("Your grade is: " + letter);
    }
}

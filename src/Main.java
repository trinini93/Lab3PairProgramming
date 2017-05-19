import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        do {

            System.out.println("Please enter an integer");
            int userNum = scan.nextInt();
            int square = 0;
            int cube = 0;
            scan.nextLine();

            for (int i = 1; i <= userNum; i++) {
                square = i * i;
                cube = i * i * i;
                System.out.println(i + " " + square + " " + cube);
            }
            System.out.println("Do you want to continue? (y/n)");
            input = scan.nextLine();

        }

        while (input.equalsIgnoreCase("Y"));

        System.out.println("Bye");
    }
}

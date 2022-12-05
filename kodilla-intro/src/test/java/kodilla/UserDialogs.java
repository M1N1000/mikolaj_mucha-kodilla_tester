package kodilla;
import java.util.Scanner;
public class UserDialogs {
    public static String getColor() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter your First color letter:");                // [3]
            String firstColorLetter = scanner.nextLine().trim().toUpperCase();
            switch (firstColorLetter) {
                case "R":
                    return "Red";
                case "B":
                    return "Blue";
                case "O":
                    return "Orange";
                case "Y":
                    return "Yellow";
                case "W":
                    return "White";
                case "P":
                    return "Pink";
                case "G":
                    return "Grey";

                default:
                    System.out.println("Wrong letter. Try again.");// [4]
                    // [6]
            }

        }
    }
}


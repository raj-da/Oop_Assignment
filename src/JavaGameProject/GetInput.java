package JavaGameProject;
import java.util.Scanner;

public class GetInput {
    private static Scanner scanner = new Scanner(System.in);
    public static String getInput() {
        scanner = new Scanner(System.in);

        return scanner.next();
    }
    public static void closeScanner() {
        scanner.close();
    }
}

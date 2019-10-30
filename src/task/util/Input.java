package task.util;

import java.util.Scanner;

public class Input {
    Scanner scanner;

    public String getString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

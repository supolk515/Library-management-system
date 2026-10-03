package LibraryManagementSystem;

import java.util.NoSuchElementException;
import java.util.Scanner;

// All prompts share one Scanner and consume complete lines.
public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(String prompt) {
        while (true) {
            System.out.println(prompt);
            if (!scanner.hasNextLine()) {
                throw new NoSuchElementException("Input closed.");
            }
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Please enter a non-empty value.");
        }
    }

    public int readInt(String prompt, int min, int max) {
        while (true) {
            String value = readText(prompt);
            try {
                int number = Integer.parseInt(value);
                if (number >= min && number <= max) {
                    return number;
                }
            } catch (NumberFormatException ignored) {
                // Invalid or overflowing integers are handled by the same prompt.
            }
            System.out.println("Please enter a whole number from " + min + " to " + max + ".");
        }
    }
}

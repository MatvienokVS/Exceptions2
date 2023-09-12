
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try {
            String input = getInput("Введите строку: ");
            System.out.println("Вы ввели: " + input);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getInput(String prompt) throws EmptyInputException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new EmptyInputException("Пустые строки вводить нельзя");
            }

            return input;
        }
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException(String message) {
        super(message);
    }
}

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        float number = getInputFloat("Введите дробное число: ");
        System.out.println("Вы ввели: " + number);
    }
    
    public static float getInputFloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        float inputNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            
            if (scanner.hasNextFloat()) {
                inputNumber = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
                scanner.next(); // Очистка буфера после некорректного ввода
            }
        }

        return inputNumber;
    }
}


